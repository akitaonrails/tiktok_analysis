package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote;

import X.C0K8F;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("subscription_anchor_emotes_setting_item_policy")
public final class SubscriptionAnchorEmotesSettingItemPolicy {
    public static final String DEFAULT = "https://sf19-draftcdn-sg.ibytedtos.com/obj/ies-hotsoon-draft-sg/tiktok-live/634e6d93-67b9-4e98-b706-b87accc60611_en.html";
    public static final SubscriptionAnchorEmotesSettingItemPolicy INSTANCE = new SubscriptionAnchorEmotesSettingItemPolicy();
    public static JSONObject _urlMap;

    private final JSONObject getUrlMap() {
        JSONObject jSONObject;
        JSONObject jSONObject2 = _urlMap;
        if (jSONObject2 != null) {
            return jSONObject2;
        }
        try {
            jSONObject = new JSONObject(SettingsManager.INSTANCE.getStringValue("subscription_anchor_emotes_setting_item_policy", DEFAULT));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            jSONObject = new JSONObject();
        }
        _urlMap = jSONObject;
        return jSONObject;
    }

    public final String getUrl() {
        C0K8F.LIZ.getClass();
        return getUrlMap().optString(C0K8F.LIZ(), "https://sf19-draftcdn-sg.ibytedtos.com/obj/ies-hotsoon-draft-sg/tiktok-live/634e6d93-67b9-4e98-b706-b87accc60611_en.html");
    }
}
