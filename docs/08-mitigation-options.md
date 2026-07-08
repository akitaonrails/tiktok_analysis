# 08 — Privacy-Leak Mitigation: What Works, What Doesn't, and Why

This is a brainstorm/assessment of how far a user can actually reduce what TikTok
collects and sends, while still using the core app (watch videos, read comments,
like/dislike). It builds on the findings in reports 04–07 and is grounded in what
the decompiled code actually does. **Static-analysis caveat applies** (see README):
these are architecture-level conclusions; exact per-request behavior would need live
capture to confirm.

## The goal and the honest ceiling

Goal: keep the app working for passive viewing while cutting every *non-essential*
dial-out and starving/spoofing private data.

Ceiling (stated up front so the rest is read realistically): **you can remove the
third-party fan-out and the crash/analytics noise, but you cannot, while using the
app normally, prevent ByteDance from (a) fingerprinting your device and (b) learning
what you watch.** Those two are welded to the core API by design. Everything below
is about maximizing the removable part and understanding why the rest won't budge.

## Why traffic can't be cleanly separated: the three tiers

TikTok's outbound traffic falls into three tiers with very different separability.

| Tier | Examples | Separable from "watch videos"? |
|---|---|---|
| **1. Third-party + pure telemetry** | Adjust, AppsFlyer, Facebook, Google Analytics/DoubleClick, ThreatMetrix (`online-metrix.net`); ByteDance APM/crash/behavior firehose (`mon*`, `log*`, `rtlog`, `applog`, `abtest`/`libra`) | **Yes** — own hostnames, app degrades gracefully |
| **2. Fingerprint / anti-fraud / auth** | `device_register` (`*.isnssdk.com`/`*.byteoversea.com`), `mssdk-*`, `sdfp-*` | **No** — fused to request signing (see below) |
| **3. Viewing behavior** | `/aweme/v1/aweme/stats/`, `/aweme/v1/fast/stats/`, `/aweme/v1/aweme/feedback/`, feed-call params | **No** — travels on the same signed `api*` request that fetches the video |

### The coupling that defeats selective blocking (Tier 2)

The decompiled code signs every API request with `X-Gorgon` / `X-Argus` / `X-Ladon`
/ `X-Khronos` headers computed in native `libmetasec_ov.so`. Those signatures depend
on a valid `device_id`/`install_id` issued by the `device_register` call to the
ByteDance telemetry hosts and validated by `mssdk-*`. **Block the fingerprint tier
and the feed API rejects your requests** (invalid signature / no device). The
anti-fraud layer *is* the auth layer. This is intentional — it makes "keep the feed,
drop the fingerprint" close to mutually exclusive.

### The fusion that defeats it entirely (Tier 3)

Engagement signals (watch time, replays, pauses, likes) are reported to the **same
signed `api*.tiktokv.com/.us` host** that serves the feed, via `stats`/`feedback`
endpoints and the feed request's own parameters. There is no separate "tracking
server" to block. Watching a TikTok video inherently reports that you watched it.
The recommendation engine is the product, not an add-on.

---

## Option A — Network-level blocking (DNS / per-app firewall)

**Tools:** NextDNS, Rethink DNS, TrackerControl, AdGuard, Pi-hole, NetGuard
(no-root VPN), AFWall+ (root).

**What works:** Blocking **Tier 1** hosts. This removes the third-party ad/analytics
fan-out (your advertising ID stops going to ~6 outside companies) and the loudest
first-party analytics/crash firehose. The app keeps working; it just queues failed
telemetry and retries in the background.

**What doesn't work:**
- Blocking **Tier 2/3** — kills login and the feed (signing depends on it).
- A **static** blocklist over time. `TTNetInit` (42 refs) pulls its endpoint list and
  settings from the server, so ByteDance can push alternate/fallback domains. It's a
  maintenance treadmill, not a set-and-forget.
- Payload-level filtering (keep the connection, strip fields): TTNet uses a custom
  `X509TrustManager` and native pinning, so you can't MITM without root + Frida
  unpinning.

**Why:** Tier 1 lives on distinct hostnames the app treats as best-effort; Tiers 2/3
are load-bearing for auth and are the content path itself.

**Verdict:** ✅ Best realistic single measure. Meaningful, low-effort, no root — but
scoped to Tier 1 and needs occasional list upkeep.

---

## Option B — Permission denial / "starve, don't lie"

**Tools:** Android per-permission settings; "approximate location"; deny contacts,
Bluetooth, precise location.

**What works:** Denying gives the app *nothing* for that signal, which is the
cleanest privacy win and — importantly — **un-suspicious**. "No location permission"
and "empty contact list" are normal states millions of users are in, so they don't
trip anti-fraud. "Approximate location" gives coarse region without precise GPS and
without a spoof flag.

**What doesn't work / limits:** Denial can't touch data that doesn't need a runtime
permission — the metasec device fingerprint, the advertising ID path, coarse region
inferred from IP/timezone/SIM, or your in-app viewing behavior. Those flow
regardless.

**Why:** Runtime permissions gate the *sensitive* OS APIs (location, contacts, mic),
but a lot of fingerprinting uses signals that need no dangerous permission (build
props, timezone, network operator, screen metrics).

**Verdict:** ✅ Highest value-per-effort after Option A, and safer than spoofing.

---

## Option C — Data spoofing / poisoning (feed it bogus values)

**Tools:** mock-location (built-in dev option or app); LSPosed/Xposed privacy modules
(XPrivacyLua) to return fake/empty contacts, hidden app list, fake sensors; ad-ID
randomizers.

**What works (in isolation):** Faking **OS-provided** signals is technically doable
because you intercept the Android API return value *outside* TikTok's code — fake
GPS, empty contacts, randomized ad ID, hidden installed-app list.

**What doesn't work / backfires:**
- **The consistency trap.** Fingerprinting correlates signals. This build reads
  **SIM country (`getSimCountryIso`), network country (`getNetworkCountryIso`),
  MCC/MNC, timezone (44 refs), IP region, and store region (61 refs)** and expects
  them to agree. Mock GPS to Tokyo while IP=Brazil, SIM=`br`, TZ=`America/Sao_Paulo`
  is a *stronger* anomaly signal than the truth. A randomly churning fingerprint also
  makes you a stand-out outlier — potentially **more** trackable and more likely to
  get the account limited.
- **Detection of the tooling itself.** The app carries heavy anti-tamper detection:
  **Xposed (342 refs)**, Magisk (18), Frida (14), shadowhook (15), substrate,
  `isMock` (25), "cheat" (43). The moment you use root-level hooks to spoof the
  harder signals, you're in the exact category metasec is built to flag → captcha /
  phone verification / soft-ban, not silent success.

**Why:** Anti-fraud's whole job is detecting spoofed/emulated/hooked devices and
inconsistent geo-signals. Lying to it is the thing it's designed to catch.

**Verdict:** ⚠️ Partial and risky. Bogus *coarse* location via "approximate" is fine;
active spoofing of everything tends to cost account access more than it costs
ByteDance useful data. Convincing spoofing needs a *coherent* alternate persona (VPN
+ timezone + locale + SIM + GPS all consistent) — high effort, constant upkeep.

---

## Option D — Tamper with metasec itself / repackage the APK

**Tools:** Frida hooks on the native signer; patched/repackaged APK; stubbed telemetry.

**What works:** Essentially nothing durable for a normal user.

**Why it doesn't:**
- `libmetasec_ov.so` is native, obfuscated, anti-hooked, and **server-validated** —
  produce a bogus signature and the server rejects it or scores it anomalous.
- Integrity/anti-repackaging libs (`libvcnverify`, `libavocadoguard`,
  `libfileprotect`) trip on a modified APK.
- Endpoints and signing params are refreshed server-side, so any static patch is a
  losing cat-and-mouse.

**Verdict:** ❌ Not worth it outside dedicated research; breaks on updates, high ban
risk, and requires reverse-engineering native code that this static pass didn't crack.

---

## Summary matrix

| Approach | Removes | Keeps app working | Effort | Risk | Verdict |
|---|---|---|---|---|---|
| A. Network blocking (Tier 1) | 3rd-party trackers, APM/behavior-log | ✅ | Low | Low | ✅ Do this |
| B. Permission denial | Precise location, contacts, BT, mic-at-rest | ✅ | Low | None | ✅ Do this |
| C. Data spoofing | *Attempts* to poison OS signals | ⚠️ | Med–High | Med (flags/ban) | ⚠️ Coarse-loc only |
| D. Metasec/APK tampering | Fingerprint | ❌ (often breaks) | Very high | High (ban) | ❌ Skip |

## Recommended layered strategy (no root)

1. **Block Tier 1** with a per-app filtering DNS/firewall (Option A).
2. **Deny** precise location (use "approximate"), contacts, and Bluetooth (Option B).
3. **Reset the advertising ID** periodically; opt out of ad personalization.
4. **Never open links in the in-app browser** — use the system browser (avoids the
   JS-bridge surface from report 05).
5. **Accept the residual:** persistent device ID + viewing behavior remain — they're
   welded to the signed feed API. If that residual is unacceptable, the only real
   mitigation is **not using the app** (or using the web at `tiktok.com` in a hardened
   browser, which still fingerprints but with fewer OS-level signals).

## What's unavoidable while using the app

- A persistent, ByteDance-controlled **device identity** (metasec + `openudid`/`cdid`).
- Your **complete viewing behavior** (the recommendation signal is the feed request).
- **Coarse region** (from IP + timezone + network operator, no permission needed).

## Verification gap

Every "works / doesn't work" call above is reasoned from static evidence. To *prove*
which blocks break the app and which telemetry survives permission denial, you'd run
the dynamic follow-ups in report 07: a rooted device, MITM proxy with TLS-unpinning,
and Frida instrumentation, blocking hosts one tier at a time and observing what still
functions.
