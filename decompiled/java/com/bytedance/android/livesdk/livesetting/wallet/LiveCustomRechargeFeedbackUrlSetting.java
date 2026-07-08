package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_custom_recharge_feedback_url")
public final class LiveCustomRechargeFeedbackUrlSetting {
    public static final String DEFAULT = "sslocal://webcast_lynxview?type=fullscreen&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue%2Frevenue%2Fpages%2Fguide%2Ffeedback_and_guide.js&web_bg_color=FFFFFF&hide_nav_bar=1";
    public static final LiveCustomRechargeFeedbackUrlSetting INSTANCE = new LiveCustomRechargeFeedbackUrlSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_custom_recharge_feedback_url", DEFAULT);
    }
}
