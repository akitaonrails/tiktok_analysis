package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_performance_scoring_fluency_interval")
public final class LiveScoreSystemFluencyInterval {
    public static final int DEFAULT = 11;
    public static final LiveScoreSystemFluencyInterval INSTANCE = new LiveScoreSystemFluencyInterval();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_performance_scoring_fluency_interval", DEFAULT);
    }
}
