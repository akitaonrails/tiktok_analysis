package com.bytedance.android.livesdk.livesetting.pcs;

import X.C2097608Jq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_pcs_generic_api_monitor_sampling")
public final class LivePcsGenericApiMonitorSamplingSetting {
    public static final LivePcsGenericApiMonitorSamplingSetting INSTANCE = new LivePcsGenericApiMonitorSamplingSetting();
    public static final Map<String, Double> DEFAULT = C2097608Jq.LJ();

    public final Map<String, Double> getValue() {
        return (Map) SettingsManager.INSTANCE.getValueSafely("live_pcs_generic_api_monitor_sampling", DEFAULT);
    }
}
