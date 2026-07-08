package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlh_enable_effect_log_callback_opt")
public final class TTLHEnableEffectLogCallbackOptSettings {
    public static final int DEFAULT = 0;
    public static final TTLHEnableEffectLogCallbackOptSettings INSTANCE = new TTLHEnableEffectLogCallbackOptSettings();

    public final boolean value() {
        return SettingsManager.INSTANCE.getIntValue("ttlh_enable_effect_log_callback_opt", DEFAULT) == 1;
    }
}
