package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "live_drawer_arch_opt_2nd")
public final class LiveDrawerArchOpt2ndSetting {
    public static final int DEFAULT = 0;
    public static final int EXPERIENCE = 1;
    public static final LiveDrawerArchOpt2ndSetting INSTANCE = new LiveDrawerArchOpt2ndSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_drawer_arch_opt_2nd", DEFAULT);
    }

    public final boolean enable() {
        return 1 == getValue();
    }
}
