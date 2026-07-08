package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_match_opt_out_league_countdown")
public final class LiveMatchOptOutLeagueCountdownSetting {
    public static final boolean DEFAULT = true;
    public static final LiveMatchOptOutLeagueCountdownSetting INSTANCE = new LiveMatchOptOutLeagueCountdownSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_match_opt_out_league_countdown", DEFAULT);
    }
}
