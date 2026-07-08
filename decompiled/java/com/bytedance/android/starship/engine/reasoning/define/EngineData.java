package com.bytedance.android.starship.engine.reasoning.define;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class EngineData implements Serializable {

    @C09CT("engine_config")
    public List<EngineConfig> config;

    public EngineData() {
        this(null);
    }

    public EngineData(List<EngineConfig> list) {
        this.config = list;
    }

    public final void setConfig(List<EngineConfig> list) {
        this.config = list;
    }
}
