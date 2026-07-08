package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_game_speed_detector_cache_manual")
public final class TtliveGameSpeedDetectorCacheManualSetting {
    public static final int DEFAULT = 1;
    public static final TtliveGameSpeedDetectorCacheManualSetting INSTANCE = new TtliveGameSpeedDetectorCacheManualSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("ttlive_game_speed_detector_cache_manual", DEFAULT);
    }
}
