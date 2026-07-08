package com.ss.android.ugc.aweme.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class SparkWebViewSecurityLayerModel {

    @C09CT("block_enable")
    public final boolean blockEnable;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("page_enable")
    public final boolean pageEnable;

    public SparkWebViewSecurityLayerModel() {
        this(false, false, false);
    }

    public SparkWebViewSecurityLayerModel(boolean z, boolean z2, boolean z3) {
        this.enable = z;
        this.pageEnable = z2;
        this.blockEnable = z3;
    }
}
