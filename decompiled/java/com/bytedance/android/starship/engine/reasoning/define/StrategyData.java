package com.bytedance.android.starship.engine.reasoning.define;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class StrategyData implements Serializable {

    @C09CT("strategy_config")
    public List<Object> configList;

    public StrategyData() {
        this(null);
    }

    public StrategyData(List<Object> list) {
        this.configList = list;
    }

    public final void setConfigList(List<Object> list) {
        this.configList = list;
    }
}
