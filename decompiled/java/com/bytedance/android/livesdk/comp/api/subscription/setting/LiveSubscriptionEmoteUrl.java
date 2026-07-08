package com.bytedance.android.livesdk.comp.api.subscription.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_subscription_emotes_url")
public final class LiveSubscriptionEmoteUrl {
    public static LiveSubscribeEmoteLynxMap lynxMap;
    public static final LiveSubscriptionEmoteUrl INSTANCE = new LiveSubscriptionEmoteUrl();
    public static final String DEFAULT = "";

    public final JSONObject getJsonValue() {
        return new JSONObject(SettingsManager.INSTANCE.getStringValue("live_subscription_emotes_url", DEFAULT));
    }

    public final LiveSubscribeEmoteLynxMap getValue() {
        if (lynxMap == null) {
            lynxMap = new LiveSubscribeEmoteLynxMap(SettingsManager.INSTANCE.getStringValue("live_subscription_emotes_url", DEFAULT));
        }
        LiveSubscribeEmoteLynxMap liveSubscribeEmoteLynxMap = lynxMap;
        return liveSubscribeEmoteLynxMap == null ? new LiveSubscribeEmoteLynxMap("") : liveSubscribeEmoteLynxMap;
    }

    public final String getDEFAULT() {
        return DEFAULT;
    }
}
