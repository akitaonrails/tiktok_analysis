package com.bytedance.android.livesdk.performance.memory;

import X.C13LP;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Set;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_broadcast_memory_clean_setting")
public final class BroadcastMemoryCleanSetting {
    public static final BroadcastMemoryCleanSetting INSTANCE = new BroadcastMemoryCleanSetting();
    public static final BroadcastMemoryCleanConfig DEFAULT = new BroadcastMemoryCleanConfig(null, 1, null);

    private final BroadcastMemoryCleanConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        BroadcastMemoryCleanConfig broadcastMemoryCleanConfig = DEFAULT;
        BroadcastMemoryCleanConfig broadcastMemoryCleanConfig2 = (BroadcastMemoryCleanConfig) settingsManager.getValueSafely("live_broadcast_memory_clean_setting", broadcastMemoryCleanConfig);
        return broadcastMemoryCleanConfig2 != null ? broadcastMemoryCleanConfig2 : broadcastMemoryCleanConfig;
    }

    public static final Set<String> getCriticalDestroyPageWhitelist() {
        return C13LP.LLIFFJFJJ(INSTANCE.getConfig().getCriticalDestroyPageWhitelist());
    }
}
