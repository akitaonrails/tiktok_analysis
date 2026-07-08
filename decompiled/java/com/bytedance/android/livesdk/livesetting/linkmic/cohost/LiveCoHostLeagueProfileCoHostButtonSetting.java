package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_cohost_league_profile_cohost_button")
public final class LiveCoHostLeagueProfileCoHostButtonSetting {
    public static final boolean DEFAULT = true;
    public static final LiveCoHostLeagueProfileCoHostButtonSetting INSTANCE = new LiveCoHostLeagueProfileCoHostButtonSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_cohost_league_profile_cohost_button", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
