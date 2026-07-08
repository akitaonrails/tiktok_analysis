package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "live_enable_wave_v2")
public final class LiveMessageWaveNewStyleSetting {
    public static final boolean DEFAULT = false;
    public static final LiveMessageWaveNewStyleSetting INSTANCE = new LiveMessageWaveNewStyleSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_enable_wave_v2", DEFAULT);
    }
}
