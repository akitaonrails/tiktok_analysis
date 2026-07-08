# 03 — Manifest Components, Exported Surfaces & App Enumeration

Component totals in the base manifest:

| Type | Total | Exported |
|---|---|---|
| activity | 494 | 30 |
| activity-alias | 2 | 2 |
| service | 92 | 15 |
| receiver | 48 | 11 |
| provider | 13 | 8 |

## Cross-app account & attribution providers (the notable finding)

Eight `ContentProvider`s are exported. Several are exported **with no permission
guard**, which means any other app on the device can query them:

| Provider | Exported | Permission | Concern |
|---|---|---|---|
| `…account.provider.AccountInfoProvider` | yes | **none** | Exposes account info to other apps |
| `…account.provider.OneTapLoginTokenProvider` | yes | **none** | Exposes a login token for "one-tap" sign-in |
| `…account.share.data.write.provider.SecShareDataProvider` | yes | **none** | Writes shared account data readable by sibling apps |
| `…lemon.TTReferrerForLemon8Provider` | yes | none | Passes install-referrer to **Lemon8** (ByteDance) |
| `…drama.app.referrer.DramaTTReferrerProvider` | yes | none | Referrer to the Drama/short-video sibling app |
| `com.facebook.FacebookContentProvider` | yes | none | Standard Facebook SDK provider |
| `…livewallpaper.WallPaperDataProvider` | yes | `…permission.wallpaper` | Guarded |
| `…preinstall.attribution.provider.PreinstallAttributionProvider` | yes | `…permission.ATTRIBUTION_INFO` | Guarded |

This is ByteDance's **cross-app account-sharing** mechanism. When another ByteDance
app (CapCut, Lemon8, TikTok Now, Lark, Resso) is installed alongside TikTok, they
can share sign-in state ("one-tap login") across the family of apps. The shared
`Token` object (read from the decompiled provider) carries real credentials:
`user_id`, `id_token`, `id_token_id`, `device_secret`, `username`, `avatar_url`.

**These providers are NOT wide open — the code gate matters.** Although the manifest
declares no `android:permission`, the decompiled `AccountInfoProvider.query()` and
`.call()` both invoke a caller-verification method (`LIZIZ()`) that:

1. reads `getCallingPackage()`, allows the app's own package, otherwise
2. computes the caller's **signing-certificate signature** and checks it against a
   **server-pushed allowlist** stored in Keva under
   `oidc_android_client_package_sigs`, logging the result as
   `oidc_certificate_validate_result`.

So account tokens are handed only to **signature-verified, allowlisted ByteDance
"OIDC client" sibling apps**, not to any arbitrary app that knows the authority.
That is a meaningful safeguard and corrects the naïve "unguarded = readable by
anyone" reading of the manifest.

The residual privacy point stands, though: **identity and login tokens are shared
across the ByteDance app family** by design, so your TikTok identity is linkable to
your CapCut/Lemon8/etc. identity on the same device, and the allowlist of who may
read it is controlled remotely by ByteDance (server-pushed), not by the user. This
is the most concrete "crosses the single-app sandbox boundary" behavior in the
manifest — governed, but ByteDance-governed.

## Installed-app enumeration via `<queries>`

Instead of the blanket `QUERY_ALL_PACKAGES` permission, the manifest lists **91
specific packages** plus 24 intent filters it wants visibility into. TikTok can
therefore detect whether each of these is installed. The list includes:

- **Competitor / social apps:** WhatsApp (+ business + w4b), Snapchat, Instagram,
  Facebook (katana/lite/mlite/orca), Twitter/X, Telegram, Reddit, Discord,
  Pinterest, YouTube, Viber, Line, KakaoTalk/Story, Zalo, VK, Naver Band/Blog/Cafe,
  Imgur.
- **Payments:** PayPal, Venmo.
- **Music (competitive/streaming):** Spotify, Apple Music, Amazon Music, Deezer,
  SoundCloud, YouTube Music, Anghami, Melon, Resso.
- **ByteDance siblings:** Lemon8 (`com.bd.nproject`), Lark, TikTok Now, `musically.go`,
  `tiktok.lite.go`, `ss.android.ttmd.video`.
- **Browsers:** Chrome (+beta/dev), Firefox, Samsung Internet, all WebView channels.
- **Carrier/OEM preload & attribution helpers:** T-Mobile, Sprint, IronSource/aura,
  Ticketmaster, Google Maps, etc.

**Interpretation.** A general intent (`VIEW` with `scheme="*"` `host="*"`) is also
present, which broadens visibility to any app handling web links. The explicit
enumeration of competitor social/messaging/payment/music apps is a well-documented
industry practice used for: "invite/share to app X" buttons, install-attribution,
and **audience/behavioral signals** (which other apps you have installed is a strong
profiling feature). It is scoped rather than unlimited, but it is broad, and it goes
beyond what sharing UI strictly requires — you don't need to know a user has Venmo,
Spotify, and PayPal installed to render a share sheet.

## Exported services worth noting

Most exported services are guarded (`BIND_JOB_SERVICE`, `BIND_QUICK_SETTINGS_TILE`,
push-vendor permissions). Two carry **no permission**:
`TiktokAuthService` (OAuth "Login with TikTok" for third-party apps — exported by
design) and `NotifyService` (legacy push). `OriginalSoundUploadService` and
`VideoFramesUploadService` are `BIND_JOB_SERVICE` background upload workers — named
for uploading original audio and extracted video frames, worth noting as
content-egress workers (expected for a publishing app, but they are upload paths).
