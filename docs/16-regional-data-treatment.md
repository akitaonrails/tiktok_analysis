# 16 — Regional Data Treatment: Brazil vs. US vs. EU

Does a **Brazilian** user have more or less data shared with TikTok than a user in the
**US** or **EU**? Short answer, from v47.7.1 static analysis: **Brazil is in the
least-protected tier.** Not necessarily because more *fields* are collected (that needs
live capture to prove), but because the two things that constrain collection — a dedicated
data-residency enclave and a regulatory data-minimization code path — **both exist for the
US and EU and neither exists for Brazil.**

> Static analysis only. This shows which code branch runs for which region and where data is
> routed. It does not measure byte-for-byte payload differences. Paths relative to the v47
> jadx `sources/` root.

---

## 1. The app sorts every user into one of five compliance regions

`X/C0E8F.java` is the region enum the compliance layer uses:

```
US, EU, KR, ROW, UNKNOWN
```

- **US** → United States.
- **EU** → European Economic Area.
- **KR** → South Korea (its own bucket — Korea's PIPA law).
- **ROW** → "rest of world." **Brazil lands here**, together with most of Latin America,
  Asia, Africa and the Middle East.
- **UNKNOWN** → not yet determined.

The region is resolved by `ComplianceServiceProvider.LJIILL().LJIIL()` from the **store /
account region** (the app-store country and account history), not merely your IP. A VPN alone
does not move you between these buckets; it's cross-checked against SIM, locale and account
signals (report 14 §3.2). There is **no `BR` / Brazil / LGPD branch anywhere in the code** —
`grep` for `LGPD` returns zero hits, versus multiple `EEA`/`GDPR`/`isInEea` gates.

## 2. Where the data physically goes

| Region | Dedicated enclave | Example hosts | Program |
|---|---|---|---|
| **US** | ✅ Yes | `api16-normal-useast5/8.tiktokv.us`, `dig.tiktokv.us` (+ Oracle Cloud Ashburn) | Project Texas / USDS |
| **EU** | ✅ Yes | `api16-normal-no1a.tiktokv.eu` (Norway), `*-ie` (Ireland) | Project Clover |
| **Brazil (ROW)** | ❌ **None** | general `*.tiktokv.com` shards + ByteDance-global `*.byteoversea.com`, `*.isnssdk.com` | — |

US and EU user data is steered into walled-off, independently-audited national/regional
infrastructure. **Brazil has no equivalent.** Your traffic uses TikTok's general
international infrastructure and the ByteDance-global telemetry/fingerprint hosts
(`byteoversea.com`, `isnssdk.com`, `zijieapi.com`) that sit *outside* any enclave
(report 04, report 14 §4). So for a Brazilian user there is no "my data stays in my region"
guarantee of the kind US and EU users nominally get.

## 3. The security/fingerprint engine runs a different mode for you

`com/ss/android/ugc/aweme/sec/DmtSec.java` sets the metasec (anti-fraud / device-signature)
collection mode by region:

```java
// DmtSec.java:175-178
private final boolean isUsEeaRegion() {
    C0E8F r = ComplianceServiceProvider...LJIIL();
    return r == C0E8F.US || r == C0E8F.EU;   // KR and ROW are NOT included
}
// DmtSec.java:272-284
if (isUsEeaRegion())  msManager.LIZ(503);   // US + EU
else                  msManager.LIZ(603);   // everyone else, incl. Brazil
```

US and EU get a distinct, compliance-constrained mode (`503`); **Brazil gets the default mode
`603`.** The two numbers select different collection/transmission behavior in the native
engine. *Which* mode collects less is inside `libmetasec_ov.so` and not provable from static
analysis — but the structure is unambiguous: **the special-cased, regulation-driven path is
reserved for US/EU, and Brazil runs the unmodified default.**

## 4. Data-minimization branches are gated to US/EU

The privacy-reducing code paths that do exist are keyed to the compliance region, not applied
globally:

- **Android ID can be blanked** only behind a compliance check
  (`X/C822303It.LJIILJJIL()` → `ComplianceServiceProvider…LIZLLL()`, report 14 §3.1). That
  check is driven by the same US/EU-oriented compliance state.
- **Consent flows** (`com/ss/android/ugc/aweme/compliance/consent/*`, `PNSDeviceConsent…`)
  and several UI/data gates branch on `C0E8F.EU` / `C0E8F.US` (e.g. `X/C17CZ.java`).
- The built-in network config is split only two ways: the **US** config (`X/C03HO.java:17`,
  for `US, AS, VI, MP, PR, GU`) and **everything else** (`:18`), which is what Brazil loads.
  They are nearly identical; the US one points at the Oracle-hosted resolver, the ROW one at
  the Google-Cloud resolver IP.

In each case the restrictive branch is written for the US and EU. A ROW user falls through to
the default — the most permissive path the app offers.

## 5. Verdict for a Brazilian user

**You have *less* protection than a US or EU user, not more.** Concretely:

1. **No data-residency enclave.** US → Project Texas/Oracle, EU → Project Clover. Brazil →
   ByteDance-global infrastructure, no regional ring-fence.
2. **No regulatory minimization path runs for you.** The GDPR/EEA and US branches (consent
   gating, ID blanking, security mode 503) are region-locked to US/EU. Brazil gets the
   default (mode 603, no blanking).
3. **Korea is carved out, Brazil isn't.** The code bothers to give `KR` its own bucket;
   there is no `BR` bucket and no LGPD handling, even though Brazil's LGPD is a GDPR-style law.
4. **Same unavoidable core as everyone.** The device fingerprint and your in-app behavior
   (watch time, searches) flow for every region alike; region only changes *where* they land
   and *which* compliance trimming is applied on top.

So a Brazilian user gets **the baseline-everyone collection plus none of the regional
dampeners** that US and EU users get. "More data shared" is the fair characterization,
chiefly through weaker routing guarantees and the absence of a minimization branch.

### Does this change the mitigation advice?

It makes it **more** worthwhile, not less. Because no enclave or legal-minimization path
protects you by default, the user-side controls carry the whole load:
- the isolate-don't-spoof setup and the NextDNS + router rules in
  [report 14 §4–5](14-v47-data-inventory-and-dns-blocking.md);
- note that **changing your store/account region to the EU does not reliably move you** into
  the EU bucket — it's cross-checked against SIM, IP and account history, and a mismatch is
  itself an anti-fraud signal (report 14 §5). Chasing the EU bucket by spoofing backfires the
  same way other spoofing does.

## 6. Caveats

- Region is decided by **store/account region**, resolved in a `ComplianceServiceProvider`
  whose backing value is partly server-controlled; the enum and the branch points are static
  facts, the live value on a given device is not.
- "Mode 503 vs 603" is a real, region-gated switch, but the *contents* of each mode are in
  encrypted native code. The direction (US/EU = more constrained) is inferred from the branch
  being the one guarded by the compliance check, not measured.
- Confirming actual per-region payload differences needs the dynamic setup in
  [report 07](07-assessment.md), run from both a Brazil and an EU/US vantage point.
