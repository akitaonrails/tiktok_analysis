package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "play_together_config")
public final class GameLivePlayTogetherConfigSetting {
    public static final GameLivePlayTogetherConfigSetting INSTANCE = new GameLivePlayTogetherConfigSetting();
    public static final GamePlayTogetherConfigV2 DEFAULT = new GamePlayTogetherConfigV2();

    public static final class GamePlayTogetherConfigV2 {
        public static final TypeAdapter ADAPTER = new GameLivePlayTogetherConfigSetting_GamePlayTogetherConfigV2_OptTypeAdapter(NormalGson.singleton());

        @C09CT("enable_board")
        public boolean enableBoard;

        @C09CT("business_version")
        public int version;
    }

    private final GamePlayTogetherConfigV2 getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        GamePlayTogetherConfigV2 gamePlayTogetherConfigV2 = DEFAULT;
        GamePlayTogetherConfigV2 gamePlayTogetherConfigV22 = (GamePlayTogetherConfigV2) settingsManager.getValueSafely("play_together_config", gamePlayTogetherConfigV2);
        return gamePlayTogetherConfigV22 != null ? gamePlayTogetherConfigV22 : gamePlayTogetherConfigV2;
    }

    public final boolean enableBoard() {
        return getValue().enableBoard;
    }

    public final boolean enableV2() {
        return getValue().version == 1;
    }
}
