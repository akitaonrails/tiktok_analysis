package com.ss.android.ugc.aweme.commercialize.measurement.mrc.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class MRCImpressionOptimizeConfig {

    @C09CT("enable_ignore_piv")
    public final boolean enableIgnorePiv;

    @C09CT("fix_lack_break")
    public final boolean fixLackBreak;

    @C09CT("fix_more_over")
    public final boolean fixMoreOver;

    public MRCImpressionOptimizeConfig() {
        this(false, false, false);
    }

    public MRCImpressionOptimizeConfig(boolean z, boolean z2, boolean z3) {
        this.enableIgnorePiv = z;
        this.fixMoreOver = z2;
        this.fixLackBreak = z3;
    }
}
