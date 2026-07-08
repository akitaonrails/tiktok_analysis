package com.bytedance.android.livesdk.livesetting.game;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_game_safety_reporter")
public final class LiveGameSafetyReporterSetting {
    public static final LiveGameSafetyReporterSetting INSTANCE = new LiveGameSafetyReporterSetting();
    public static final GameLiveSafetyReporterConfig DEFAULT = new GameLiveSafetyReporterConfig();

    public static final class GameLiveSafetyReporterConfig {
        public static final TypeAdapter ADAPTER = new LiveGameSafetyReporterSetting_GameLiveSafetyReporterConfig_OptTypeAdapter(NormalGson.singleton());

        /* JADX INFO: renamed from: switch, reason: not valid java name */
        @C09CT("switch")
        public boolean f29switch;

        @C09CT("report_interval")
        public long reportInterval = 60000;

        @C09CT("threshold")
        public double threshold = 0.2d;
    }

    public final GameLiveSafetyReporterConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        GameLiveSafetyReporterConfig gameLiveSafetyReporterConfig = DEFAULT;
        GameLiveSafetyReporterConfig gameLiveSafetyReporterConfig2 = (GameLiveSafetyReporterConfig) settingsManager.getValueSafely("live_game_safety_reporter", gameLiveSafetyReporterConfig);
        return gameLiveSafetyReporterConfig2 != null ? gameLiveSafetyReporterConfig2 : gameLiveSafetyReporterConfig;
    }
}
