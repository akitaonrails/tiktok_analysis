package com.bytedance.android.livesdk.performancetune.strategy.model;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public class AbsStrategyInputConfig {

    @C09CT("bizKey")
    public final String bizKey;
    public final Map<String, Object> strategyInputParams;

    @C09CT("strategyType")
    public final int strategyType;

    public AbsStrategyInputConfig() {
        this(1, "", new LinkedHashMap());
    }

    public final String getBizKey() {
        return this.bizKey;
    }

    public final Map<String, Object> getStrategyInputParams() {
        return this.strategyInputParams;
    }

    public final int getStrategyType() {
        return this.strategyType;
    }

    public AbsStrategyInputConfig(int i, String str, Map<String, Object> map) {
        this.strategyType = i;
        this.bizKey = str;
        this.strategyInputParams = map;
    }
}
