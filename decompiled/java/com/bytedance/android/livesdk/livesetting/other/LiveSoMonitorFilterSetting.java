package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_so_monitor_filter")
public final class LiveSoMonitorFilterSetting {
    public static final LiveSoMonitorFilterSetting INSTANCE = new LiveSoMonitorFilterSetting();
    public static final String[] DEFAULT = {"byterts", "ttmcmaf", "ttquic", "volcenginertc"};

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("live_so_monitor_filter", DEFAULT);
    }
}
