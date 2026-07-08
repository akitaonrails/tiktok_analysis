package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_league_match_corner_rank_badge_display_duration")
public final class LiveLeagueMatchRankBadgeDisplayDuration {
    public static final int DEFAULT = 15;
    public static final LiveLeagueMatchRankBadgeDisplayDuration INSTANCE = new LiveLeagueMatchRankBadgeDisplayDuration();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_league_match_corner_rank_badge_display_duration", DEFAULT);
    }
}
