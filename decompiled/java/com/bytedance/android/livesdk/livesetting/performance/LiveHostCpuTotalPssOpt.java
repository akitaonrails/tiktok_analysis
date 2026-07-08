package com.bytedance.android.livesdk.livesetting.performance;

import X.C480790ItJ;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_broadcast_get_cpu_total_pss_opt")
public final class LiveHostCpuTotalPssOpt {
    public static final LiveHostCpuTotalPssOpt INSTANCE = new LiveHostCpuTotalPssOpt();
    public static final int DEFAULT = 0;
    public static final int value = SettingsManager.INSTANCE.getIntValue("live_broadcast_get_cpu_total_pss_opt", DEFAULT);

    public static final boolean enable() {
        int i = value;
        if ((i & 1) == 0 || !C480790ItJ.LIZIZ) {
            return (i & 2) != 0 && C480790ItJ.LIZ;
        }
        return true;
    }
}
