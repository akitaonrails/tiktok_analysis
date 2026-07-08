package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class GcOptionConfig {

    @C09CT("adj_gc_type_limit_percent")
    public float adjGcTypeLimitPercent;

    @C09CT("adj_gc_type_limit_percent_low")
    public float adjGcTypeLimitPercentLow;

    @C09CT("clear_soft_ref_limit_percent")
    public float clearSoftRefLimitPercent;

    @C09CT("clear_soft_ref_limit_percent_low")
    public float clearSoftRefLimitPercentLow;

    public GcOptionConfig() {
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public final void setAdjGcTypeLimitPercent(float f) {
        this.adjGcTypeLimitPercent = f;
    }

    public final void setAdjGcTypeLimitPercentLow(float f) {
        this.adjGcTypeLimitPercentLow = f;
    }

    public final void setClearSoftRefLimitPercent(float f) {
        this.clearSoftRefLimitPercent = f;
    }

    public final void setClearSoftRefLimitPercentLow(float f) {
        this.clearSoftRefLimitPercentLow = f;
    }

    public GcOptionConfig(float f, float f2, float f3, float f4) {
        this.clearSoftRefLimitPercent = f;
        this.adjGcTypeLimitPercent = f2;
        this.clearSoftRefLimitPercentLow = f3;
        this.adjGcTypeLimitPercentLow = f4;
    }
}
