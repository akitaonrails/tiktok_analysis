package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_cohost_take_stage_corner_radius_percent")
public final class LiveCoHostTakeStageCornerRadiusPercent {
    public static final double DEFAULT = 0.0205128d;
    public static final LiveCoHostTakeStageCornerRadiusPercent INSTANCE = new LiveCoHostTakeStageCornerRadiusPercent();

    public final double getValue() {
        return SettingsManager.INSTANCE.getDoubleValue("live_cohost_take_stage_corner_radius_percent", DEFAULT);
    }
}
