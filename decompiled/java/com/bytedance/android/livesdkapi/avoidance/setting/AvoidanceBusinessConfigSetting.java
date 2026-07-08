package com.bytedance.android.livesdkapi.avoidance.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live.uikit.uisetting.MsgNotifyAvoidConfig;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_avoid_handle_framework_config")
public final class AvoidanceBusinessConfigSetting {
    public static final MsgNotifyAvoidConfig DEFAULT;
    public static final AvoidanceBusinessConfigSetting INSTANCE = new AvoidanceBusinessConfigSetting();
    public static final MsgNotifyAvoidConfig config;

    static {
        MsgNotifyAvoidConfig msgNotifyAvoidConfig = new MsgNotifyAvoidConfig(null, null);
        DEFAULT = msgNotifyAvoidConfig;
        MsgNotifyAvoidConfig msgNotifyAvoidConfig2 = (MsgNotifyAvoidConfig) SettingsManager.INSTANCE.getValueSafely("live_avoid_handle_framework_config", msgNotifyAvoidConfig);
        if (msgNotifyAvoidConfig2 != null) {
            msgNotifyAvoidConfig = msgNotifyAvoidConfig2;
        }
        config = msgNotifyAvoidConfig;
    }

    public final MsgNotifyAvoidConfig getSetting() {
        return config;
    }
}
