# 14 — v47.7.1: What It Collects From Your Phone, Where It Goes, and Whether DNS Blocking Works

Re-analysis of **TikTok `com.zhiliaoapp.musically` v47.7.1** (APKPure single APK,
SHA-256 `3b68b645…07b0c`, 472 MB, 58 dex, 302 arm64 libs). Signed by the same
v1/v2/v3 certificate (`9041803e…2ab5ba`) with a source stamp.

**Tooling this time:**
- jadx 1.5.6: full source, 364,859 files, 3,224 methods failed to decompile.
- REA MCP with Ghidra 12.1: native analysis of `libsscronet.so`, ByteDance's Cronet/"TTNet" network stack.
- REA APK-signature inspection.
- Full-tree `ripgrep`.
- Three parallel full-corpus sweeps, whose appendices are in [`_evidence/v47/`](_evidence/v47/).

Java paths below are relative to the jadx `sources/` root. Native line numbers refer to
`strings` dumps.

> **Static analysis only.** No phone or emulator was attached, so nothing was observed on
> the wire. "Collects X" means the code reads X and has a path that puts it in a request.
> It does not mean a captured packet proved it. The [verification section](#7-how-to-verify-this-on-your-own-network)
> explains how to confirm each point at home with your NextDNS logs.

---

## 0. TL;DR

1. **No, NextDNS alone cannot reliably fence TikTok in.**
   - The app ships its own DNS-over-HTTP resolver, **enabled by default** and reached by
     **raw IP address** (`34.102.215.99` / `35.213.190.132` outside the US). NextDNS never
     sees those lookups.
   - Core API hosts are additionally **hard-pinned to `199.103.24.2/4/6/8`** (Bytedance Inc.'s own network).
   - The server can push new host→host and host→IP rewrite rules at any time ([§2](#2-why-dns-blocking-alone-is-not-a-fence)).
   - DNS blocking still works for **third-party trackers** and **most first-party telemetry
     hosts today**. It needs a router IP rule as backup and periodic re-checking.
2. **It does not "spy on everything you do on the phone."**
   - v47 has **no** accessibility service, notification listener, all-apps listing,
     usage-stats, SMS, call-log or phone-state access.
   - The only new permission is `DETECT_SCREEN_RECORDING`, which tells the app when *its
     own* screen is being recorded.
   - Android's sandbox prevents it from seeing other apps' content.
3. **What it does collect, quietly and without asking, is a lot**:
   - persistent device IDs, including `ANDROID_ID`, re-reported hourly to a dedicated endpoint;
   - carrier and region;
   - a deep hardware fingerprint, including a Google-signed **hardware attestation** of your phone;
   - **how you touch the screen and hold the phone** (touch pressure and size, motion sensors);
   - root, VPN and proxy flags;
   - your Wi-Fi's DNS servers;
   - **everything you do inside the app**, across 6,079 distinct event types, including
     watch time per video and your search text.
4. **Your in-app behavior cannot be blocked or faked while you use the app.**
   - Watch stats travel on the **same host and the same signed requests** as the feed itself
     (a default rule forces `/aweme/v*/aweme/stats/` onto `api-core.tiktokv.com`).
   - The realistic goal is **unlinkability**: make the profile TikTok builds point to a
     throw-away device identity that isn't tied to you, rather than to *you*. [§5](#5-the-fake-substitute-plan)
     shows how.
   - Faking hardware or sensor values is detectable and backfires. Using a separate identity
     (separate device or Android profile, no SIM, reset ad ID) is not.

---

## 1. What changed since v46.0.1

| Area | v46 | v47.7.1 |
|---|---|---|
| Permissions | 57 | 59. **Added:** `DETECT_SCREEN_RECORDING`, an internal `PRF_INTERNAL`. Nothing removed ([`permissions47.txt`](_evidence/v47/permissions47.txt)) |
| Hosts in code | 961 (cleaned) | **1,350**. All 82 v46 telemetry hosts are still present. New: `fp.us.tiktokv.com`, `location.tiktokw.us`, `location-va.byteintl.com`, `ml.byteintl.net`, `log.tiktok-row.net`, `reckon-us.tiktok-row.net` and others ([`hosts47.txt`](_evidence/v47/hosts47.txt)) |
| Domain registry (`builtin_network_config`, XOR 0x55) | 541 | 541, **identical** |
| Security SDKs | metasec | metasec **+ OECSec** (TikTok Shop security, `liboecsec_ov.so`, does hardware key attestation) **+ "Pipo Probe"** (first-party KYC/risk probe, up to ~90 fields) |
| Adjust SDK | listed in report 06 | **Not present.** `view.adjust.com` is only a LIVE game-promo click ping (`X/RunnableC1468520oJc.java:36`). Report 06 is corrected |
| ThreatMetrix | native SDK | Only a hidden WebView loading `h.online-metrix.net/fp/tags.js` **during payments** (`X/C2769014z.java:95-115`) |
| Device registration | assumed on `log*`/`isnssdk` | `log-va.tiktokv.com/service/2/device_register/`, **or `api.tiktokv.com`** when a flag is set (`X/C2330309At.java:10-13`) |
| metasec native strings | partly readable | Much thinner; string encryption appears stronger |

---

## 2. Why DNS blocking alone is not a fence

### 2.1 A built-in resolver, on by default, reached by IP

TTNet ships two default network configs as JSON strings in `X/C03HO.java`. They are decoded
at [`ttnet_builtin_config_row.json`](_evidence/v47/ttnet_builtin_config_row.json) and
[`ttnet_builtin_config_us.json`](_evidence/v47/ttnet_builtin_config_us.json). Region choice is made at
`X/C1112504Wj.java:242-250`: **US and US territories** (`US, AS, VI, MP, PR, GU`,
`X/C03HO.java:12`) get the US config. **Everyone else, Brazil included,** gets the rest-of-world one.

| Setting | Rest of world (you) | US |
|---|---|---|
| `ttnet_http_dns_enabled` / `ttnet_tt_http_dns` | **1 / 1** | **1 / 1** |
| `ttnet_tt_http_dns_domain` (TikTok's resolver) | **`34.102.215.99`** (a raw IP, Google Cloud) | `dig.tiktokv.us`, pinned to **`130.35.75.83`** (Oracle) |
| `ttnet_http_dns_addr` (static host→IP pins) | `api-boot`, `api-core-boot`, `webcast-boot`, `search16-normal-c-useast1a`, `oec-api` `.tiktokv.com` → **`199.103.24.2,.4,.6,.8`** (Bytedance Inc., `199.103.24.0/23`) | `dig.tiktokv.us` → `130.35.75.83` |
| `ttnet_http_dns_prefer` | 0 (the phone's DNS is tried first) | 0 |
| `ttnet_request_retry_error_list` / `_max_attempts` | `[-7,-15,-21,-101,-102,-106,-103,-109,-126]` / **20** | same |

Corroborating code:
- TTNet's HTTP-DNS host is passed in as `"34.102.215.99"`, with net-log domain
  `ttnet.tiktokv.com` (`com/tiktok/ttf/network/depend/AbsIESNetDependAdapter.java:76-79`).
- A "third-party" resolver list: `dns.google.com/resolve`, `34.102.215.99/q`,
  `35.213.190.132/q` (`com/orbu/core/config/BootConfigKt.java:10`).
- The video player has its own DNS modes `localDNS / httpDNS_own / httpDNS_google`
  (`X/C06EC.java:410-423`), with `player_medialoader_own_dns_host = 34.102.215.99` and
  `player_medialoader_google_dns_host = dns.google.com` (`X/C371110Egd.java:3834-3838`).
- The resolver's reply can carry `httpdns_backup_ip`. Those addresses are **saved on the
  phone** (`dispatchersdk_httpdns_hardcodeips`) and used afterwards
  (`com/bytedance/frameworks/baselib/network/http/ok3/impl/httpdns/HttpDns.java:250-258,486-500,844-846`).
  So a resolver IP learned once survives your later blocking.
- Native side, `libsscronet.so`:
  - `net/tt_net/dns/httpdns_host_resolver.cc`, `StartHttpDnsTransaction`,
    `tt_httpdns_tt_host_pattern`, `tt_httpdns_google_host_pattern`,
    `https://dns.google.com/resolve?name=`, `dns_race_host_list`, `StartTTRaceDnsTask`.
  - These mean phone DNS and TikTok DNS can be **raced**.
  - `/debug.get_localdnsip` means it can learn which resolver you use.
- Ghidra via REA, function `FUN_0044faf0` (retry-policy parser; Evidence
  `ev_728e10d8…`):
  - It reads `ttnet_retry_force_httpdns_error_list` plus a `…_white_list` and
    `…_wildchar_hosts`, and builds a rule that **re-issues a failed request through
    HTTP-DNS** for matching hosts and error codes.
  - It also reads `ttnet_retry_skip_prefer_ip_error_list`.
  - These keys are **not** in the built-in defaults, so they arrive from the server when wanted.

`4.2.243.66-tiktok`, which looks like an IP, is TTNet's *version string*
(`HttpDns.java:202`), not an address.

**What this means at home.**
- NextDNS answers a blocked name with `0.0.0.0` (or NXDOMAIN). The connection then fails
  with one of the codes in the retry list (`-102` refused, `-109` unreachable), and TTNet
  retries up to 20 times.
- Whether a retry switches to TikTok's own resolver depends on server-pushed rules. Static
  code can't show what the server sends to your device.
- So treat the built-in resolver as **active until proven otherwise**, and block its IPs at the router ([§4.2](#42-router-firewall-rules-nextdns-cannot-block-ips)).

### 2.2 The server can re-route any host

On launch, TTNet fetches `tnc-boot.tiktokv.com/get_domains/v5/`
(`com/bytedance/ttnet/tnc/TNCManager.java:535-539`). When the reply's epoch changes, it
**replaces the entire rule list** (`wa4/l.java:379-410`). Rules can rewrite any host or path
to another host (`host_replace`, `dispatch`), drop requests, or pin hosts to IPs. The
built-in rules already:

- rename legacy `*.byteoversea.com` / `*.isnssdk.com` telemetry hosts to `*.tiktokv.com`;
- before the server answers, send everything to `*-boot.tiktokv.com` variants
  (`log-boot`, `mon-boot`, `mssdk-boot`, …). **A blocklist must include the `-boot` names**;
- force `/aweme/v*/aweme/stats/` (per-video watch stats) onto `api-core.tiktokv.com`, the
  feed host, so watch stats cannot be split off by DNS;
- **hard-drop** all traffic to China-domestic Douyin/Toutiao domains (`*.snssdk.com`,
  `*.pstatp.com`, `*.amemv.com`, `*.toutiao.com`, …). This is reassuring;
- **drop location-upload paths on every host** (`/location/submit/`, `/location/locate/`,
  `/location/batch-submit-wifi-bss/`, `/location/gis/reverse_geolocation`, …). Also
  reassuring, but a server rule can override it.

Full rule dump: [`hosts_endpoints_blocklist.md` §4](_evidence/v47/hosts_endpoints_blocklist.md).

---

## 3. The full inventory: what it collects from your phone

Columns:
- **Perm?**: does Android ask you first? "—" means no prompt: any app can read it.
- **Goes to**: the destination host.
- **DNS-blockable?**: can blocking a hostname stop it without breaking the app?
- **Fake?**: what to do about it (see [§5](#5-the-fake-substitute-plan)).

### 3.1 Identifiers: who your device is

| Data | Real source | Perm? | Goes to | DNS-blockable? | Fake? |
|---|---|---|---|---|---|
| `openudid` / `ssaid` = **ANDROID_ID** (stable per app-signing-key + Android user + device; survives reinstall and data clear) | `Settings.Secure` (`AbsDeviceParamsProvider.java:79-127`) | — | Registration, every API call, and **hourly to `cp-rp.tiktokv.com/track_event`** | ❌ (API) / ✅ `cp-rp` | ✅ Changes per Android *user profile*: use a separate profile or device |
| `google_aid` (+ `gaid_limited`, `uoo` = Limit-Ad-Tracking) | `AdvertisingIdClient` (`X/C09K8.java:72-74`) | — | API, AppsFlyer, `cp-rp` | partly | ✅ **Delete** the ad ID (Android 12+ → all zeros), a normal state |
| `cdid`, `clientudid` (random UUIDs in app prefs) | `X/C1754106tl.java:55-80` | — | API, registration | ❌ | ✅ Regenerated on data clear or reinstall |
| `device_id`, `install_id`/`iid`, `bd_did`, `ssid` (server-issued) | `X/C09KC.java:20-23` | — | Every request | ❌ | Follows the above. The server may re-issue the same `device_id` if the other IDs or the fingerprint match |
| **Hourly ID re-report**: `did`, `iid`, `cdid`, `ssaid`, `clientudid`, `opud`, `gaid`, each natively encrypted (`RopaEncrypt`), plus `is_data_changed` | `com/ss/android/ugc/aweme/lancet/DeviceManagerLancet.java:58-240` → `https://cp-rp.tiktokv.com/track_event` | — | `cp-rp.tiktokv.com` | ✅ probably (needs a test) | Notices when IDs change, so keep substitutes stable, not rotating |
| Cross-app device mapping | `/service/2/cross_app_did_collect/` (`…/account/didmapping/CrossAppDidCollectApi.java:16`) | — | log/API | partly | Links IDs across ByteDance apps. Don't install CapCut/Lemon8 in the same profile |
| `sig_hash` (MD5 of the APK signing certificate), `apk_first_install_time`, install source | header builder (`X/C2342909Fp.java`) | — | Registration | ❌ | Leave alone. Detects re-signed or modded APKs |
| Signed device token `tt-device-guard-client-data` (key-pair backed) | `com/bytedance/bdinstall/BDDeviceTokenInterceptor.java:323,375` | — | API | ❌ | ❌ Cryptographic, can't be edited |

**Not collected:** IMEI, IMSI, phone number, SIM serial, `Build.SERIAL`, MAC address,
Bluetooth name or address. Only AppsFlyer *tries* IMEI by reflection, and it fails: there's
no `READ_PHONE_STATE`, and Android 10+ blocks it anyway. Evidence:
[`identity_and_request_params.md`](_evidence/v47/identity_and_request_params.md).

### 3.2 Region and network: where you are, without asking for location

| Data | Source | Perm? | Goes to | Fake? |
|---|---|---|---|---|
| `carrier` (name), `mcc_mnc`, `carrier_region` / `sim_region` (SIM country), `carrier_region_v2` (MCC) | `TelephonyManager.getNetworkOperator*` / `getSimCountryIso`, `Configuration.mcc` (`X/C1514805wG.java:603-646`, `SettingServiceImpl.java:507-620`) | — | Every API request | ✅ **A device with no SIM** sends empty values, a normal state. Don't spoof single values: the server cross-checks all of these |
| `sys_region`, `language`, `timezone_name`, `tz_offset`, 12/24-hour format | `Locale`, `TimeZone` | — | Every API request, metasec | Keep consistent with your IP. Mismatches get flagged |
| `ac` / `ac2` (network type, Wi-Fi 5 GHz), local IP | `ConnectivityManager`, `NetworkInterface` | — | API, Probe | Harmless |
| **Wi-Fi DNS servers** (DHCP dns1/dns2) | `WifiManager.getDhcpInfo` (`ms/bd/o/c1.java:17-35`, `cs/bd/o/i0.java:19`) | — (normal permission) | metasec, OECSec | Reveals your router's or NextDNS's resolver. Unavoidable on your network |
| **VPN up** (`Use-Vpn` header), **proxy set** (`Is-Mockip`) | `NetworkInterface` `tun*`/`ppp*`, `http.proxyHost` (`com/bytedance/touchpoint/data/interceptor/VPNInterceptor.java:38-77`) | — | API, on server-chosen paths | A VPN is visible but common. Not a ban signal by itself |
| Public IP → city/region | server side | — | every host | ❌ Inherent. Use approximate location or deny location, not mock GPS |

Precise location: needs your permission. Wi-Fi SSID/BSSID and cell info are read only by
the location SDK, which needs location permission. The default rules also drop the
location-upload paths ([§2.2](#22-the-server-can-re-route-any-host)).

### 3.3 Hardware fingerprint: what your phone *is*

All of this needs **no permission**. Most of it is invoked from native code by metasec or
OECSec, or uploaded by Pipo Probe to `/security/v1/psd/sample_info` on the API host
(`com/ss/android/ugc/aweme/pipo/probe/core/infoupload/ProbeApi.java:13`; fields are
server-selected, `X/C0EBA.java:220-516`). Evidence:
[`fingerprint_and_sensors.md`](_evidence/v47/fingerprint_and_sensors.md).

| Data | Source | Fake? |
|---|---|---|
| **Hardware key attestation**: Google-signed cert chain with verified-boot state, bootloader lock, patch level, attested brand/model | `KeyGenParameterSpec.setAttestationChallenge` + `setDevicePropertiesAttestationIncluded` (`X/C2318401Foq.java:46-58`, `cs/bd/o/a1.java:30-66`), OECSec | ❌ **Impossible**, and it exposes any spoofed `Build` values. It identifies the *device model/state*, not you |
| `Build.*` (model, brand, fingerprint, hardware, SoC, ABIs), ~70 `ro.*` properties, ROM version | `X/C0EBA.java:242-250`, `X/C1187310h03.java:852-863` | ❌ Must match the attestation |
| CPU (`/proc/cpuinfo`, cores, max/min frequency), **GPU renderer** (creates a GL context), RAM, disk total/free | `X/C0ASS.java:72-87`, `X/C1223470hwN.java:77-230,295-323` | ❌ Must match the model |
| **MD5 of the full sensor list** (name + vendor), sensor count | `cs/bd/o/l1.java:37-58` | ❌ Must match the model |
| Real screen size, dpi, refresh rate | `X/C0ASS.java:38-44`, `ms/bd/o/u1.java:16` | ❌ |
| **Full camera hardware spec** (per lens: sensor size, focal lengths, apertures, OIS…), with no camera permission | `X/C1187620h0Y.java:775-875` | ❌ |
| Audio input device list | `X/C0ASS.java:180-205` | ❌ |
| **Installed keyboards** (default + all IME packages) | `X/C0ASS.java:103-145` | Shows *which* keyboard apps you have, not what you type |
| **Installed accessibility services** | `ms/bd/o/j1.java:22-40` (method name inferred from its encrypted length) | Shows *which* a11y apps you have enabled |
| Screen lock set?, GMS version, app's own signature | `cs/bd/o/c1.java:16`, `ms/bd/o/r2.java`, `ms/bd/o/n0.java` | Leave alone |

### 3.4 Behavioral biometrics: *how* you use the phone (continuous, while the app is open)

| Data | Source | Notes |
|---|---|---|
| **Touch dynamics on every screen**: pressure, contact size, tool type, input-device ID, x/y/time path, tagged by screen | metasec wraps every Activity's `Window.Callback` (`ms/bd/o/g3.java:32-38`, `h3.java:49-51`, `i3.java:17`, `l3.java:120-151`) | **Keystrokes are not recorded** (`h3.java:34-35` passes them through). Built to tell humans from bots. A per-person touch "style" is plausible but unproven |
| Six motion sensors (accelerometer, gyroscope, magnetometer, gravity, linear acceleration, rotation) in native-controlled sampling windows | `ms/bd/o/q1.java:27-37`, `j2.java:59-84`, `i2.java:160-200`; OECSec `cs/bd/o/m1.java:29-39` | "Is this a real phone in a real hand?" |
| Gyroscope and light-sensor jitter (min/max) | Pipo Probe `X/C0EBA.java:98-170` | Same purpose |
| Battery level, charging state, and a **history of the last ~20 readings**; media volume; airplane mode; SIM state; mic/camera *permission status* | `ms/bd/o/g1.java`, `z2.java:38-51`, `e2.java`, `d0.java`, `d1.java`, `c2.java`/`d2.java` | Low-entropy liveness signals |
| Boot time / uptime | `X/C2003107sp.java:474` | Joins sessions across reinstalls on the same boot |

**Fake?** ❌ No. Synthetic or constant values are exactly what these collectors are built to
detect ([report 08 option C](08-mitigation-options.md)). They describe *a* device being held.
On a separate device or profile ([§5](#5-the-fake-substitute-plan)) they stop pointing to your
main identity.

### 3.5 Integrity and environment checks (root / hook / emulator)

These come from Pipo Probe (`X/C1187310h03.java`), metasec (`env_root`/`env_hook`) and the
on-device ML features (`X/C2003107sp.java`). They check for:
- **root**: it runs `which su` and `su -c` expecting `uid=0` (`X/C1187310h03.java:245,510`), which can pop a Magisk prompt;
- Magisk/KernelSU paths;
- Xposed/LSPosed/Frida (files, classes, `/proc/self/maps`);
- emulator/QEMU;
- cloud phones and containers;
- LineageOS-style ROMs;
- clone-app containers;
- unlocked bootloader;
- `/system` mounted read-write;
- developer mode and ADB;
- USB state;
- virtual cameras;
- mock-location app;
- being in a call / mic active.

These are **local checks whose results are reported**. They're why root-based spoofing
backfires: you would land in the "tampered device" bucket.

### 3.6 Your in-app behavior: the part that identifies your interests

| Data | Evidence | Goes to | DNS-blockable? |
|---|---|---|---|
| **6,079 distinct analytics event types** through the main logger `X/C10338042c.LJIIZILJ(event, params)` (~9,900 call sites): plays, `stay_time`, `h5_stay_time`, progress-bar scrubbing, likes, follows/unfollows, shares, comments, profile visits, LIVE watch duration, notification toggles, account switches… | list: [`applog_event_names.txt`](_evidence/v47/applog_event_names.txt) | `log*.tiktokv.com/service/2/app_log/`, `rtlog*` | ✅ partly (`log*`/`rtlog*`) |
| **Search text** (`search_keyword` 666 refs, `raw_query` 76, `keyword`, `query`) | full-tree key census | Search API + AppLog | ❌ The search API needs the query |
| **Per-video watch stats** (`play_time`, `duration`, `percent`, `enter_from`, `session_id`, `google_aid`) | `com/ss/android/ugc/aweme/feed/api/AwemeStatsApi.java:41-69`, forced to `api-core.tiktokv.com` | Feed host | ❌ **Same host as the feed** |
| Screen time and app-open counts (digital well-being) | `com/ss/android/ugc/aweme/digitalwellbeing/sdk/network/DwNetworkLayer.java:40-43` | API host | ❌ |
| Crash reports, perf metrics, **log files and heap dumps on server request** ("cloud control") | `MonitorInitTask.java:116-188`, `X/C1183540gty.java:17`, `X/C1194330hBN.java:352` | `mon*.tiktokv.com`, `mon.zijieapi.com`, `api-va` (heap dumps) | ✅ `mon*` (heap dumps on `api-va` ❌) |
| Install attribution, GAID, in-app events | AppsFlyer (`com/appsflyer/internal/AFj1xSDK.java:46-58`), Firebase `app-measurement.com` | third party | ✅ |

### 3.7 Personal content: only when you grant a permission or tap something

| Data | Gate |
|---|---|
| Precise location, Wi-Fi/cell scans | Location permission. Upload paths dropped by default rules |
| Contacts ("find friends") | Contacts permission + in-app action (report 05) |
| **Photo gallery scanning** ("On This Day", AI album suggestions, feature extraction) | Photo permission **plus** an in-app "allow" dialog: `has_allow_scan_album` is set only by the dialog's allow path (`X/C0HSS.java:21,46` ← `Y/ACListenerS106S0100000_35_I1.java:3735`). Settings `studio_skip_album_feature_extraction`, `studio_album_ai_*` |
| Clipboard | Only on user action (report 10) |
| Mic / camera | Permission + recording UI |

### 3.8 What it does *not* do (searched the whole tree)

- No reading of other apps' screens, notifications, keystrokes, SMS, call log, or
  browsing history.
- No full installed-apps list and no `QUERY_ALL_PACKAGES`. Root, hook and clone-app *package*
  probes target apps outside its 99-entry visibility list, so Android 11+ hides them.
- No IMEI/IMSI/phone number/serial/MAC.
- No Play Integrity or SafetyNet calls, and no Widevine device ID.

---

## 4. Where it goes, and the blocklist

Full host-by-host evidence: [`hosts_endpoints_blocklist.md`](_evidence/v47/hosts_endpoints_blocklist.md).
NextDNS denylist entries block the listed name **and all its subdomains**. **Never add
`tiktokv.com`, `tiktok.com` or `tiktokcdn.com` themselves.** That kills the app.

### 4.1 NextDNS denylist

**Tier 1: block now (telemetry or third-party only; no functional path found).**
```
rtlog.tiktokv.com
rtlog-va.tiktokv.com
rtlog-boot.tiktokv.com
rtlog16-normal-useast1a.tiktokv.com
rtlog.byteoversea.com
mon.tiktokv.com
mon-va.tiktokv.com
mon-sg.tiktokv.com
mon-boot.tiktokv.com
mon-i18n.tiktokv.com
mon15-normal-useast1a.tiktokv.com
mon16-normal-useast5.tiktokv.us
isnssdk.com
sgsnssdk.com
byteoversea.com
zijieapi.com
cp-rp.tiktokv.com
analytics.tiktok.com
analytics-sg.tiktok.com
analytics-exp-sg.tiktok.com
analytics.us.tiktok.com
rtc-logger-va.tiktokv.com
rtc-logger.tiktokv.us
appsflyersdk.com
appsflyer.com
app-measurement.com
google-analytics.com
doubleclick.net
googlesyndication.com
googleadservices.com
view.adjust.com
connect.facebook.net
```
Notes:
- `isnssdk.com` / `sgsnssdk.com` / `byteoversea.com` / `zijieapi.com` are legacy telemetry
  domains that the built-in rules already rewrite to `*.tiktokv.com`, so blocking them whole
  is low-risk.
- `cp-rp` (the hourly ID re-report) has no functional path in the code, but it is new. Watch for breakage.
- Skip `connect.facebook.net` and `graph.facebook.com` handling if you log in with Facebook.

**Tier 2: add after you've installed and logged in, then test.**
```
log.tiktokv.com
log-va.tiktokv.com
log-boot.tiktokv.com
log16-normal-alisg.tiktokv.com
log16-normal-useast1a.tiktokv.com
log22-normal-useast1a.tiktokv.com
log.tiktok-row.net
libra-va.tiktokv.com
libra-sg.tiktokv.com
libra-boot.tiktokv.com
pitaya.tiktokv.com
pitaya-boot.tiktokv.com
ugattribution-sg.tiktokv.com
ugattribution-boot.tiktokv.com
xdevice-api.tiktokv.com
xdevice-boot.tiktokv.com
```
- `log*` is the main behavioral event firehose (the biggest win). `log-va` also serves
  **device registration**, so blocking it on a fresh install can break sign-up.
- `libra` serves experiment flags, `pitaya` on-device ML tasks, `ugattribution` install
  attribution, and `xdevice` cross-device linking.

**Do not block (breaks the app):**
- `api*`, `search*`, `webcast*`, `im*`/`imapi*`, `oec-api`, `inapp`, `gecko*`, `jsb*` (`.tiktokv.com`);
- the CDNs (`*.tiktokcdn*.com`, `*.ibyteimg.com`, `*.ibytedtos.com`, `*.akamaized.net`, `*.ttwstatic.com`);
- verification/captcha (`verification*`, `vcs*`);
- **`mssdk*` / `sdfp*`**: request signing; blocking them leads to captchas or logout;
- `firebaseinstallations.googleapis.com` (push).

Unknowns (`tnc-boot`, `hotapi*`, `frontier*`, `bsync*`, `xlog*`, `fp*`, `scc`) are discussed
in the evidence file. Leave them alone unless you test one at a time.

### 4.2 Router firewall rules (NextDNS cannot block IPs)

Block outbound to these, all ports. This closes TikTok's own DNS path:
```
34.102.215.99      # TikTok HTTP-DNS resolver (rest of world) – also the video player's DNS
35.213.190.132     # second TikTok HTTP-DNS resolver
130.35.75.83       # dig.tiktokv.us resolver (US config; harmless to block elsewhere)
```
- **Do not** block `199.103.24.0/23`. Those are the pinned core-API addresses and the feed dies.
- Optionally, enable NextDNS *Parental Control → "Block bypass methods"* so `dns.google`
  DoH can't be used either. This affects every device on the network.
- **Expected effect:** since `ttnet_http_dns_prefer = 0`, blocking the resolvers should
  just keep TikTok on your normal DNS. The video player falls back to local DNS
  (`libttquic.so`: `RetryWithLocalDns`, "error cdn_ip … Use local dns").

### 4.3 Why this is still not airtight

- The server can, at any time, move `/service/2/app_log/` onto `api-normal.tiktokv.com` or
  pin `log-boot` to IPs ([§2.2](#22-the-server-can-re-route-any-host)).
- Saved backup resolver IPs survive in app data, so **clear TikTok's storage once after
  setting up the router rules**.
- Your watch stats, searches, screen time and app opens already ride the API host.
- DNS blocking reduces the volume and third-party spread. **It doesn't hide your behavior from TikTok.**

---

## 5. The fake-substitute plan

The key idea: you cannot hide *behavior* from the service that serves you the feed. You
**can** make sure the identity it attaches that behavior to is a throw-away one that isn't
connected to your real phone, accounts, contacts or other apps. Starve and isolate; don't
spoof values.

| # | Do this | What it replaces | Why it doesn't backfire |
|---|---|---|---|
| 1 | **Run TikTok in a separate Android profile**: Private Space (Android 15+), or a work profile via Shelter/Island. Better still, **a dedicated cheap phone or tablet with no SIM** on a guest Wi-Fi | ANDROID_ID/`openudid`/`ssaid`, `cdid`, `clientudid`, `device_id`, cross-app DID linking, contacts/photos access, the hardware fingerprint (dedicated device) | A fresh profile is a normal Android state with a new per-profile ANDROID_ID. On a dedicated device, everything it fingerprints describes *that* device. Nothing is spoofed, so nothing contradicts the attestation |
| 2 | **Delete the advertising ID** (Settings → Privacy → Ads) in that profile | `google_aid` | Zeros plus "limit ad tracking" is a mainstream state |
| 3 | **No SIM** in that device, or Wi-Fi-only | `carrier`, `mcc_mnc`, `carrier_region*`, `sim_region` | Empty carrier values are normal on tablets |
| 4 | **Deny** location (or "approximate"), contacts, photos (or "selected photos only"), mic and camera unless you're creating | precise location, Wi-Fi/cell scans, contacts upload, gallery AI scanning | Denial looks like millions of other users; mock GPS doesn't |
| 5 | **Don't log in** with your phone number, Google or Facebook account. If you need an account, use an email alias used nowhere else. Don't follow your real-life contacts | the link from that device identity to *you* | Links are what turn "a device that likes cooking videos" into "you" |
| 6 | NextDNS Tier 1 (and Tier 2 after login) + router IP rules ([§4](#4-where-it-goes-and-the-blocklist)) | third-party fan-out, crash/log uploads, hourly ID re-report, most of the event firehose | Those endpoints are best-effort. The app queues and moves on |
| 7 | Keep region signals **consistent**: timezone, locale and IP country should match. If you use a VPN, use the same country consistently | — | Mismatches are a stronger anomaly than the truth |
| 8 | Behave as if every tap is logged, **because it is** (search text, watch time per video). Use the web version in a hardened browser for anything sensitive | — | The only "fake" for behavior is not doing it in the app |

**Don't**:
- spoof `Build`/`ro.*`/sensor values;
- root or install LSPosed/Frida on the device you use for TikTok;
- use mock-location apps;
- run in an emulator or cloud phone;
- rotate IDs frequently.

Each one is explicitly detected ([§3.5](#35-integrity-and-environment-checks-root--hook--emulator)),
contradicts the hardware attestation, or trips `is_data_changed` on the hourly ID report.
Expect captchas, phone-verification walls or a shadow-limited account, while the
fingerprint still goes out.

---

### 5.1 Does the Morphe patch set help? (`icysymmetra/tiktok-patches-for-morphe` v0.8.1)

Reviewed from source, cloned 2026-11-04 into `_work/ext/` (not built or run). It is a
**features/UX patch set** (downloads, feed filter, playback speed, UI hiding). It is
**not** a privacy or anti-telemetry patch set. It targets **TikTok 46.2.3**, not 47.7.1.
A quick scan found no network code of its own in the injected extensions.

| Patch | Privacy value |
|---|---|
| `Disable login requirement` | ✅ **Useful**: browse without an account. That's the biggest single unlinkability step ([§5](#5-the-fake-substitute-plan) step 5). The device ID still exists |
| `Open external links directly` | ✅ Avoids the in-app browser and its JS bridge / TikTok Pixel |
| `Sanitize sharing links` | ✅ Strips tracking parameters from shared links, so recipients aren't tied back to you |
| `Enable non-personalized search` | Small. Search text is still sent |
| `Region spoof` | ⚠️ Rewrites only Java `TelephonyManager` country/operator/MCC-MNC calls. v47 also reads MCC from `Configuration.mcc` / `ro.cdma.home.operator.numeric` (`X/C1684906ib.java:8-16`, `carrier_region_v2`), and native code reads SIM state. That produces **inconsistent** region values, the anomaly §5 warns about. A SIM-less device is cleaner |
| `Feature Gate Lab` | Overrides A/B and settings flags, but **only keys in its own catalog**; unknown keys are rejected (`featuregatelab/FeatureGateLabStore.java:201`). The catalog has no telemetry keys. TTNet's DNS/dispatch config is a separate native path that it can't reach |

**Costs.**
- Patching re-signs the APK. `sig_hash` in the device-registration header changes, and
  metasec checks the app's own signature (`ms/bd/o/n0.java`). So TikTok's servers can
  tell you run a modified client. That's why the set needs a "Fix Google login" patch.
- You also lose Play Store updates, and the install source changes.

**Bottom line:** it helps with *unlinkability* (no login, no in-app browser, clean share
links). It does nothing about the device fingerprint, the ID re-reports, or the HTTP-DNS
bypass. Morphe could be used to write **custom privacy patches** for v47:
- make the hourly `cp-rp` uploader in `DeviceManagerLancet` a no-op;
- set `ttnet_http_dns_enabled: 0` and remove the IP pins in the built-in TTNet configs (`X/C03HO.java`);
- skip `InitAppsFlyer`;
- enable the existing compliance branch that blanks `android_id` (`DeviceManagerLancet.java:56-58`).

That is a separate project, each item needs live testing, and the server can still
override built-in TTNet config through TNC.

## 6. Answering the two questions directly

**"Can I simply deny the destinations in NextDNS and safely use it at home?"**
- *Partly.* DNS denies cut third-party trackers, crash and log uploads, the hourly
  ID re-report and (after login) the main event firehose.
- They **cannot** stop what rides the feed API, and they **cannot** stop
  TikTok's built-in resolver unless you add the router IP rules.
- Even then, the server can re-route later. Plan on re-checking your NextDNS logs every few
  app updates.

**"Can it be made to send no private information that identifies my behavior?"**
- *Not while you use the app.* What you watch, for how long, what you search and what you
  like is how the feed works, and it travels on the same signed requests as the videos.
- What you *can* achieve is that this behavior attaches to an isolated, throw-away device
  identity with no SIM, no real account, no contacts, no photos, no location, and no shared
  IDs with your main phone ([§5](#5-the-fake-substitute-plan)).
- The "spying on your other apps" fear is not supported by the code: Android's sandbox
  stops it, and the app requests none of the permissions that would get around that.

---

## 7. How to verify this on your own network

1. **Baseline:** with no blocks, open TikTok for 10 minutes. In NextDNS → Logs, filter on
   `tiktok`, `byte`, `isnssdk`, `appsflyer`. Expect the `*-boot` names first, then the
   post-TNC names (§2.2).
2. **Add Tier 1** and the router IP rules. Clear TikTok's storage, use it normally for a day.
   Check whether the feed, comments, DMs and LIVE still work.
3. **Watch the router's firewall hit counters** for `34.102.215.99` / `35.213.190.132`. Any
   hits mean the built-in resolver is active on your device, and the rules are doing work.
4. **Add Tier 2** one group at a time, after login.
5. **After each app update**, repeat step 1 and look for *new* names in the logs. A blocked
   name that stops appearing, while a new `api-*`-looking name or a raw-IP connection
   appears, means the server moved the traffic.
6. **Proof of payload contents** needs the dynamic setup in [report 07](07-assessment.md):
   a rooted test device (not your daily one), a MITM proxy, and Frida TLS-unpinning. The
   payloads to inspect first are `track_event` (cp-rp), `/service/2/app_log/`, and
   `/security/v1/psd/sample_info`.

## 8. Coverage and gaps

- **Full Java tree** searched (364,859 files). 3,224 methods failed to decompile.
- **Native code:**
  - `libsscronet.so`: analysed in Ghidra via REA, limited to the DNS/retry config path.
  - Other libraries: string-scanned only.
  - metasec and OECSec: payload format and send timing live in native code and weren't reversed.
  - v47's metasec strings are more heavily encrypted than v46's.
- **Server-pushed config** (TNC rules, Pipo Probe field lists, AppLog allow/block lists) decides
  much of the actual behavior and is invisible to static analysis.
- **23 dynamic-feature modules** now ship as `libdex_df_*.so` and were only string-scanned.
  Payments, OCR and kids mode are among them.
- The REA JADX bridge timed out on this 58-dex APK, so Java decompilation used the jadx CLI.
  REA was used for the signature, Ghidra and native analysis.
