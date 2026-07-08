package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_game_local_memory_leak_monitor")
public final class TtliveGameLocalMemoryLeakMonitorSetting {
    public static final boolean DEFAULT = true;
    public static final TtliveGameLocalMemoryLeakMonitorSetting INSTANCE = new TtliveGameLocalMemoryLeakMonitorSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlive_game_local_memory_leak_monitor", DEFAULT);
    }
}
