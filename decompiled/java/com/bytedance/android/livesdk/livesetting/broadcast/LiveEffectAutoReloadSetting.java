package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_effect_auto_reload_switch")
public final class LiveEffectAutoReloadSetting {
    public static final int DEFAULT = 1;
    public static final LiveEffectAutoReloadSetting INSTANCE = new LiveEffectAutoReloadSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getIntValue("live_effect_auto_reload_switch", DEFAULT) > 0;
    }
}
