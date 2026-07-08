package com.bytedance.android.livesdk.livesetting.game.partnership;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlive_game_esports_xtab_highlights_dsl")
public final class GameLiveESportsXTabHighlightsDSLSetting {
    public static final GameLiveESportsXTabHighlightsDSLSetting INSTANCE = new GameLiveESportsXTabHighlightsDSLSetting();
    public static final String DEFAULT = "{\"basic_info\":{\"cards\":[{\"card_class\":\"esports_highlight_card\",\"data_key_path\":[],\"extra_card_config\":{}}]}}";

    public final String getDSL() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        String str = DEFAULT;
        String stringValue = settingsManager.getStringValue("ttlive_game_esports_xtab_highlights_dsl", str);
        return stringValue != null ? stringValue : str;
    }
}
