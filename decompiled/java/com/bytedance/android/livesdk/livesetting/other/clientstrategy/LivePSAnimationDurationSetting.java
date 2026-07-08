package com.bytedance.android.livesdk.livesetting.other.clientstrategy;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("like_public_screen_animation_setting")
public final class LivePSAnimationDurationSetting {
    public static final StrategyConfig DEFAULT;
    public static final LivePSAnimationDurationSetting INSTANCE = new LivePSAnimationDurationSetting();
    public static final StrategyConfig value;

    public static final class StrategyConfig {
        public static final TypeAdapter ADAPTER;

        @C09CT("detail")
        public String detail;

        @C09CT("type")
        public String type;

        static {
            NormalGson.singleton();
            ADAPTER = new LivePSAnimationDurationSetting_StrategyConfig_OptTypeAdapter();
        }

        public StrategyConfig() {
            this("", "");
        }

        public StrategyConfig(String str, String str2) {
            this.type = str;
            this.detail = str2;
        }
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    static {
        StrategyConfig strategyConfig = new StrategyConfig("", "");
        DEFAULT = strategyConfig;
        StrategyConfig strategyConfig2 = (StrategyConfig) SettingsManager.INSTANCE.getValueSafely("like_public_screen_animation_setting", strategyConfig);
        if (strategyConfig2 != null) {
            strategyConfig = strategyConfig2;
        }
        value = strategyConfig;
    }

    public static final StrategyConfig getValue() {
        return value;
    }
}
