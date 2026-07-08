package com.bytedance.android.starship.engine.graph.config;

import X.C09CT;

/* JADX INFO: loaded from: classes21.dex */
public final class CustomNodeConfig {

    @C09CT("custom_node_name")
    public final String customNodeName;

    @C09CT("extra_inputs")
    public final String extraInputs;

    public CustomNodeConfig() {
        this(null, null);
    }

    public CustomNodeConfig(String str, String str2) {
        this.customNodeName = str;
        this.extraInputs = str2;
    }
}
