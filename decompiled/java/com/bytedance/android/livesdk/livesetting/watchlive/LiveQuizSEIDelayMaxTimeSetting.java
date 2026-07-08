package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("live_quiz_max_delay_time")
public final class LiveQuizSEIDelayMaxTimeSetting {
    public static final long DEFAULT = 0;
    public static final LiveQuizSEIDelayMaxTimeSetting INSTANCE = new LiveQuizSEIDelayMaxTimeSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_quiz_max_delay_time", DEFAULT);
    }
}
