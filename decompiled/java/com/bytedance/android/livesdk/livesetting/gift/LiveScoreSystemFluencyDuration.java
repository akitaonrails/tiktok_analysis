package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_performance_scoring_fluency_duration")
public final class LiveScoreSystemFluencyDuration {
    public static final int DEFAULT = 3;
    public static final LiveScoreSystemFluencyDuration INSTANCE = new LiveScoreSystemFluencyDuration();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_performance_scoring_fluency_duration", DEFAULT);
    }
}
