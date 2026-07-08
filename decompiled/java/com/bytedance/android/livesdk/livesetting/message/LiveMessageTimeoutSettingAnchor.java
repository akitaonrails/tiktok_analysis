package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.model.LiveMessageTimeoutConfig;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_message_timeout_anchor")
public final class LiveMessageTimeoutSettingAnchor {
    public static final LiveMessageTimeoutSettingAnchor INSTANCE = new LiveMessageTimeoutSettingAnchor();
    public static final LiveMessageTimeoutConfig DEFAULT = new LiveMessageTimeoutConfig();

    private final LiveMessageTimeoutConfig getSettingValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveMessageTimeoutConfig liveMessageTimeoutConfig = DEFAULT;
        LiveMessageTimeoutConfig liveMessageTimeoutConfig2 = (LiveMessageTimeoutConfig) settingsManager.getValueSafely("live_message_timeout_anchor", liveMessageTimeoutConfig);
        return liveMessageTimeoutConfig2 != null ? liveMessageTimeoutConfig2 : liveMessageTimeoutConfig;
    }

    public final long getWsConnectTimeout() {
        return getSettingValue().wsConnectTimeout;
    }
}
