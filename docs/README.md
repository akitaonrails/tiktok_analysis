# TikTok Android — Privacy & Data-Flow Analysis

Static reverse-engineering analysis of the TikTok Android app to answer three
questions:

1. Does the app access resources beyond what its stated function needs?
2. Where does it "dial home" (which servers, operated by whom, in which regions)?
3. What data is collected and shared outside the device?

**Subject:** `com.zhiliaoapp.musically` (TikTok) — the international/global build.
The package name `musically` is the legacy name from the pre-2018 musical.ly merger.

| Field | Value |
|---|---|
| Package | `com.zhiliaoapp.musically` |
| App name | TikTok - Videos, Shop & LIVE |
| Version | 46.0.1 (versionCode 2024600010) |
| Distribution | APKPure `.xapk` bundle (Android App Bundle split into base + config + dynamic-feature APKs) |
| minSdk / targetSdk | 23 / 36 |
| Base APK | 136 MB, 37 `.dex` files (~308 MB uncompressed) |
| Native libs (arm64) | 204 `.so` files |

## Method & scope

This is a **static** analysis. Nothing was executed; there is no runtime/network
capture (that would require an instrumented device and MITM proxy — see
[future work](#limitations)). Findings come from:

- The bundle manifest (`manifest.json`) and the decoded `AndroidManifest.xml`.
- String mining across all 37 `.dex` files (`strings` → URL/host/keyword extraction).
- Full Java decompilation via **jadx 1.5.5**.
- Inspection of bundled assets and the list of native libraries.

**Important caveat on obfuscation and native code.** TikTok is heavily obfuscated
and pushes a large amount of sensitive logic into native `.so` libraries
(`libmetasec_ov.so`, `libttcrypto.so`, `libEncryptor.so`, `libpns_crypto.so`, …).
Native code was **not** disassembled here. So this report reliably establishes
*capabilities present in the app and the endpoints it is built to talk to*, but a
purely static Java+strings pass cannot prove exactly which fields are transmitted
on any given request at runtime, because payload assembly and encryption happen in
native code. Where this report says "collected" it means the code path to read
that data exists and is wired to telemetry; confirming the wire payload requires
dynamic analysis.

## How to reproduce

```sh
# 1. Unpack the bundle
unzip -o "TikTok+-+Videos,+Shop+&+LIVE_46.0.1_APKPure.xapk" -d unpacked/

# 2. Decode manifest + resources
jadx --no-src -d _work/jadx-res unpacked/com.zhiliaoapp.musically.apk

# 3. Full source decompile
jadx --no-res -j 8 -d _work/jadx-src unpacked/com.zhiliaoapp.musically.apk

# 4. String/URL harvest
unzip -o unpacked/com.zhiliaoapp.musically.apk 'classes*.dex' -d _work/dex/
for f in _work/dex/*.dex; do strings -n 6 "$f"; done > all_dex_strings.txt
grep -oE 'https?://[^" ]+' all_dex_strings.txt | sort -u
```

The `.xapk`, `unpacked/`, and `_work/` artifacts are git-ignored (large / redistributable
binary). Reproduce them locally from the `.xapk`.

## Report index

| Doc | Contents |
|---|---|
| [01-app-overview.md](01-app-overview.md) | Bundle structure, dynamic features, native-library inventory (what the `.so` files do) |
| [02-permissions.md](02-permissions.md) | Every requested permission, classified, with the "is this justified?" call |
| [03-manifest-components.md](03-manifest-components.md) | Exported activities/services/providers, the cross-app account-sharing providers, installed-app enumeration |
| [04-network-endpoints.md](04-network-endpoints.md) | The "dial-home" map: every host family, who operates it, region, purpose |
| [05-data-collection.md](05-data-collection.md) | Identifiers, device fingerprint, clipboard, contacts upload, location, sensors, in-app browser |
| [06-third-party-sdks.md](06-third-party-sdks.md) | Adjust, AppsFlyer, Facebook, ThreatMetrix, Google, and others |
| [07-assessment.md](07-assessment.md) | Bottom line: is it "spying"? Evidence-weighted verdict, and what only dynamic analysis can settle |
| [08-mitigation-options.md](08-mitigation-options.md) | Can the leaks be blocked? What works, what backfires, and why |
| [09-deep-scan-coverage.md](09-deep-scan-coverage.md) | Full-corpus rescan (all 303k files + native libs), decoded hidden config, honest completeness statement |
| [10-os-and-clipboard-access.md](10-os-and-clipboard-access.md) | Full-tree check: cross-app/OS out-of-bounds access and clipboard — what's real, what it's for |
| [11-diy-reproduce-guide.md](11-diy-reproduce-guide.md) | Reproduce from scratch: fetch the APK, decompile, and LLM-analysis prompts for any app |
| [12-malicious-and-dark-patterns.md](12-malicious-and-dark-patterns.md) | Malware-pattern check (none found) + dark-pattern inventory + well-being counter-signal |
| [13-native-library-analysis.md](13-native-library-analysis.md) | `strings` sweep of all 204 native `.so` files: metasec fingerprint engine confirmed in cleartext, reassuring negatives, build-path disclosure |
| [17-brazilian-law-compliance.md](17-brazilian-law-compliance.md) | **LGPD & "Lei Felca" (ECA Digital) technical reading:** where the app's behavior strains each law, the real ANPD case/fine over children's data, and what only server-side facts can settle |
| [16-regional-data-treatment.md](16-regional-data-treatment.md) | **Brazil vs US vs EU:** the app sorts users into US/EU/KR/ROW compliance buckets; US & EU get data-residency enclaves + minimization branches, Brazil (ROW) gets neither — least-protected tier |
| [15-repackaging-feasibility-and-patch-plan.md](15-repackaging-feasibility-and-patch-plan.md) | **Can we patch/re-sign TikTok to stop the leaks?** Feasibility verdict: native-fused signer + server-validated signature + config treadmill cap it; the removable Java telemetry tier, a tiered patch plan, and why isolation beats repackaging for most users |
| [14-v47-data-inventory-and-dns-blocking.md](14-v47-data-inventory-and-dns-blocking.md) | **v47.7.1 re-analysis (jadx + REA/Ghidra):** full inventory of what is collected from the phone, built-in HTTP-DNS that bypasses NextDNS by raw IP, per-host NextDNS blocklist + router IP rules, fake-substitute plan, Morphe patch review |

Evidence dumps live in [`_evidence/`](_evidence/).

## Limitations

- No native (`.so`) disassembly — the highest-value target (`libmetasec_ov.so`) is a black box here.
- No dynamic/network capture — cannot show actual request payloads or TLS-pinned traffic.
- Decompiled identifiers are obfuscated; class-level intent is inferred from retained
  strings, endpoint paths, package names (`com.ss.android.ugc.aweme.*`), and SDK signatures.
