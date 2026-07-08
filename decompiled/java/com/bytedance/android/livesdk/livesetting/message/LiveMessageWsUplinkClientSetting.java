package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_message_ws_uplink_client_setting")
public final class LiveMessageWsUplinkClientSetting {
    public static final LiveMessageWsUplinkClientSetting INSTANCE = new LiveMessageWsUplinkClientSetting();
    public static final LiveMessageWsUplinkClientConfig DEFAULT = new LiveMessageWsUplinkClientConfig(false);

    public final LiveMessageWsUplinkClientConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveMessageWsUplinkClientConfig liveMessageWsUplinkClientConfig = DEFAULT;
        LiveMessageWsUplinkClientConfig liveMessageWsUplinkClientConfig2 = (LiveMessageWsUplinkClientConfig) settingsManager.getValueSafely("live_message_ws_uplink_client_setting", liveMessageWsUplinkClientConfig);
        return liveMessageWsUplinkClientConfig2 != null ? liveMessageWsUplinkClientConfig2 : liveMessageWsUplinkClientConfig;
    }

    public final LiveMessageWsUplinkClientConfig getDEFAULT() {
        return DEFAULT;
    }
}
