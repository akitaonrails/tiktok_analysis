# 09 — Deep Scan: Expanded Coverage, Methodology & Honest Completeness

This report answers a fair question: *was the whole app scanned, and does the report
list every privacy leak and dial-home?* Short version: the first pass (reports 00–08)
was string- and manifest-driven with sampled source reads. This pass scanned **100%
of the decompiled Java (303,877 files / 1.8 GB), 100% of the native-library string
tables, and decoded a previously-obfuscated config**. It materially expanded the host
census and corrected/confirmed the sink findings. Full completeness is still not
achievable by static analysis alone — the residual gaps are enumerated at the end.

## What this pass added over the first pass

| | First pass (00–08) | Deep scan (this report) |
|---|---|---|
| Java coverage | dex string tables + ~dozen files read | **all 303,877 files** via `ripgrep` |
| Native libs | listed, not scanned | **all 204 `.so` string tables scanned** |
| Endpoint census | 230 hosts (dex strings) | **991 hosts / 445 registrable domains** (all sources) |
| Obfuscated config | noted as XOR-scrambled | **decoded (XOR 0x55)** — +511 hosts |
| Sink findings | keyword hit-counts | **call-site census with file counts** |

## Method (batched, full-corpus)

- `rg -o` over `decompiled/java` for URL/host literals, endpoint paths, and each
  Android sink API (32-core parallel; the tree is ~1.8 GB, scans in seconds).
- `strings -n 8` over all 204 native `.so` files → separate host extraction.
- Single-byte XOR brute force over `assets/builtin_network_config` (known-plaintext
  "tiktok"/"https"/".com") → key **0x55** recovered.
- Consolidated + real-TLD-filtered to remove Java class-name fragments
  (e.g. `network.api`, `model.dto`) that a naïve host regex catches.

Evidence: [`_evidence/master_hosts_all_sources.txt`](_evidence/master_hosts_all_sources.txt)
(991 hosts), [`_evidence/registrable_domains.txt`](_evidence/registrable_domains.txt)
(445 domains), [`_evidence/telemetry_tier_hosts.txt`](_evidence/telemetry_tier_hosts.txt),
[`_evidence/builtin_network_config.decoded.txt`](_evidence/builtin_network_config.decoded.txt).

## Expanded finding 1 — the endpoint map is ~4× larger than first reported

The full-tree scan found **hundreds of regional API shards** the dex-string pass
missed: `api16/19/21/22`, `-core`/`-normal`, across `-va`, `-alisg`, `-useast1a/2a/5/8`,
`-no1a` (Norway), `-ie` (Ireland). Every telemetry service also has a
**`*-boot.tiktokv.com` bootstrap variant** (`mssdk-boot`, `log-boot`, `mon-boot`,
`libra-boot`, `pitaya-boot`, `vcs-boot`, `hotapi-boot`, `rtlog-boot`) — the
initial-contact endpoints used before the server pushes live config. This does not
change the *conclusions* of report 04 (same operators, same tiers) but the earlier
host list was incomplete; the authoritative list is now in `_evidence/`.

## Expanded finding 2 — the hidden built-in domain registry (decoded)

`assets/builtin_network_config` was XOR-obfuscated (key `0x55`). Decoded, it is
TTNet's **built-in domain registry**: 511 hosts including many not present as
plaintext anywhere in the Java — e.g. `bytedapm.com`, `byteplusapi.com`,
`bytetos.com`, `byteimg.com`, `bytegecko-i18n.com`, `adsintegrity.{us,eu,net}`,
`boe.tiktok.com` (ByteDance's internal "BOE" staging environment), `byted.org`,
`bytednsdoc.com`, and the full **CapCut** domain family.

**Important honesty caveat:** this is a *shared ByteDance networking-library registry*
(traffic-network-control / cert-pinning / routing table) that ships across ByteDance
apps. Its presence proves the networking layer *knows about* these domains — it does
**not** prove TikTok contacts all 511 at runtime. Many (BOE staging, CapCut, test
domains) are almost certainly dormant in a production TikTok install. Treat the
decoded list as "the universe of domains the network stack can route to," not "hosts
TikTok dials." Distinguishing the two requires live capture.

## Expanded finding 3 — sink call-site census (100% of decompiled code)

Counted across the full Java tree (files = distinct classes touching the API):

| Sink | Hits | Files | Read vs. write / note |
|---|---:|---:|---|
| camera / mic | 1835 | 231 | Core product (recording) |
| sensors (accel/gyro) | 297 | 70 | UX + anti-bot fingerprint |
| clipboard (all refs) | 181 | 45 | **reads (`getPrimaryClip`) = only 3 files**; writes = 4; rest are type refs |
| screen capture (MediaProjection) | 165 | 24 | LIVE screen-share |
| WebView JS-bridge | 159 | 69 | Hybrid UI + in-app-browser injection surface |
| advertising ID | 116 | 30 | GAID/OAID |
| account manager | 84 | 11 | Cross-app account (report 03) |
| Wi-Fi scan/info | 79 | 16 | BSSID/SSID/scan → location + fingerprint |
| telephony identifiers | 52 | 19 | SIM/network country, operator |
| Bluetooth | 31 | 11 | Scan/advertise |
| installed apps | 24 | 7 | Scoped enumeration (report 03) |
| accessibility refs | 23 | 5 | **No custom AccessibilityService declared (see below)** |
| location | 12 | 3 | GPS/fused |
| contacts | 7 | 4 | Find-friends upload path |

### Two corrections/confirmations from this census
- **Clipboard reads are genuinely narrow** — only **3 files** call `getPrimaryClip(`.
  My report 05 "3 call sites" was correct; the larger `ClipboardManager` count is
  copy-*to*-clipboard (share codes) and type references. Not pervasive surveillance.
- **No accessibility screen-scraping.** TikTok references `AccessibilityService`
  constants in 5 files but **declares no AccessibilityService in the manifest** and
  implements no `onAccessibilityEvent`. It cannot read other apps' screens via
  accessibility. This is a meaningful *negative* finding.

## Honest completeness assessment

**Now well-covered (high confidence):**
- Every **plaintext** endpoint/host in Java, native strings, and the decoded config.
  Cross-check: extracting hosts from the full Java tree found **zero** ByteDance/
  TikTok hosts beyond the consolidated list — the plaintext endpoint surface is
  effectively exhausted.
- Every **recognizable** privacy-sink API call site in decompiled Java.
- Manifest surface (components, permissions, providers) — complete.

**Still NOT covered (static analysis blind spots — these are real):**
1. **Native code semantics.** `libmetasec_ov.so` etc. were string-scanned, not
   disassembled. What the device fingerprint actually contains is still opaque.
2. **Runtime-assembled / encrypted strings.** Endpoints or field names built by
   concatenation, decrypted at runtime, or resolved via server config won't appear as
   literals. The XOR-decoded config shows ByteDance *does* obfuscate such data — there
   may be more we haven't decoded.
3. **Reflection & dynamic dispatch.** Sink calls invoked via reflection
   (`Method.invoke`) evade signature-based grep.
4. **49 dynamic-feature modules** (`df_camera`, `df_gemini_nano`, `df_livesdk`,
   `df_ccdc_impl_ocr`, …) download code **after install** and are not in the base APK.
5. **~2,412 methods** failed to decompile (jadx errors) — a small fraction, but they
   were not read.
6. **Actual runtime behavior.** Static presence of a capability ≠ proof it fires, or
   what it sends. Only dynamic capture settles that.

## Bottom-line confidence

- **"Where it can dial home":** high confidence the operator/tier map (report 04) is
  complete and correct; the specific host list is now ~4× more complete and saved as
  evidence. Cannot rule out runtime-resolved endpoints from server config.
- **"What data it can access":** high confidence on the *inventory of capabilities*
  present in Java + manifest. The exact fingerprint payload remains native-opaque.
- **"Complete list of every leak":** **no static analysis can promise that** for an
  app this obfuscated, with native crypto, server-driven config, and post-install
  modules. This report is a thorough, mostly-exhausted *static* map — the named
  residual gaps require the dynamic follow-ups in report 07 to close.
