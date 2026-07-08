package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_feedback_skip_setting")
public final class LiveCohostFeedbackSkipSetting {
    public static final int DEFAULT = 14;
    public static final LiveCohostFeedbackSkipSetting INSTANCE = new LiveCohostFeedbackSkipSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_cohost_feedback_skip_setting", DEFAULT);
    }
}
