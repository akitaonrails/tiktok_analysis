package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "game_dual_device_vertical_full_video_enable")
public final class GameDualDeviceVerticalFullVideoEnabled {
    public static final boolean DEFAULT = true;
    public static final boolean GROUP_EXPERIMENT = false;
    public static final GameDualDeviceVerticalFullVideoEnabled INSTANCE = new GameDualDeviceVerticalFullVideoEnabled();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("game_dual_device_vertical_full_video_enable", DEFAULT);
    }
}
