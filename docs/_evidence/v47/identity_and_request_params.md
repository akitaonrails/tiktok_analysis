# TikTok v47.7.1: device-identity fields sent without user action (static analysis)

All paths are relative to `_work/v47/jadx-src/sources/`. Everything below is from **static
reading of decompiled Java**. "Code reads X and puts it under key K" is **not** proof that K
reaches the wire. Server-pushed header block lists (see §5) can remove keys at runtime, and
native code (metasec) adds its own payloads that this pass can't see.

## 0. Architecture: who builds what

| Layer | Code | Role | Party |
|---|---|---|---|
| bdinstall "DeviceManager" header | `X/C2342909Fp.java` (collectors map, `LJ()` at ~l.110–360) + `X/C09KS.java` (device-params collectors) + `X/C2343409Fu.java` (SDK meta) | Builds the JSON **header** used by `device_register` and copied into every AppLog batch | ByteDance SDK (bdinstall 2.5.14.8, `X/C2343409Fu.java:57`) |
| Device-ID storage | `com/bytedance/bdinstall/storage/AbsDeviceParamsProvider.java`, `X/C09G1.java`, `X/C09JL.java`, `X/C1754106tl.java` | openudid / clientudid / cdid / device_id persistence | ByteDance SDK |
| Register endpoint | `X/C2330309At.java:10` → `https://log-va.tiktokv.com/service/2/device_register/` (or `api.tiktokv.com/...`); `X/C09BP.java:45` derives `/service/2/dsign/` | Device registration | SDK, TikTok-configured |
| AppLog v5 engine | `X/C09DL.java:1436-1438`, `X/C09MG.java:116-121`, `X/C09DK.java:150-158` | Wraps `{magic_tag:"ss_app_log", header, time_sync, _gen_time, launch/terminate/event...}` → `log-va.tiktokv.com/service/2/app_log/` (`com/ss/android/ttf/tasks/applog/AppLogNetworkContextImpl.java:58`) | ByteDance SDK (applog 5.7.24) |
| Common URL params (SDK part) | `X/C047M.java:155-800` (`LIZ()` appends to every URL via `Uri.Builder.appendQueryParameter`, l.50-70) | `device_id`, `iid`, `openudid`, `cdid`, device/OS params | ByteDance SDK |
| Common URL params (TikTok part) | `com/ss/android/ugc/aweme/setting/services/SettingServiceImpl.java:507-620` (`installCommonParams`) → values from `com/ss/android/ugc/aweme/ml/feature/FeatureServiceManagerImpl.java:700-1240` (`f_global_*` features) | `carrier_region`, `mcc_mnc`, `sys_region`, `timezone_name`, `op_region`, `residence`, … | **First-party** |
| Carrier/region callback | `X/C1514805wG.java:603-646` (`AppLog.setSensitiveApiCallback`) → `X/C06VA.java` (BPEA-gated Telephony wrappers) | Supplies `carrier`, `mcc_mnc`, `sim_region`, `region`, GAID to the SDK header | **First-party** |
| Extra ID report | `com/ss/android/ugc/aweme/lancet/DeviceManagerLancet.java:58-240` | POST `https://cp-rp.tiktokv.com/track_event` | **First-party** |

Helios proxy: `X/C03NM.java` wraps every sensitive Android call. Each wrapper carries an API id
and name (e.g. `LLII` = `TelephonyManager.getNetworkOperator`, id 10337, l.1416-1422). That's
how the API behind each obfuscated call below was resolved.

---

## 1. `device_register` / AppLog **header** (JSON, POSTed without user action at first launch, then re-sent on header changes)

| Key | Real value | Android API / source | Runtime perm? | Persistence | Cite |
|---|---|---|---|---|---|
| `device_id` | Server-assigned numeric DID | Returned by register response, stored in SP (`device_id`, `bd_did`, `install_id` go to a dedicated SP) | none | Stored (SP; AccountManager mirror code exists, see notes) | `X/C09KC.java:21`, `X/C09G1.java:50-52` |
| `install_id` (`iid` in URLs) | Server-assigned per-install ID | register response → SP | none | Stored; new on reinstall/clear | `X/C09KC.java:20` |
| `bd_did`, `ssid` | Server-assigned IDs | SP | none | Stored | `X/C09KC.java:22-23` |
| `openudid` | **`Settings.Secure.ANDROID_ID`** (+`_local` suffix in local mode). Falls back to a random 80-bit hex (F-padded) if empty or equal to the emulator constant `9774d56d682e549c` | `C09M9.LIZ` → `C03NM.LLFZ` = `Settings$Secure.getString("android_id")` | none | ANDROID_ID: per app-signing-key + user + device on Android 8+; **survives reinstall and data clear**, reset only by factory reset. Also cached in SP `openudid` | `X/C2354909Kf.java:31`, `com/bytedance/bdinstall/storage/AbsDeviceParamsProvider.java:79-127`, `X/C09M9.java:9-20` |
| `clientudid` | Random `UUID.randomUUID()` | app-generated | none | SP `clientudid`; regenerated after data clear/reinstall | `X/C2354909Kf.java:29`, `AbsDeviceParamsProvider.java:36-60` |
| `cdid` | Random UUID | app-generated; mirrored to a second SP file + a cross-process store `C2543209xk` | none | SP; regenerated after data clear | `X/C09KG.java:21`, `X/C1754106tl.java:55-80` |
| `google_aid` | Google Advertising ID | `AdvertisingIdClient.getAdvertisingIdInfo().getId()` (`X/C09MA.java`, TikTok side `X/C1514805wG.java:620-632`) | none (needs `com.google.android.gms.permission.AD_ID`, which is declared, install-time) | Cached in SP `google_aid`; user can reset/delete it in Android settings | `X/C09K8.java:72` |
| `gaid_limited` | Limit-ad-tracking flag | `AdvertisingIdClient.Info.isLimitAdTrackingEnabled` | none | live/SP | `X/C09K8.java:74` |
| `carrier` | Network operator **name** | `TelephonyManager.getNetworkOperatorName` (`C06VA.LJI`) | none | cached | `X/C2354909Kf.java:22`, `X/C1514805wG.java:612-616` |
| `mcc_mnc` | Registered-network MCC+MNC (e.g. `72405`) | `TelephonyManager.getNetworkOperator` (`C06VA.LJ`) | none | cached | `X/C2354909Kf.java:27`, `X/C1514805wG.java:640-645` |
| `sim_region` | SIM country ISO | `TelephonyManager.getSimCountryIso` (`C06VA.LJIIIIZZ`) | none | cached | `X/C09KS.java:365`, `X/C1514805wG.java:605-609` |
| `region` | Locale country | `Locale.getDefault().getCountry()` | none | live | `X/C09KS.java:334`, `X/C1514805wG.java:634-637` |
| `language` | Locale language | `Configuration.locale` | none | live | `X/C09KS.java:318` |
| `timezone` | UTC offset in hours, clamped to -12..12 | `Calendar.getInstance().getTimeZone()` | none | live | `X/C09KS.java:320-327` |
| `tz_name` | e.g. `America/Sao_Paulo` | `TimeZone.getID()` | none | live | `X/C09KS.java:335` |
| `tz_offset` | Offset in seconds | `TimeZone.getOffset()` | none | live | `X/C09KS.java:336` |
| `access` | Network type (`wifi`/`4g`/`5g`…) | ConnectivityManager / TelephonyManager (`C166000kC.f3`) | ACCESS_NETWORK_STATE (normal) | live | `X/C09KS.java:146` |
| `os`, `os_version`, `os_api` | `Android`, `Build.VERSION.RELEASE`, `SDK_INT` | `android.os.Build` | none | static | `X/C09KS.java:38-40`, `X/C2343409Fu.java:26-34` |
| `device_model` | `Build.MODEL` (Pico headsets: special) | Build | none | static | `X/C09KS.java:41-47` |
| `device_brand`, `device_manufacturer` | `Build.BRAND`, `Build.MANUFACTURER` | Build | none | static | `X/C09KS.java:48-49` |
| `cpu_abi` | `Build.CPU_ABI` | Build | none | static | `X/C09KS.java:50` |
| `density_dpi`, `display_density`, `display_density_v2` | `DisplayMetrics.densityDpi` and bucket | Resources | none | static | `X/C09KS.java:82-108` |
| `resolution` / `resolution_v2` | `HxW` app area / `HxW` real panel (`Display.getRealMetrics`) | DisplayMetrics / WindowManager | none | static | `X/C09KS.java:88, 130` |
| `rom` | `MIUI-`/`FLYME-`/`EMUI-<ver>-` prefix + `Build.VERSION.INCREMENTAL` | Build + system props (`ro.build.version.emui`) | none | static | `X/C09KS.java:154-206` |
| `rom_version` | OEM ROM string (`miui_<ro.miui.ui.version.name>_<incr>`, `coloros_…`, vivo/flyme/amigo/360/letv…, else `Build.DISPLAY`) | SystemProperties | none | static | `X/C09KS.java:207-303` |
| `sig_hash` | MD5 of the APK signing cert | `PackageManager.getPackageInfo(GET_SIGNATURES)` | none | static (detects repackaged APKs) | `X/C2342909Fp.java:166-189` |
| `package`, `real_package_name`, `app_version`, `app_version_minor`, `version_code`, `update_version_code`, `manifest_version_code`, `app_name`, `tweaked_channel`, `display_name` | App metadata | PackageManager | none | static | `X/C2342909Fp.java:122-142` |
| `channel`, `aid`, `release_build`, `not_request_sender` | Build constants (`aid` 1233 for musically) | config | none | static | `X/C09K8.java:32-39` |
| `appkey` | `UMENG_APPKEY` manifest meta | PackageManager | none | static | `X/C2342909Fp.java:245` |
| `user_agent` | Stored UA string (usually the WebView UA, which embeds MODEL/build) | SP `user_agent` | none | SP | `X/C09K8.java:40-46` |
| `ab_version`, `app_language`, `app_region` | A/B group, in-app language/region | app state | none | SP | `X/C09K8.java:53-96` |
| `app_track` | JSON read from the **APK zip comment** (install-channel attribution) | `RandomAccessFile(getPackageCodePath())` | none | SP `applog_stats` | `X/C09K8.java:97-111`, `com/bytedance/ies/ugc/statisticlogger/config/SetAppTrackTask.java:55-80` |
| `custom{}` | Host-supplied bag: `dark_mode_setting_value`, `user_mode`, `user_period`, `is_kids_mode`, `filter_warn`, `is_non_personalized`, plus `priority_region`, `client_first_activation_time`, `x-tt-env` via `setHeaderInfo` | app state | none | — | `X/C09K8.java:113-151`; `com/ss/android/ttf/tasks/applog/InitAppLogHookImpl.java:253-294`; `com/ss/android/ugc/aweme/legoImp/task/InitAppsFlyer.java:373` |
| `device_category` | Device class (phone/pad…) | config | none | — | `X/C2342909Fp.java:313` |
| `apk_first_install_time` | `PackageInfo.firstInstallTime` (ms) | PackageManager | none | survives updates, resets on reinstall | `X/C2343409Fu.java:77` |
| `is_system_app` | Pre-installed flag (`FLAG_SYSTEM`) | ApplicationInfo | none | static | `X/C2343409Fu.java:83` |
| `req_id` | Per-request ID | generator `C1183370gth` | none | regenerated | `X/C2343409Fu.java:56` |
| `old_did` | Previous DID after migration | SP | none | stored | `X/C2343409Fu.java:61-68` |
| `guest_mode`, `device_platform`, `git_hash`, `sdk_version(_code)`, `sdk_target_version`, `sdk_flavor`, `harmony{}` | SDK/build metadata (Harmony: `hw_sc.build.*` props) | constants/props | none | static | `X/C2343409Fu.java:26-59` |
| AppLog-only: `platform`, `sdk_version 5072490`, `sdk_version_name 5.7.24`, `ab_sdk_version`, `time_sync`, `_gen_time` | Engine metadata | — | — | — | `X/C09DK.java:80,150-158`; `X/C09MG.java:116-121` |

Signed device token header (separate from the JSON): `BDDeviceTokenInterceptor` adds
`tt-device-guard-client-data` = Base64 JSON `{device_token, timestamp, …req sign}` to
selected requests, including `/service/2/dsign/` (`com/bytedance/bdinstall/BDDeviceTokenInterceptor.java:175, 323, 375`).
That's a key-pair-backed device attestation. Swapping JSON fields won't regenerate it.

## 2. Common query parameters appended to API URLs

### 2a. SDK-built part (`X/C047M.java`)
| Key | Value / API | Perm | Persistence | Cite |
|---|---|---|---|---|
| `device_platform`=android, `os`, `sub_os_api` (Harmony) | constants / props | none | static | `X/C047M.java:160-168` |
| `ssmix`=a | constant | — | — | `X/C047M.java:174` |
| `_rticket` | `System.currentTimeMillis()` | — | per request | `X/C047M.java:176` |
| `cdid` | random UUID (see §1) | none | SP | `X/C047M.java:179-185` |
| `channel`, `aid`, `app_name`, `version_code`, `version_name`, `manifest_version_code`, `update_version_code` | build metadata | none | static | `X/C047M.java:215-550` |
| `resolution` | `W*H` (DisplayMetrics) | none | static | `X/C047M.java:728-750` |
| `dpi` | `densityDpi` | none | static | `X/C047M.java:752-757` |
| `device_type` | `Build.MODEL` | none | static | `X/C047M.java:759-765` |
| `device_brand` | `Build.BRAND` | none | static | `X/C047M.java:766` |
| `language`, `os_api`, `os_version` (≤10 chars) | Locale / Build | none | static | `X/C047M.java:600-608, 767-768` |
| `ac` | network type | ACCESS_NETWORK_STATE | live | `X/C047M.java:769-771` |
| `iid`, `device_id` | server-assigned | none | SP | `X/C047M.java:782-789` |
| `openudid` | ANDROID_ID (only at param level `L0`) | none | ANDROID_ID | `X/C047M.java:790-794` |
| `ab_version`, `ab_client`, `ab_group`, `ab_feature`, `abflag` | A/B state | — | — | `X/C047M.java:704-722` |

### 2b. First-party part (`SettingServiceImpl.installCommonParams`, values resolved in `FeatureServiceManagerImpl`)
Per-request ("network_common_params"):
| Key | Value / API | Perm | Cite (put / resolver) |
|---|---|---|---|
| `carrier_region` | SIM country ISO, upper-cased (`TelephonyManager.getSimCountryIso`), debug mock override `C10365043d` | none | `SettingServiceImpl.java:547` / `FeatureServiceManagerImpl.java:723`, `X/C1024103zJ.java:96-113` |
| `region` | i18n-manager region, else system-locale country | none | `:549` / `:1136`, `X/C1024103zJ.java:84-94` |
| `op_region` | Settings `priority_region`; else SIM ISO; else **MCC→country table** from `getNetworkOperator`; else locale | none | `:551` / `:765`, `X/C1024103zJ.java:66-76, 202-258` |
| `timezone_offset` | `TimeZone.getRawOffset()/1000` | none | `:545` / `:745` |
| `app_language`, `content_language`, `locale`, `build_number` | app settings | none | `:533-543` |
| `uoo` | 1 if user has **Limit Ad Tracking** on (omitted in child mode) | none | `:536` / `:1030-1044` |
| `host_abi` | primary ABI (`Build.SUPPORTED_ABIS[0]` or host) | none | `:553` / `:958`, `SettingServiceImpl.java:494-503` |
| `ts` | server-synced Unix time (s) | — | `:560` / `:953`, `X/C1661306en.java` |
| `ac2` | `wifi` / **`wifi5g`** (from `WifiInfo.getFrequency` 4.9–5.9 GHz) / `5g` (NR) / … | ACCESS_WIFI_STATE (normal) | `:572` / `:978`, `X/C1779806xu.java`, `X/C1779906xv.java:33-40` |
| `effect_channel`, `fake_region` (internal `lark_inhouse` builds only), `pkg_build_env` | build | — | `:562-569` |
| + `ICoinService.LJ()` map | coin/rewards params | — | `:555-559` |

Once per process ("network_common_params_once", via `C923903j9.LIZ`):
| Key | Value / API | Perm | Cite |
|---|---|---|---|
| `mcc_mnc` | `TelephonyManager.getNetworkOperator` | none | `SettingServiceImpl.java:588` / `FeatureServiceManagerImpl.java:897`, `X/C1649606cu.java` |
| `carrier_region_v2` | **SIM MCC** from `Configuration.mcc` (or `ro.cdma.home.operator.numeric` on CDMA) | none | `:593` / `:1079`, `X/C1684906ib.java:7-15` |
| `sys_region` | `Resources.getSystem().getConfiguration().locale` country | none | `:594` / `:770`, `X/C1024103zJ.java:115-122` |
| `timezone_name` | `TimeZone.getDefault().getID()` | none | `:590` / `:740` |
| `language` | system language | none | `:595` / `:834` |
| `current_region`, `residence` | **server-supplied** region/residence cached in `SharePrefCache` | none | `:591-592` / `:1210, 932` |
| `account_region` | logged-in user's account region | none | `:608` / `:913` |
| `last_install_time` | first-launch time (Keva `key_first_launch_time`)/1000 | none | `:607` / `:1131`, `X/C03AC.java` |
| `is_pad`, `is_foldable`, `is_flip`, `app_type` | form factor | none | `:589, 596-604` |

The same param set is exposed to H5/Lynx pages through an XBridge `getAppInfo`-style model
(`X/InterfaceC2732431Vz5.java`: keyPaths `device_id`, `iid`, `openudid`, `cdid`,
`mcc_mnc`, `carrier_region`, `sys_region`, `tz_name`, `uoo`, `idfa`…). Web content inside the
app can read them.

## 3. First-party out-of-band ID report: `cp-rp.tiktokv.com/track_event`
`DeviceManagerLancet.LIZLLL` runs on **cold_start / foreground / activity_resume**, at most
once per clock hour, gated by server setting `pumbaa_parameter_report_settings` (default `true`).
Triggers: `X/C18024073s.java:21,30,43`.
The POST body contains `app_id`, `did`, `report_type="OneTime"`, `trigger_source`, `app_version`,
`os`, `is_data_changed`, plus these values, each passed through **native** `RopaEncrypt.getEncryptSeqV2`:
`iid`, `cdid`, **`ssaid` (= ANDROID_ID)**, `clientudid`, **`opud` (= openudid)**, **`gaid`**
(`com/ss/android/ugc/aweme/lancet/DeviceManagerLancet.java:79-128, 152-170, 229-240`;
`com/bytedance/ropa/encrypt/RopaEncrypt.java:20`). Last-sent values are kept in Keva repo
`pns_common_id_mini` so the client can flag a change (`is_data_changed`). If you swap IDs, this
endpoint is built to notice.

## 4. Absent / neutralized identifiers

| Identifier | Status | Evidence |
|---|---|---|
| IMEI/MEID (`getDeviceId`/`getImei`) | **Not read by first-party or bdinstall code.** Only **AppsFlyer** (3rd party) tries `TelephonyManager.getDeviceId` by reflection. Without `READ_PHONE_STATE` (not declared) and on Android 10+ that throws SecurityException or returns null | `com/appsflyer/internal/AFg1wSDK.java:80-86`; manifest has no READ_PHONE_STATE/READ_PRIVILEGED_PHONE_STATE |
| `Build.SERIAL` / `getSerial`, `build_serial`, `serial_number` | **No reader found** in Java. The keys show up only in an allow-list (`X/C1398205dS.java:17`) and in the Helios hook table (`com/bytedance/helios/statichook/config/ApiHookConfig.java:795`). Key name only | — |
| `sim_serial_number` (ICCID), `udid` | Key names only: in a compliance "sensitive key" strategy list (`com/ss/android/ugc/aweme/compliance/api/settings/NetworkDataConfig.java:68`) and in allow-lists. No `getSimSerialNumber` call | — |
| MAC (`mc`, `mac_address`) | No `getMacAddress`/`getHardwareAddress` call. `mac_address`, `uuid`, `openudid`, `aliyun_uuid`, `oaid` are explicitly **removed** from Gecko's common params (`X/C10499048h.java:131-137`). Android 6+ returns `02:00:00:00:00:00` anyway | — |
| `aliyun_uuid`, `oaid` | Not populated by TikTok (OAID only inside AppsFlyer) | `X/C10499048h.java:135-136`; `com/appsflyer/internal/AFf1tSDK.java:65` |
| Wi-Fi SSID/BSSID, cell info | **Not in header/common params.** Used only by the location SDK (`com/bytedance/i18n/location/wifi/WifiClientImpl.java` → `X/C2309691Fan.java`; `CellClientImpl`), which needs location permission. Out of scope here | — |
| AccountManager ID mirror | `X/C09JL.java` would copy `device_id`/`install_id` into the app's own Account userData (authenticator `com.zhiliaoapp.account`), but **no caller of `DeviceRegisterManager.setAccount`/`AppLog.setAccount` was found**, so it appears to stay in memory only | `X/C09JL.java:72-87`; `com/ss/android/deviceregister/DeviceRegisterManager.java:584-587` |
| Kids / child mode | ANDROID_ID returns `""` and GAID is forced to `00000000-…` when strict-mode `kids_mode_overseas` fuses API 103000 (`X/C09M9.java:11`, `X/C03ZV.java:13-16`, `X/C06M3.java:13-27`). Child mode (`setChildModeBeforeInit`) also drops `google_aid` and `openudid` from the header (`X/C09K8.java:55`, `X/C2354909Kf.java:30`) and strips `openudid`/`uoo` from URLs (`X/C1183500gtu.java:45-52`) | — |

## 5. Blind spots and caveats
- **Native fingerprint**: `libmetasec_ov.so` (MSSDK) builds its own encrypted device fingerprint
  and request signatures (X-Argus/X-Gorgon family). These likely contain hardware/system
  properties not listed above. `RopaEncrypt` is native too. Neither was disassembled.
- **Server-pushed config** controls what actually goes out: `log_settings` returns header
  block/allow lists (`params_block_enable`, `header_custom_allow_enable`, `X/C09DL.java:1440-1446`;
  blocked headers `LJLIIL` in `X/C09DK.java:99`), `ApplogAllowKeysExp` (kids allow-list),
  `pumbaa_parameter_report_settings`, `common_params_host_abi`, `priority_region`, `tt_regions`.
- **Values cached and BPEA-gated**: Telephony reads go through `C06VA` with BPEA certs
  (`bpea-getNetworkOperator`…). A runtime policy could return empty or cached values.
- **Debug mocks**: `X/C10365043d.java` (`ITtmockService`) overrides carrier/op/sys region in
  internal builds. It's presumably null in the release build, but it shows which fields the
  server treats as region signals.
- **Server-side linkage**: `device_id` is issued by the server. Whether the server re-issues the
  same DID from openudid/GAID/fingerprint matches can't be seen statically.
- Not checked line-by-line: every caller of `AppLog.addCommonParams` (e.g. TTNet interceptors,
  `X/C1183500gtu.java`) and the AppsFlyer/Adjust/Facebook payloads (third party; AppsFlyer
  separately reads `android_id`, `com/appsflyer/internal/AFg1jSDK.java:1524`).

## 6. Refinement vs. v46 docs/05
- v46 said identity "survives app data clears via the openudid/cdid scheme". More precisely,
  **only `openudid` (= ANDROID_ID) and GAID survive a data clear or reinstall.** `cdid` and
  `clientudid` are random UUIDs in SharedPreferences and are regenerated. `install_id` and
  `device_id` are server-issued and stored in SP.
- New in this pass: the first-party `cp-rp.tiktokv.com/track_event` ID re-report (§3); the
  `ac2` Wi-Fi-band signal; `carrier_region_v2` (SIM MCC); `op_region`'s MCC-table fallback;
  `sig_hash`; `app_track` from the APK comment; and the `tt-device-guard-client-data` signed
  token.

## 7. Implications for substitution (for planning only)
- Consistency checks are possible server-side: `carrier_region` (SIM ISO) vs `carrier_region_v2`
  (SIM MCC) vs `mcc_mnc` (network) vs `sim_region` vs `op_region` vs `sys_region`/`region`/`tz_name`
  vs `current_region`/`residence` (server-derived, probably IP-based).
- `openudid`/`ssaid` (ANDROID_ID) and `gaid` are sent twice: in the header and to `cp-rp`
  (encrypted, with change detection).
- `sig_hash` exposes a re-signed or modified APK. The device-token header and metasec signatures
  are bound to keys you can't derive by editing JSON.
