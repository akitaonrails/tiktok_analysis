package com.bytedance.android.livesdk.livesetting.game.partnership;

import X.C2097608Jq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlive_game_universal_host_dsl_data")
public final class GameLiveCommonMixHostDSLBundle {
    public static final GameLiveCommonMixHostDSLBundle INSTANCE = new GameLiveCommonMixHostDSLBundle();
    public static final Map<String, String> DEFAULT = C2097608Jq.LJ();

    public final Map<String, String> getDSLBundle() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Map<String, String> map = DEFAULT;
        Map<String, String> map2 = (Map) settingsManager.getValueSafely("ttlive_game_universal_host_dsl_data", map);
        return map2 != null ? map2 : map;
    }
}
