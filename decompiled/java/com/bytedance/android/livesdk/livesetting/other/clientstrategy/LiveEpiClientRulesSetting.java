package com.bytedance.android.livesdk.livesetting.other.clientstrategy;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_epi_client_rules_config")
public final class LiveEpiClientRulesSetting {
    public static final LiveStrategyParamsConfig DEFAULT;
    public static final LiveEpiClientRulesSetting INSTANCE = new LiveEpiClientRulesSetting();
    public static final LiveStrategyParamsConfig value;

    public static /* synthetic */ void getValue$annotations() {
    }

    static {
        LiveStrategyParamsConfig liveStrategyParamsConfig = new LiveStrategyParamsConfig(false, 3000L);
        DEFAULT = liveStrategyParamsConfig;
        LiveStrategyParamsConfig liveStrategyParamsConfig2 = (LiveStrategyParamsConfig) SettingsManager.INSTANCE.getValueSafely("live_epi_client_rules_config", liveStrategyParamsConfig);
        if (liveStrategyParamsConfig2 != null) {
            liveStrategyParamsConfig = liveStrategyParamsConfig2;
        }
        value = liveStrategyParamsConfig;
    }

    public static final LiveStrategyParamsConfig getValue() {
        return value;
    }

    public static final class LiveStrategyParamsConfig {
        public static final TypeAdapter ADAPTER = new LiveEpiClientRulesSetting_LiveStrategyParamsConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("enable")
        public boolean enable;

        @C09CT("engine_freq")
        public long engineFreq;

        public LiveStrategyParamsConfig() {
            this(false, 3000L);
        }

        public LiveStrategyParamsConfig(boolean z, long j) {
            this.enable = z;
            this.engineFreq = j;
        }
    }
}
