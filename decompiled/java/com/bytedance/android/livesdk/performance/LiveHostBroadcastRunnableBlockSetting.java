package com.bytedance.android.livesdk.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_host_broadcast_runnable_block_setting")
public final class LiveHostBroadcastRunnableBlockSetting {
    public static final LiveHostBroadcastRunnableBlockSetting INSTANCE = new LiveHostBroadcastRunnableBlockSetting();
    public static final LiveHostRunnableBlockConfig DEFAULT = new LiveHostRunnableBlockConfig(false, 0, null, 7, null);

    public static final List<String> getBlockList() {
        return INSTANCE.getConfig().getBlockList();
    }

    public static final long getBlockTimeInMills() {
        long blockTimeInMills = INSTANCE.getConfig().getBlockTimeInMills();
        if (blockTimeInMills < 0) {
            return 0L;
        }
        return blockTimeInMills;
    }

    private final LiveHostRunnableBlockConfig getConfig() {
        LiveHostRunnableBlockConfig liveHostRunnableBlockConfig = (LiveHostRunnableBlockConfig) SettingsManager.INSTANCE.getValueSafely(LiveHostBroadcastRunnableBlockSetting.class);
        return liveHostRunnableBlockConfig == null ? DEFAULT : liveHostRunnableBlockConfig;
    }

    public static final boolean isEnable() {
        return INSTANCE.getConfig().getEnable();
    }
}
