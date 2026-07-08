package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_enable_effect_config_log")
public final class LiveEnableEffectConfigLogSetting {
    public static final boolean DEFAULT = false;
    public static final LiveEnableEffectConfigLogSetting INSTANCE = new LiveEnableEffectConfigLogSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_enable_effect_config_log", DEFAULT);
    }
}
