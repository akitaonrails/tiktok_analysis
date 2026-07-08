package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("ttlive_linkmic_msg_optimization_at_least_available_time")
public final class TTliveLinkmicMsgOptimizationAtLeastAvailableTimeSetting {
    public static final int DEFAULT = 5;
    public static final TTliveLinkmicMsgOptimizationAtLeastAvailableTimeSetting INSTANCE = new TTliveLinkmicMsgOptimizationAtLeastAvailableTimeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("ttlive_linkmic_msg_optimization_at_least_available_time", DEFAULT);
    }
}
