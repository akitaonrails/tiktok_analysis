package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_data_channel_opt")
public final class LiveDataChannelOptSetting {
    public static final LiveDataChannelOptSetting INSTANCE = new LiveDataChannelOptSetting();
    public static final DataChannelOptConfig DEFAULT = new DataChannelOptConfig();

    public final DataChannelOptConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        DataChannelOptConfig dataChannelOptConfig = DEFAULT;
        DataChannelOptConfig dataChannelOptConfig2 = (DataChannelOptConfig) settingsManager.getValueSafely("live_data_channel_opt", dataChannelOptConfig);
        return dataChannelOptConfig2 != null ? dataChannelOptConfig2 : dataChannelOptConfig;
    }
}
