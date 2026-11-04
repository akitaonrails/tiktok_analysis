# 17 — Brazilian Law: LGPD & "Lei Felca" (ECA Digital) — Technical Reading

Does TikTok v47.7.1, as analyzed in this repo, **infringe Brazil's LGPD or the "Lei Felca"
(ECA Digital)?** This maps the technical findings (reports 14–16) onto the two laws.

> **Not legal advice, and not a legal verdict.** Whether a data practice *legally* infringes
> is decided by the **ANPD** and the courts, weighing TikTok's privacy policy, its consent
> screens, its claimed legal bases, and its actual server-side behavior — none of which is
> fully visible in the APK. What static analysis *can* do is show where the app's behavior
> **creates tension** with specific articles, and where regulators have **already acted**.
> Treat the article mapping as "where a regulator would look," not "proven violation."

**One-line answer:** The app's behavior is **in clear tension** with several LGPD principles
and with the children's-data core of the Lei Felca, and **Brazilian regulators have already
found problems and fined ByteDance over children's data**. But a blanket "it infringes"
can't be concluded from the APK alone — the decisive facts (privacy policy, consent, age
gating, legal basis) sit partly outside it.

---

## 1. What has already happened in Brazil (real-world, not inferred)

This isn't hypothetical — the ANPD has an active enforcement track against TikTok:

- A probe that began from a **2021 complaint** found weak age-verification and improper
  handling of children's/teens' data, flagged against **LGPD Art. 14** (children's data).
- In **November 2024** the ANPD opened a formal administrative proceeding; scope included
  collecting minors' data **without age verification or registration**, and using that data
  for **content personalization**.
- The ANPD ordered TikTok to **disable access to the feed without registration** in Brazil.
- Reporting on a decision dated **25 August** (year per the source; verify) states the ANPD
  **fined ByteDance ~R$153.7 million** over minors' data and ordered it to **delete
  irregularly-collected data** and submit an improvement plan.

So the LGPD question is, in part, **already answered by the regulator** for the
children's-data slice: the ANPD treated it as a violation serious enough to fine. The
analysis in this repo is consistent with why (persistent identifiers, opacity, profiling).

*(Appeal/current status not verified here — check the ANPD site before relying on the fine's
finality. Sources at the end.)*

---

## 2. LGPD (Lei 13.709/2018): where the app's behavior creates tension

| LGPD article / principle | Technical finding (this repo) | Tension |
|---|---|---|
| **Art. 6, II–III — necessidade & adequação** (collect only what's needed for the stated purpose) | Hourly re-report of **all device IDs incl. ANDROID_ID** to `cp-rp.tiktokv.com` (`DeviceManagerLancet.java:58-240`); a ~90-field root/hook/hardware probe (`X/C0EBA.java`); a permanent native fingerprint; touch + motion sampling (report 14 §3) | Breadth far exceeds what "watch short videos" needs. Necessity is the hardest test to pass here |
| **Art. 7 / Art. 11 — legal basis / sensitive data** | Device fingerprint, ANDROID_ID, sensors, touch dynamics are collected **passively, with no opt-in** (report 14 §3.3–3.4) | Requires a valid basis (consent or legitimate interest). Behavioral/biometric-adjacent signals raise the bar; opacity weakens any "legitimate interest" balancing |
| **Art. 9 — transparency / right to know** | The fingerprint and signatures are **computed and encrypted in native code** (`libmetasec_ov.so`); contents aren't auditable even with full decompilation (report 13, 14) | The data subject cannot realistically know what is collected — direct tension with the right to clear information |
| **Art. 14 — children's data** (best interest; parental consent) | Default path profiles behavior for everyone; a **Kids Mode** minimization exists (blanks ANDROID_ID, zeros GAID, drops `openudid`/`google_aid`/`uoo`: `X/C09M9.java:11`, `X/C1183500gtu.java:45`) but only when that mode is active; robustness of age-gating is **server-side, not provable from the APK** | This is exactly the ANPD's finding. Minimization exists but hinges on correctly identifying the user as a minor |
| **Art. 18 — data-subject rights** (access, deletion, portability) | `openudid` = ANDROID_ID **survives app-data clears and reinstalls** (`AbsDeviceParamsProvider.java:79-127`); the server may re-issue the same `device_id` on a matching fingerprint (report 14 §3.1) | A persistent identity that outlives a data wipe complicates the right to deletion / to not be re-identified |
| **Art. 33 — international transfer** | **No Brazil data-residency enclave.** US → `.tiktokv.us`/Oracle, EU → `.tiktokv.eu`; Brazil (ROW) → general + ByteDance-global hosts (`byteoversea.com`, `isnssdk.com`) outside any enclave (report 16) | Cross-border transfer to ByteDance-global infrastructure engages Art. 33's safeguards/consent requirements |
| **Art. 6, VI — transparência** + region | The app ships **GDPR/EEA and US minimization branches but no `BR`/LGPD branch** (`C0E8F` enum = US/EU/KR/ROW; `DmtSec.java:175-178` restricts the constrained mode to US+EU) (report 16) | Brazil gets the default, most-permissive path. Not itself illegal, but it means none of the regulatory dampeners apply to Brazilian users |

**Net LGPD reading:** The strongest tension is **necessity + transparency + persistent
identifiers**, and specifically **children's data**, which the ANPD has already acted on. A
disclosed privacy policy with a legitimate-interest basis could cover *some* of this legally;
it cannot cure unauditable collection or identifiers that defeat deletion.

---

## 3. "Lei Felca" / ECA Digital (Lei 15.211/2025)

Nicknamed after the influencer **Felca**, whose 2025 videos on *adultização* (sexualization
of minors online) drove it. Sanctioned **17 Sep 2025**; the main duties take effect after a
vacatio legis (reported as **~March 2026**). It targets **protection of children and
adolescents on digital platforms**. Mapping its core duties to what we can and can't see:

| Lei Felca duty | What the APK shows | Verdict from static analysis |
|---|---|---|
| **Robust age verification** (no mere self-declaration; biometrics/documents) | Age-gating logic is largely **server-side**; the APK has age-related settings (`age-signals.properties`) but the verification strength isn't decidable statically | **Can't confirm or refute from the APK.** This is exactly the ANPD's open concern |
| **Under-16 accounts linked to a guardian** | Account/guardian binding is a server + account-flow feature | Outside static scope |
| **No targeted advertising from children's data** | Default engine profiles behavior; **Kids Mode** zeros the ad ID (GAID → all zeros) and drops ad identifiers (`X/C06M3.java:13-27`, `X/C1183500gtu.java:45`) | Minimization path **exists** for identified minors; depends entirely on correct age detection |
| **Prevention by design** (reduce exploitation/harm risk from the design stage) | Not measurable in a telemetry teardown | Outside static scope |
| **Rapid removal of illegal/harmful content**; **loot-box ban**; **semiannual transparency reports** (>1M minor users) | Content moderation, store mechanics and reporting are server/policy, not client telemetry | Outside static scope |
| **Fines up to R$50M per infraction**; ANPD among enforcers | — | Enforcement context |

**Net Lei Felca reading:** The law's center of gravity — **age verification and not profiling
minors** — is mostly **server-side and age-detection-dependent**, so this static analysis
**cannot prove** compliance or infringement. What it *can* say: the technical means to
minimize children's data **exist in the app (Kids Mode)**, but the default path profiles
everyone, so compliance rests on the app reliably knowing who is a minor — the precise point
the ANPD already flagged as weak.

---

## 4. Bottom line

- **LGPD:** Strong tension on necessity, transparency, persistent identifiers, international
  transfer, and children's data. For children's data this is **more than tension** — the ANPD
  has opened a proceeding and reportedly fined ByteDance and ordered deletion. For adults, a
  definitive "infringement" call needs the privacy policy, consent flows and legal basis that
  the APK doesn't contain.
- **Lei Felca (ECA Digital):** The decisive questions (age-verification strength, guardian
  linkage, profiling of minors) are **server-side and not provable from the client**. The app
  has a minimization mode for identified minors; whether minors are reliably identified is the
  open question — and the one regulators are pressing.
- **Practical takeaway for you:** regardless of the legal outcome, Brazil is the
  least-protected tier technically (report 16), and the regulator's own interim remedy —
  **no feed without registration / an account** — lines up with this repo's advice to not log
  in and to isolate the app (report 14 §5). The user-side controls carry the load that neither
  a regional enclave nor (yet-fully-enforced) local law provides.

## 5. Caveats

- This repo is a **static teardown of one APK (v47.7.1)**. Legality depends on documents and
  server behavior it doesn't include.
- Enforcement facts (the ANPD fine amount, date and appeal status; the Lei Felca effective
  date) are from **secondary news/legal sources** summarized below; verify against the ANPD
  and Planalto before citing them as settled.
- Children's-protection compliance (Lei Felca) is **largely outside what any client-side
  analysis can settle**; it needs the age-verification and moderation systems, which are
  server-side.

## Sources

Brazilian law & enforcement (secondary; verify against official texts):
- ECA Digital / Lei Felca overview — [Migalhas](https://www.migalhas.com.br/depeso/457525/eca-digital-protecao-de-criancas-e-adolescentes-nas-plataformas-online), [Conjur](https://conjur.com.br/2026-mar-28/lei-felca-e-compliance-digital-o-que-muda-na-governanca-das-empresas-2/), [TJPE](https://portal.tjpe.jus.br/web/portal/-/eca-digital-imp%C3%B5e-novas-regras-para-crian%C3%A7as-e-jovens-acessarem-redes-sociais-jogos-e-sites), law text mirror [Lei 15.211/2025](https://www.maisumsitejuridico.com.br/lei-no-15-211-de-17-de-setembro-de-2025-eca-digital-lei-felca/)
- ANPD vs TikTok (children's data) — [Tecnoblog](https://tecnoblog.net/noticias/anpd-vai-investigar-tiktok-por-tratamento-de-dados-de-criancas/), [TeleTime](https://teletime.com.br/04/11/2024/anpd-tiktok-falha-no-tratamento-de-dados-de-criancas-e-adolescentes/), feed-without-registration order [Canaltech](https://canaltech.com.br/redes-sociais/tiktok-tera-que-desativar-acesso-ao-feed-sem-cadastro-no-brasil-determina-anpd/), [Diário do Nordeste](https://diariodonordeste.verdesmares.com.br/ultima-hora/tecnologia/anpd-abre-processo-contra-tiktok-por-potencial-tratamento-irregular-de-dados-de-criancas-1.3579005)

Technical basis: this repo's [report 14](14-v47-data-inventory-and-dns-blocking.md),
[15](15-repackaging-feasibility-and-patch-plan.md), [16](16-regional-data-treatment.md),
with `file:line` citations in `docs/_evidence/v47/`.
