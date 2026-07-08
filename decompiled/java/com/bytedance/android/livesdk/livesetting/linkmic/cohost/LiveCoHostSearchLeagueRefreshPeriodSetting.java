package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_search_league_refresh_period")
public final class LiveCoHostSearchLeagueRefreshPeriodSetting {
    public static final int DEFAULT = 30;
    public static final LiveCoHostSearchLeagueRefreshPeriodSetting INSTANCE = new LiveCoHostSearchLeagueRefreshPeriodSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_cohost_search_league_refresh_period", DEFAULT);
    }
}
