package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_effect_notify_check_params")
public final class LiveEffectNotifyCheckParamsSetting {
    public static final LiveEffectNotifyCheckParamsSetting INSTANCE = new LiveEffectNotifyCheckParamsSetting();
    public static final boolean DEFAULT = false;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_effect_notify_check_params", DEFAULT);

    public final boolean enable() {
        return value;
    }
}
