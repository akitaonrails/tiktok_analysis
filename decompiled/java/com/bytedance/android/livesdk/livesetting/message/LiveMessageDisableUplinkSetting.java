package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_message_opt_disable_uplink")
public final class LiveMessageDisableUplinkSetting {
    public static final boolean DEFAULT = false;
    public static final LiveMessageDisableUplinkSetting INSTANCE = new LiveMessageDisableUplinkSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_message_opt_disable_uplink", DEFAULT);
    }
}
