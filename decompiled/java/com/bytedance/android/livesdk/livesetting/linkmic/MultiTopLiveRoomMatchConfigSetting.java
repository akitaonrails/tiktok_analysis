package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_toplive_room_match_config")
public final class MultiTopLiveRoomMatchConfigSetting {
    public static final MultiTopLiveRoomMatchConfigSetting INSTANCE = new MultiTopLiveRoomMatchConfigSetting();
    public static final RandomMatchConfig DEFAULT = new RandomMatchConfig(0, 0.0d, false, 0.0d, false, 0.0d);

    private final RandomMatchConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        RandomMatchConfig randomMatchConfig = DEFAULT;
        RandomMatchConfig randomMatchConfig2 = (RandomMatchConfig) settingsManager.getValueSafely("multi_guest_toplive_room_match_config", randomMatchConfig);
        return randomMatchConfig2 != null ? randomMatchConfig2 : randomMatchConfig;
    }

    public static final double getFetchMatchRoomInterval() {
        return INSTANCE.getConfig().fetchMatchRoomInterval;
    }

    public static final double getMatchSuccessExpireTime() {
        return INSTANCE.getConfig().matchSuccessExpireTime;
    }

    public static final double getRoomMatchTimeoutDuration() {
        return INSTANCE.getConfig().roomMatchTimeoutDuration;
    }

    public static final int getTopModuleRoomMatchType() {
        return INSTANCE.getConfig().topModuleRoomMatchType;
    }

    public static final boolean isEnableDeduplicationOptimize() {
        return INSTANCE.getConfig().enableDeduplicationOptimize;
    }

    public static final boolean isEnableEnterRoomAfterTimeout() {
        return INSTANCE.getConfig().enableEnterRoomAfterTimeout;
    }

    public static final boolean isEnableRandomMatch() {
        return getTopModuleRoomMatchType() > 0;
    }
}
