package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_league_match_banner_countdown_threshold")
public final class LiveLeagueMatchBannerCountdownThresholdSetting {
    public static final long DEFAULT = 172800;
    public static final LiveLeagueMatchBannerCountdownThresholdSetting INSTANCE = new LiveLeagueMatchBannerCountdownThresholdSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_league_match_banner_countdown_threshold", DEFAULT);
    }
}
