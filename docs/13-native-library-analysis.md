# 13 — Native Library String Analysis (204 `.so` files)

The native libraries are where TikTok's most sensitive logic lives, and earlier
reports treated them largely as a black box. This report is a **`strings`-level sweep
of all 204 arm64 `.so` files** (~274k attributed strings). It is not disassembly — it
recovers hardcoded URLs, symbol/field names, paths, and log messages, but **not the
compiled logic**. Still, several libraries leak enough in cleartext to confirm (and
sharpen) findings that were previously inferred from Java.

Method: `strings -n 6` over every `_work/so/lib/arm64-v8a/*.so`, each line tagged with
its library, then category grep. Evidence:
[`_evidence/libmetasec_ov_strings.txt`](_evidence/libmetasec_ov_strings.txt),
[`_evidence/native_lib_sizes.txt`](_evidence/native_lib_sizes.txt).

## Headline — `libmetasec_ov.so` confirms the fingerprint-and-report engine in cleartext

The device-signing/anti-fraud library ("MS SDK" / metasec) exposes its purpose in
plaintext strings. This is the strongest direct evidence in the whole analysis for the
persistent-fingerprint claim (reports 04/05), and it was previously only inferred:

- **Identifiers/fields it handles:** `secdeviceid`, `device_id`, `device_info`,
  `device_model`, `device_type`, `device_screen_size`, `device_status`,
  **`device_battery_level`, `device_battery_state`** (battery state is a known
  fingerprinting vector), `ro.product.device`.
- **Request signing:** `http_reqsign`, `SHOULD_HAVE_SIGNATURE` — confirms it signs
  outbound API requests (the `X-Argus`/`X-Gorgon` family from report 08).
- **Hardcoded reporting endpoints (baked into the binary):**
  `https://i.isnssdk.com/monitor/collect/`, `https://mon.isnssdk.com/monitor/collect/`,
  `.../monitor/appmonitor/v2/settings`, plus `byteoversea.com`.
- **Scheduled reporting:** `reportURLs`, `msmodel_data_report_count`,
  `msmodel_data_report_tsp`, `schedule_report_interval`.
- **JNI reflection bridge:** `JWP_CallMethodByNameV` / `JWP_CallStaticMethodByNameV`
  (calls Java APIs from native by name — used to read device values without leaving an
  obvious Java call site).

So the native layer independently collects a device fingerprint (including battery and
screen metrics), signs it, and reports it on a timer to ByteDance monitoring endpoints.
This matches — and concretely substantiates — the telemetry tier in report 04.

## What is NOT there (reassuring negatives)

The scan specifically looked for covert-capability tooling and did not find it:

| Looked for | Result |
|---|---|
| Keystroke logger | **Not present.** The `keylog` hits are `KeyLogPath` / `keylog_callback` — the standard **TLS `SSLKEYLOGFILE`** debug feature in the BoringSSL/Cronet libs, not input logging. |
| Screen recording | `screen_record` = 0. `screenshot`/`captureScreen`/`screencap` hits are in `libtt_c2pa_sdk.so` (C2PA content-authenticity) and `libttmplayer.so` (video player), not covert capture. |
| Input injection / `/dev/input` reading | `/dev/input` = 0, `inject_input` = 0. The `getevent` hits are "get event" method names in media/graphics libs, not the shell input tool. |
| Embedded private keys / certs | Only 1 PEM block across all libs (a pinned cert/CA); no leaked private keys. |

## Anti-debug / anti-tamper (self-protection, concentrated in the right libs)

`ptrace` (22 refs), `/proc/self/maps` (20), and `frida`/`xposed` detection strings
cluster in exactly the libraries you'd expect: the security engine
(`libmetasec_ov.so`, `libavocadoguard.so`) and the crash/monitor suite
(`libnpth_*`, `libmonitorcollector-lib.so`, `libartshadowhook.so`). This is runtime
self-inspection / anti-hooking — reading the app's **own** process — consistent with
report 10. Not out-of-bounds.

## Crypto stack

Strong and standard: **BoringSSL** (1,568 refs — Google's TLS, the basis of TTNet),
plus `aes-256`, `chacha20`, `curve25519`. No weak/homebrew cipher identifiers stood out.

## Device-fingerprint signals spread across many libs

`getprop` (71 libs), `ro.build*` (45), `cpuinfo` (41), `/sys/devices/system/cpu/*`,
`getDeviceId` (21) appear across media, graphics, and monitoring libraries — partly
genuine fingerprinting, partly build-info collection for crash reports. Consistent with
the broad in-sandbox device profiling documented in report 05/10.

## Two "worth-noting" observations

1. **ByteDance-internal security toolchain.** `liboecsec_ov.so` and the security libs
   are built with a ByteDance-internal hardened compiler:
   `git@code.byted.org:security/android-ndk-llvm.git`. The security modules also embed
   a string-obfuscation runtime (`oecsec::GECCS0_SubstringManager`). This is why these
   libraries resist analysis — they're compiled with a custom obfuscating toolchain by
   ByteDance's security team.
2. **Build-path information disclosure.** Debug strings leak internal build-machine
   paths and SDK/project names, e.g.
   `/Users/iOSAndroid_ttp_1_4_v_ibpm/83030/full_link_sdk/client/...`,
   `/Users/macAndroidBuild_1_3_v_gfkca/56315/TikTok/components/live/...`. Harmless to a
   user's privacy, but it exposes internal project structure — common in native builds,
   worth a note, not a red flag.

## Network hosts in native = same families as Java (no new mystery hosts)

Hostnames baked into native code (`mon.isnssdk.com`, `i.isnssdk.com`,
`rtc-*.tiktokv.com`, `hotapi-va.tiktokv.com`, `byteoversea.com`, plus build-time
`git.byted.org`/`code.byted.org`) are all within the operator families already mapped
in report 04. The apparent `http://according`, `http://An`… in `libsscronet.so` are
false positives — Cronet's embedded English word-lists/HTML error templates, not
endpoints.

## Verdict for this layer

- The native scan **confirms in cleartext** what was previously inferred: metasec is a
  device-fingerprint-collection-and-reporting engine with request signing and hardcoded
  ByteDance telemetry endpoints. It reads battery and screen metrics among other signals.
- It found **no** covert-capability tooling (no keylogger, screen recorder, or input
  injection); the scary-sounding keyword hits are TLS-debug, content-authenticity, or
  media-player features.
- Anti-tamper is self-directed; crypto is standard-strong; the security libs are
  deliberately obfuscated via a ByteDance-internal toolchain.

**Caveat (unchanged):** `strings` reveals intent and endpoints, not the compiled
algorithm or the exact bytes sent. Decoding the actual metasec fingerprint payload
still requires native disassembly and/or live capture (report 07).
