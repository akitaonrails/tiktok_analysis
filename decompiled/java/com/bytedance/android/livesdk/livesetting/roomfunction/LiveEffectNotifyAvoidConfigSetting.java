package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdkapi.depend.model.live.NotifyAvoidConfig;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_effect_notify_avoid_config")
public final class LiveEffectNotifyAvoidConfigSetting {
    public static final LiveEffectNotifyAvoidConfigSetting INSTANCE = new LiveEffectNotifyAvoidConfigSetting();
    public static final NotifyAvoidConfig DEFAULT = new NotifyAvoidConfig();

    public static final NotifyAvoidConfig getConfig() {
        NotifyAvoidConfig notifyAvoidConfig = (NotifyAvoidConfig) SettingsManager.INSTANCE.getValueSafely(LiveEffectNotifyAvoidConfigSetting.class);
        return notifyAvoidConfig == null ? DEFAULT : notifyAvoidConfig;
    }
}
