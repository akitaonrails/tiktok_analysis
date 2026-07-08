package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_message_hold_config")
public final class LiveMessageHoldDispatchSetting {
    public static final LiveMessageHoldDispatchSetting INSTANCE = new LiveMessageHoldDispatchSetting();
    public static final HoldMessageDispatchConfig DEFAULT = new HoldMessageDispatchConfig();

    public final HoldMessageDispatchConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        HoldMessageDispatchConfig holdMessageDispatchConfig = DEFAULT;
        HoldMessageDispatchConfig holdMessageDispatchConfig2 = (HoldMessageDispatchConfig) settingsManager.getValueSafely("live_message_hold_config", holdMessageDispatchConfig);
        return holdMessageDispatchConfig2 != null ? holdMessageDispatchConfig2 : holdMessageDispatchConfig;
    }

    public final boolean enabled() {
        return getValue().getEnabled();
    }

    public final int maxHoldCount() {
        return getValue().getMaxHoldCount();
    }
}
