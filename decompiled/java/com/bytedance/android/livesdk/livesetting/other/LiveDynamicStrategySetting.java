package com.bytedance.android.livesdk.livesetting.other;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_dynamic_strategy_setting")
public final class LiveDynamicStrategySetting {
    public static final LiveStrategyParamsConfig DEFAULT;
    public static final LiveDynamicStrategySetting INSTANCE = new LiveDynamicStrategySetting();
    public static final LiveStrategyParamsConfig value;

    public static final class LiveStrategyParamsConfig {
        public static final TypeAdapter ADAPTER;

        @C09CT("strategy_over_time")
        public long strategyOverTime;

        static {
            NormalGson.singleton();
            ADAPTER = new LiveDynamicStrategySetting_LiveStrategyParamsConfig_OptTypeAdapter();
        }

        public LiveStrategyParamsConfig() {
            this(10L);
        }

        public LiveStrategyParamsConfig(long j) {
            this.strategyOverTime = j;
        }
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    static {
        LiveStrategyParamsConfig liveStrategyParamsConfig = new LiveStrategyParamsConfig(10L);
        DEFAULT = liveStrategyParamsConfig;
        LiveStrategyParamsConfig liveStrategyParamsConfig2 = (LiveStrategyParamsConfig) SettingsManager.INSTANCE.getValueSafely("live_dynamic_strategy_setting", liveStrategyParamsConfig);
        if (liveStrategyParamsConfig2 != null) {
            liveStrategyParamsConfig = liveStrategyParamsConfig2;
        }
        value = liveStrategyParamsConfig;
    }

    public static final LiveStrategyParamsConfig getValue() {
        return value;
    }
}
