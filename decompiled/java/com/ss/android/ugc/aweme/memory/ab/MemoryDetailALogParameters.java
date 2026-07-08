package com.ss.android.ugc.aweme.memory.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes4.dex */
public final class MemoryDetailALogParameters {
    public static final int $stable = 0;

    @C09CT("interval")
    public final long interval;

    @C09CT("javaDetail")
    public final boolean javaDetail;

    @C09CT("pssDetail")
    public final boolean pssDetail;

    public MemoryDetailALogParameters() {
        this(300000L, false, false);
    }

    public MemoryDetailALogParameters(long j, boolean z, boolean z2) {
        this.interval = j;
        this.javaDetail = z;
        this.pssDetail = z2;
    }
}
