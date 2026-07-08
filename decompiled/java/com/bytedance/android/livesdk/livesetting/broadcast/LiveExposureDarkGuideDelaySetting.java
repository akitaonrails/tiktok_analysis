package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_exposure_dark_guide_delay")
public final class LiveExposureDarkGuideDelaySetting {
    public static final int DEFAULT = 6000;
    public static final LiveExposureDarkGuideDelaySetting INSTANCE = new LiveExposureDarkGuideDelaySetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_exposure_dark_guide_delay", DEFAULT);
    }
}
