package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "fix_first_frame_rate_in_pre_pull_stream")
public final class FirstFrameRateInPrePullStreamOpt {
    public static final boolean DEFAULT = false;
    public static final FirstFrameRateInPrePullStreamOpt INSTANCE = new FirstFrameRateInPrePullStreamOpt();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("fix_first_frame_rate_in_pre_pull_stream", DEFAULT);
    }
}
