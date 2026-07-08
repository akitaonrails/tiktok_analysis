package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("subscribe_feedback_scheme")
public final class LiveSubscribeLynxFeedbackUrl {
    public static final LiveSubscribeLynxFeedbackUrl INSTANCE = new LiveSubscribeLynxFeedbackUrl();
    public static final String DEFAULT = "";

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("subscribe_feedback_scheme", DEFAULT);
    }

    public final String getDEFAULT() {
        return DEFAULT;
    }
}
