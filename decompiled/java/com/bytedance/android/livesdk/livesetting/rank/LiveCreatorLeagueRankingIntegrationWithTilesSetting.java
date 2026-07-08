package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_creator_league_ranking_integration_with_tiles_setting")
public final class LiveCreatorLeagueRankingIntegrationWithTilesSetting {
    public static final boolean DEFAULT = false;
    public static final LiveCreatorLeagueRankingIntegrationWithTilesSetting INSTANCE = new LiveCreatorLeagueRankingIntegrationWithTilesSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_creator_league_ranking_integration_with_tiles_setting", DEFAULT);
    }
}
