package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_cohost_search_auto_refresh")
public final class LiveCoHostSearchLeagueAutoRefreshSetting {
    public static final boolean DEFAULT = true;
    public static final LiveCoHostSearchLeagueAutoRefreshSetting INSTANCE = new LiveCoHostSearchLeagueAutoRefreshSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_cohost_search_auto_refresh", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
