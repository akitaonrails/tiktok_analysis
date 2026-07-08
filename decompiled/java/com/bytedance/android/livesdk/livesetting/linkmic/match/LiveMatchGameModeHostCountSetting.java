package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C2097608Jq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_match_game_mode_host_count")
public final class LiveMatchGameModeHostCountSetting {
    public static final LiveMatchGameModeHostCountSetting INSTANCE = new LiveMatchGameModeHostCountSetting();
    public static final Map<Integer, GameModeHostRange> DEFAULT = C2097608Jq.LJIIIIZZ(new Pair(1, new GameModeHostRange(2, 2)), new Pair(53, new GameModeHostRange(2, 2)), new Pair(2, new GameModeHostRange(2, 4)), new Pair(4, new GameModeHostRange(3, 4)), new Pair(3, new GameModeHostRange(3, 4)), new Pair(51, new GameModeHostRange(2, 4)));

    public final Map<Integer, GameModeHostRange> getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Map<Integer, GameModeHostRange> map = DEFAULT;
        Map<Integer, GameModeHostRange> map2 = (Map) settingsManager.getValueSafely("live_match_game_mode_host_count", map);
        return map2 != null ? map2 : map;
    }
}
