package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_message_monitor_sampling")
public final class LiveMessageMonitorSamplingConfig {
    public static final LiveMessageMonitorSamplingConfig INSTANCE = new LiveMessageMonitorSamplingConfig();
    public static final MessageMonitorSamplingConfig DEFAULT = new MessageMonitorSamplingConfig(0.001d, 1.0d);

    private final MessageMonitorSamplingConfig getMonitorSamplingConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        MessageMonitorSamplingConfig messageMonitorSamplingConfig = DEFAULT;
        MessageMonitorSamplingConfig messageMonitorSamplingConfig2 = (MessageMonitorSamplingConfig) settingsManager.getValueSafely("live_message_monitor_sampling", messageMonitorSamplingConfig);
        return messageMonitorSamplingConfig2 != null ? messageMonitorSamplingConfig2 : messageMonitorSamplingConfig;
    }

    public final double logSamplingRate() {
        return getMonitorSamplingConfig().getLogSamplingRate();
    }

    public final double zstdSamplingRate() {
        return getMonitorSamplingConfig().getZstdSamplingRate();
    }

    public final MessageMonitorSamplingConfig getDEFAULT() {
        return DEFAULT;
    }
}
