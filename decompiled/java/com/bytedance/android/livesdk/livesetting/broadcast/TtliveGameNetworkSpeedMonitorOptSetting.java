package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_game_network_speed_monitor_opt")
public final class TtliveGameNetworkSpeedMonitorOptSetting {
    public static final int DEFAULT = 0;
    public static final TtliveGameNetworkSpeedMonitorOptSetting INSTANCE = new TtliveGameNetworkSpeedMonitorOptSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("ttlive_game_network_speed_monitor_opt", DEFAULT);
    }

    public final boolean useTTNet() {
        return SettingsManager.INSTANCE.getIntValue("ttlive_game_network_speed_monitor_opt", DEFAULT) == 1;
    }
}
