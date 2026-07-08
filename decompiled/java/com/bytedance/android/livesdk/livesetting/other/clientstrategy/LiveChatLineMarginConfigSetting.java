package com.bytedance.android.livesdk.livesetting.other.clientstrategy;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_chat_line_margin_config")
public final class LiveChatLineMarginConfigSetting {
    public static final LiveChatLineMarginConfigSetting INSTANCE = new LiveChatLineMarginConfigSetting();
    public static final StrategyConfig DEFAULT = new StrategyConfig("", "");

    public static final class StrategyConfig {
        public static final TypeAdapter ADAPTER;

        @C09CT("detail")
        public String detail;

        @C09CT("type")
        public String type;

        static {
            NormalGson.singleton();
            ADAPTER = new LiveChatLineMarginConfigSetting_StrategyConfig_OptTypeAdapter();
        }

        public StrategyConfig() {
            this("", "");
        }

        public StrategyConfig(String str, String str2) {
            this.type = str;
            this.detail = str2;
        }
    }

    public final StrategyConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        StrategyConfig strategyConfig = DEFAULT;
        StrategyConfig strategyConfig2 = (StrategyConfig) settingsManager.getValueSafely("live_chat_line_margin_config", strategyConfig);
        return strategyConfig2 != null ? strategyConfig2 : strategyConfig;
    }
}
