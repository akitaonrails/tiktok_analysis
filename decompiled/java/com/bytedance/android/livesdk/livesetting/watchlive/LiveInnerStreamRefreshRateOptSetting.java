package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "live_refresh_rate_opt_dur")
public final class LiveInnerStreamRefreshRateOptSetting {
    public static final int DEFAULT = 0;
    public static final LiveInnerStreamRefreshRateOptSetting INSTANCE = new LiveInnerStreamRefreshRateOptSetting();

    public static final int getIntMs() {
        return SettingsManager.INSTANCE.getIntValue("live_refresh_rate_opt_dur", DEFAULT);
    }
}
