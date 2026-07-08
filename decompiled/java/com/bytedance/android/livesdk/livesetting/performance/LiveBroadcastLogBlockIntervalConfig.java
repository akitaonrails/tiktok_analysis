package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_broadcast_log_block_interval_config")
public final class LiveBroadcastLogBlockIntervalConfig {
    public static final LiveHostBlockTimeConfig DEFAULT;
    public static final LiveBroadcastLogBlockIntervalConfig INSTANCE = new LiveBroadcastLogBlockIntervalConfig();
    public static final long blockTime;
    public static final long executeTime;

    public static /* synthetic */ void getBlockTime$annotations() {
    }

    public static /* synthetic */ void getExecuteTime$annotations() {
    }

    static {
        LiveHostBlockTimeConfig liveHostBlockTimeConfig = new LiveHostBlockTimeConfig(100L, 100L);
        DEFAULT = liveHostBlockTimeConfig;
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveHostBlockTimeConfig liveHostBlockTimeConfig2 = (LiveHostBlockTimeConfig) settingsManager.getValueSafely("live_broadcast_log_block_interval_config", liveHostBlockTimeConfig);
        executeTime = liveHostBlockTimeConfig2 != null ? liveHostBlockTimeConfig2.executeTime : liveHostBlockTimeConfig.executeTime;
        LiveHostBlockTimeConfig liveHostBlockTimeConfig3 = (LiveHostBlockTimeConfig) settingsManager.getValueSafely("live_broadcast_log_block_interval_config", liveHostBlockTimeConfig);
        blockTime = liveHostBlockTimeConfig3 != null ? liveHostBlockTimeConfig3.blockTime : liveHostBlockTimeConfig.blockTime;
    }

    public static final long getBlockTime() {
        return blockTime;
    }

    public static final long getExecuteTime() {
        return executeTime;
    }
}
