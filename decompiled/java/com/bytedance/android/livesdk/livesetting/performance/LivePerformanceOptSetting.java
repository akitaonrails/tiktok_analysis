package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_perf_opt_setting")
public final class LivePerformanceOptSetting {
    public static final int DEFAULT = 0;
    public static final LivePerformanceOptSetting INSTANCE = new LivePerformanceOptSetting();
    public static int value = -1;

    public static final boolean enableAudienceInteractionPerfOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("live_perf_opt_setting", DEFAULT);
        }
        return (value & 1) == 1;
    }

    public static final boolean enableFluencyMgrLeakFix() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("live_perf_opt_setting", DEFAULT);
        }
        return (value & 8) == 8;
    }

    public static final boolean enableLiveHolderV2MemOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("live_perf_opt_setting", DEFAULT);
        }
        return (value & 4) == 4;
    }

    public static final boolean enableLivePlayFragMemOpt() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("live_perf_opt_setting", DEFAULT);
        }
        return (value & 2) == 2;
    }

    public static final boolean enablePreFetchRoomInfoManagerFix() {
        if (value < 0) {
            value = SettingsManager.INSTANCE.getIntValue("live_perf_opt_setting", DEFAULT);
        }
        return (value & 16) == 16;
    }
}
