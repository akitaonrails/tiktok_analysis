package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_enable_fix_arch_type_multi_thread_issue")
public final class LinkmicEnableFixArchTypeMultiThreadIssueSetting {
    public static final boolean DEFAULT = true;
    public static final LinkmicEnableFixArchTypeMultiThreadIssueSetting INSTANCE = new LinkmicEnableFixArchTypeMultiThreadIssueSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_enable_fix_arch_type_multi_thread_issue", DEFAULT);
    }
}
