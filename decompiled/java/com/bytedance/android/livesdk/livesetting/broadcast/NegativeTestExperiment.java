package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_negative_test")
public final class NegativeTestExperiment {
    public static final NegativeTestSettings DEFAULT;
    public static final NegativeTestExperiment INSTANCE = new NegativeTestExperiment();
    public static final NegativeTestSettings setting;

    static {
        NegativeTestSettings negativeTestSettings = new NegativeTestSettings(0L, 0L);
        DEFAULT = negativeTestSettings;
        setting = (NegativeTestSettings) SettingsManager.INSTANCE.getValueSafely("live_negative_test", negativeTestSettings);
    }

    public final long getCpuSleepTime() {
        NegativeTestSettings negativeTestSettings = setting;
        if (negativeTestSettings == null) {
            return 0L;
        }
        long j = 100;
        return (negativeTestSettings.cpuCycle * (j - negativeTestSettings.cpuLoadRate)) / j;
    }

    public final long getCyclePeriod() {
        NegativeTestSettings negativeTestSettings = setting;
        if (negativeTestSettings == null) {
            return 0L;
        }
        return negativeTestSettings.cpuCycle;
    }

    public final boolean isEnable() {
        NegativeTestSettings negativeTestSettings = setting;
        return negativeTestSettings != null && negativeTestSettings.cpuLoadRate > DEFAULT.cpuLoadRate;
    }

    public final NegativeTestSettings getDEFAULT() {
        return DEFAULT;
    }

    public final NegativeTestSettings getSetting() {
        return setting;
    }
}
