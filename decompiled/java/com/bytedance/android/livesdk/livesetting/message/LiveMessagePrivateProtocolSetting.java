package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_message_private_protocol_setting")
public final class LiveMessagePrivateProtocolSetting {
    public static final LiveMessagePrivateProtocolSetting INSTANCE = new LiveMessagePrivateProtocolSetting();
    public static final LiveMessagePrivateProtocolConfig DEFAULT = new LiveMessagePrivateProtocolConfig(false, false, 1000);

    public final LiveMessagePrivateProtocolConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveMessagePrivateProtocolConfig liveMessagePrivateProtocolConfig = DEFAULT;
        LiveMessagePrivateProtocolConfig liveMessagePrivateProtocolConfig2 = (LiveMessagePrivateProtocolConfig) settingsManager.getValueSafely("live_message_private_protocol_setting", liveMessagePrivateProtocolConfig);
        return liveMessagePrivateProtocolConfig2 != null ? liveMessagePrivateProtocolConfig2 : liveMessagePrivateProtocolConfig;
    }

    public final boolean enableNewFrontierAccess() {
        return getValue().getEnableNewFrontierAccess();
    }

    public final boolean enablePrivateProtocol() {
        return getValue().getEnablePrivateProtocol();
    }

    public final long fallbackTimeoutMills() {
        return getValue().getFallbackTimeoutMills();
    }
}
