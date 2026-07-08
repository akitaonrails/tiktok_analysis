package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("watch_perf_opt_new_setting")
public final class LiveRoomPerfOptSetting {
    public static final LiveRoomPerfOptSetting INSTANCE = new LiveRoomPerfOptSetting();
    public static final PerfOptData DEFAULT = new PerfOptData(0.1d, false, false);

    public static final boolean enableFixClearAudioFocusListenerLeak() {
        return INSTANCE.getConfig().enableFixClearAudioFocusListenerLeak;
    }

    public static final boolean enableLowMemStringGCOpt() {
        return INSTANCE.getConfig().enableLowMemStringGCOpt;
    }

    public static final double getSampleRate() {
        return INSTANCE.getConfig().sampleRate;
    }

    public final PerfOptData getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        PerfOptData perfOptData = DEFAULT;
        PerfOptData perfOptData2 = (PerfOptData) settingsManager.getValueSafely("watch_perf_opt_new_setting", perfOptData);
        return perfOptData2 != null ? perfOptData2 : perfOptData;
    }
}
