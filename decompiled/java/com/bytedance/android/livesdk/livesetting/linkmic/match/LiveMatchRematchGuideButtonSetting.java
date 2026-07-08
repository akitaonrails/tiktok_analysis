package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_match_rematch_guide_button")
public final class LiveMatchRematchGuideButtonSetting {
    public static final String DEFAULT = "aweme://roma_redirect/?spark_page=live_match_rematch_button";
    public static final LiveMatchRematchGuideButtonSetting INSTANCE = new LiveMatchRematchGuideButtonSetting();

    public final String getValue() {
        String stringValue = SettingsManager.INSTANCE.getStringValue("live_match_rematch_guide_button", DEFAULT);
        return stringValue == null ? "aweme://roma_redirect/?spark_page=live_match_rematch_button" : stringValue;
    }
}
