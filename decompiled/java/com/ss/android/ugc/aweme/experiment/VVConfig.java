package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class VVConfig {

    @C09CT("enable")
    public boolean isEnable;

    @C09CT("vv_index")
    public int vvIndex;

    public VVConfig() {
        this(false, 5);
    }

    public VVConfig(boolean z, int i) {
        this.isEnable = z;
        this.vvIndex = i;
    }
}
