package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_cohost_search_league_refresh_interval")
public final class LiveCoHostSearchLeagueRefreshIntervalSetting {
    public static final int DEFAULT = 2;
    public static final LiveCoHostSearchLeagueRefreshIntervalSetting INSTANCE = new LiveCoHostSearchLeagueRefreshIntervalSetting();

    public final int getValue() {
        int intValue = SettingsManager.INSTANCE.getIntValue("live_cohost_search_league_refresh_interval", DEFAULT);
        if (intValue < 2) {
            return 2;
        }
        return intValue;
    }
}
