package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_layout_leak_fix")
public final class LinkmicLayoutLeakFixSetting {
    public static final boolean DEFAULT = true;
    public static final LinkmicLayoutLeakFixSetting INSTANCE = new LinkmicLayoutLeakFixSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_layout_leak_fix", DEFAULT);
    }
}
