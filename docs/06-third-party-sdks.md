# 06 — Third-Party SDKs (Data Leaving to Non-ByteDance Companies)

Beyond ByteDance's own infrastructure, the app embeds third-party SDKs that receive
data. Counts are dex-string references (a proxy for integration depth, not call
volume).

| SDK | Refs | Category | Data typically shared | Endpoint seen |
|---|---|---|---|---|
| **Adjust** | 1544 | Attribution/analytics | Ad ID, device signals, install/events | `view.adjust.com` |
| **Facebook SDK** | 763 | Login / share / attribution | App events, ad ID (if FB app present) | `graph.facebook.com` |
| **AppsFlyer** | 692 | Attribution | Ad ID, device, install referrer | `*.onelink.me`, `aps-webhandler.appsflyer.com` |
| **Singular** | 12 | Attribution | Install/attribution | — |
| **Amplitude** | 19 | Product analytics | Event telemetry | — |
| **Firebase / GMS** | 7+ | Analytics / messaging / auth | Events, push tokens | `app-measurement.com`, `firebase.google.com` |
| **ThreatMetrix (LexisNexis)** | 3 | Device fingerprint / fraud | Rich device fingerprint | `h.online-metrix.net` |
| Google Ads / DoubleClick | — | Ad serving | Ad requests, ad ID | `doubleclick.net`, `googlesyndication.com`, `googleadservices.com` |
| Google Play services | many | Billing, referrer, AICore | Purchases, install referrer | `play.google.com`, Finsky referrer |
| Amazon (LWA / ADM) | — | Login / push | Push token, auth | `api.amazon.com` |
| OEM push (OPPO/HeyTap, Huawei, Samsung) | — | Notifications | Push tokens, device | vendor endpoints |

## Notes

- **ThreatMetrix (`online-metrix.net`)** is the notable non-obvious one: a
  LexisNexis Risk Solutions device-fingerprinting/fraud service. It builds its own
  cross-site device profile. Its presence is normal for apps with payments/anti-fraud
  (TikTok Shop), but it means device-fingerprint data goes to a **US data-broker**
  in addition to ByteDance.
- **Attribution stack is redundant** (Adjust + AppsFlyer + Singular + Facebook +
  Firebase). Each independently collects the advertising ID and install/device
  signals for marketing attribution. This is common in large consumer apps but
  multiplies the number of third parties receiving device identifiers.
- **Ad networks** (DoubleClick/AdMob/Google Ad Services) participate in ad serving
  and measurement.
- These SDKs are **disclosed, industry-standard vendors** — not covert. The privacy
  cost is breadth: your advertising ID and coarse device profile fan out to roughly
  half a dozen advertising/analytics companies in addition to TikTok itself.
