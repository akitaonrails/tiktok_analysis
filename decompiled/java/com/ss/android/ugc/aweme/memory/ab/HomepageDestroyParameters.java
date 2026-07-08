package com.ss.android.ugc.aweme.memory.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes4.dex */
public final class HomepageDestroyParameters {
    public static final int $stable = 0;

    @C09CT("interval")
    public final long interval;

    @C09CT("sample")
    public final float sample;

    public HomepageDestroyParameters() {
        this(1.0E-4f, 600000L);
    }

    public HomepageDestroyParameters(float f, long j) {
        this.sample = f;
        this.interval = j;
    }
}
