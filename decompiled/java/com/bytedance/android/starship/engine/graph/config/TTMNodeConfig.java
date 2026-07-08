package com.bytedance.android.starship.engine.graph.config;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class TTMNodeConfig {

    @C09CT("b_data")
    public final String data;

    @C09CT("data_center_config")
    public final List<DataCenterConfig> dataCenterConfig;

    @C09CT("extra_inputs")
    public final String extraInputs;

    @C09CT("models")
    public final List<String> models;

    public TTMNodeConfig() {
        this(null, null, null, null);
    }

    public TTMNodeConfig(String str, String str2, List<DataCenterConfig> list, List<String> list2) {
        this.data = str;
        this.extraInputs = str2;
        this.dataCenterConfig = list;
        this.models = list2;
    }
}
