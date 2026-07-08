package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_feedback_web_url")
public final class MultiGuestDisconnectFeedbackUrlSetting {
    public static final String DEFAULT = "";
    public static final MultiGuestDisconnectFeedbackUrlSetting INSTANCE = new MultiGuestDisconnectFeedbackUrlSetting();

    public final String getUrl() {
        return SettingsManager.INSTANCE.getStringValue("live_feedback_web_url", DEFAULT);
    }
}
