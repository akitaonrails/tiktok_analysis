package com.bytedance.android.livesdk.livesetting.other.clientstrategy;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_stream_comment_adaption_config")
public final class LiveStreamCommentAdaptionConfigSetting {
    public static final LiveStreamCommentAdaptionConfigSetting INSTANCE = new LiveStreamCommentAdaptionConfigSetting();
    public static final StrategyConfig DEFAULT = new StrategyConfig("rule", "{\"version\":1,\"name\":\"stream_comment_adaption_v0\",\"type\":\"rule\",\"key_features\":[\"room_type\"],\"rules\":[{\"rule_id\":1,\"expression\":\"room_type != 0\",\"order\":1,\"result_value\":\"false\"}],\"default_result\":\"true\"}");

    public static final class StrategyConfig {
        public static final TypeAdapter ADAPTER;

        @C09CT("detail")
        public String detail;

        @C09CT("type")
        public String type;

        static {
            NormalGson.singleton();
            ADAPTER = new LiveStreamCommentAdaptionConfigSetting_StrategyConfig_OptTypeAdapter();
        }

        public StrategyConfig() {
            this("rule", "{\"version\":1,\"name\":\"stream_comment_adaption_v0\",\"type\":\"rule\",\"key_features\":[\"room_type\"],\"rules\":[{\"rule_id\":1,\"expression\":\"room_type != 0\",\"order\":1,\"result_value\":\"false\"}],\"default_result\":\"true\"}");
        }

        public StrategyConfig(String str, String str2) {
            this.type = str;
            this.detail = str2;
        }
    }

    public final StrategyConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        StrategyConfig strategyConfig = DEFAULT;
        StrategyConfig strategyConfig2 = (StrategyConfig) settingsManager.getValueSafely("live_stream_comment_adaption_config", strategyConfig);
        return strategyConfig2 != null ? strategyConfig2 : strategyConfig;
    }
}
