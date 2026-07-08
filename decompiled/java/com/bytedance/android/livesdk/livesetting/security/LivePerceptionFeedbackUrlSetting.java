package com.bytedance.android.livesdk.livesetting.security;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_violations_feedback_scheme")
public final class LivePerceptionFeedbackUrlSetting {
    public static final String DEFAULT = "sslocal://webcast_lynxview_popup?hide_nav_bar=1&url=https%3A%2F%2Flf-main-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_fundamental_live_center%2Fpages%2Fviolations-feedback%2Ftemplate.js&hide_status_bar=1&gravity=bottom&show_mask=1&self_adaptive_height=1";
    public static final LivePerceptionFeedbackUrlSetting INSTANCE = new LivePerceptionFeedbackUrlSetting();

    public final String getUrl() {
        return SettingsManager.INSTANCE.getStringValue("live_violations_feedback_scheme", DEFAULT);
    }
}
