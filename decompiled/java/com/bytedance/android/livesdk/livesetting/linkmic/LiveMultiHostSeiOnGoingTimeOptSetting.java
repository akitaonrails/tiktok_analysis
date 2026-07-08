package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "live_multi_host_sei_on_going_time_opt")
public final class LiveMultiHostSeiOnGoingTimeOptSetting {
    public static final int DEFAULT = 0;
    public static final LiveMultiHostSeiOnGoingTimeOptSetting INSTANCE = new LiveMultiHostSeiOnGoingTimeOptSetting();
    public static final int OPT = 1;

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_multi_host_sei_on_going_time_opt", DEFAULT);
    }

    public final boolean isOpt() {
        return getValue() == 1;
    }
}
