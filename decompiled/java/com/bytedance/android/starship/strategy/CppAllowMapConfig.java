package com.bytedance.android.starship.strategy;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class CppAllowMapConfig {

    @C09CT("event_allow_map")
    public final Map<String, Object> eventMap;

    @C09CT("strategy_allow_map")
    public final Map<String, Object> strategyMap;

    public CppAllowMapConfig() {
        this(null, null);
    }

    public CppAllowMapConfig(Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
        this.strategyMap = map;
        this.eventMap = map2;
    }
}
