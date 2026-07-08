package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_background_duration_calibrate")
public final class LiveBackgroundDurationCalibrate {
    public static final boolean DEFAULT = false;
    public static final LiveBackgroundDurationCalibrate INSTANCE = new LiveBackgroundDurationCalibrate();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_background_duration_calibrate", DEFAULT);
    }
}
