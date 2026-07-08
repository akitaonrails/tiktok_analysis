package com.bytedance.pns.engine;

import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class ConstPoolConfig {
    public List<String> baseConfigs;
    public List<String> extraConfig;

    public final List<String> getBaseConfigs() {
        return this.baseConfigs;
    }

    public final List<String> getExtraConfig() {
        return this.extraConfig;
    }

    public final void setBaseConfigs(List<String> list) {
        this.baseConfigs = list;
    }

    public final void setExtraConfig(List<String> list) {
        this.extraConfig = list;
    }

    public ConstPoolConfig(List<String> list, List<String> list2) {
        this.baseConfigs = list;
        this.extraConfig = list2;
    }
}
