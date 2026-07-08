package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_orientation_change_perception_opt")
public final class LiveOrientationPerceptionOptSetting {
    public static final int DEFAULT = 0;
    public static final LiveOrientationPerceptionOptSetting INSTANCE = new LiveOrientationPerceptionOptSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("live_orientation_change_perception_opt", DEFAULT) == 1;
    }
}
