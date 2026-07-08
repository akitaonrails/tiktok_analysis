package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = true, value = "live_ultimateinflate_switch")
public final class LiveUltimateInflateSwitchSetting {
    public static final boolean DEFAULT = false;
    public static final LiveUltimateInflateSwitchSetting INSTANCE = new LiveUltimateInflateSwitchSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_ultimateinflate_switch", DEFAULT);
    }
}
