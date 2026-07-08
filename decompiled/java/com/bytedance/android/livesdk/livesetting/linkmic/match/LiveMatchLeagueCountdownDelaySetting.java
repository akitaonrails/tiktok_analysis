package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_match_league_count_down_delay_setting")
public final class LiveMatchLeagueCountdownDelaySetting {
    public static final boolean DEFAULT = true;
    public static final LiveMatchLeagueCountdownDelaySetting INSTANCE = new LiveMatchLeagueCountdownDelaySetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_match_league_count_down_delay_setting", DEFAULT);
    }
}
