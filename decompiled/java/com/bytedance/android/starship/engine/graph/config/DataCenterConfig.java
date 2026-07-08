package com.bytedance.android.starship.engine.graph.config;

import X.C09CS;
import X.C09CT;
import X.EnumC1307710k8P;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class DataCenterConfig {

    @C09CT("get")
    public final List<String> get;

    @C09CT("providers")
    public final List<DataProviderConfig> providers;

    @C09CT("put")
    public final List<String> put;

    @C09CT("scope")
    @C09CS(DataCenterScopeAdapter.class)
    public final EnumC1307710k8P scope;

    public DataCenterConfig() {
        this(EnumC1307710k8P.UNKNOWN, null, null, null);
    }

    public DataCenterConfig(EnumC1307710k8P enumC1307710k8P, List<String> list, List<String> list2, List<DataProviderConfig> list3) {
        this.scope = enumC1307710k8P;
        this.get = list;
        this.put = list2;
        this.providers = list3;
    }
}
