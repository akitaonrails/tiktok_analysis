# 01 — App Overview & Native Library Inventory

## Bundle structure (`.xapk` → App Bundle splits)

The `.xapk` is an APKPure wrapper around a Google Android App Bundle. It installs
as one base APK plus configuration and dynamic-feature splits:

| Split | Purpose |
|---|---|
| `com.zhiliaoapp.musically.apk` | Base APK — all code (37 dex) + shared assets |
| `config.arm64_v8a.apk` | Native `.so` libraries for arm64 (204 libs, 58 MB) |
| `config.en.apk`, `config.mdpi.apk` | English strings, mdpi resources |
| `df_kakao`, `df_line`, `df_line_nonus` | KakaoTalk / LINE social-login & share (dynamic feature) |
| `df_location` | Location feature module |
| `df_oppo_hyperboost` | OPPO device performance integration |
| `df_pns_biz` | Push-notification-service business module |

Additional dynamic features are declared as installable-on-demand in
`assets/dynamic_feature_install/` — including `df_camera`, `df_camera_biz`,
`df_ccdc_impl_ocr` (OCR — document/ID scanning), `df_gemini_nano` (on-device LLM),
`df_kids_mode`, `df_c2pa_fake` (content authenticity), and live/IM modules. These
download code after install, so a static snapshot of the base APK does not capture
100% of shipped code.

## Notable bundled assets

- `assets/api_key.txt` — a **Login-with-Amazon / Amazon Device Messaging** API JWT
  (issuer "Amazon", client `amzn1.application-oa2-client…`, bound to the app's
  signing cert). This is a legitimate embedded 3rd-party client credential for
  Amazon push/login, **not** a leaked secret.
- `assets/df_config.json` — the **preinstall attribution map**: which OEM/carrier
  preloaded the app (Xiaomi, Samsung, T-Mobile, Orange, SFR, IronSource/aura,
  Appnext, …) with `media_source`/`campaign` codes. Used to attribute installs.

## Native library inventory (the real engine)

204 native libraries ship for arm64. This is where the security-sensitive and
telemetry logic lives, and it is **not** analyzed at the instruction level here.
Grouped by function:

### Device fingerprinting / anti-tamper / security ("the interesting ones")
| Library | What it is |
|---|---|
| `libmetasec_ov.so`, `liboecsec_ov.so` | ByteDance **"MS SDK" / metasec** (a.k.a. Argus) — device signing, anti-fraud device fingerprinting, request signing. Talks to `mssdk-*.byteoversea.com`. This is the single most privacy-relevant native module. |
| `libpns_crypto.so`, `libpsiencrypt.so`, `libropaencrypt.so`, `libttcrypto.so`, `libEncryptor.so`, `libttboringssl.so` | Multiple crypto/obfuscation layers used to sign & encrypt telemetry payloads so they can't be trivially read on the wire. |
| `libcep*.so` (`libCepAuth`, `libCepEngine`, `libCepAST`) | Client-side execution/policy engine. |
| `libvcnverify*.so`, `libttmverify*.so`, `libavocadoguard.so`, `libfileprotect.so` | Integrity / verification / anti-repackaging. |

### Networking
`libsscronet.so` (Chromium **Cronet**, the basis of ByteDance's **TTNet** stack),
`libpumbaa-network.so`, `libnetecho.so`, `libstarship_*.so`.

### Telemetry / crash / performance monitoring
`libapplog_rust.so`, `libiesapplogger.so` (**AppLog** event pipeline),
`libnpth_*.so` (~15 libs — Native Page Trace crash/ANR handler),
`libsliver.so`, `libwatson.so`, `libbytemonitor.so`, `libmonitorcollector-lib.so`,
`libresource_monitor.so`, `libprofiler.so`.

### Media / camera / AI (expected for a video app)
`libvcn.so`, `libttffmpeg.so`, `libttmplayer.so`, `libNLE*.so` (video editor),
`libbytenn.so` / `libbytennwrapper.so` (neural-net inference), `libspeechengine.so`,
`libspeechsdk.so`, `libaudio_fingerprint_sdk.so` (audio matching), `libeffect*` /
`liblynx*` (Lynx — ByteDance's React-Native-like UI framework), `libTTMachine*.so`,
`libclient_ai_impl_jni.so`.

### Storage / DB
`libwcdb.so` (WeChat's encrypted SQLite fork), `libkeva.so` (ByteDance KV store).

**Takeaway:** the native layer is dominated by (a) a large media/AI/effects engine —
consistent with a video app — and (b) an unusually heavy **security, fingerprinting,
crypto and telemetry** subsystem. The concentration of device-signing and
payload-encryption libraries (`metasec`, multiple `*crypt*` libs) is the technical
reason independent researchers cannot easily audit TikTok's outbound data: the
payloads are assembled and encrypted in native code. That is the central finding of
the overview.
