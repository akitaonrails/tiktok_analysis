# 15 — Repackaging TikTok to Stop Privacy Leaks: Feasibility & Patch Plan

Follow-up to [report 14](14-v47-data-inventory-and-dns-blocking.md). The user asked whether
we can **repackage (patch + re-sign) TikTok v47.7.1 to mitigate every privacy leak**, and for
an honest verdict on whether it can work. This report is a plan and an engineering assessment,
not a build. Everything is from static analysis of `com.zhiliaoapp.musically` v47.7.1; nothing
was patched, built, or run.

> **Scope note.** This is defensive privacy work on the user's own device and account. It
> deliberately stops at the *design* level: which collectors are reachable from Java and could
> be turned into no-ops, versus which are welded to the native request-signer and can't be
> touched without breaking the app. It does **not** include a signature-spoofing / anti-tamper
> bypass recipe, because — as [§3](#3-the-three-walls) shows — that path is both the one most
> likely to get the account limited and a losing maintenance race, so it's not the mitigation
> to reach for.

---

## 1. Verdict up front

**Partly, and not the way you'd hope.** A repackaged build can remove the *third-party and
best-effort first-party* telemetry — the same class NextDNS blocks, but removed at the source
so it never even tries. That's a real, durable win and it degrades gracefully.

It **cannot** remove the two things you most want gone:
1. the **native device fingerprint**, because it's computed in `libmetasec_ov.so` and is the
   same thing that **signs every API request** — strip it and the feed stops loading; and
2. your **in-app behavior**, because it rides the signed feed request itself.

And repackaging adds two new costs that network blocking doesn't have: **re-signing is visible
to TikTok's servers** ([§3.2](#32-wall-2-your-signature-is-part-of-the-device-signature)), and
you're on an **update treadmill** (every TikTok release re-breaks the fingerprints the patches
match on).

**Recommendation:** for a normal user, the isolation plan in [report 14 §5](14-v47-data-inventory-and-dns-blocking.md#5-the-fake-substitute-plan)
(separate profile/device, no SIM, no login, DNS + router rules) achieves **most** of the
realistic privacy gain with **none** of the ban risk or upkeep. Repackaging is worth it only as
a research project, or layered *on top of* isolation to also kill the removable telemetry at the
source. The tiered patch plan is in [§5](#5-the-patch-plan).

---

## 2. What "repackaging" means here

The Morphe set we reviewed ([`_work/ext/tiktok-patches-for-morphe`](../_work/ext/)) is a
ReVanced-style pipeline:

1. **Decode** the APK's dex to smali / a patcher bytecode model.
2. **Match** target methods by *fingerprint* (return type, params, defining class, string
   literals) rather than by name — essential because TikTok's names are obfuscated and shift
   every build (`X/C2342909Fp`, etc.).
3. **Rewrite** bytecode: insert calls to injected "extension" classes, or force a method to
   return a constant.
4. **Repackage** and **re-sign** with the user's own key, then install.

Toolchain: Morphe patcher `1.5.1`, smali, AGP `8.2.2` (`gradle/libs.versions.toml`). The set
targets **TikTok 46.2.3**, so every fingerprint would need re-proofing against 47.7.1.

Crucially, the Morphe set re-signs **without any signature-spoofing patch** and still runs
(its only login-related patch, `FixGoogleLoginPatch.kt`, just forces
`GoogleAuth.isAvailable()` to return false). So **re-signing does not hard-break TikTok at
launch** — it degrades specific cert-bound features and is *observable server-side*, but the
app starts and the feed loads. That's the opening a privacy patch set would use.

---

## 3. The three walls

### 3.1 Wall 1: the fingerprint is the request signer (native, can't strip)

Every API request carries `X-Gorgon/X-Argus/X-Ladon/X-Khronos` signatures computed in
`libmetasec_ov.so`. The same engine computes the device fingerprint. From Java you can only see
the *handler table* it calls by integer ID (`ms/bd/o/h2.java:84-144`); the logic and the
upload are native. You cannot no-op the fingerprint without also killing the signer, and an
unsigned or wrongly-signed request is rejected by the server. This is by design and is
[report 08 Tier 2](08-mitigation-options.md) confirmed in v47. **Out of scope for a dex patch.**

### 3.2 Wall 2: your signature is part of the device signature

`ms/bd/o/n0.java` is metasec handler that reads the app's own signing certificate:

```java
Signature[] signatureArr = ...getPackageInfo(getPackageName(), 64).signatures;
return signatureArr[0].toByteArray();   // raw cert bytes handed to native code
```

Native code requests this by ID, so your certificate bytes feed the native device signature.
Re-signing with your own key changes them. TikTok's servers therefore *can* tell a device is
running a self-signed client, and can factor that into risk scoring — captcha, phone
verification, or a shadow-limit — at a time of their choosing. The Java `sig_hash` in the
device-register header (`X/C2342909Fp.java`) is the same story in the clear.

A patch set *could* make `n0` return the original certificate bytes instead of the re-signed
ones, which is exactly the anti-tamper arms race this report declines to script: it's brittle
(the real check is native and server-validated, not just this Java handler), and getting it
subtly wrong is *more* anomalous than an honest re-sign. The honest read is that **any
repackaged build is identifiable as modified**, and the only safe assumption is that TikTok may
act on that. Keep the patched app on a throwaway account.

### 3.3 Wall 3: server-pushed config outlives any static patch

TTNet pulls its endpoint list, DNS rules, AppLog allow/block lists, and the Pipo Probe field
list from the server at runtime (`tnc-boot.tiktokv.com`, `wa4/l.java:379-410`; report 14 §2.2).
Patching the *built-in* config in `X/C03HO.java` only changes the pre-server defaults; the
server replaces them. So config-level patches are weak unless paired with blocking the config
fetch — which itself may degrade routing.

---

## 4. What *is* reachable from Java (the removable tier)

These collectors are pure-Java, best-effort, and already degrade gracefully when they fail
(they queue and drop) — the ideal patch targets. Each can be turned into a no-op by forcing the
documented method to return early / a constant, the same mechanism the Morphe set already uses
for features.

| Target | Where | Effect of no-op | Breakage risk |
|---|---|---|---|
| **Hourly ID re-report** to `cp-rp.tiktokv.com` | `com/ss/android/ugc/aweme/lancet/DeviceManagerLancet.java:58-240` (`track_event`) | Stops the periodic `did/iid/cdid/ssaid/gaid` upload | **None found** — no feature reads its result |
| **AppLog event firehose** | sender `X/C10338042c.LJIIZILJ(event, params)` (~9,900 call sites); network `com/ss/android/ttf/tasks/applog/AppLogNetworkContextImpl.java` | Drops behavioral events (plays, `stay_time`, search terms, likes) | Low–med: some features read AB flags delivered alongside; needs testing |
| **AppsFlyer** init | `com/ss/android/ugc/aweme/legoImp/task/InitAppsFlyer.java` | No install attribution / GAID to AppsFlyer | None to the user |
| **Firebase Analytics** (`app-measurement.com`) | `InitFirebase`-style task | No GA4 events | Keep FCM (push) separate; don't disable Installations |
| **APM / Slardar / npth** crash+perf+**cloud-control file upload** | `MonitorInitTask.java:116-188`, `X/C1183540gty.java:17` | No perf/crash/file uploads | Low |
| **Pipo Probe** (root/hook/emulator/hardware, up to ~90 fields) | `com/ss/android/ugc/aweme/pipo/probe/*`, boot task `ProbeApplogObserverBootTask.java:60` | No risk-probe upload | Payments/KYC flows may fail — fine if you never buy coins |
| **Android ID blanking** (reuse TikTok's own compliance branch) | `DeviceManagerLancet.java:56-58` already returns `""` under a flag | Sends empty `android_id` | Low; it's a path TikTok itself ships |
| **ThreatMetrix WebView** (payments) | `X/C2769014z.java:95-115` | No TMX fingerprint | Payments only |

What you **cannot** usefully no-op from Java: the metasec/OECSec native fingerprint, the
hardware key attestation (`X/C2318401Foq.java:46-58`), touch/motion sampling, the TTNet HTTP-DNS
resolver (native in `libsscronet.so`), the per-video watch stats (`AwemeStatsApi` on the signed
feed host), and screen-time/app-open uploads on the API host.

---

## 5. The patch plan

Build order, lowest risk first. Each patch is "force the documented Java entry point to no-op";
all need re-proofing against v47 fingerprints and **live testing one at a time**.

**Tier A — telemetry removal (safe, graceful, high value):**
1. Disable the `cp-rp` hourly ID uploader (`DeviceManagerLancet`).
2. Skip `InitAppsFlyer` and Firebase Analytics init.
3. Neutralize APM/Slardar/npth init (keep crash-free; they just stop uploading).
4. Disable the Pipo Probe boot task + heartbeat.
5. Force the existing Android-ID compliance branch on (empty `android_id`).

**Tier B — reduce behavioral logging (medium, test feature impact):**
6. No-op the AppLog sender for non-essential events, *or* filter event names. Watch for feature
   regressions (some UI gates read AB config that rides the same channel).

**Tier C — reuse the Morphe privacy-relevant feature patches (independent of telemetry):**
7. Disable login requirement (browse anonymously) — the single biggest unlinkability win.
8. Open external links in the system browser (kills the in-app JS-bridge + Pixel surface).
9. Sanitize share links.

**Explicitly out of plan (walls, or counterproductive):**
- No metasec/signature tampering (Wall 2; raises the risk it's meant to lower).
- No region/SIM *spoofing* — v47 reads region from several places that would disagree
  (report 14 §5.1); use a SIM-less device instead.
- No touching the native signer or HTTP-DNS resolver.

**Then layer the network controls from report 14 §4** (NextDNS tiers + router IP rules). With
Tier A applied, the DNS layer becomes a backstop rather than the primary defense.

---

## 6. Costs and the treadmill

- **Re-signing is detectable** (§3.2). Assume the account may be risk-scored. Use a throwaway.
- **Cert-bound features break:** Google / Facebook sign-in, anything gated on the original cert
  (the Morphe set already ships a Google-login workaround). FCM push usually survives; don't
  disable Firebase Installations.
- **No Play Store updates**; re-patch manually each release.
- **Fingerprint rot:** TikTok ships frequent builds; obfuscated targets move, so patches that
  match by fingerprint need re-proofing roughly every update. This is ongoing work, not
  set-and-forget.
- **Native and dynamic modules untouched:** 23 `libdex_df_*.so` dynamic features and all native
  telemetry are outside dex patching.

---

## 7. Bottom line

- **Can a repackaged TikTok stop *all* privacy leaks? No.** The fingerprint and your in-app
  behavior are welded to the native, server-validated request signer.
- **Can it stop the *removable* telemetry at the source (the Tier-A list)? Yes, durably**, and
  more completely than DNS blocking, because the app never even attempts those uploads.
- **Is it the right first move for a normal user? No.** Report 14 §5 isolation gets most of the
  benefit with no ban risk and no upkeep. Repackaging is a research project, or an add-on for
  someone already comfortable running a self-signed app on a throwaway account.
- **Best realistic stack, most to least impactful:** (1) dedicated/profile-isolated, SIM-less,
  not-logged-in TikTok → (2) NextDNS tiers + router IP rules (report 14 §4) → (3) a Tier-A
  telemetry-removal patch build layered on top. (1) and (2) need no repackaging and carry no ban
  risk; (3) is the optional power-user layer.

To validate any of this for real, the dynamic setup in [report 07](07-assessment.md) is still
required: a spare rooted device, a MITM proxy, and before/after capture of `track_event`,
`/service/2/app_log/`, and `/security/v1/psd/sample_info`.
