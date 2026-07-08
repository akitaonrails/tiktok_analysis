package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_match_league_campaign_url")
public final class LiveLeagueMatchCampaignPageUrl {
    public static final String DEFAULT = "aweme://roma_redirect/?spark_page=league_match_main&enter_from=match_countdown";
    public static final LiveLeagueMatchCampaignPageUrl INSTANCE = new LiveLeagueMatchCampaignPageUrl();

    public final String link() {
        return SettingsManager.INSTANCE.getStringValue("live_match_league_campaign_url", DEFAULT);
    }
}
