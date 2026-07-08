package com.bytedance.android.livesdk.livesetting.game;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_game_safety_reporter_setting_config2")
public final class LiveGameSafetyReporterSettingConfig2 {
    public static final LiveGameSafetyReporterSettingConfig2 INSTANCE = new LiveGameSafetyReporterSettingConfig2();
    public static final GameLiveSafetyReporterConfig2 DEFAULT = new GameLiveSafetyReporterConfig2();

    public static final class GameLiveSafetyReporterConfig2 {
        public static final TypeAdapter ADAPTER;

        @C09CT("voice_db")
        public int voiceDB;

        @C09CT("init_value")
        public int initValue = 5;

        @C09CT("step")
        public int step = 5;

        @C09CT("count")
        public int count = 10;

        @C09CT("version")
        public int version = 1;

        static {
            NormalGson.singleton();
            ADAPTER = new LiveGameSafetyReporterSettingConfig2_GameLiveSafetyReporterConfig2_OptTypeAdapter();
        }
    }

    public final GameLiveSafetyReporterConfig2 getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        GameLiveSafetyReporterConfig2 gameLiveSafetyReporterConfig2 = DEFAULT;
        GameLiveSafetyReporterConfig2 gameLiveSafetyReporterConfig22 = (GameLiveSafetyReporterConfig2) settingsManager.getValueSafely("live_game_safety_reporter_setting_config2", gameLiveSafetyReporterConfig2);
        return gameLiveSafetyReporterConfig22 != null ? gameLiveSafetyReporterConfig22 : gameLiveSafetyReporterConfig2;
    }
}
