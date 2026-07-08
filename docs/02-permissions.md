# 02 — Permission Analysis

64 permissions are declared in the bundle manifest. Below they are grouped by
sensitivity, each with a verdict on whether it is justified by a feature a user
would expect from TikTok.

## Runtime / "dangerous" permissions

| Permission | Justified by | Verdict |
|---|---|---|
| `CAMERA` + `FOREGROUND_SERVICE_CAMERA` | Recording video | Expected |
| `RECORD_AUDIO` + `FOREGROUND_SERVICE_MICROPHONE` + `MODIFY_AUDIO_SETTINGS` | Recording sound, live audio | Expected |
| `READ_MEDIA_IMAGES` / `READ_MEDIA_VIDEO` / `READ_MEDIA_AUDIO` / `READ_MEDIA_VISUAL_USER_SELECTED` / `ACCESS_MEDIA_LOCATION` | Upload from gallery | Expected. `ACCESS_MEDIA_LOCATION` exposes **GPS EXIF embedded in photos** — see note below |
| `READ_EXTERNAL_STORAGE` / `WRITE_EXTERNAL_STORAGE` | Legacy media access (maxSdk-gated) | Expected on old Android |
| `ACCESS_FINE_LOCATION` + `ACCESS_COARSE_LOCATION` | Location tags, local content, ads | **Notable** — see 05 |
| `READ_CONTACTS` | "Find friends" | **Notable** — feeds contacts upload (see 05) |
| `USE_BIOMETRIC` / `USE_FINGERPRINT` | App-lock, payment auth | Expected |

## Connectivity / network / device-scanning

| Permission | Note |
|---|---|
| `INTERNET`, `ACCESS_NETWORK_STATE`, `CHANGE_NETWORK_STATE` | Standard |
| `ACCESS_WIFI_STATE`, `CHANGE_WIFI_STATE` | Reads Wi-Fi state; **can enumerate/measure nearby networks**, a known signal for coarse location & device fingerprinting |
| `ACCESS_LOCAL_NETWORK` | New Android 16 permission — access to other devices on the LAN |
| `BLUETOOTH`, `BLUETOOTH_SCAN`, `BLUETOOTH_ADVERTISE`, `BLUETOOTH_CONNECT` | BT scanning is a **proximity / nearby-device fingerprinting** signal; TikTok's user-facing BT need is limited (accessories), so the scan/advertise pair is worth scrutiny |
| `NFC` | Limited obvious user feature |

## Advertising / attribution

| Permission | Purpose |
|---|---|
| `com.google.android.gms.permission.AD_ID` | Read Google Advertising ID (GAID) |
| `ACCESS_ADSERVICES_ATTRIBUTION`, `ACCESS_ADSERVICES_AD_ID` | Android Privacy Sandbox ad attribution |
| `com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE` | Play Install Referrer (attribution) |
| `com.android.vending.BILLING` | In-app purchase (Coins/Shop) |

## Screen / overlay / capture

| Permission | Note |
|---|---|
| `SYSTEM_ALERT_WINDOW` | Draw over other apps (floating player) |
| `FOREGROUND_SERVICE_MEDIA_PROJECTION` | **Screen capture** — for screen-sharing in LIVE; a capability worth noting |
| `DETECT_SCREEN_CAPTURE` | Detect when the *user* screenshots (anti-leak / DRM signal) |
| `REORDER_TASKS` | Move own tasks in the recents stack |

## Telephony / calls

`FOREGROUND_SERVICE_PHONE_CALL`, `MANAGE_OWN_CALLS` — VoIP calling in the app.
Notably **absent**: `READ_PHONE_STATE`, `READ_SMS`, `CALL_PHONE`, `QUERY_ALL_PACKAGES`,
`GET_ACCOUNTS`, `READ_CALENDAR`. Their absence matters (see below).

## OEM-specific push & integration

Samsung badge, OPPO/ColorOS (`com.oplus.ocs.*`, HeyTap/MCS), Huawei AppMarket,
Amazon Device Messaging, Orange attribution, Samsung MapsAgent — these are
per-vendor push and preload-attribution hooks. Individually benign; collectively
they show a wide OEM integration surface.

## What the permission set tells us

**Reassuring:**
- No `QUERY_ALL_PACKAGES`. TikTok enumerates apps via a *scoped* `<queries>` list
  instead (see 03) — more limited than the blanket permission, though still broad.
- No `READ_PHONE_STATE` → cannot read IMEI / phone number / SIM serial via the
  normal path on modern Android. Consistent with the string scan finding no
  `"imei"`/`"mac_address"` telemetry keys.
- No SMS, call-log, or calendar permissions.

**Worth watching (justified by a feature, but privacy-heavy):**
- Precise location, contacts, Bluetooth/Wi-Fi scanning, and screen capture are all
  present. Each maps to a real feature, but each is also a strong tracking/
  fingerprinting signal. The concern is not that any one is unjustified — it is the
  **breadth**: TikTok requests nearly every sensor/identity signal Android exposes
  that isn't outright blocked, which maximizes the fingerprinting surface.

**Note on `ACCESS_MEDIA_LOCATION`:** this lets the app read the GPS coordinates
embedded in a photo's EXIF even when the user only granted "selected photos." When
a user uploads a photo, precise capture location can travel with it unless stripped.
