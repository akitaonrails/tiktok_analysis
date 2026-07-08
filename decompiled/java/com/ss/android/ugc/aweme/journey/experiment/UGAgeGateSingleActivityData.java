package com.ss.android.ugc.aweme.journey.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class UGAgeGateSingleActivityData {

    @C09CT("enable_in_main")
    public final boolean enableInMain;

    @C09CT("enable_in_nuj")
    public final boolean enableInNUJ;

    @C09CT("enable_in_register")
    public final boolean enableInRegister;

    public UGAgeGateSingleActivityData() {
        this(true, true, true);
    }

    public UGAgeGateSingleActivityData(boolean z, boolean z2, boolean z3) {
        this.enableInNUJ = z;
        this.enableInMain = z2;
        this.enableInRegister = z3;
    }
}
