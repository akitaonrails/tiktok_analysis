package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "subscribe_monitor_enable_applog")
public final class PcsMonitorEnableApplogSetting {
    public static final boolean DEFAULT = false;
    public static final PcsMonitorEnableApplogSetting INSTANCE = new PcsMonitorEnableApplogSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("subscribe_monitor_enable_applog", DEFAULT);
    }
}
