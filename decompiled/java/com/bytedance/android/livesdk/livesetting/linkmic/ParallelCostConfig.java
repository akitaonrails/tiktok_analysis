package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes34.dex */
public final class ParallelCostConfig {
    public static final TypeAdapter ADAPTER = new ParallelCostConfig_OptTypeAdapter(NormalGson.singleton());

    /* JADX INFO: renamed from: default, reason: not valid java name */
    @C09CT("default")
    public PullSceneConfig f34default;

    @C09CT("enable")
    public int enable;

    @C09CT("not_p95_high")
    public PullSceneConfig notP95High;

    @C09CT("not_p95_low")
    public PullSceneConfig notP95Low;

    @C09CT("p95_high")
    public PullSceneConfig p95High;

    @C09CT("p95_high_possible")
    public PullSceneConfig p95HighPossible;

    @C09CT("p95_low")
    public PullSceneConfig p95Low;

    @C09CT("p95_strategy_fail_opt")
    public int p95StrategyFailOpt;

    public ParallelCostConfig() {
        this(0, -1, null, null, null, null, null, null);
    }

    public final PullSceneConfig getDefault() {
        return this.f34default;
    }

    public final int getEnable() {
        return this.enable;
    }

    public final PullSceneConfig getNotP95High() {
        return this.notP95High;
    }

    public final PullSceneConfig getNotP95Low() {
        return this.notP95Low;
    }

    public final PullSceneConfig getP95High() {
        return this.p95High;
    }

    public final PullSceneConfig getP95HighPossible() {
        return this.p95HighPossible;
    }

    public final PullSceneConfig getP95Low() {
        return this.p95Low;
    }

    public final int getP95StrategyFailOpt() {
        return this.p95StrategyFailOpt;
    }

    public final void setDefault(PullSceneConfig pullSceneConfig) {
        this.f34default = pullSceneConfig;
    }

    public final void setEnable(int i) {
        this.enable = i;
    }

    public final void setNotP95High(PullSceneConfig pullSceneConfig) {
        this.notP95High = pullSceneConfig;
    }

    public final void setNotP95Low(PullSceneConfig pullSceneConfig) {
        this.notP95Low = pullSceneConfig;
    }

    public final void setP95High(PullSceneConfig pullSceneConfig) {
        this.p95High = pullSceneConfig;
    }

    public final void setP95HighPossible(PullSceneConfig pullSceneConfig) {
        this.p95HighPossible = pullSceneConfig;
    }

    public final void setP95Low(PullSceneConfig pullSceneConfig) {
        this.p95Low = pullSceneConfig;
    }

    public final void setP95StrategyFailOpt(int i) {
        this.p95StrategyFailOpt = i;
    }

    public ParallelCostConfig(int i, int i2, PullSceneConfig pullSceneConfig, PullSceneConfig pullSceneConfig2, PullSceneConfig pullSceneConfig3, PullSceneConfig pullSceneConfig4, PullSceneConfig pullSceneConfig5, PullSceneConfig pullSceneConfig6) {
        this.enable = i;
        this.p95StrategyFailOpt = i2;
        this.p95Low = pullSceneConfig;
        this.p95HighPossible = pullSceneConfig2;
        this.p95High = pullSceneConfig3;
        this.notP95High = pullSceneConfig4;
        this.notP95Low = pullSceneConfig5;
        this.f34default = pullSceneConfig6;
    }
}
