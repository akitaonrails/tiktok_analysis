package com.bytedance.android.livesdk.livesetting.game;

import X.C09CT;
import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "smart_preview_game_moment_ai_config")
public final class SmartPreviewGameMomentAiConfigSetting {
    public static final SmartPreviewGameMomentAiConfigSetting INSTANCE = new SmartPreviewGameMomentAiConfigSetting();
    public static final SmartPreviewGameMomentAIConfig DEFAULT = new SmartPreviewGameMomentAIConfig(false, false, true, 5, 0.6f, 1);

    public final SmartPreviewGameMomentAIConfig getValue() {
        SmartPreviewGameMomentAIConfig smartPreviewGameMomentAIConfig = (SmartPreviewGameMomentAIConfig) SettingsManager.INSTANCE.getValueSafely(SmartPreviewGameMomentAiConfigSetting.class);
        return smartPreviewGameMomentAIConfig == null ? DEFAULT : smartPreviewGameMomentAIConfig;
    }

    public static final class SmartPreviewGameMomentAIConfig {
        public static final TypeAdapter ADAPTER = new SmartPreviewGameMomentAiConfigSetting_SmartPreviewGameMomentAIConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("data_collect_switch")
        public boolean dataCollectSwitch;

        @C09CT("feature_collect_switch")
        public boolean featureCollectSwitch;

        @C09CT("history_data_show_num_threshold")
        public int historyDataShowNumThreshold;

        @C09CT("score_threshold")
        public float scoreThreshold;

        @C09CT("show_freq")
        public int showFreq;

        /* JADX INFO: renamed from: switch, reason: not valid java name */
        @C09CT("switch")
        public boolean f30switch;

        public SmartPreviewGameMomentAIConfig() {
            this(false, false, true, 5, 0.6f, 1);
        }

        public SmartPreviewGameMomentAIConfig(boolean z, boolean z2, boolean z3, int i, float f, int i2) {
            this.f30switch = z;
            this.featureCollectSwitch = z2;
            this.dataCollectSwitch = z3;
            this.historyDataShowNumThreshold = i;
            this.scoreThreshold = f;
            this.showFreq = i2;
        }
    }
}
