package com.bytedance.android.livesdk.livesetting.game;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "game_live_pip_quality_strategy")
public final class GameLivePipQualityStrategySetting {
    public static final GameLivePipQualityStrategySetting INSTANCE = new GameLivePipQualityStrategySetting();
    public static final GameLivePipQualityStrategyConfig DEFAULT = new GameLivePipQualityStrategyConfig();

    public static final class GameLivePipQualityStrategyConfig {
        public static final TypeAdapter ADAPTER = new GameLivePipQualityStrategySetting_GameLivePipQualityStrategyConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("include_auto")
        public boolean includeAuto;

        /* JADX INFO: renamed from: switch, reason: not valid java name */
        @C09CT("switch")
        public boolean f28switch;

        @C09CT("strategy")
        public String strategy = "ld";

        @C09CT("delay")
        public long delay = 1000;

        @C09CT("interval")
        public long interval = 60000;
    }

    private final GameLivePipQualityStrategyConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        GameLivePipQualityStrategyConfig gameLivePipQualityStrategyConfig = DEFAULT;
        GameLivePipQualityStrategyConfig gameLivePipQualityStrategyConfig2 = (GameLivePipQualityStrategyConfig) settingsManager.getValueSafely("game_live_pip_quality_strategy", gameLivePipQualityStrategyConfig);
        return gameLivePipQualityStrategyConfig2 != null ? gameLivePipQualityStrategyConfig2 : gameLivePipQualityStrategyConfig;
    }

    public final long delayTime() {
        return getValue().delay;
    }

    public final boolean includeAuto() {
        return getValue().includeAuto;
    }

    public final long intervalTime() {
        return getValue().interval;
    }

    public final boolean isOpen() {
        return getValue().f28switch;
    }

    public final String strategy() {
        return getValue().strategy;
    }
}
