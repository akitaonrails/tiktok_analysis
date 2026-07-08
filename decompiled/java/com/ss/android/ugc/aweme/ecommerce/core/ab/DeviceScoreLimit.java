package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class DeviceScoreLimit {

    @C09CT("max_score")
    public final Float maxScore;

    @C09CT("min_score")
    public final Float minScore;

    /* JADX WARN: Illegal instructions before constructor call */
    public DeviceScoreLimit() {
        Float fValueOf = Float.valueOf(0.0f);
        this(fValueOf, fValueOf);
    }

    public DeviceScoreLimit(Float f, Float f2) {
        this.minScore = f;
        this.maxScore = f2;
    }
}
