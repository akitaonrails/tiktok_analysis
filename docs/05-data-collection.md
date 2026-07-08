# 05 — What Data Is Collected

Each item below lists the capability, the evidence found, and an honest confidence
level. Remember the core caveat (README): payload assembly happens in native code,
so "collected" = *the read path exists and is wired toward telemetry/API*, verified
by decompiled Java + retained strings, not by observing the wire.

## Device identifiers & fingerprint (high confidence)

The ByteDance **AppLog / device-register** bundle is present. Telemetry field names
found in the dex:

`openudid`, `install_id`, `clientudid`, `cdid`, `gaid` (Google Advertising ID, 41
hits), `oaid` (OAID — the Chinese-OEM advertising ID), `google_aid`, `device_brand`,
`device_model`, `cpu_abi`, `carrier`, `sim_region`, `tz_offset`, `rom_version`,
`resolution`. Endpoint: `/service/2/device_register/` → `*.isnssdk.com` / `-va` /
`-sg`.

On top of that sits the **MS SDK (metasec)** hardware/software fingerprint computed
in `libmetasec_ov.so` and sent (encrypted) to `mssdk-*.byteoversea.com`, plus a
`sdfp-*` device-fingerprint service. This is a **persistent cross-session device
identity** that survives app data clears via the `openudid`/`cdid` scheme.

**Reassuring:** the string scan found **no** `"imei"` or `"mac_address"` telemetry
keys, and the app does **not** request `READ_PHONE_STATE`. On modern Android it
relies on advertising IDs and app-generated UUIDs, not hardware serials — consistent
with current Play policy.

## Contacts (high confidence — feature-gated)

- Permission `READ_CONTACTS` is declared.
- Endpoint `/aweme/v1/upload/contacts/` is present in the API list
  (`X/C1499030p6z.java`).
- Settings keys govern it: `contact_upload_timing`, `contact_upload_optimization`,
  `contact_upload_next_time_key`, `upload_contacts_notice_interval`,
  `contact_upload_ui_limits`, `social/friend/`, `friend/find`.

This is the **"Find Friends" contacts sync**: when enabled, the address book is
uploaded to TikTok to match contacts to accounts. It is normally consent-gated in
the UI, and industry practice is to upload **hashed** phone/email — but the upload
endpoint and scheduling machinery are unambiguously built in, and the settings imply
**recurring re-upload on a timer** once enabled.

## Precise location (high confidence)

`ACCESS_FINE_LOCATION` + `ACCESS_COARSE_LOCATION` + `ACCESS_MEDIA_LOCATION`;
`LocationManager`, `getLatitude`/`getLongitude` references; dedicated
`location.tiktokv.com` / `location-sg.byteintl.com` services and a `df_location`
dynamic module. Combined with Wi-Fi (`ACCESS_WIFI_STATE`, `CHANGE_WIFI_STATE`) and
Bluetooth scanning permissions, the app can derive location from **GPS, Wi-Fi, and
BT signals** — and `ACCESS_MEDIA_LOCATION` exposes **GPS EXIF in uploaded photos**.

## Clipboard (moderate — limited footprint)

`ClipboardManager.getPrimaryClip()` read paths exist but at only **3 call sites**
(`X/C21410318qb`, `X/C2204961BRm`, `X/C20145713s7`). This is consistent with
targeted use (reading share/deep-link/invite codes pasted by the user) rather than
continuous clipboard surveillance. Modern Android also shows a paste indicator.
Historically TikTok was caught reading the clipboard aggressively (2020, iOS); this
build's Java surface for it is small, but native paths were not audited.

## Installed-app inventory (high confidence)

Via the scoped `<queries>` list of **91 named apps** (see 03) — competitors,
messengers, payment, and music apps — TikTok can determine which are installed. Also
`getInstalledPackages` (3 refs) and `getRunningTasks` (6 refs) appear. No blanket
`QUERY_ALL_PACKAGES`, so this is scoped but still a strong profiling signal.

## Screen, camera, mic, biometrics, sensors

- **Screen capture:** `FOREGROUND_SERVICE_MEDIA_PROJECTION` (for LIVE screen-share)
  and `DETECT_SCREEN_CAPTURE` (detect user screenshots).
- **Camera/mic:** expected for the core product; foreground-service variants present.
- **Sensors:** 432 `SENSOR`-related string hits — accelerometer/gyroscope are read
  (motion is both a UX and an anti-bot/fingerprint signal).
- **Biometrics/NFC/Bluetooth:** capabilities present (app-lock, payments, accessories).

## In-app browser / WebView instrumentation (moderate)

`addJavascriptInterface` (6), `JsBridge` (107), `getSelection` (70),
`javascript:` (34), `on_input`/`reportInput` hooks. TikTok's in-app browser injects
a JavaScript bridge into pages opened inside the app. This is standard for hybrid
apps (Lynx/JSB framework), but the same mechanism is what independent researchers
(Krause, 2022) used to show TikTok's in-app browser *could* observe keystrokes/taps
on third-party pages. The injection points exist here; whether keystroke logging is
active is a runtime question. **Using the system browser instead of the in-app
browser avoids this surface entirely.**

## Behavioral telemetry (high confidence)

The AppLog pipeline (`libapplog_rust.so`, `libiesapplogger.so`) streams event
telemetry to `log*.byteoversea.com` / `rtlog.tiktokv.com`. Combined with the Libra
A/B system (`abtest-*`, `libra-*`) and the Pitaya on-device ML engine
(`pitaya.byteintl.com`), the app collects fine-grained **engagement/behavioral
signals** — what you watch, for how long, scroll/pause/replay — which is the core of
the recommendation system. This is expected for TikTok and is the least "hidden" of
all the collection, but it is the most *voluminous*.

## Summary table

| Data | Evidence strength | Feature-justified? | Notes |
|---|---|---|---|
| Device fingerprint / ad IDs | High | Partly | Persistent cross-session ID; encrypted via metasec |
| Contacts (hashed) | High | Yes (Find Friends) | Consent-gated; recurring upload once enabled |
| Precise location | High | Yes | GPS + Wi-Fi + BT + photo EXIF |
| Installed apps (91 scoped) | High | Weakly | Broad profiling signal |
| Clipboard | Moderate | Yes (limited) | Only 3 Java call sites |
| Screen capture | High | Yes (LIVE) | Plus screenshot *detection* |
| Motion sensors | High | Partly | UX + anti-bot fingerprint |
| In-app browser JS bridge | Moderate | Yes (hybrid UI) | Keystroke-capable surface exists |
| Behavioral engagement | High | Yes (core product) | Highest volume |
