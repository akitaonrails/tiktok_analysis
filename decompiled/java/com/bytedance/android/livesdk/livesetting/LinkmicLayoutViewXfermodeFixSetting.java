package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_layout_view_xfermode_fix")
public final class LinkmicLayoutViewXfermodeFixSetting {
    public static final boolean DEFAULT = true;
    public static final LinkmicLayoutViewXfermodeFixSetting INSTANCE = new LinkmicLayoutViewXfermodeFixSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_layout_view_xfermode_fix", DEFAULT);
    }
}
