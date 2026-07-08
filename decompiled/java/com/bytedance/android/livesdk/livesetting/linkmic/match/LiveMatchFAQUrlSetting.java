package com.bytedance.android.livesdk.livesetting.linkmic.match;

import android.text.TextUtils;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("live_match_faq_config")
public final class LiveMatchFAQUrlSetting {
    public static final String DEFAULT = "";
    public static final LiveMatchFAQUrlSetting INSTANCE;
    public static final String liveMatchFAQUrl;
    public static final String liveMatchNewRule;
    public static final String liveMatchSpecificGiftRule;
    public static final String liveMatchStreakRule;

    static {
        LiveMatchFAQUrlSetting liveMatchFAQUrlSetting = new LiveMatchFAQUrlSetting();
        INSTANCE = liveMatchFAQUrlSetting;
        liveMatchFAQUrl = liveMatchFAQUrlSetting.getValue().optString("live_match_faq_url", "");
        liveMatchNewRule = liveMatchFAQUrlSetting.getValue().optString("live_match_new_rule", "");
        liveMatchSpecificGiftRule = liveMatchFAQUrlSetting.getValue().optString("live_match_specific_gift_rule", "");
        liveMatchStreakRule = liveMatchFAQUrlSetting.getValue().optString("live_match_streak_rule", "");
    }

    public final JSONObject getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        String str = DEFAULT;
        return TextUtils.isEmpty(settingsManager.getStringValue("live_match_faq_config", str)) ? new JSONObject() : new JSONObject(settingsManager.getStringValue("live_match_faq_config", str));
    }

    public final String getLiveMatchFAQUrl() {
        return liveMatchFAQUrl;
    }

    public final String getLiveMatchNewRule() {
        return liveMatchNewRule;
    }

    public final String getLiveMatchSpecificGiftRule() {
        return liveMatchSpecificGiftRule;
    }

    public final String getLiveMatchStreakRule() {
        return liveMatchStreakRule;
    }
}
