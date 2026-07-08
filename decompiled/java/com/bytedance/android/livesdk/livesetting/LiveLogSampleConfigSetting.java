package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.model.LiveLogSampleConfigData;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_integrated_tracker_dolphin_configuration")
public final class LiveLogSampleConfigSetting {
    public static final double SAMPLE_0 = 0.0d;
    public static final LiveLogSampleConfigSetting INSTANCE = new LiveLogSampleConfigSetting();
    public static final double SAMPLE_1000 = 0.001d;
    public static final double SAMPLE_100 = 0.01d;
    public static final double SAMPLE_10 = 0.1d;
    public static final double NO_SAMPLE = 1.0d;
    public static final LiveLogSampleConfigData DEFAULT = new LiveLogSampleConfigData();

    public static /* synthetic */ void getNO_SAMPLE$annotations() {
    }

    public static /* synthetic */ void getSAMPLE_0$annotations() {
    }

    public static /* synthetic */ void getSAMPLE_10$annotations() {
    }

    public static /* synthetic */ void getSAMPLE_100$annotations() {
    }

    public static /* synthetic */ void getSAMPLE_1000$annotations() {
    }

    public final LiveLogSampleConfigData getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveLogSampleConfigData liveLogSampleConfigData = DEFAULT;
        LiveLogSampleConfigData liveLogSampleConfigData2 = (LiveLogSampleConfigData) settingsManager.getValueSafely("live_integrated_tracker_dolphin_configuration", liveLogSampleConfigData);
        return liveLogSampleConfigData2 != null ? liveLogSampleConfigData2 : liveLogSampleConfigData;
    }

    public static final double getNO_SAMPLE() {
        return NO_SAMPLE;
    }

    public static final double getSAMPLE_0() {
        return SAMPLE_0;
    }

    public static final double getSAMPLE_10() {
        return SAMPLE_10;
    }

    public static final double getSAMPLE_100() {
        return SAMPLE_100;
    }

    public static final double getSAMPLE_1000() {
        return SAMPLE_1000;
    }
}
