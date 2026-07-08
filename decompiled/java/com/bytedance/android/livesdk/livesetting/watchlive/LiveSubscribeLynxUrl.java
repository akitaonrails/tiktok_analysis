package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.model.LiveSubscribeLynxMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_subscription_lynx_url")
public final class LiveSubscribeLynxUrl {
    public static LiveSubscribeLynxMap lynxMap;
    public static final LiveSubscribeLynxUrl INSTANCE = new LiveSubscribeLynxUrl();
    public static final String DEFAULT = "";

    public final JSONObject getJsonValue() {
        return new JSONObject(SettingsManager.INSTANCE.getStringValue("live_subscription_lynx_url", DEFAULT));
    }

    public final LiveSubscribeLynxMap getValue() {
        if (lynxMap == null) {
            lynxMap = new LiveSubscribeLynxMap(SettingsManager.INSTANCE.getStringValue("live_subscription_lynx_url", DEFAULT));
        }
        return lynxMap;
    }

    public final String getDEFAULT() {
        return DEFAULT;
    }
}
