package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_beauty_reverse_experiment")
public final class LiveBeautyReverseExperiment {
    public static final int DEFAULT = 0;
    public static final LiveBeautyReverseExperiment INSTANCE = new LiveBeautyReverseExperiment();

    private final int getSettingValue() {
        return SettingsManager.INSTANCE.getIntValue("live_beauty_reverse_experiment", DEFAULT);
    }

    public final boolean isInExperiment() {
        return getSettingValue() != 0;
    }

    public final boolean notInExperiment() {
        return getSettingValue() == 0;
    }
}
