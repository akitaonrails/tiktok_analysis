package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlh_split_module_diff_report")
public final class TTLHSplitModuleDiffReport {
    public static final int DEFAULT = 0;
    public static final TTLHSplitModuleDiffReport INSTANCE = new TTLHSplitModuleDiffReport();

    public final boolean enabled() {
        return SettingsManager.INSTANCE.getIntValue("ttlh_split_module_diff_report", DEFAULT) == 1;
    }
}
