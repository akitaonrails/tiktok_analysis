package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_enable_effect_log")
public final class LiveEnableEffectLogSetting {
    public static final boolean DEFAULT = false;
    public static final LiveEnableEffectLogSetting INSTANCE = new LiveEnableEffectLogSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_enable_effect_log", DEFAULT);
    }
}
