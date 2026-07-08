package com.bytedance.android.livesdk.livesetting.game.partnership;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlive_game_leader_board_card_dsl")
public final class GameLiveLeaderBoardDSLSetting {
    public static final GameLiveLeaderBoardDSLSetting INSTANCE = new GameLiveLeaderBoardDSLSetting();
    public static final String DEFAULT = "{\"basic_info\":{\"cards\":[{\"card_class\":\"lynx_card\",\"data_key_path\":[],\"extra_card_config\":{\"card_scheme\":\"aweme://roma_redirect/?spark_page=game_leaderboard_gip_main\"}}]}}";

    public final String getDSL() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        String str = DEFAULT;
        String stringValue = settingsManager.getStringValue("ttlive_game_leader_board_card_dsl", str);
        return stringValue != null ? stringValue : str;
    }
}
