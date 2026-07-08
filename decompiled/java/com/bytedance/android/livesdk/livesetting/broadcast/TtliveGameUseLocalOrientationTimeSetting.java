package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_game_use_local_orientation_time")
public final class TtliveGameUseLocalOrientationTimeSetting {
    public static final int DEFAULT = 0;
    public static final TtliveGameUseLocalOrientationTimeSetting INSTANCE = new TtliveGameUseLocalOrientationTimeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("ttlive_game_use_local_orientation_time", DEFAULT);
    }
}
