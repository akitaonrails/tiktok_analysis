# TikTok v47.7.1: host census, telemetry endpoints, and a NextDNS blocklist

Static analysis only. All `file:line` refs are relative to
`_work/v47/jadx-src/sources/` unless noted. Config JSON = the two TTNet built-in
configs in `X/C03HO.java:17` (`LJII`, US) and `X/C03HO.java:18` (`LJIIIIZZ`, rest of world),
decoded at `_work/v47/c03ho/LJII.json` / `LJIIIIZZ.json`. Static code shows what the app
is built to do. It does not show what goes over the wire. Every "safe to block" call
below is a prediction, and none of it has been tested live.

---

## 1. Census and diff vs v46

Raw census: `/mnt/data/Projects/tiktok_analysis/_work/v47/hosts47.txt`, **1,350 hosts**.

Sources merged:
- Java URL literals (`https?://` and `wss?://`) plus bare quoted hostnames with a real TLD, across 364,870 files.
- Every hostname in both C03HO JSON configs (307).
- Native `.so` string tables in `_work/v47/strings/` (210). This now includes 23 `libdex_df_*.so` files, which are dynamic-feature dex packed as .so (payments, OCR, pitaya and others).
- Resource/asset files (107).
- The domain-suffix registry in `net47.txt` (541 registrable domains).
- Any v46 host still found by fixed-string search anywhere in v47.

Package-name noise (`com.bytedance.*`) was filtered out. Some doc and CRL hosts remain.

| | count |
|---|---|
| v46 master (cleaned) | 961 |
| v47 census | 1,350 |
| v46 hosts still present in v47 | 952 |
| **v46 hosts gone in v47** | **9**: `capcutforpc.com`, `lf16-tiktok-common.ttwstatic.com`, `lf16-tiktok-web.ttwstatic.com`, `p16-webcast.tiktokcdn-us.com`, `p19-sign.tiktokcdn-us.com`, `p19-webcast.tiktokcdn-us.com`, `v16m.tiktokcdn-us.com`, `tiktokimpact.com`, `skia.org` (all CDN or marketing, none telemetry) |
| v47 hosts not found anywhere in the v46 tree | ~254, mostly cert/CRL/doc/payments noise |

All 82 v46 `telemetry_tier_hosts.txt` entries are still present in v47.

**ByteDance hosts that are new in v47** (not found in the v46 decompiled tree, evidence files, or v46 .so list):
- Telemetry and identity: `fp.us.tiktokv.com` (in `libdex_df_pipo_bnpl.so`), `location.tiktokw.us`, `location-va.byteintl.com`, `ml.byteintl.net`, `reckon-us.tiktok-row.net`, `opencamera.tiktok-row.net`, `tosv-va.tiktok-row.org`, `starling.tiktokv.us`.
- Product: `search.survey.tiktok.com`, `sf-unpkg.tiktokcdn.com`, `p16-ug-incentive-img-sg.tiktokcdn.com`, `p16-common-sign-va.tiktokcdn-us.com`, `effect.local.tiktokv.com`, `open-ap-singapore-1.bytevcloudapi.com`.
- Firebase project: `musically-c51f4.firebaseio.com` / `.appspot.com`.
- Internal leaks: `code.byted.org`, `git.byted.org`, `bytedance.larkoffice.com`.
- A family of throw-away share-link domains (`vt./www./pro./pro-video.` × `tiklol.com`, `tt-best.com`, `ttmov.site`, `incentive-bonus.com`, …) in `X/C1KHF.java:6`. These look like alternate short-link and referral-incentive domains (probably for when the main domain is blocked in messengers). They are not telemetry.

Other new domains: `tiktok-row.net/.org` and `tiktokw.us/.eu` appear in v47 (`X/C1106804Ue.java:6` has `log.tiktok-row.net`; `X/C03HO.java:15` lists `.tiktokw.us`/`.tiktokw.eu` as first-party cookie suffixes). Three random-looking first-party suffixes are also listed: `.xzcs3zlph.com`, `.mzfvozqybf.com`, `.qfyf1toi.com` (`X/C03HO.java:13`). The default dispatch rules drop all traffic to them (§4).

---

## 2. Telemetry-tier endpoints: hosts, paths, and data

### 2a. AppLog (behavioral event firehose)
| Host / URL | Ref | Data |
|---|---|---|
| `https://log-va.tiktokv.com/service/2/app_log/` | `com/ss/android/ttf/tasks/applog/AppLogNetworkContextImpl.java:58` | Batched UI/behavior events (impressions, plays, clicks, session start/end) with the device header |
| `https://log-va.tiktokv.com/service/2/log_settings/` | same file `:53` | AppLog config pull (sampling, event allowlist) |
| `https://rtlog.tiktokv.com/service/2/app_log/` | same file `:68` | Real-time (high-priority) AppLog channel |
| `https://log-va.tiktokv.com/service/2/device_register/` (falls back to `https://api.tiktokv.com/service/2/device_register/` when a flag = 2/3) | `X/C2330309At.java:10,13` | **Device registration**: device fingerprint in, `device_id`/`install_id` out. This is not just telemetry (see §3) |
| `/service/2/app_alert_check/`, `/service/2/dsign/`, `/service/2/cross_app_did_collect/` | `com/bytedance/bdinstall/BDDeviceTokenInterceptor.java:175` (dsign), `com/ss/android/ugc/aweme/account/didmapping/CrossAppDidCollectApi.java:16` | Install-alert check, device-token signing, **cross-app device-ID mapping** (links the device_id across ByteDance apps) |
| `/service/2/app_log_monitor/`, `/service/2/app_log_test/` | `X/C2329709An.java:74`; `com/bytedance/helios/api/config/NetworkConfig.java:67` | AppLog self-monitoring / test |

Host variants: `log.tiktokv.com`, `log-va.tiktokv.com`, `log-boot.tiktokv.com`, `log16-normal-alisg.tiktokv.com`, `log16/22-normal-useast1a.tiktokv.com`, `log.byteoversea.com`, `log16.byteoversea.com`, `log.tiktok-row.net`, `rtlog.tiktokv.com`, `rtlog-va.tiktokv.com`, `rtlog-boot.tiktokv.com`, `rtlog.byteoversea.com`, `rtlog16-normal-useast1a.tiktokv.com`.

### 2b. APM / Slardar / crash (npth) / "cloud control"
| Host / URL | Ref | Data |
|---|---|---|
| `https://mon(-va/-sg).tiktokv.com/monitor/collect/` | `com/ss/android/ugc/aweme/legoImp/task/MonitorInitTask.java:116-118` | Perf metrics, network timings, custom events |
| `https://mon(-va/-sg).tiktokv.com/monitor/appmonitor/v2/settings` | same file `:177-188` | Pulls the APM sampling config |
| `https://mon-va.tiktokv.com/monitor/collect/c/exception` | same file `:81` | Caught exceptions |
| `https://mon-boot.tiktokv.com` (npth crash domain, behind the `pns_slardar_route_opt_enable_boot` flag) | `com/ss/android/ugc/aweme/legoImp/task/NpthCoreInitTask.java:111` | Java/native crash reports |
| `https://mon-boot.tiktokv.com/monitor/collect/custom_monitor/` | `X/C1184950gwF.java:84` | Custom metrics |
| `https://mon.isnssdk.com/monitor/collect/`, `/monitor/appmonitor/v4/settings` | `com/bytedance/android/livesdk/comp/impl/logger/slardarmonitor/LiveSlardarSdkConfigSetting.java:37`; `com/bytedance/pns/crypto2/CryptoInitializer.java:301` | LIVE SDK APM, hybrid/WebView monitor |
| `https://mon.tiktokv.com/monitor_browser/collect/batch/security/` (+ `mon-i18n.tiktokv.com`, `mon16-normal-useast5.tiktokv.us`) | `com/bytedance/hybrid/spark/security/web_js/setting/InlineInjectOptSettings.java:10` | Telemetry injected into WebViews (JS security monitor) |
| `https://i.isnssdk.com`, `i.sgsnssdk.com`, `mon.byteoversea.com` `/monitor/collect/batch/`, `/c/exception`, `/c/trace_collect`, `/appmonitor/v5/batch_settings` | `X/C1218404pY.java:20-44` | Legacy defaults; the dispatcher rewrites them to `mon-*` (§4) |
| Paths seen: `/monitor/collect/c/{crash,native_bin_crash,logcollect,trace_collect,code_coverage,core_dump_collect,core_dump_upload_check,rapheal_file_collect,exception/dump_collection,biz_exception}`, `/monitor/collect/quota_status`, `/monitor/collect/zstd_dict/` | `zt3/h.java:25-77`; `com/bytedance/apm/internal/ApmDelegate.java:790-826` | Crash dumps, **log-file and core-dump uploads**, code-coverage, traces |
| `https://mon.zijieapi.com/monitor/collect/c/cloudcontrol/file` (default, then rewritten to the configured mon host at `X/C1183830guR.java:129`) | `X/C1183540gty.java:17` | **Server-commanded file/log upload** ("cloud control": the server issues `/monitor/collect/c/cloudcontrol/get`, `X/C1183760guK.java:70`, and the client uploads the requested files) |
| `https://api-va.tiktokv.com/monitor/collect/c/mom_dump_collect/` | `X/C1194330hBN.java:352,422` | **Heap (hprof) dump upload, on an API host** |
| `https://choco.tiktokv.com/hippo/diagnosis/api/v1/explore/hprof` | `X/C1194440hBY.java:22` | Heap-dump diagnosis |

Host variants: `mon.tiktokv.com`, `mon-va.tiktokv.com`, `mon-sg.tiktokv.com`, `mon-boot.tiktokv.com`, `mon-i18n.tiktokv.com`, `mon15-normal-useast1a.tiktokv.com`, `mon16-normal-useast5.tiktokv.us`, `mon.isnssdk.com`, `monitor.isnssdk.com`, `mon.sgsnssdk.com`, `mon.byteoversea.com`, `mon-va.byteoversea.com`, `mon.zijieapi.com`.

### 2c. MSSDK / metasec / sdfp (signing + fingerprint)
- Hosts (config only): `mssdk-va/-sg/-boot.tiktokv.com`, `mssdk-va/-sg.byteoversea.com`, `sdfp-va/-sg.tiktokv.com`, `sdfp-va/-sg.byteoversea.com`, `xlog(-va).tiktokv.com` (`X/C03HO.java:17-18`).
- Paths in the boot path allowlists: `/ms/get_seed`, `/ms/dyn/task`, `/ms/dyn/check`, `/ms/dyn/report`, `/sdi/get_token`, `/ri/report`, `/mscc/common_setting`, `/mscc/host_setting` (`X/C1353105Qx.java:14`; `com/ss/android/ugc/aweme/feed/FeedColdBootNetworkSparseConfig.java:17`).
- No Java code builds an mssdk URL. The host strings in `libmetasec_ov.so` are encrypted, as in v46. `libsscronet.so` has `mssdk_post`, `x-metasec-bypass-mssdk`, `dns_skip_mssdk` (strings file lines 2187, 4412-4413), so the native network stack calls metasec on every request. Images opt out with `x-metasec-bypass-mssdk: 1` (`com/facebook/imagepipeline/request/ImageRequest.java:203`).
- Data: the encrypted device fingerprint (seed/token exchange, dynamic risk tasks, risk report). v46's conclusion stands: this is fused to request signing.
- DmtSec switches the collection mode by region (US/EEA → mode 503, else 603) at `com/ss/android/ugc/aweme/sec/DmtSec.java:272-284`.

### 2d. Libra / A-B testing
- `https://libra-sg.tiktokv.com/common`, `https://libra-va.tiktokv.com/common` (`com/tiktok/ttf/absettings/init/depend/InitAbSettingsDependDefault.java:66`; `X/C820703Id.java:20`). `/abtest/param/` is at `X/C498500Jgc.java:272`, and `/aweme/v1/abtest/param` is on the API host.
- Legacy `abtest-*-tiktok.byteoversea.com` is rewritten to `libra-*` (§4).
- Data: device/user identifiers out, experiment buckets and feature flags back.

### 2e. TNC / dispatch / HTTP-DNS
- `https://tnc-boot.tiktokv.com/get_domains/v5/?abi=…&tnc_src=…&okhttp_version=4.2.243.66-tiktok` (`com/bytedance/ttnet/tnc/TNCManager.java:535-539`; host from `X/C03HO.java:16`).
- HTTP-DNS resolvers: `34.102.215.99` path `/q`, `35.213.190.132` path `/q`, and `dns.google.com` path `/resolve` (`com/orbu/core/config/BootConfigKt.java:10`). `34.102.215.99` also appears at `com/ss/android/ugc/aweme/net/corenet/IESNetDepend.java:83`, `com/tiktok/ttf/network/depend/AbsIESNetDependAdapter.java:76`, and as the video preloader's own DNS host `player_medialoader_own_dns_host` (`com/ss/android/ugc/aweme/video/simpreloader/PreloaderExperiment.java:655`).
- `AddDFIDInterceptor.java:24-30` attaches DFID headers to calls to these resolvers.
- `libsscronet.so` also has `https://dns.google.com/resolve?name=` and a `dns-query` string (strings lines 7625, 10613).
- US: `dig.tiktokv.us` pinned to `130.35.75.83`.

### 2f. Frontier / sync websockets
- `wss://frontier-va.tiktokv.com/ws/v2` (`X/C03HO.java:17`; `com/ss/android/ttf/tasks/sync/InitSyncHookImpl.java:30`), `wss://frontier100-normal.tiktokv.com/ws/v2` (`com/ss/android/ugc/aweme/websocket/experiment/WsConnectionExtrasConfig.java:57`), and `https://bsync-va.tiktokv.com` (bytesync, `InitSyncHookImpl.java:25`).
- Data: server push (DMs, notifications, settings sync) plus client acks. These are functional channels.

### 2g. Other first-party telemetry-ish hosts
- `analytics.tiktok.com` → `analytics-sg.tiktok.com` for `/api/v2/pixel`, `/api/v2/performance`, `/api/v2/interaction`, `/api/v2/monitor`, `/i18n/pixel/log`. This is the TikTok Pixel inside ad landing-page WebViews (dispatch rule priority 30123).
- `rtc-logger-va.tiktokv.com/report`, `rtc-logger.tiktokv.us` (LIVE RTC logs, `X/C1152290g5Z.java:1684`; `com/ss/lyrax/live_core/interact/InteractEngineImpl.java:1637,1657`).
- `scc.tiktokv.com/ssp_sdk/event_report`, `/landingpage_report`, `/scc_sdk/url_scan_v3` (URL safety scanning plus report, `X/C1EQ9.java:44`, `X/C1219870hqZ.java:156`).
- `f-p-va.isnssdk.com/risk/request_vendor` (payment-risk vendor selection, `X/C659302hZ.java:81`).
- `pitaya*.tiktokv.com` (on-device ML tasks and models).
- `ugattribution-*` (install attribution).
- `xdevice-api/-boot` (cross-device).

### 2h. Third-party
| Vendor | Hosts / URLs | Ref | Note |
|---|---|---|---|
| AppsFlyer (SDK 6.14.0, `InitAppsFlyer` task) | `https://{prefix}{launches,inapps,conversions,attr,register,gcdsdk,validate,validate-and-log,viap,ars,adrevenue,monitorsdk,sdk-services,dlsdk,onelink,cdn-settings,app}.appsflyersdk.com/...` | `com/appsflyer/internal/AFj1xSDK.java:46-58`, `AFe1ySDK.java:95-96`, `AFg1nSDK.java:15`, `AFe1gSDK.java:25` | Install attribution, GAID, events. Block `appsflyersdk.com` (whole domain). `snssdk*.onelink.me` are share/deep links, not telemetry |
| Firebase Analytics | `app-measurement.com` | `X/C2373631Hvj.java:66` | GA4 events |
| Firebase Installations/FCM | `firebaseinstallations.googleapis.com` | census | **Needed for push notifications** |
| Adjust | `https://view.adjust.com` | `X/RunnableC1468520oJc.java:36` | **No Adjust SDK in v47.** This is only a click/impression ping for LIVE gaming-anchor promos (corrects v46 report 06) |
| ThreatMetrix | `https://h.online-metrix.net/fp/tags.js?org_id=k8vif92e&session_id=bytedance…/pipo_us…` loaded in a hidden WebView | `X/C2769014z.java:105-110`; also `libdex_df_pipo_bnpl.so` | Device fingerprint for **payment** risk only |
| Google ads | `securepubads.g.doubleclick.net`, `pagead2.googlesyndication.com`, `www.googleadservices.com`, `www.google-analytics.com` | census | Ads/measurement |
| Facebook | `graph.facebook.com`, `connect.facebook.net`, `m.facebook.com` | census; `com/ss/android/ugc/network/observer/bean/DetectorParam.java:37` (also a connectivity-probe target) | Login with Facebook, share, app events |
| Microblink | `ping.microblink.com`, `baltazar.microblink.com` | `libBlinkCard.so`, `libdex_df_ccdc_impl_ocr.so` | Card-OCR SDK licence ping (payments) |
| PayPal/Braintree | `b.stats.paypal.com`, `c.paypal.com`, `api-m.paypal.com`, `api.braintreegateway.com` | payments dynamic feature | Payment SDK |

---

## 3. Dual-use: telemetry on functional hosts (can't be DNS-split)

| Host | Telemetry carried | Evidence |
|---|---|---|
| `api-core.tiktokv.com` (and everything rewritten to it) | `/aweme/vN/aweme/stats/` (per-video play/watch stats batch with `log_extra`, `enter_from`, `session_id`, `google_aid`, `first_install_time`), `/aweme/v1/fast/stats/` | `com/ss/android/ugc/aweme/feed/api/AwemeStatsApi.java:41,46-51,69`; dispatch rule 30013 forces `/aweme/v\d+/aweme/stats/` → `api-core.tiktokv.com` |
| `api-normal.tiktokv.com` / `api*.tiktokv.com` (base `C04XV.LIZJ`) | `/tiktok/v1/screen_time/upload/`, `/tiktok/v1/app_open_times/upload/` (`com/ss/android/ugc/aweme/digitalwellbeing/sdk/network/DwNetworkLayer.java:40-43`), `/tiktok/v1/activity_status/report` (`X/C16FL.java:10`), `/aweme/v1/device/update/` (`X/C831503Mh.java:39`), `/aweme/v1/device/benchmark/`, `/bytebench/api/sdk/device/score`, `/v1/client/report_metrics` (rule 30015), `/service/2/device_register/` (flagged path, `X/C2330309At.java:13`) | as cited |
| `api-va.tiktokv.com` | `/monitor/collect/c/mom_dump_collect/` heap dumps | `X/C1194330hBN.java:352` |
| `log-va.tiktokv.com` / `log-boot.tiktokv.com` | Reverse case: a telemetry host that also does **device registration** and AppLog settings | `X/C2330309At.java:10` |
| `oec-api.tiktokv.com` | `/aweme/v1/oec/creator_union/chain_collector/visit_event/report` | `com/ss/android/ugc/aweme/ecommerce/base/pdp/repository/api/PdpApi.java:36` |
| `i.isnssdk.com`, `i.sgsnssdk.com` | Both settings and monitor paths; the dispatcher splits them into `api-*` vs `mon-*` | rules 30001 |
| `inapp.tiktokv.com` | Ad survey/feedback (`/ad/tetris/experience/*`) next to account pages (`/ucenter_web/device_management`) | `X/C371110Egd.java:473`; `X/C20790316Wt.java:250` |

The API host itself carries watch-time, screen-time, app-open counts and device updates.
No DNS rule can remove those without breaking the feed (v46 report 08's "watching is
reporting" point still holds).

---

## 4. TNC / URL dispatcher: can the server move hosts at runtime? Yes.

Mechanism (`wa4/l.java:80-82, 379-410`):
- The TNC response (from `tnc-boot.tiktokv.com/get_domains/v5/`) is stored in the SharedPreferences file `ttnet_tnc_config` under `tnc_config_str`.
- `ttnet_url_dispatcher_enabled` toggles the dispatcher.
- When `ttnet_dispatch_actions_epoch` changes, the whole `ttnet_dispatch_actions` list is **cleared and replaced** by the server's list, sorted by `act_priority`.
- Each action is either `tc` (host_replace / scheme_replace / drop) or `dispatch` (strategy_info host→host map). Matching uses `host_group`, `contain_group`, `equal_group`, `pattern_group` (regex).
- `libsscronet.so` also has `host_replace_map`, `tt_httpdns_host_pattern_map`, `httpdns_dispatch_config`, `ttnet_retry_force_httpdns_white_list`, `only_use_send_tnc_host_arrays` (strings lines 2702-3827).
- So the server can redirect any path on any host to any other host, and can pin any host to IPs through `ttnet_http_dns_addr`. That defeats per-hostname DNS blocking.

Built-in default rules (identical in US and ROW configs), quoted from `LJIIIIZZ.json`:
- `2001 dispatch "skip frontier"`: `/ws` on `*frontier*` are not dispatched.
- `2002 tc "force https"` on `*.tiktok.com, *.tiktokv.com, *.tiktokcdn(-us).com, *.ibytedtos.com, *.ibyteimg.com, *.byteoversea.com, *.akamaized.net`.
- `10009 tc drop:1 possibility:100` on `*.muscdn.com, *.musical.ly, *.mzfvozqybf.com, *.qfyf1toi.com, *.toutiao50.com, *.xzcs3zlph.com`.
- `10010 tc drop:1` on `*.snssdk.com, *.pstatp.com, *.byteimg.com, *.amemv.com, *.toutiao.com`. These are the China-domestic Douyin/Toutiao domains, hard-dropped client-side. This is reassuring.
- `10011 dispatch`: `ib.snssdk.com` `/service/2/device_sdk/stats_collect/` → `unavailable.tiktokv.com` (sinkhole).
- `10013 tc drop:1` on `host_group ["*"]` for `/location/submit/`, `/location/suusci/`, `/location/locate/`, `/location/batch-submit-wifi-bss/`, `/location/geocode/`, `/location/gis/reverse_geolocation`, `/aweme/v1/poi/geo/reverse`, `/aweme/v1/testidc/`. **Location-upload endpoints are dropped by default.** This is a reassuring negative, but TNC can override it.
- `30001`: `i.isnssdk.com`/`i.sgsnssdk.com` `/service/settings/vN/` → `api-va`/`api.tiktokv.com`; `/monitor/collect/` → `mon-va`/`mon-sg.tiktokv.com`.
- `30005 dispatch host_group ["*"]`: legacy→current map. `abtest-*-tiktok.byteoversea.com → libra-*.tiktokv.com`, `log(16).byteoversea.com → log.tiktokv.com`, `mon*.isnssdk/byteoversea/sgsnssdk → mon(-sg).tiktokv.com`, `mssdk-*.byteoversea.com → mssdk-*.tiktokv.com`, `sdfp-*.byteoversea → sdfp-*.tiktokv`, `f-p(-va).*snssdk → fp-va/fp-sg.tiktokv.com`, `pitaya*.bytedance/byteintl → pitaya(-task).tiktokv.com`, `xlog*.byteoversea → xlog*.tiktokv`, `rtlog.byteoversea → rtlog.tiktokv`, `starling/vcs/verify/tp-pay/smr/jsb/ug-sg.byteoversea → *.tiktokv.com`, `sg-link/va-link.byteoversea.com → www.tiktok.com`. In effect, **`*.byteoversea.com`/`*.isnssdk.com` are legacy aliases in v47 and the live traffic targets `*.tiktokv.com`.**
- `30011/30013/30015/30017`: all `api*` shards collapse to `api-core.tiktokv.com` (feed, post, **stats**, user) or `api-normal.tiktokv.com` (everything else, including IM and `/v1/client/report_metrics`).
- `30021/30023`: webcast → `webcast-normal.tiktokv.com`. `30031`: search → `search.tiktokv.com`. `30041`: oec live → `oec-api.tiktokv.com`.
- `30061 "applog"`: `log-va.tiktokv.com` → `log.tiktokv.com`. `30063 "rtlog"`: `rtlog-va` → `rtlog.tiktokv.com`.
- `30123`: pixel paths on `analytics.tiktok.com` → `analytics-sg.tiktok.com`.
- `9000000 "boot domain normalization"`: `api-normal→api-boot`, `api-core→api-core-boot`, `search→search16-normal-c-useast1a`, `webcast-normal→webcast-boot`, `webcast-ws→webcast16-ws-useast1a`, `hotapi-*→hotapi-boot`, `libra-*→libra-boot`, `log→log-boot`, `rtlog→rtlog-boot`, `mon(-va/-sg)→mon-boot`, `pitaya→pitaya-boot`, `vcs-*→vcs-boot`, `gecko-*→gecko-boot`, `jsb-*→jsb-boot`, `mssdk-*→mssdk-boot`, `ugattribution-sg→ugattribution-boot`, `xdevice-api→xdevice-boot` (all `.tiktokv.com`). This is the reason every blocklist must include the `*-boot` names: before TNC answers, they are what actually get resolved.

Other built-in values:
- `ttnet_http_dns_enabled:1`, `ttnet_tt_http_dns:1`, `ttnet_http_dns_prefer:0` (local DNS is tried first), `ttnet_http_dns_google:0`, `ttnet_local_dns_time_out:5`.
- `ttnet_http_dns_addr` pins `api-core-boot`, `api-boot`, `webcast-boot`, `search16-normal-c-useast1a.tiktokv.com` and `oec-api.tiktokv.com` to `199.103.24.{2,4,6,8}` (ROW). Telemetry hosts are **not** pinned by default.
- `client_key_config` signs `/passport/*` on `*.tiktokv.com`.

What this means for NextDNS:
- **Today**: telemetry hosts go through local DNS first, so NextDNS blocks apply. With `prefer:0` and a 5 s local timeout, it is unknown whether an NXDOMAIN/0.0.0.0 answer triggers an HTTP-DNS fallback. Test this live.
- **Tomorrow**: TNC can (a) re-home `/service/2/app_log/` onto `api-normal.tiktokv.com` via `pattern_group` + `host_replace`, or (b) pin `log-boot` to IPs via `ttnet_http_dns_addr`. Either defeats hostname blocking. Static analysis can't say whether the server does this.

---

## 5. Hard-coded IP literals

| IP | Use | Ref |
|---|---|---|
| `199.103.24.2/.4/.6/.8` | DNS pins for core API/webcast/search/oec boot hosts (ROW) | `X/C03HO.java:18` |
| `34.102.215.99` | TT HTTP-DNS (`/q`), default `ttnet_tt_http_dns_domain` (ROW), video preloader's own DNS | `X/C03HO.java:18`; `com/orbu/core/config/BootConfigKt.java:10`; `com/ss/android/ugc/aweme/net/corenet/IESNetDepend.java:83`; `PreloaderExperiment.java:655`; `X/C371110Egd.java:3838` |
| `35.213.190.132` | Second TT HTTP-DNS (`/q`) | `com/orbu/core/config/BootConfigKt.java:10` |
| `130.35.75.83` | `dig.tiktokv.us` pin (US HTTP-DNS) | `X/C03HO.java:17` |
| `35.244.141.111:443` | Connectivity probe target, along with `8.8.8.8:443` and `graph.facebook.com:443` | `com/ss/android/ugc/network/observer/bean/DetectorParam.java:37`; `X/C2590551Qbj.java:44`; `X/C07XV.java:47` |
| `8.8.8.8`, `8.8.4.4`, `1.1.1.1`, `1.0.0.1`, `9.9.9.9`, `149.112.112.112` | Chromium-style "known public DNS" sets in the LIVE/RTC QUIC stacks (DoH-capable resolver detection) | `com/ss/videoarch/live/ttquic/AndroidNetworkLibrary.java:30-39`, `com/ss/lyrax/live_core/core/transport/AndroidNetworkLibrary.java:30-39` |

Only the HTTP-DNS resolvers and the 199.103.24.x pins are direct-connect IPs. No IP-literal
telemetry endpoint was found in Java (native metasec strings are encrypted, so that part is unknown).

---

## 6. Proposed NextDNS blocklist

The user is in Brazil, so the ROW config applies; the US `.us` variants are harmless to include.
Every entry below is a static-analysis prediction. Add entries one tier at a time and test.

### A. Safe to block (telemetry-only, no functional path found)
```
# AppLog real-time channel
rtlog.tiktokv.com
rtlog-va.tiktokv.com
rtlog-boot.tiktokv.com
rtlog16-normal-useast1a.tiktokv.com
rtlog.byteoversea.com
# APM / Slardar / crash / cloud-control file pulls
mon.tiktokv.com
mon-va.tiktokv.com
mon-sg.tiktokv.com
mon-boot.tiktokv.com
mon-i18n.tiktokv.com
mon15-normal-useast1a.tiktokv.com
mon16-normal-useast5.tiktokv.us
mon.isnssdk.com
monitor.isnssdk.com
mon.sgsnssdk.com
mon.byteoversea.com
mon-va.byteoversea.com
mon.zijieapi.com
# TikTok Pixel / web analytics (ad landing pages)
analytics.tiktok.com
analytics-sg.tiktok.com
analytics-exp-sg.tiktok.com
analytics.us.tiktok.com
# LIVE RTC logging
rtc-logger-va.tiktokv.com
rtc-logger.tiktokv.us
# Third-party attribution / analytics / ads
appsflyersdk.com            (whole domain)
aps-webhandler.appsflyer.com
app-measurement.com
www.google-analytics.com
securepubads.g.doubleclick.net
pagead2.googlesyndication.com
www.googleadservices.com
view.adjust.com
connect.facebook.net
```

### B. Blocking breaks the app (do not block)
- Feed, API, login: `api-normal.tiktokv.com`, `api-core.tiktokv.com`, `api-boot.tiktokv.com`, `api-core-boot.tiktokv.com`, all `api*.tiktokv.com` / `api*-normal-*.tiktokv.com` shards, `api-t.tiktok.com`.
- `search.tiktokv.com`, `search16-normal-c-useast1a.tiktokv.com`.
- Video/image CDN: `*.tiktokcdn.com`, `*.tiktokcdn-us.com`, `*.tiktokcdn-eu.com`, `*.ibyteimg.com`, `*.ibytedtos.com`, `*.byteeffecttos-g.com`, `*.akamaized.net`, `*.ttwstatic.com`.
- LIVE: `webcast*.tiktokv.com`, `webcast-ws`/`webcast16-ws-useast1a.tiktokv.com`, `rtc*-access*`/`rtc-sg.tiktokv.com` (LIVE features).
- DMs: `im-va.tiktokv.com`, `imapi-16.tiktokv.com`.
- Shop: `oec-api.tiktokv.com`. Hybrid UI: `inapp.tiktokv.com`, `gecko-*.tiktokv.com` (Lynx/web resource packages), `jsb-*.tiktokv.com`.
- Captcha/verification: `verification*`, `verify-*`, `rc-verification*`, `vcs*.tiktokv.com`.
- **mssdk/sdfp** (`mssdk-*.tiktokv.com`, `mssdk-boot.tiktokv.com`, `sdfp-*`): request-signing seed/token. v46 conclusion: blocking leads to signature failure, captcha, or login loss.
- `firebaseinstallations.googleapis.com` / FCM (push), `graph.facebook.com` (only if you use Facebook login/share), `www.tiktok.com`, `vm.tiktok.com`/`vt.tiktok.com` (share links).

### C. Unknown / needs a live test
- **AppLog main** (`log.tiktokv.com`, `log-va.tiktokv.com`, `log-boot.tiktokv.com`, `log16/22-normal-*.tiktokv.com`, `log.byteoversea.com`, `log16.byteoversea.com`, `log.tiktok-row.net`). This is the most valuable telemetry to cut, but `log-va` also hosts **`/service/2/device_register/`** (`X/C2330309At.java:10`). Expect it to be fine on an already-registered install and to risk breaking a fresh install or re-registration. Suggested order: install, log in, then add these.
- **TNC** `tnc-boot.tiktokv.com`. Blocking it freezes the app on the built-in rules (which drop location paths) and stops the server from pushing new host rewrites. That looks attractive, but region routing and failover depend on it. Test.
- **Libra/A-B** `libra-va/-sg/-boot.tiktokv.com`, `abtest-*-tiktok.byteoversea.com`. v46 rated these blockable. With them blocked, the app probably runs on defaults, but some features may be gated off.
- **hotapi** `hotapi-va/-sg/-boot.tiktokv.com`, `hotapi*.isnssdk.com`. Settings/hot-config. Unclear.
- **Pitaya** (`pitaya*.tiktokv.com`, `pitaya*.byteintl.com`, `lf1x-pitayacdn.tiktokcdn.com`). On-device ML tasks; might degrade recommendations.
- `ugattribution-*.tiktokv.com` (install attribution), `xdevice-api/-boot.tiktokv.com`, `xlog(-va).tiktokv.com` (likely the metasec security log, so it may be coupled to signing), `smr-*.tiktokv.com`, `fp-va/fp-sg.tiktokv.com`, `f-p*.isnssdk.com`, `fp.us.tiktokv.com` (risk vendor; payments), `scc.tiktokv.com` (link scanner; may block opening links), `starling-*` (UI strings).
- `frontier-va.tiktokv.com`, `frontier100-normal.tiktokv.com`, `bsync-va.tiktokv.com` (websocket push: DMs/notifications are probably delayed, may fall back to polling).
- `h.online-metrix.net`, `ping/baltazar.microblink.com`, `b.stats.paypal.com`. These are only used in payments/coin purchase flows. Safe if you never buy anything.
- HTTP-DNS bypass: `dig.tiktokv.us` (DNS-blockable), plus `34.102.215.99`, `35.213.190.132` (IPs, so they need a router/firewall rule, not NextDNS). `dns.google.com` is used too, and blocking it affects other apps. Since `prefer:0` sends lookups to local DNS first, blocking the resolvers should just keep the app on NextDNS. Verify it doesn't break video preload (`player_medialoader_own_dns_host`).

### Residual limits
- The server can rewrite any host onto `api-*` or onto IPs (§4).
- Per-video watch stats, screen time and app-open counts already ride the API host (§3).
- MSSDK hosts and payloads live in encrypted native code.
- Dynamic-feature dex (`libdex_df_*`) was only string-scanned.
- The census regex misses hosts built at runtime (AppsFlyer `%s` templates were handled by hand).
