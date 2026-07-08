package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_exposure_opt")
public final class LiveExposureOptSetting {
    public static final LiveExposureOptSetting INSTANCE = new LiveExposureOptSetting();
    public static final int DEFAULT = 0;
    public static final int value = SettingsManager.INSTANCE.getIntValue("live_exposure_opt", DEFAULT);

    public final boolean disable() {
        return value == 0;
    }

    public final boolean enable() {
        return value > 0;
    }

    public final boolean isV1() {
        return value == 1;
    }

    public final boolean isV2() {
        return value == 2;
    }
}
