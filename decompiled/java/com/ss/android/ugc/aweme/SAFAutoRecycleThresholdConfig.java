package com.ss.android.ugc.aweme;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class SAFAutoRecycleThresholdConfig {

    @C09CT("ge31")
    public final float ge31;

    @C09CT("lt31")
    public final Float lt31;

    public SAFAutoRecycleThresholdConfig() {
        this(0.0f, Float.valueOf(0.0f));
    }

    public SAFAutoRecycleThresholdConfig(float f, Float f2) {
        this.ge31 = f;
        this.lt31 = f2;
    }
}
