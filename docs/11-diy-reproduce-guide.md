# 11 — Do It Yourself: Fetch, Decompile & LLM-Analyze Any Android App

This guide lets you reproduce everything in this repo from scratch — on TikTok or any
other Android app — and gives you ready-to-paste prompts to drive your favorite LLM
through the same analysis. Nothing here needs a rooted device.

> **Legal / ethical note.** Decompiling an app you have lawfully installed, for
> personal security research and interoperability study, is broadly defensible in
> many jurisdictions — but app store Terms of Service and copyright still apply, and
> rules vary by country. Analyze apps you have a legitimate reason to inspect, keep
> decompiled code for private research, and don't redistribute the original binary.
> This is research, not an invitation to repackage or ship someone else's code.

---

## Step 1 — Get the APK / XAPK

You have three good options, roughly in order of trustworthiness:

### Option A — Pull it off your own device (most trustworthy)
This gives you the *exact* build running on your phone, not a mirror.
```sh
# with USB debugging on and `adb` installed:
adb shell pm list packages | grep -i tiktok        # find the package id
adb shell pm path com.zhiliaoapp.musically         # lists base + split APK paths
# pull every split it prints:
adb pull /data/app/~~xxxx==/com.zhiliaoapp.musically-yyyy==/base.apk
adb pull .../split_config.arm64_v8a.apk            # repeat for each split
```
Modern apps ship as **split APKs** (base + per-ABI + per-language + dynamic
features). Pull them all if you want the native libs and resources.

### Option B — Download a bundle from a mirror
Sites like **APKPure**, **APKMirror**, or **Aptoide** distribute `.xapk`/`.apks`
bundles. This repo used APKPure:
<https://apkpure.com/tiktok-app/com.zhiliaoapp.musically>
Pick the version you want; a `.xapk` is just a ZIP containing the split APKs plus a
`manifest.json`. **Verify integrity**: compare the signing certificate to the Play
version (`apksigner verify --print-certs base.apk`) so you know the mirror didn't
tamper with it.

### Option C — Google Play (indirect)
Play doesn't hand you the file directly; use a tool that reconstructs the bundle for
an account you own. Same verification caveat.

---

## Step 2 — Install tools

```sh
# Debian/Ubuntu style; use brew/pacman/etc. as appropriate
sudo apt install unzip openjdk-17-jre ripgrep python3 git git-lfs
# jadx (best Android decompiler) — grab a release:
#   https://github.com/skylot/jadx/releases   (v1.5.x)
# optional: apktool (for smali + better resource decoding)
#   https://apktool.org
```
`jadx` = Java decompiler (the workhorse). `ripgrep` (`rg`) = fast full-tree search.
`apktool` = optional, for resource/manifest decoding and smali.

---

## Step 3 — Unpack the bundle

```sh
mkdir -p unpacked && unzip -o "TikTok_..._APKPure.xapk" -d unpacked/
cat unpacked/manifest.json | python3 -m json.tool   # permissions, version, splits
# the base APK holds all the code (dex); config.* splits hold native .so + resources
```

---

## Step 4 — Decode the manifest & decompile the code

```sh
# Manifest + resources only (fast):
jadx --no-src -d out-res unpacked/com.zhiliaoapp.musically.apk

# Full Java decompile of ALL dex (slow; TikTok = ~300k files, ~30 min, ~2 GB):
jadx --no-res -j 8 -d out-src unpacked/com.zhiliaoapp.musically.apk
# (jadx will report some failed methods — normal for large obfuscated apps.)
```

---

## Step 5 — Mine strings, URLs, and endpoints

```sh
# extract dex and dump all strings
unzip -o unpacked/com.zhiliaoapp.musically.apk 'classes*.dex' -d dex/
for f in dex/*.dex; do strings -n 6 "$f"; done > all_strings.txt

# also scan the native libraries (people forget these!)
unzip -o unpacked/config.arm64_v8a.apk 'lib/*' -d libs/
for f in libs/lib/*/*.so; do strings -n 8 "$f"; done > native_strings.txt

# hosts from the full decompiled tree (the complete picture):
rg -oiN --no-filename 'https?://[a-zA-Z0-9._~:/?#%-]+' out-src \
  | sed -E 's#https?://##; s#[/?"].*##' | sort -u > hosts.txt

# privacy-sink call sites across ALL code:
rg -l 'getPrimaryClip\(|getLastKnownLocation|getInstalledPackages|AdvertisingIdClient|MediaProjection|addJavascriptInterface|getSimCountryIso' out-src
```

### The obfuscated-config trick
Some config assets are XOR-scrambled. This repo's `assets/builtin_network_config`
decoded with a **single-byte XOR key of `0x55`**. Brute-force it:
```python
data = open('builtin_network_config','rb').read()
for k in range(256):
    d = bytes(b ^ k for b in data)
    if b'tiktok' in d or b'https' in d:
        print(hex(k)); open('decoded.txt','wb').write(d); break
```

---

## Step 6 — Drive an LLM through the analysis

An app this size won't fit in any context window, so **don't paste the whole
codebase**. The workflow that worked here is: *you* run `grep`/`rg` to pull the
relevant slices, then hand those slices to the LLM and ask it to interpret, verify,
and cite. Treat the LLM as an analyst that must show its evidence, not an oracle.

### Golden rules for LLM-assisted RE
1. **Feed it grep output, not the repo.** Extract candidate files/lines first.
2. **Demand `file:line` citations** for every claim so you can check them.
3. **Ask it to distinguish "capability present" from "behavior proven."** Static code
   ≠ runtime traffic.
4. **Tell it about obfuscation** (mangled class names, native `.so`, encrypted
   strings) so it flags what it *can't* see instead of guessing.
5. **Have it separate first-party from bundled-SDK code** (e.g. a `content://sms`
   string inside a compliance monitor is not the app reading your SMS).
6. **Re-verify anything alarming** with a second, narrower grep before believing it.

### Ready-to-paste prompts

**Kickoff / orientation**
> "I've decompiled an Android app with jadx (obfuscated identifiers). I'll paste
> grep output in batches. For each finding, tell me: what capability it shows, your
> confidence, whether it's first-party or a bundled SDK, and what it does NOT prove.
> Always cite the file/line I gave you. Never infer behavior that isn't in the text."

**Network / dial-home map**
> "Here is a deduped list of every hostname found in the code and native libs
> [paste `hosts.txt`]. Group them by operator (first-party vs. named third-party ad/
> analytics vendors vs. unknown), by likely region from naming, and by purpose
> (content/CDN, API, telemetry/fingerprint, config/AB-test, crash/APM). Flag any host
> you can't attribute to a known company as HIGH priority to investigate."

**Permissions**
> "Here is the AndroidManifest permission list [paste]. Classify each as
> expected/notable/suspicious for an app whose core function is [describe it].
> Call out any permission with no plausible feature justification, and note dangerous
> permissions that are ABSENT (their absence is evidence too)."

**Privacy sinks / data collection**
> "For each of these Android APIs I grepped, here are the call-site files [paste
> `rg -l` output per API: location, contacts, clipboard, telephony IDs, wifi/BT scan,
> installed apps, advertising ID, sensors, MediaProjection, WebView JS bridge]. For
> each, estimate whether it's core-feature use, fingerprinting, or over-collection,
> and tell me which files to open to confirm."

**Out-of-bounds / cross-app access**
> "I grepped for `content://` authorities, `Runtime.exec` commands, `/proc`//`/sys`//
> `/data/data/` paths, `su` binary paths, and `getInstalledPackages`. Here's the
> output [paste]. Decide for each: is this reading OTHER apps' data / escalating
> privilege / enumerating apps — or is it self-inspection, anti-fraud detection, or a
> compliance monitor? Explain how to tell the difference from the strings alone."

**Clipboard (specific)**
> "Here are the classes that call `getPrimaryClip()` [paste the files]. Tell me
> whether the read is user-initiated (e.g. an EditText paste), gated by a capability/
> permission wrapper, or auto-triggered from a lifecycle hook (onResume/onStart/
> Application). Is there any code path that reads the clipboard and then sends it to a
> network call? Cite lines."

**Mitigation**
> "Given this host list and the fact that API requests are signed with headers from a
> native library, which outbound hosts can I safely block (DNS/firewall) without
> breaking core functionality, and which are fused to auth/content and will break the
> app? Explain the coupling. Rank by privacy benefit vs. breakage risk."

**Verification / red-team your own findings**
> "Re-examine your previous conclusions skeptically. For each, state what evidence
> would OVERTURN it, whether that evidence could be hidden in native code or
> runtime-decrypted strings, and rewrite any claim that overstated certainty."

---

## Step 7 — Know the limits (state them in your report)

Static analysis + an LLM gets you a thorough *capability map*. It **cannot** prove
exact wire payloads because sensitive logic sits in native `.so` files and telemetry
is encrypted. To close that gap you need dynamic analysis: a rooted device or
emulator, a MITM proxy (mitmproxy/Charles/Burp) with TLS-unpinning via **Frida**, and
hooks on the specific APIs (`getPrimaryClip`, location, the network signer). That's
the follow-up described in [report 07](07-assessment.md).

**Bottom line:** grep does the finding, the LLM does the interpreting, and *you* do
the verifying. An LLM that isn't forced to cite lines and separate "present" from
"proven" will confidently hallucinate — the prompts above are written to prevent that.
