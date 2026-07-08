package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_resource_manager_settings")
public final class LiveGiftResourceManagerSettings {
    public static final LiveGiftResourceManagerSettings INSTANCE = new LiveGiftResourceManagerSettings();
    public static final LiveGiftResourceManagerConfig DEFAULT = new LiveGiftResourceManagerConfig(0, 259200, true, 51200, 102400, 51200, 102400, true, true, true);

    public final LiveGiftResourceManagerConfig getConfig() {
        LiveGiftResourceManagerConfig liveGiftResourceManagerConfig = (LiveGiftResourceManagerConfig) SettingsManager.INSTANCE.getValueSafely(LiveGiftResourceManagerSettings.class);
        return liveGiftResourceManagerConfig == null ? DEFAULT : liveGiftResourceManagerConfig;
    }

    public final boolean enableDeleteAll() {
        return getConfig().enableDeleteAllResource;
    }

    public final boolean enableDeleteUnused() {
        return getConfig().enableDeleteUnusedResource;
    }

    public final boolean enableDiskLimitation() {
        return getConfig().resourceDiskLimitationEnable;
    }

    public final int getExpireDuration() {
        return getConfig().resourceExpireDuration;
    }

    public final int getPreloadStrategy() {
        return getConfig().resourcePreloadStrategy;
    }

    public final long getRedLine() {
        return getConfig().diskRedLine;
    }

    public final long getRedLineForBatchAsset() {
        return getConfig().diskRedLineForBatchAsset;
    }

    public final boolean getThreadCrash() {
        return getConfig().threadCrashFix;
    }

    public final long getYellowLine() {
        return getConfig().diskYellowLine;
    }

    public final long getYellowLineForBatchAsset() {
        return getConfig().diskYellowLineForBatchAsset;
    }
}
