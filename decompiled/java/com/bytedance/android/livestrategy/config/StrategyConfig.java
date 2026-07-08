package com.bytedance.android.livestrategy.config;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class StrategyConfig {
    public static final TypeAdapter ADAPTER = new StrategyConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("final_strategy_config")
    public FinalStrategyConfig finalStrategyConfig;

    @C09CT("trigger_strategy_config")
    public TriggerStrategyConfig triggerStrategyConfig;

    public final FinalStrategyConfig getFinalStrategyConfig() {
        return this.finalStrategyConfig;
    }

    public final TriggerStrategyConfig getTriggerStrategyConfig() {
        return this.triggerStrategyConfig;
    }

    public final void setFinalStrategyConfig(FinalStrategyConfig finalStrategyConfig) {
        this.finalStrategyConfig = finalStrategyConfig;
    }

    public final void setTriggerStrategyConfig(TriggerStrategyConfig triggerStrategyConfig) {
        this.triggerStrategyConfig = triggerStrategyConfig;
    }
}
