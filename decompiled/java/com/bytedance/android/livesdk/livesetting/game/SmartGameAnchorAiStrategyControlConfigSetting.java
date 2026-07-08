package com.bytedance.android.livesdk.livesetting.game;

import X.C09CT;
import X.C2097608Jq;
import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "smart_game_anchor_ai_strategy_control_config")
public final class SmartGameAnchorAiStrategyControlConfigSetting {
    public static final SmartGameAnchorAiStrategyControlConfigSetting INSTANCE = new SmartGameAnchorAiStrategyControlConfigSetting();
    public static final SmartGameAnchorAiStrategyControlConfig DEFAULT = new SmartGameAnchorAiStrategyControlConfig(C2097608Jq.LJ());

    /* JADX INFO: loaded from: classes19.dex */
    public static final class AnchorStrategyConfig {
        public static final TypeAdapter ADAPTER = new SmartGameAnchorAiStrategyControlConfigSetting_AnchorStrategyConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("enable_data_collect")
        public boolean enableDataCollect;

        @C09CT("enable_infer")
        public boolean enableInfer;

        @C09CT("enable_infer_gip")
        public boolean enableInferGIP;

        @C09CT("preload_trigger_count")
        public int preloadTriggerCount;

        @C09CT("require_server_features")
        public boolean requireServerFeatures;

        @C09CT("score_key")
        public String scoreKey;

        @C09CT("score_threshold")
        public float scoreThreshold;

        @C09CT("score_threshold_gip")
        public float scoreThresholdGIP;

        public AnchorStrategyConfig() {
            this(false, false, false, "", 0.0f, 0.0f, 5, true);
        }

        public AnchorStrategyConfig(boolean z, boolean z2, boolean z3, String str, float f, float f2, int i, boolean z4) {
            this.enableInfer = z;
            this.enableInferGIP = z2;
            this.enableDataCollect = z3;
            this.scoreKey = str;
            this.scoreThreshold = f;
            this.scoreThresholdGIP = f2;
            this.preloadTriggerCount = i;
            this.requireServerFeatures = z4;
        }
    }

    public static final class SmartGameAnchorAiStrategyControlConfig {
        public static final TypeAdapter ADAPTER = new SmartGameAnchorAiStrategyControlConfigSetting_SmartGameAnchorAiStrategyControlConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("anchor_config_map")
        public Map<String, AnchorStrategyConfig> anchorConfigMap;

        public SmartGameAnchorAiStrategyControlConfig() {
            this(C2097608Jq.LJ());
        }

        public SmartGameAnchorAiStrategyControlConfig(Map<String, AnchorStrategyConfig> map) {
            this.anchorConfigMap = map;
        }
    }

    public final SmartGameAnchorAiStrategyControlConfig getConfig() {
        SmartGameAnchorAiStrategyControlConfig smartGameAnchorAiStrategyControlConfig = (SmartGameAnchorAiStrategyControlConfig) SettingsManager.INSTANCE.getValueSafely(SmartGameAnchorAiStrategyControlConfigSetting.class);
        return smartGameAnchorAiStrategyControlConfig == null ? DEFAULT : smartGameAnchorAiStrategyControlConfig;
    }

    public final AnchorStrategyConfig getAnchorConfig(int i) {
        return getConfig().anchorConfigMap.get(String.valueOf(i));
    }
}
