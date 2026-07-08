# 10 — Out-of-Bounds OS Access & Clipboard (Full-Tree Verification)

This report specifically re-checks two claims from the earlier assessment against a
**full scan of all 303,877 decompiled Java files** (not the sampled first pass):

1. Does TikTok reach *out of bounds* — into the Android OS or other apps — beyond
   what its own function needs?
2. Does it read the **clipboard**, and if so, what does it do with the contents?

Method: `ripgrep` over the entire decompiled tree for cross-app content-provider
access, shell execution, `/proc`//`/sys`//`/system` probing, `SystemProperties`/
`getprop`, root/emulator detection, package enumeration, and every clipboard call
site — then reading the actual implementing classes. Native `.so` code is **not**
covered (string-scanned only) — see the caveat at the end.

## Part 1 — Out-of-bounds OS / cross-app access

### Cross-app content providers — NOT harvested
References to `content://sms`, `content://call_log`, `content://mms-sms`,
`content://com.android.calendar`, `content://com.android.chrome.browser`, and
`content://com.android.contacts` **do** exist — but all of them live in **one class**
(`X/C842060X1o.java`) inside a function that does `string.startsWith("content://sms")`
etc. to *classify* which sensitive resource a query targets. That class is part of
**Helios**, ByteDance's privacy-compliance API-monitoring framework (`com.bytedance.
helios.statichook.config.ApiHookConfig`). It is a **watchdog that tags/gates**
sensitive access — not code that reads those providers. Corroborating facts:

- The app requests **no** `READ_SMS`, `READ_CALL_LOG`, or `READ_CALENDAR` permission
  (report 02), so it *cannot* read them at runtime regardless.
- The install-referrer providers it does read (`com.facebook.katana…`,
  `com.instagram.contentprovider…`, Google Phenotype) are the standard cross-app
  **attribution** mechanism, where the other app deliberately exposes a referrer.

**Verdict:** No covert reading of SMS, call logs, calendar, browser history, or other
apps' private data. The sensitive-provider strings are a compliance *monitor*.

### `/data/data/<other-package>` — presence checks, not data theft
The 11 hard-coded other-package data paths are **existence probes for anti-fraud**:
`com.topjohnwu.magisk` (root), `com.shuame.rootgenius` / `com.rd.user2root` /
`com.qihoo.permmgr` / `com.mtk.user2root` (root tools), `com.longene.lglocations`
(a **GPS-spoofing** app), `com.redfinger.*` / `com.migu.*` (cloud-phone/emulators).
It checks whether these directories *exist* to detect a tampered device. Android
SELinux blocks reading another app's data contents anyway. **Not exfiltration.**

### Shell execution — diagnostics/fingerprint only, no privilege escalation
`Runtime.exec` / `ProcessBuilder` appear in only **7 files**, and the actual commands
are `getprop` (system properties), `logcat` (the app's *own* logs), and
`/sbin/ldconfig -p` (emulator/linker detection). The `/system/bin/su`,
`/system/xbin/su`, `/sbin/su` strings are used to **detect** root — there is **no
execution of `su`** and no privilege-escalation attempt.

### `/proc` and `/sys` — device fingerprint + self-inspection (in-sandbox)
Reads of `/proc/cpuinfo`, `/proc/meminfo`, `/proc/stat`, `/sys/devices/system/cpu/*`
feed device fingerprinting and performance monitoring. Reads of `/proc/self/*`
(`maps`, `stat`, `cmdline`, `fd`, `exe`) inspect the app's **own** process — used for
crash/ANR handling and, notably, **anti-hook/anti-debug** (e.g. `/proc/self/maps` to
spot injected Frida/Xposed libraries, consistent with report 07's tamper-detection
findings). `/proc/net/xt_qtaguid/stats` (per-UID traffic) appears in Facebook's
bandwidth-sampler SDK and one network-quality class. All of these are world-readable
interfaces (increasingly restricted on newer Android); none reach into other apps.

### `SystemProperties` / `getprop` — 51 files
Extensive reading of build/`ro.*` system properties for device fingerprinting.
In-sandbox, but part of the broad identity-signal collection already documented.

### App enumeration — scoped, not bulk
`getInstalledPackages(0)` full-list calls: **0**. Targeted `getPackageInfo`: 10
(checking specific packages from the scoped `<queries>` list, report 03). It does
**not** pull your entire installed-app list.

### Part 1 verdict
TikTok collects a large amount of **device/OS fingerprint data** through legitimate,
world-readable system interfaces, and it performs **aggressive root/emulator/spoofer/
hook detection** (reading, never escalating). But on the specific "out-of-bounds"
question — reading other apps' private data, executing privileged commands, or bulk
app enumeration — the full scan found **no evidence**. The one class touching SMS/
call-log/calendar is a privacy *monitor*, and the app lacks the permissions to read
them anyway. My earlier "does not go out of bounds" statement holds, now on a
full-tree basis rather than a sampled one.

## Part 2 — Clipboard: does it read it, and what for?

**Where clipboard is read (3 files, confirmed exhaustive for Java `getPrimaryClip`):**

| File | What it is |
|---|---|
| `X/C21410318qb.java` | A custom `EditText` subclass. The `getPrimaryClip()` call is inside **paste handling** — i.e., when the *user* pastes into a text field. User-initiated, expected. |
| `X/C2204961BRm.java` | The giant **Helios API-proxy** dispatcher (9,174 lines, wraps every sensitive Android API). The clipboard call here is the *hooked/monitored* version. |
| `X/C20145713s7.java` | A 28-line wrapper that requires a **BPEA `Cert`** (`com.bytedance.bpea.basics.Cert`). |

**The governance layer (the important part).** Clipboard access is routed through
**BPEA — ByteDance Privacy Encapsulation API** — a capability-token system: a read
must present a `Cert` identifying the caller and purpose, and Helios logs/gates it.
So clipboard reads are instrumented and access-controlled, not free-for-all.

**What it does with the contents:** the read sites are (a) user paste into input
fields, and (b) the compliance-wrapped proxy. Clipboard *writes* (`setPrimaryClip`,
4 files) are copy-out actions (share codes/links). I did **not** find:

- any clipboard read wired into an `onResume` / `onStart` / `onWindowFocusChanged` /
  `Application` lifecycle hook — i.e. **no automatic "read clipboard when the app
  comes to the foreground"** behavior (the pattern TikTok was criticized for on iOS
  in 2020 is **not** present in this Android build's Java), and
- a clipboard read feeding an obvious deep-link/invite-code/token harvester (no URL
  parsing co-located with the read sites).

**Clipboard verdict:** In this build, clipboard is read only in response to user paste
and through a compliance-gated proxy; it is **not** auto-scraped on launch/foreground,
and access is BPEA-certificated and Helios-monitored. What reaches the clipboard is
used for paste and share-link handling, not silently uploaded as far as the Java
shows.

## Honest caveats

- **Native code not covered.** `libmetasec_ov.so` and peers were string-scanned, not
  disassembled. A native clipboard/OS read would not appear in this Java analysis.
  (No clipboard-related symbols stood out in the native string scan, but that's weak
  evidence.)
- **BPEA/Helios is self-governance, and it is remotely configurable.** The presence of
  a compliance framework is genuinely reassuring, but its policy (`AllowNetworkApiConfig`,
  `DataOperationStrategy`, `ModifyConfig`, sampling rates) is **server-pushed by
  ByteDance**, not user-controlled. It governs access; it does not mean *no* access.
- **Static ≠ runtime.** Presence/absence in code is strong but not identical to
  observed behavior. Confirming "clipboard never leaves the device" needs the dynamic
  capture from report 07.
