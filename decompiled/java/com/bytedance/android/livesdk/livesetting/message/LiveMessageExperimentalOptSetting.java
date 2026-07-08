package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_message_experimental_opt_config")
public final class LiveMessageExperimentalOptSetting {
    public static final LiveMessageExperimentalOptSetting INSTANCE = new LiveMessageExperimentalOptSetting();
    public static final ExperimentalOptConfig DEFAULT = new ExperimentalOptConfig();

    public final ExperimentalOptConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        ExperimentalOptConfig experimentalOptConfig = DEFAULT;
        ExperimentalOptConfig experimentalOptConfig2 = (ExperimentalOptConfig) settingsManager.getValueSafely("live_message_experimental_opt_config", experimentalOptConfig);
        return experimentalOptConfig2 != null ? experimentalOptConfig2 : experimentalOptConfig;
    }

    public final EnterRoomChangeWindowTimeConfig enterRoomChangeWindowTime() {
        return getValue().getEnterRoomChangeWindowTime();
    }

    public final EnterRoomLimitDispatchDurationConfig enterRoomLimitDispatchDuration() {
        return getValue().getEnterRoomLimitDispatchDuration();
    }
}
