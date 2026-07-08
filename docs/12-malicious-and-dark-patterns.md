# 12 — Malicious Code & Dark Patterns

This report answers: *does the code contain malicious/malware patterns, or
manipulative "dark patterns"?* It is based on a full-tree scan of the decompiled
Java (native `.so` code is string-scanned only — same caveat as every other report).

Two separate questions, two different answers:

- **Malware-style malice:** none found.
- **Dark patterns (manipulative UX):** clearly present, though industry-standard and
  partly offset by a large well-being subsystem.

---

## Part 1 — Malware-technical patterns: none found

Each classic red flag was checked and cleared:

| Pattern checked | Result | Evidence |
|---|---|---|
| Silent / covert APK install | **Absent** | `REQUEST_INSTALL_PACKAGES` not declared in manifest; 1 installer-related file |
| Overlay clickjacking | **Absent** | 0 `TYPE_APPLICATION_OVERLAY` window uses in Java (the `SYSTEM_ALERT_WINDOW` permission is the floating video player) |
| Covert AccessibilityService | **Absent** | No service declared, no `onAccessibilityEvent` (report 10) |
| Privilege escalation | **Absent** | `su` paths are for *detection*; no `su` execution (report 10) |
| Premium-SMS / dialer abuse | **Absent** | No SMS/call permissions |
| Covert C2 / unknown beacon host | **Absent** | Every endpoint attributable (report 04) |
| Download-and-run arbitrary code | **Not found** | The 12 `DexClassLoader` sites load the app's **own** bundled/split code and native libs (Facebook SoLoader, ByteDance codec/realx context, in-app preloaders) — not internet-fetched dex |

### The one genuine caveat: heavy server-side content/config delivery
This is **not malicious**, but it is the honest asterisk on "the code looks clean."
TikTok ships an extensive **remote delivery** stack:

- **Gecko** (359+ files) — `geckochannel` / `geckoresource` / `geckobundle` /
  `geckopackage`: delivers **web/JS/resource bundles** (not native code patches).
- **Lynx** — ByteDance's JS UI runtime; screens can be defined by server-pushed bundles.
- **Helios** privacy policy — server-pushed (`AllowNetworkApiConfig`, `ModifyConfig`).
- **Dynamic feature modules** — 49 install-on-demand modules downloaded post-install.

**Implication:** ByteDance can change a large amount of the app's content, front-end
behavior, and access policy **server-side, without a Play Store update**. Gecko
delivers *resources/JS*, not arbitrary native code, so this is not an RCE backdoor —
but it does mean **no static snapshot (including this one) can guarantee future
behavior**. This is legitimate and common in large apps, but it is the vector by
which a benign build could be altered later, and it belongs in any honest verdict.

---

## Part 2 — Dark patterns: present

Manipulative engagement/retention design, visible as A/B-test and setting keys in the
decompiled code. These are standard across large ad/engagement-driven apps — not
unique to TikTok — but they are present and fairly extensive.

| Category | Evidence keys | What it does |
|---|---|---|
| **Win-back / re-engagement** | `ab_retention_popup`, `af_reengagement_window`, `push_resurrect*`, `resurrect*`, `click_push_streak` | Popups and push to pull lapsed users back |
| **Streak mechanics** | `active_streak_threshold`, `chatroomstreakvm`, `click_streak`, `conversation_has_active_streak` | Snapchat-style streaks that penalize stopping |
| **Social-action nudges** | `attachment_type_nudge_like` / `_repost` / `_favourite`, `badgenudge*` | Prompts engineered to push likes/reposts |
| **Autoplay / infinite feed** | `bbautoplayviewmodel`, `commerce_photo_mode_disable_autoplay_in_feed` | The endless-scroll engagement core |
| **Cancel-flow friction** | `cancel_recharge_retention_popup`, exit/`show_exit_dialog` | Friction when leaving or canceling a coin recharge |
| **Contacts-upload nagging** | `upload_contacts_notice_interval`, `upload_contacts_notice_times`, `contact_upload_ui_limits`, `contact_upload_next_time_key` | Machinery to **repeatedly re-prompt** contact upload after you decline — the most concrete "keeps asking until you cave" pattern |

The contacts-upload nagging is the most notable because it directly serves data
collection (report 05): the app schedules repeat prompts, capped by
`notice_times`/`notice_interval`, to convert users who initially said no.

---

## Part 3 — In fairness: a large well-being counter-signal

The same codebase carries an unusually large **anti-addiction / digital-wellbeing /
minor-protection** subsystem — much of it regulator-driven (China minor rules, EU DSA,
US scrutiny), but real:

- `anti_addiction_day_time` / `_night_time` / `_separation` / `_toast_time`,
  `bottom_banner_anti_addiction`, `common_feed_anti_addiction_video`
- `daily_screen_time_*` — blocks, popups, missions, challenges, and even
  `daily_screen_time_bypass_detected` (it detects attempts to *evade* the screen-time
  limit)
- `digital_wellbeing*`, `minor_protection`, `family_pairing`, teen-mode components,
  break/sleep reminders

So the app simultaneously ships engagement **dark patterns** *and* **brakes** on them.
An honest reading: the growth/engagement teams and the compliance/safety teams are
both visible in the code, pulling in opposite directions.

---

## Verdict

- **Malicious code:** no. No silent install, clickjacking, covert accessibility,
  privilege escalation, premium-SMS, hidden C2, or remote arbitrary-native-code
  execution. Dynamic loading is own-code; Gecko delivers resources, not code patches.
- **Trust caveat:** the powerful server-side content/config/policy delivery means the
  app's behavior is remotely mutable — a static audit cannot bind future behavior.
- **Dark patterns:** yes — retention popups, streaks, action nudges, autoplay/infinite
  feed, cancel-flow friction, and persistent contacts-upload nagging. Aggressive but
  conventional for the category.
- **Counter-signal:** a substantial, largely compliance-driven well-being and
  minor-protection layer is also present.

As always, static presence ≠ runtime proof — see [report 07](07-assessment.md) for
the dynamic follow-ups that would confirm which of these actually fire in normal use.
