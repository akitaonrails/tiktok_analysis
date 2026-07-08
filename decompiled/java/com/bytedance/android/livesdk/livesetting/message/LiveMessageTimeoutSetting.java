package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.model.LiveMessageTimeoutConfig;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_message_timeout")
public final class LiveMessageTimeoutSetting {
    public static final LiveMessageTimeoutSetting INSTANCE = new LiveMessageTimeoutSetting();
    public static final LiveMessageTimeoutConfig DEFAULT = new LiveMessageTimeoutConfig();

    private final LiveMessageTimeoutConfig getSettingValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveMessageTimeoutConfig liveMessageTimeoutConfig = DEFAULT;
        LiveMessageTimeoutConfig liveMessageTimeoutConfig2 = (LiveMessageTimeoutConfig) settingsManager.getValueSafely("live_message_timeout", liveMessageTimeoutConfig);
        return liveMessageTimeoutConfig2 != null ? liveMessageTimeoutConfig2 : liveMessageTimeoutConfig;
    }

    public final long getHttpFetchMonitorTimeout() {
        return getSettingValue().httpFetchMonitorTimeout;
    }

    public final long getHttpFetchRequestTimeout() {
        return getSettingValue().httpFetchRequestTimeout;
    }

    public final long getWsConnectTimeout() {
        return getSettingValue().wsConnectTimeout;
    }
}
