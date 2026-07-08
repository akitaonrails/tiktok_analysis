# 04 — Network Endpoints: The "Dial-Home" Map

> **Update:** a full-corpus deep scan (see [report 09](09-deep-scan-coverage.md))
> expanded this from 230 to **991 unique hosts / 445 registrable domains** and
> decoded the previously-obfuscated `builtin_network_config`. The operator tiers and
> conclusions below are unchanged; the complete host list now lives in
> [`_evidence/master_hosts_all_sources.txt`](_evidence/master_hosts_all_sources.txt)
> and the telemetry tier in
> [`_evidence/telemetry_tier_hosts.txt`](_evidence/telemetry_tier_hosts.txt).

Originally extracted from 1,038 hard-coded URLs across the dex files. Full lists in
[`_evidence/hardcoded_urls.txt`](_evidence/hardcoded_urls.txt) and
[`_evidence/url_hosts.txt`](_evidence/url_hosts.txt). Domain naming follows
ByteDance conventions: region suffixes `-va` (US-East / Virginia), `-sg` /
`alisg` (Singapore, Alibaba Cloud), `useast5/8`, `no1a` (Norway), `ie` (Ireland).

## Who operates the destinations

Every substantive endpoint resolves to infrastructure operated by **TikTok/ByteDance**
or a **named third-party SDK vendor**. There are no unexpected/unknown first-party
exfiltration hosts in the static set. The operators break down as:

### 1. TikTok first-party — user-facing & API
| Host family | Purpose |
|---|---|
| `api.tiktokv.com`, `api-va.tiktokv.com`, `api-normal/-core/-si.tiktokv.com`, `api16-normal-useast5.tiktokv.us`, `api16-normal-alisg…` | Main app API (feed, profile, actions). Regionally sharded. |
| `www.tiktok.com`, `m.tiktok.com`, `support.tiktok.com`, `ads.tiktok.com`, `business-api.tiktok.com` | Web, support, ads/business |
| `webcast*.tiktokv.com`, `webcast16-normal-useast5.tiktokv.us` | LIVE streaming |
| `oec-api.tiktokv.com`, `tako*.tiktokv.com`, wallet/`choco.tiktokv.com` | TikTok Shop / e-commerce / wallet |
| `im-va.tiktokv.com`, `imapi-*.isnssdk.com` | Direct messages |
| `search.tiktokv.com`, `sami*.tiktokv.com` | Search, SAMI speech/AI |
| `*.tiktokcdn.com`, `*.tiktokcdn-us.com`, `*.tiktokcdn-eu.com`, `*.ttwstatic.com`, `*.akamaized.net` | Content delivery (videos, images, effects, Gecko resource packages) |

### 2. TikTok first-party — **telemetry, fingerprinting & config** (the privacy-relevant tier)
| Host | What it collects / does |
|---|---|
| `mssdk-sg.byteoversea.com`, `mssdk-va.byteoversea.com` | **MS SDK (metasec/Argus) device-signature & anti-fraud service.** Receives the encrypted device fingerprint from `libmetasec_ov.so`. |
| `sdfp-sg.byteoversea.com`, `sdfp-va.byteoversea.com` | **Device-fingerprint ("sdfp") service.** |
| `log.byteoversea.com`, `log16.byteoversea.com`, `rtlog.tiktokv.com`, `log-va.tiktokv.com` | **AppLog** event/behavior telemetry firehose. |
| `mon.isnssdk.com`, `monitor.isnssdk.com`, `mon.byteoversea.com`, `mon-va.tiktokv.com`, `mon.zijieapi.com`, `mon16-normal-useast5.tiktokv.us` | APM / crash / performance monitoring (Slardar/npth). |
| `i.isnssdk.com`, `i.sgsnssdk.com`, `f-p.sgsnssdk.com`, `f-p-va.isnssdk.com`, `hotapi*.isnssdk.com` | Device-register / "install & activate" + settings fetch (`f-p` = feature/config push). |
| `abtest-va-tiktok.byteoversea.com`, `abtest-sg-tiktok.byteoversea.com`, `libra-va.tiktokv.com` | **Libra** A/B-testing & experiment assignment (fetches per-device config; sends bucketing signals). |
| `pitaya.byteintl.com`, `pitaya-task-sg.byteintlapi.com` | **Pitaya** on-device ML task/model engine (recommendation, edge inference). |
| `location.tiktokv.com`, `location-sg.byteintl.com` | Location resolution service. |
| `dig.tiktokv.us`, `bytecast.tiktokv.com` | Diagnostics / cast. |

### 3. Compliance / regional data enclaves (the reassuring counterweight)
| Host | Meaning |
|---|---|
| `*.tiktokv.us` (`useast5`, `useast8`) | **US Data-Security enclave** — the "Project Texas / USDS" US user-data endpoints. |
| `*.tiktokv.eu` (`no1a`=Norway, `ie`=Ireland) | **EU enclave** (Project Clover) — European user data. |
| `config.mtp.sag.us-ashburn-1.oci.oraclecloud.com`, `proxy.telemetry.us-ashburn-1.oci.oraclecloud.com` | **Oracle Cloud, Ashburn Virginia** — the US-government-audited hosting used for US traffic/telemetry proxying under Project Texas. |

The app is clearly **built to route by region**: US installs are steered to
`tiktokv.us`/Oracle-Ashburn, EU installs to `tiktokv.eu`. This is the technical
footprint of TikTok's regulatory data-residency commitments. It does **not** by
itself prove data never reaches ByteDance globally — the `byteoversea.com`,
`isnssdk.com`, `sgsnssdk.com`, and `zijieapi.com` telemetry/fingerprint hosts sit
*outside* the `.us`/`.eu` enclave naming and are ByteDance-global. Which tier a
given device actually talks to is a runtime routing decision.

### 4. Third-party SDK endpoints (see also 06)
| Host | Vendor / purpose |
|---|---|
| `h.online-metrix.net` | **ThreatMetrix (LexisNexis)** — third-party device fingerprinting / fraud (US company). |
| `view.adjust.com`, `*.onelink.me` (AppsFlyer), `app-measurement.com` | Attribution: Adjust, AppsFlyer, Firebase. |
| `www.google-analytics.com`, `securepubads.g.doubleclick.net`, `pagead2.googlesyndication.com`, `www.googleadservices.com` | Google analytics & ad networks. |
| `graph.facebook.com`, `*.facebook.com` | Facebook SDK (login, share, attribution). |
| `aps-webhandler.appsflyer.com` | AppsFlyer. |
| Amazon (`api.amazon.com`) | Login with Amazon / ADM push. |

## `zijieapi.com` — the one to flag

`mon.zijieapi.com` appears as a monitoring endpoint. `zijie` (字节) is ByteDance's
registered Chinese corporate name; `zijieapi.com` is a ByteDance-owned domain
historically tied to the parent company's core infrastructure. For the international
app it is expected to resolve to overseas infrastructure, but it is a **ByteDance-
global control-plane domain**, not a region-locked enclave host. Its presence
should be called out and, ideally, its runtime resolution and traffic verified.

## Bottom line for this doc

- **Destinations are attributable.** Nothing dials home to a mystery host; every
  live endpoint is TikTok/ByteDance infrastructure or a disclosed SDK vendor.
- **The telemetry tier is large and encrypted.** Multiple dedicated fingerprint
  (`mssdk`, `sdfp`), behavior-log (`log`/`applog`), config (`f-p`, `libra`), and
  monitoring (`mon`) endpoints exist alongside the app API. This is a heavier
  "phone-home" footprint than a typical social app.
- **Region routing is real but not a guarantee.** `.us`/`.eu`/Oracle-Ashburn
  enclaves coexist with ByteDance-global `byteoversea`/`isnssdk`/`zijieapi`
  telemetry hosts. Only network capture on a live device can prove which data goes
  where.
