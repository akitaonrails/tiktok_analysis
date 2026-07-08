package com.bytedance.pumbaa.hybrid.governance.network;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class HybridTrafficColoringModel {

    @C09CT("context_pass_enabled")
    public final boolean contextPassEnabled;

    @C09CT("enabled")
    public final boolean enabled;

    @C09CT("header_mod_enabled")
    public final boolean headerModEnabled;

    @C09CT("query_mod_enabled")
    public final boolean queryModEnabled;

    @C09CT("security_layer_pass_enabled")
    public final boolean securityLayerPassEnabled;

    public HybridTrafficColoringModel() {
        this(false, false, false, false, false);
    }

    public HybridTrafficColoringModel(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.enabled = z;
        this.headerModEnabled = z2;
        this.queryModEnabled = z3;
        this.contextPassEnabled = z4;
        this.securityLayerPassEnabled = z5;
    }
}
