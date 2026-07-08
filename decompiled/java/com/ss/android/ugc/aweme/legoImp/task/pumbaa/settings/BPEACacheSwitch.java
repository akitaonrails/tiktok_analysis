package com.ss.android.ugc.aweme.legoImp.task.pumbaa.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class BPEACacheSwitch {

    @C09CT("enableCarrierCache")
    public final boolean enableCarrierCache;

    @C09CT("enableGAIDCache")
    public final boolean enableGAIDCache;

    @C09CT("enableLocaleCache")
    public final boolean enableLocaleCache;

    @C09CT("enableOptimizeClearCache")
    public final boolean enableOptimizeClearCache;

    @C09CT("enableSplitDFID")
    public final boolean enableSplitDFID;

    public BPEACacheSwitch() {
        this(true, true, true, false, false);
    }

    public BPEACacheSwitch(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.enableCarrierCache = z;
        this.enableGAIDCache = z2;
        this.enableLocaleCache = z3;
        this.enableOptimizeClearCache = z4;
        this.enableSplitDFID = z5;
    }
}
