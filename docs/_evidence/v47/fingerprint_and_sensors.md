# TikTok v47.7.1: passive device-fingerprint and environment-check surface

Static analysis of `com.zhiliaoapp.musically` v47.7.1. Java paths are relative to
`_work/v47/jadx-src/sources/`. Native evidence is from `_work/v47/strings/<lib>.txt`.
This builds on the v46 reports 05, 10 and 13. It does not repeat them.

**Calibration.** Static code shows what the app *can* collect. It does not show what goes
over the wire. "Sent" below means there is a code path that puts the value into a
request body or header. "Native-invoked" means a Java collector registered in a table
that the native security library calls by integer ID. When and how often native calls
it is not visible. Native `.so` files were only string-scanned, not disassembled.

---

## 0. Collectors found

There are five independent collectors, plus the usual AppLog/TTNet headers.

| # | Collector | Package / class | Owner | Transport |
|---|---|---|---|---|
| A | **MSSDK / metasec** (anti-fraud, request signing, captcha model) | `ms.bd.o.*` + `libmetasec_ov.so`; facade `com/bytedance/mobsec/metasec/ov/MS.java` | ByteDance security SDK | Native. Table of 53 Java handlers registered at `ms/bd/o/h2.java:84-144`, lib loaded at `h2.java:168`. Reports to `mssdk-*.tiktokv.com` / `*.byteoversea.com` (`docs/_evidence/telemetry_tier_hosts.txt`) |
| B | **OECSec / "CS"** (TikTok Shop security SDK) | `cs.bd.o.*` + `liboecsec_ov.so` + `cs_sensor_ov`; facade `com/tts/mobsec/oecsec/ov/CS.java`; Java bridges `X/C0ASS.java` | ByteDance (TikTok Shop) | Native. Handler table at `cs/bd/o/w1.java:228-293`, libs loaded at `w1.java:43,80`. Wired into OkHttp via `com/bytedance/frameworks/baselib/network/http/ok3/impl/OkHttp3SecurityFactorInterceptor.java:18` |
| C | **Pipo Probe** ("KYC device" risk probe), **new and large** | `com/ss/android/ugc/aweme/pipo/probe/*`; field resolver `X/C0EBA.java`; detectors `X/C1187310h03.java`, `X/C1187620h0Y.java`, `X/C1223470hwN.java` | First-party (payments/risk) | `POST /security/v1/psd/sample_info` (`pipo/probe/core/infoupload/ProbeApi.java:13,16`). Boot task (`init/ProbeApplogObserverBootTask.java:60-64`, `BOOT_FINISH`) plus WorkManager heartbeat (`core/regularreport/HeartbeatWorker.java:24`) |
| D | **Client-AI feature producer** (on-device ML features) | `X/C2003107sp.java`, `X/C2003307sr.java`; used by `com/ss/android/ugc/aweme/ml/feature/*` | First-party | Feeds on-device models. Upload not proven |
| E | **AppsFlyer** anti-fraud payload | `com/appsflyer/internal/*` | Third party | AppsFlyer endpoints |
| F | **AppLog / device_register headers** | key allowlists `X/C1398205dS.java:17`, `X/C1398405dU.java`, `X/C1396105d7.java` (monitor) | First-party | Every API call and register request |

There is also a small, targeted sender: **`com/bytedance/touchpoint/data/interceptor/VPNInterceptor.java:38-77`**.
On server-chosen paths (`ug_cheat_block_info.blockPath`, an incentive/rewards
anti-cheat feature) it adds the HTTP headers **`Use-Vpn`** (`tun*`/`ppp*` interface up)
and **`Is-Mockip`** (`http.proxyHost` set) to the request. This is a clear
*collected-and-sent* path.

---

## 1. Ranked signal inventory (most to least important for fingerprinting)

"Perm" means the Android permission needed. "—" means none: any app can read it.

### Tier 1: hard identity and attestation (cannot be convincingly faked)

| Signal | API / source | Perm | Component | Sent vs local | Citation |
|---|---|---|---|---|---|
| **Hardware key attestation**: EC P-256 key in AndroidKeyStore with `setAttestationChallenge(server nonce)`, `setDevicePropertiesAttestationIncluded(true)` (API 31+), `setIsStrongBoxBacked(true)` (API 28+). The cert chain is exported as PKCS7. The Google-rooted chain carries **verified-boot state, bootloader lock, OS patch level, and attested brand/device/product/model** | `KeyGenParameterSpec`, `KeyStore.getCertificateChain` | — | **OECSec (B)** | Native-invoked. Output is a byte blob for the server, so almost certainly sent | `X/C2318401Foq.java:46-58`; `cs/bd/o/a1.java:30-66` |
| Server-assigned `device_id` / `install_id` (iid); app-generated `openudid`, `cdid`, `clientudid`; MSSDK `secdeviceid` | AppLog / device_register | — | F, A | Sent (every request) | key lists `X/C1398205dS.java:17`; `libmetasec_ov.so.txt` (v46 report 13) |
| `android_id` (SSAID: unique per signing key, user and device) | `Settings.Secure.getString("android_id")` | — | First-party lancet (7 call sites), AppsFlyer | Sent via AppLog. **Gated:** the lancet returns `""` in a compliance mode | `com/ss/android/ugc/aweme/lancet/DeviceManagerLancet.java:55-64`; also `X/C09M9`, `X/C0DRY`, `X/C1377905aB`, `X/C1876707Wh`, `X/C822103Ir`, `X/C05IV` |
| GAID (Google Ad ID) | `AdvertisingIdClient.getAdvertisingIdInfo` (5 sites), `Info.getId` (25) | `AD_ID` | AppLog, Pipo Probe (`gaid`), AppsFlyer | Sent | Helios wrapper `X/C03NM.java` (`LLLLIILL`/`LLLLIIL`); `X/C0EBA.java:366` |
| App signing certificate (self-integrity / repackaging check) | `PackageManager.getPackageInfo(self, GET_SIGNATURES)` | — | metasec handler `n0` | Native-invoked | `ms/bd/o/n0.java` |

### Tier 2: high-entropy hardware profile (stable, cross-checked)

| Signal | API / source | Perm | Component | Sent vs local | Citation |
|---|---|---|---|---|---|
| Build identity: `MANUFACTURER`, `BRAND`, `DEVICE`, `MODEL`, `PRODUCT`, `FINGERPRINT`, `HARDWARE`, `SOC_MODEL`, `SUPPORTED_ABIS`, `VERSION.RELEASE/SDK` | `android.os.Build` | — | All collectors | Sent (Probe fields `build_*`, `device_cpu_abi`; AppLog `device_model`, `cpu_abi`, `rom`, `rom_version`) | `X/C0EBA.java:242-250`; `X/C1223470hwN.java:59-65`; `ms/bd/o/v.java:144-150` |
| System properties via reflection `SystemProperties.get`: ~70 `ro.*` keys, mostly ROM-version detection (`ro.miui.*`, `ro.build.version.emui`, `ro.vivo.*`, `ro.build.display.id`, `ro.board.platform`, `ro.hardware`, `ro.product.cpu.abilist*`) | reflection | — | Many; metasec native reads `ro.product.device/model`, `ro.build.version.release/sdk` | Sent (AppLog `rom_version`) | `X/C1187310h03.java:852-863`; `libmetasec_ov.so.txt:718-723,1385` |
| **CPU details**: `/proc/cpuinfo` `Processor`/`Hardware`/`Features`, core count (`/sys/devices/system/cpu/`), `cpuinfo_max_freq`/`min_freq` | file reads | — | **OECSec bridge**, Probe (`cpu_model`, `cpu_cores`) | Native-invoked / Probe-sent | `X/C0ASS.java:72-87`; `X/C1223470hwN.java:323` |
| **GPU renderer/version** (creates an EGL14 context to read the GL strings) | `EGL14` + GLES `glGetString` | — | Probe (`gpu_model`, `gpu_version`) | Probe-sent | `X/C1223470hwN.java:77-230`; `X/C0EBA.java:324,516` |
| **Sensor inventory hash**: MD5 of `[{name, vendor}]` over `getSensorList(ALL)` | `SensorManager.getSensorList`, `Sensor.getName/getVendor` | — | **OECSec** | Native-invoked | `cs/bd/o/l1.java:37-58` |
| Sensor count / model names (`light_sensor_model`, `gyroscope_sensor_model`) | `getSensorList`, `getDefaultSensor(4/5)` | — | Probe, Client-AI (`sensor_count`), AppsFlyer (`sensors`) | Probe-sent; AF-sent | `X/C0EBA.java:482-505`; `X/C1106610ett.java:24`; `com/appsflyer/internal/AFj1vSDK.java:105` |
| Display: real size (`getRealSize`), `densityDpi`, resolution, refresh rate, status-bar height, screen width/height | `WindowManager.getDefaultDisplay` (207 sites), `DisplayMetrics` | — | OECSec, metasec `u1`, Probe, AppLog (`resolution`, `density_dpi`) | Sent | `X/C0ASS.java:38-44`; `ms/bd/o/u1.java:16`; `X/C0EBA.java:262-282,340` |
| Total / free disk | `StatFs` (~150 sites) | — | Probe (`total_disk_space`, `free_disk_space`), monitors | Probe-sent | `X/C0EBA.java:295-308` |
| RAM | `ActivityManager.getMemoryInfo` (61 sites) | — | AppLog `ram_size`, monitors | Sent | `X/C1398405dU.java` |
| Camera hardware spec: per-camera ID, level, lens facing, sensor size, pixel array, focal lengths, apertures, OIS, flash, max faces, capabilities, output formats, logical-camera flag | `CameraCharacteristics` | — (reading characteristics needs no CAMERA perm) | Probe (`camera_specifications`, `camera_detail`, `front/back_camera_num`) | Probe-sent | `X/C1187620h0Y.java:775-875` |
| Audio *input* device list (type + name) | `AudioManager.getDevices(GET_DEVICES_INPUTS)` | — | OECSec | Native-invoked | `X/C0ASS.java:180-205` |
| Installed **input methods** (default IME + all IME package names) | `Settings.Secure "default_input_method"`, `InputMethodManager.getInputMethodList` | — | OECSec | Native-invoked | `X/C0ASS.java:103-145` |
| Installed **accessibility services** (id + eventTypes). The method name is encrypted; its length (36) matches `getInstalledAccessibilityServiceList` | `AccessibilityManager` via reflection | — | metasec `j1` | Native-invoked | `ms/bd/o/j1.java:22-40` (plaintext inferred, see §4) |

### Tier 3: behavioral biometrics (continuous, passive while the app is used)

| Signal | API | Perm | Component | Sent vs local | Citation |
|---|---|---|---|---|---|
| **Touch dynamics on every Activity**. metasec wraps each window's `Window.Callback` and records, per touch, pressure, size, toolType, flags, **input `deviceId`**, and the x/y/time trajectory tagged with the Activity class name. Injected or automated input stands out (deviceId, pressure 1.0 and so on) | `Application.ActivityLifecycleCallbacks` → `Window.setCallback(new h3(...))` | — | metasec (`msmodel_captcha.touch`) | Native-invoked | `ms/bd/o/g3.java:32-38`; `ms/bd/o/f3.java:19-24`; `ms/bd/o/h3.java:49-51`; `ms/bd/o/i3.java:17`; `ms/bd/o/l3.java:120-151` |
| Motion sensors: linear accel (10), gravity (9), gyroscope (4), rotation vector (11), accelerometer (1), magnetic field (2), at `SENSOR_DELAY_NORMAL`, on a "sensorThread". Also orientation computed from rotation matrix | `registerListener` | — | metasec (`q1`/`j2`/`t1`), **OECSec (same 6 types)** | Native-invoked | `ms/bd/o/q1.java:27-37`; `ms/bd/o/j2.java:59-84`; `cs/bd/o/m1.java:29-39`; `cs/bd/o/f0.java:37-38` |
| Native-controlled sensor sampling window. Native sets a sample count and start time, Java buffers 3-axis triples and returns them as a JSON array | `ms/bd/o/i2` | — | metasec handlers `e0`/`f0`/`g0`/`j0`/`k0` | Native-invoked | `ms/bd/o/i2.java:160-200`; `ms/bd/o/g0.java`; `ms/bd/o/f0.java` |
| Gyroscope min/max/jitter (x, y, z) and light-sensor min/max/jitter. Measures "is the phone held by a human?" | `registerListener(gyro)` on "ProbeGyroSampler", BPEA cert `bpea-pipo_probe_kyc_device_motion` | — | **Pipo Probe** | Probe-sent | `X/C0EBA.java:34-35,98-170` |
| Last ~50 sensor samples as a string | `ms/bd/o/k2` | — | metasec `v0` | Native-invoked | `ms/bd/o/v0.java` |
| Keystrokes | — | — | **Not recorded.** `dispatchKeyEvent` passes straight through | — | `ms/bd/o/h3.java:34-35` |

### Tier 4: environment and "integrity" flags (root / hook / emulator / automation)

Pipo Probe (`X/C0EBA.java:337-516`) wraps the detector library `X/C1187310h03.java`.
Every result is a structured `{state: detected|not_detected, items:[...]}` map.

| Field (Probe name) | How | Citation |
|---|---|---|
| `is_root`, `which_su`, `su_command` | Build.TAGS `test-keys`; `/system/app/Superuser.apk`; runs **`which su`** (Runtime.exec) and **`su -c …` expecting `uid=0`** (ProcessBuilder). On a rooted phone this can make Magisk show a su prompt or toast | `X/C1929307gv.java:~360-370`; `X/C1187310h03.java:242-252,1231-1238` |
| `root_paths` | ~60 paths: `/sbin/su`, `/system/xbin/su`, `/data/adb/magisk*`, `/cache/magisk.log`, `/dev/magisk`, KingRoot/360/Baidu root dirs… | `X/C1187310h03.java:62` |
| `root_packages` | Magisk (+ Kitsune `io.github.huskydg.magisk`), KernelSU `me.weishu.kernelsu`, SuperSU, KingRoot, Superuser… via `getPackageInfo` | `X/C1187310h03.java:61,787-850` |
| `system_rw` | parses `/proc/mounts` for `/system`, `/system_ext`, `/vendor`, `/product`, checking `rw`; `Os.stat`/`Os.access("/system", W_OK)` | `X/C1187310h03.java:255-435` |
| `is_bootloader` | `ro.boot.flash.locked`, `ro.boot.verifiedbootstate == "orange"` | `X/C1187310h03.java:65-72` |
| `is_hook`, `hook_framework` | packages (Xposed installer, LSPosed, EdXposed, VirtualXposed, Magisk), classes `de.robv.android.xposed.XposedBridge`/`XC_MethodHook`/`com.saurik.substrate.MS$2`, files (`XposedBridge.jar`, `app_process*_xposed`, `libxposed_art.so`, `libsubstrate.so`, **`/data/local/tmp/frida-server`**, `/system/bin/frida-server`, `/data/adb/lspd`, `/data/adb/riru`), and **`/proc/self/maps`** scanned for `frida`/`gadget`, `xposed`/`lsposed`/`edxposed`, `substrate`/`cydia` | `X/C1187310h03.java:54-57,587-785` |
| `is_emulator`, `is_qemu`, `qemu_paths` | Build heuristics (`generic`, `google_sdk`, `Emulator`, `Android SDK built for x86`, `Genymotion`); `ro.kernel.qemu`; `/dev/qemu_pipe`, `/dev/qemu_trace`, `/dev/socket/qemud` | `X/C1187310h03.java:59,143-190,489-493` |
| `is_cloud_phone`, `cloud_phone_path` | ~70 artefacts of **cloud phones / containers**: Redfinger, Haima, Anbox, docker/lxc cgroups, `/dev/cpuset/kube-proxy`, YP/Tenc/LG cloud ROMs | `X/C1187310h03.java:58,192-240` |
| `is_third_party_roms`, `third_party_rom_jar` | LineageOS / CyanogenMod / MoKee framework jars | `X/C1187310h03.java:60,439-487` |
| `is_multi_app` | own package/process name contains `clone/dual/parallel/multi/island/virtual/shadow`; probes Parallel Space, Island, Tencent multi-open | `X/C1187310h03.java:1173-1200` |
| `is_developer_mode`, `is_debugger`, `is_usb_linking`, `usb_status`, `usb_devices` | `Settings.Global development_settings_enabled`, `adb_enabled` or debuggable flag; sticky `ACTION_USB_STATE` (connected/configured/adb); `UsbManager` device list counts (audio/video/storage/HID) | `X/C1187310h03.java:1090-1106,1001-1043,866-1000` |
| `is_accessibility_services` | `Settings.Secure accessibility_enabled` / `enabled_accessibility_services` | `X/C1187310h03.java:1045-1060,574-585` |
| `is_proxy`, `is_vpn` | `System.getProperty("http.proxyHost/Port")`; `NetworkInterface` name `tun0`/`tun1` | `X/C1187310h03.java:79-92,495-504` |
| `usb_camera_exist`, `camera_hooked`, `camera_available_count` | virtual-camera apps (DroidCam, EpocCam, Iriun, iVCam, ManyCam, IP Webcam…), `/proc/self/maps` for `v4l2loopback`/`virtualcamera`/`droidcam`/…, hook libs in camera path, `EXTERNAL` lens | `X/C1187620h0Y.java:36-38,277-640` |
| `is_screen_exposed` | hard-coded `"inaccessible"` (not implemented) | `X/C0EBA.java:353-355` |
| `is_in_calling`, `is_mic_active` | `AudioManager` mode / active recording configs (`isClientSilenced`) | `X/C1187310h03.java:1121-1170` |

Similar but separate checks:

- **Client-AI (D)** (`X/C2003107sp.java`): `is_rooted` (274), `is_emulator` (395; Build + `goldfish`/`ranchu` in `X/C1101700ely.java`), `is_vpn_on` (280, `NetworkCapabilities`), `is_proxy_on` (88), **`is_mock_location`** (153; `Settings.Secure mock_location_app` / `mock_location`), `is_usb_debug` (361), `is_developer_mode` (239), `has_sim_card`/`sim_count` (436, uses `READ_PHONE_STATE` only if granted, which the manifest never requests), `last_boot_timestamp` (474, `now − elapsedRealtime`), `device_uptime_sec`, `app_install_source` (`getInstallSourceInfo`, `X/C1107610evV.java`), `battery_pct`, `is_charge`, `screen_refresh_rate`, `is_wifi`, `net_quality_lv`, `tcp_rtt`/`http_rtt`.
- **AppsFlyer (E)** reads a property map for emulator/translation detection: `ro.arch`, `ro.chipname`, **`ro.dalvik.vm.native.bridge`, `persist.sys.nativebridge`, `ro.enable.native.bridge.exec`** (ARM-on-x86 translation), `dalvik.vm.isa.*`, `ro.zygote`, `ro.allow.mock.location`, `vzw.os.rooted`, `ro.build.user`, `ro.kernel.qemu`, `ro.hardware`, `ro.product.cpu.abi*` (`com/appsflyer/internal/AFa1zSDK$19360$4.java:12-34`). It also sends battery (`btl`, `btch`), `dim`, `cpu_abi`, `build_display_id`, `last_boot_time`, `sensors`. **AppsFlyer android_id collection is switched on only for the `huaweiadsglobal_int` channel; IMEI and OAID collection are set off** (`com/ss/android/ugc/aweme/legoImp/task/InitAppsFlyer.java:715-728`).
- **metasec (A)** native strings `env_root`, `env_hook` (`libmetasec_ov.so.txt:730-731`). In v47 the actual checks are hidden behind native string encryption (see §4).

### Tier 5: soft and volatile state (low entropy alone, but used for "is this a real phone in a real hand?")

| Signal | API | Perm | Component | Citation |
|---|---|---|---|---|
| Battery level/scale, plug-or-voltage int, charging status (2/5), plus a **history ring of the last ~20 readings** | sticky `ACTION_BATTERY_CHANGED`; `BatteryManager.getIntProperty(CAPACITY=4 / CHARGE_COUNTER=1)` | — | metasec `g1`/`z2`/`e1`/`f1` (native strings `device_battery_state/level`); Probe `battery_capacity`, `battery_remaining`, `is_charging` | `ms/bd/o/g1.java`; `ms/bd/o/z2.java:38-51`; `ms/bd/o/e1.java`; `X/C1223470hwN.java:179,312` |
| Media volume % (`STREAM_MUSIC`) | `AudioManager.getStreamVolume(3)` | — | metasec `e2` (`phone_volume_size`) | `ms/bd/o/e2.java:15-19` |
| Airplane mode (16-char key = `airplane_mode_on`) | `Settings.Global` | — | metasec `d0` (`fly_mode`) | `ms/bd/o/d0.java:14` |
| Mic / camera **permission status** (31/25-char strings = `android.permission.RECORD_AUDIO` / `CAMERA`) | `checkSelfPermission` | — | metasec `c2`/`d2` (`micphone_status`, `camera_status`) | `ms/bd/o/c2.java`, `ms/bd/o/d2.java` |
| SIM ready | `TelephonyManager.getSimState()==5` | — | metasec `d1` | `ms/bd/o/d1.java:11-12` |
| Wi-Fi DHCP **DNS servers** (dns1/dns2) | `WifiManager.getDhcpInfo` | `ACCESS_WIFI_STATE` (normal) | metasec `c1`, OECSec `i0`, TTNet | `ms/bd/o/c1.java:17-35`; `cs/bd/o/i0.java:19`; `com/ttnet/org/chromium/net/AndroidNetworkLibrary.java:288,370` |
| Network type / operator / SIM operator / country ISO / carrier region | `TelephonyManager.getNetworkOperator*`, `getSimOperator*`, `getSimCountryIso`, `NetworkInfo` | — | AppLog `carrier`, `mcc_mnc`, `sim_region`; OECSec `getNetworkOperator` | wrappers in `X/C03NM.java`; `X/C1398205dS.java:17`. **Note:** Probe returns `""` for `android_id`/`carrier`/`carrier_region` (`X/C0EBA.java:317,521-523`) |
| Screen brightness, brightness mode | `Settings.System screen_brightness` (18 files) | — | Probe | `X/C1223470hwN.java:300` |
| Keyguard secure (screen lock set) | `KeyguardManager.isKeyguardSecure` | — | OECSec | `cs/bd/o/c1.java:16` |
| GMS availability / version ≥ 13000000 | `GoogleApiAvailability` | — | metasec `r2` | `ms/bd/o/r2.java:29-30` |
| Locale, sys region, timezone ID / raw offset, 12/24-hour | `Locale`, `TimeZone`, `DateFormat.is24HourFormat`, `Settings.System time_12_24` | — | metasec `q0`/`r0`/`a1`, Probe, AppLog | `ms/bd/o/q0.java:13`; `X/C0EBA.java:282-288` |
| Boot time / uptime | `System.currentTimeMillis() − SystemClock.elapsedRealtime()` | — | Client-AI, monitor `phone_startup_time`, AppsFlyer `last_boot_time` | `X/C2003107sp.java:474`; `X/C1210604oI.java:224` |
| Local IP (`eth_ip`), net type | `NetworkInterface`/`InetAddress.getHostAddress` (35 sites) | — | Probe | `X/C0EBA.java:256,309` |
| Font / animation scales, nav mode, a11y display prefs | `Settings.*` (`animator_duration_scale` ×26, `font_scale`, `navigation_mode`, `high_text_contrast_enabled`…) | — | UI code (layout, mostly local) | rg census |
| `bytest_automation_info` (ByteDance internal test-automation flag) | `Settings.Global` | — | `X/C432370GxF.java:34` | — |

### Location-gated (needs location permission, so not truly passive)

- Wi-Fi **SSID/BSSID/RSSI/frequency** and **scan results**: the i18n location SDK `com/bytedance/i18n/location/wifi/WifiClientImpl.java` → `X/C2309691Fan.java:24-45,133`. SSIDs are matched against server pick/block regexes, then encrypted with `RopaEncrypt` before collection. Also TTNet `AndroidNetworkLibrary.java:153` (scan list).
- **Cell info**: `getAllCellInfo` in `com/bytedance/i18n/location/cell/CellClientImpl.java:89`.
- `getLastKnownLocation`: `X/C0BIF.java:22`, `X/C0217004v.java:19`. ThreatMetrix: in v47 there is only a **hidden WebView that loads `h.online-metrix.net/fp/tags.js` (org `k8vif92e`) during payment/order flows** (`X/C2769014z.java:95-115`). The native TMX SDK is gone, and this is not passive.

---

## 2. Pipo Probe: field list and trigger model (new in v47; detail)

The full set of field names the resolver can serve (`X/C0EBA.java:220-516`):

`platform, aid, app_language, app_name, app_region, app_version, bundle_id, channel,
priority_region, domain, is_child_mode, device_brand, build_manufacturer, build_device,
build_model, device_type, build_product, device_cpu_abi, device_id, device_manufacturer,
eth_ip, iid, in_app, screen_height, screen_width, source, status_bar_height, sys_language,
sys_region, sys_timezone, time_system, is_charging, total_disk_space, free_disk_space,
net_type, os, screen_brightness, android_id(→""), carrier(→""), carrier_region(→""),
cpu_model, cpu_cores, gpu_model, gpu_version, battery_capacity, battery_remaining,
is_emulator, screen_refresh_rate, is_root, is_proxy, is_vpn, is_screen_exposed,
is_in_calling, is_mic_active, gaid, os_version, is_developer_mode, is_bootloader,
is_debugger, is_hook, hook_framework, is_usb_linking, is_multi_app,
camera_available_count, camera_specifications, front_camera_num, back_camera_num,
usb_camera_exist, camera_hooked, camera_detail, system_rw, root_packages, root_paths,
which_su, su_command, is_third_party_roms, third_party_rom_jar, is_cloud_phone,
cloud_phone_path, is_accessibility_services, is_qemu, qemu_paths, light_sensor_model,
gyroscope_sensor_model, gyroscope_sensor_{x,y,z}_{min,max}_value/_jitter_rate,
light_sensor_{min,max}_value/_jitter_rate, usb_status, usb_devices`.

**Which fields actually get collected is decided by the server.** The `native_fields` list
comes from the `pipo_probe_sdk_config` setting, globally or per "entrance". The compiled
default is an **empty list** (`pipo/probe/ab/PipoProbeSdkConfigSettings.java:72,118,159`).
Other server knobs: `heart_beat_enabled`, `heart_beat_interval`, `init_report_interval_sec`,
`gyroscope_sample_rate_hz`/`_window_sec`, `light_sample_*`, `pitaya_fields`
(on-device-ML field set). The boot task runs at `BOOT_FINISH` in the main process. The
heartbeat worker reports as `sdk_internal`/`heartBeat`. So this is a **passive-capable,
remotely-scoped** collector. Static analysis cannot say which fields a given account or
region receives.

---

## 3. Native layer (string scan only)

- **`libmetasec_ov.so`**: the readable strings are much thinner than in v46 (1,407 lines,
  `frida`/`xposed`/`ptrace` no longer visible). That points to stronger string
  encryption. What remains: `ro.build.version.release`, `ro.product.device`,
  `ro.product.model`, `ro.build.version.sdk`, and the captcha/risk model feature names
  `os_language, device_model, device_type, device_screen_size, device_status,
  device_battery_state, device_battery_level, env_root, env_hook, wifi_status,
  micphone_status, camera_status, fly_mode, phone_volume_size, device_info,
  msmodel_captcha.{motion,touch,text_edit}(_count), app_status, package_status,
  cs_od_model, probability, prediction_status`, plus `schedule_report_interval`,
  `autoReport`, `task_pull_interval`, `seed_pull_interval` (`libmetasec_ov.so.txt:690-748`).
  These names line up one-to-one with the Java handlers in §1 (d0=fly_mode, e2=volume,
  c2/d2=mic/camera, g1/z2=battery, c1=wifi DNS, q1/i2=motion, h3/l3=touch).
- **`liboecsec_ov.so`**: almost entirely encrypted (`ro.arch`, `oec_sec_token_ke`, `ptrace`).
- **`libapplog_rust.so`**: `/proc/self/cgroup`, `/proc/self/mountinfo`, `/sys/fs/cgroup`,
  `ro.arch`. These look like Tokio runtime CPU-quota detection, not fingerprinting.
- **`libsscronet.so`**: `/proc/cpuinfo`, `/proc/self/maps`, `/sys/devices/system/cpu/{possible,present}`.
  The `frida`/`xposed` hits are false positives inside Brotli's dictionary
  (`fridayjuniordollar…`).
- `/proc/self/maps` appears in 21 libs, mostly crash/hook infrastructure
  (`libartshadowhook`, `libnpth_*`). `ptrace` appears in 8, including metasec and oecsec.
  `__system_property_get` appears in 61 libs.
- Dynamic-feature dex dumps: `libdex_df_pipo_external_payments` has a RootBeer-style list
  (`com.topjohnwu.magisk`, `eu.chainfire.supersu`, `goldfish`, `init.goldfish.rc`,
  `/system/xbin/su`, `android_id`). That module is downloaded only when external payments
  are used.

---

## 4. Limits of this analysis

1. **metasec and OECSec Java strings are encrypted** through the native `ms.bd.o.k.a(...)`
   decryptor (`ms/bd/o/k.java:8`). The XOR keystream is not a simple hash of the seed,
   and I did not reverse it. The plaintext names in §1 marked "length matches" are
   **inferred**: the byte-array length matches the obvious Android constant, and the
   native feature names agree. They are not decrypted.
2. **Which native handler is called, when, and how often cannot be seen.** Neither can
   the report schedule or the payload format (encrypted, to `mssdk-*`).
3. The attestation blob's trigger (`cs/bd/o/a1`) is native-invoked. Static analysis
   cannot tell whether it fires at startup, per sensitive request, or only on TikTok
   Shop flows.
4. Pipo Probe field sets, the AppsFlyer config and the `ug_cheat_block_info` paths are
   all **server-pushed**.
5. There are 49 dynamic-feature modules. Only the string dumps present in `_work/v47/strings/`
   were scanned.

---

## 5. Things searched for and not found

| Searched | Result |
|---|---|
| IMEI / MEID / IMSI / phone number / SIM serial (`getImei`, `getMeid`, `getDeviceId` on TelephonyManager, `getSubscriberId`, `getLine1Number`, `getSimSerialNumber`) | **0 call sites.** No `READ_PHONE_STATE` in the manifest. AppLog key names `serial_number`/`sim_serial_number`/`build_serial` exist only in allowlists |
| `Build.SERIAL` / `Build.getSerial()` | Only in the Helios hook config, never called |
| **MAC address** (`getHardwareAddress`, `getMacAddress`, `/sys/class/net`, `wlan0`) | **0** in Java and **0** in native strings |
| Bluetooth name/address/bonded devices | None. Only `getProfileConnectionState(HEADSET)` for audio routing (`X/C1803210x1R.java:30`) |
| `getInstalledPackages` / `getInstalledApplications` / `QUERY_ALL_PACKAGES` | **0 / absent.** The root/hook/clone/virtual-camera package probes use `getPackageInfo` on names **not in the 99-entry `<queries>`**, so on Android 11+ they normally return NameNotFound and **can't see the package**. File, path, `/proc` and class checks still work |
| Widevine `MediaDrm` `deviceUniqueId` | **0** (MediaDrm is used only for DRM playback) |
| Play Integrity / SafetyNet API | **0** in Java (only an iOS-named config model). The attestation in §1 is raw KeyStore attestation, not Play Integrity |
| `Location.isFromMockProvider` / `isMock()` | **0**. Mock detection is the `mock_location_app` setting only (Client-AI) |
| `UsageStatsManager` querying other apps | Only `getAppStandbyBucket()` for the app itself (`X/C0KI3.java:26`) |
| Keystroke capture in the metasec window hook | Not recorded (pass-through) |
| `TelephonyManager.getAllCellInfo` outside the location SDK | None |
| Native ThreatMetrix SDK (`com.lexisnexisrisk`) | **Gone in v47.** Only the payment-flow JS tag remains |
| Accounts | `AccountManager` only in login/auth flows (`getAccountsByType("com.google")`), not passive |

---

## 6. What this means for planning substitutes

- **Attestation (Tier 1) cannot be faked** without a leaked hardware keybox. If OECSec
  sends it, Build/`ro.*` spoofing will contradict the attested brand/model and verified
  boot state. Report 08's "spoofing backfires" conclusion is stronger in v47.
- **The checks are built to catch contradictions.** Sensor-list MD5 + GPU renderer +
  `/proc/cpuinfo` + camera characteristics + display all have to agree with `Build.*`.
  A spoofed model with the real SoC is a stronger signal than either one alone.
- Behavioral signals (touch input `deviceId`/pressure/toolType, gyro jitter, light-sensor
  jitter, battery history) are designed to tell real hands from emulators, cloud phones
  and automation. "Perfect" or constant fake values read as synthetic.
- Hook and root hiding has to cover `/proc/self/maps` names, `/proc/mounts` rw state,
  su binaries on PATH (note the **`su -c` exec probe**), `/data/local/tmp/frida-server`,
  `tun*` interfaces, `http.proxyHost`, `adb_enabled`/`development_settings_enabled`, and
  `mock_location_app`.
- Identifiers you can reset legitimately: GAID (reset in OS), `android_id` (changes only
  with the signing key or a factory reset), and app-generated `openudid`/`cdid` (cleared
  with app data, though v46 report 05 notes persistence schemes). The server-side
  `device_id` is re-derived from the fingerprint above.
