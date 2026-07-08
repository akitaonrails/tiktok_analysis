package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_effect_notify_avoid_control_enabled")
public final class LiveEffectNotifyAvoidControlSetting {
    public static final boolean DEFAULT = false;
    public static final LiveEffectNotifyAvoidControlSetting INSTANCE = new LiveEffectNotifyAvoidControlSetting();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_effect_notify_avoid_control_enabled", DEFAULT);
    }
}
