package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_mode_switch_dipose")
public final class LinkmicModeSwitchDiposeSetting {
    public static final boolean DEFAULT = false;
    public static final LinkmicModeSwitchDiposeSetting INSTANCE = new LinkmicModeSwitchDiposeSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_mode_switch_dipose", DEFAULT);
    }
}
