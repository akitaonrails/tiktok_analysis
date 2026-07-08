package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "multi_match_half_screen_opt")
public final class MultiMatchHalfScreenOptSetting {
    public static final int DEFAULT = 0;
    public static final MultiMatchHalfScreenOptSetting INSTANCE = new MultiMatchHalfScreenOptSetting();
    public static final int OPT = 1;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("multi_match_half_screen_opt", DEFAULT);
    }

    public final boolean isOpt() {
        return getValue() == 1;
    }
}
