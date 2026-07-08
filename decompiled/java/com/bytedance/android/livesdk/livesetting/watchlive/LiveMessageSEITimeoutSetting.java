package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_message_sei_timeout_setting")
public final class LiveMessageSEITimeoutSetting {
    public static final LiveMessageSEITimeoutSetting INSTANCE = new LiveMessageSEITimeoutSetting();
    public static final LiveMessageSEITimeoutConfig DEFAULT = new LiveMessageSEITimeoutConfig(1.0f, 0, 8000);

    public final LiveMessageSEITimeoutConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveMessageSEITimeoutConfig liveMessageSEITimeoutConfig = DEFAULT;
        LiveMessageSEITimeoutConfig liveMessageSEITimeoutConfig2 = (LiveMessageSEITimeoutConfig) settingsManager.getValueSafely("live_message_sei_timeout_setting", liveMessageSEITimeoutConfig);
        return liveMessageSEITimeoutConfig2 != null ? liveMessageSEITimeoutConfig2 : liveMessageSEITimeoutConfig;
    }

    public final long calculateSEIDelayRegulateByConfig(long j) {
        if (j < 0) {
            j = 0;
        }
        LiveMessageSEITimeoutConfig value = getValue();
        long j2 = (long) ((j * value.multiple) + value.bias);
        long j3 = value.maxTimeout;
        if (j2 > j3) {
            return j3;
        }
        return j2;
    }
}
