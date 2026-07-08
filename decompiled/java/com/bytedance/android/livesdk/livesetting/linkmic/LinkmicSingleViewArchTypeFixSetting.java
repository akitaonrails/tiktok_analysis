package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_single_view_arch_type_fix")
public final class LinkmicSingleViewArchTypeFixSetting {
    public static final boolean DEFAULT = true;
    public static final LinkmicSingleViewArchTypeFixSetting INSTANCE = new LinkmicSingleViewArchTypeFixSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_single_view_arch_type_fix", DEFAULT);
    }
}
