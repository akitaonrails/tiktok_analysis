package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "apm_offline_dump_data")
public final class ApmOfflineDumpDataSetting {
    public static final boolean DEFAULT = false;
    public static final ApmOfflineDumpDataSetting INSTANCE = new ApmOfflineDumpDataSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("apm_offline_dump_data", DEFAULT);
    }
}
