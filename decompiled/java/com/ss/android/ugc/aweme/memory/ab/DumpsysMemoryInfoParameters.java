package com.ss.android.ugc.aweme.memory.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes4.dex */
public final class DumpsysMemoryInfoParameters {
    public static final int $stable = 0;

    @C09CT("interval")
    public final long interval;

    @C09CT("sample")
    public final float sample;

    @C09CT("type")
    public final int type;

    public DumpsysMemoryInfoParameters() {
        this(7.0E-4f, 0, 300000L);
    }

    public DumpsysMemoryInfoParameters(float f, int i, long j) {
        this.sample = f;
        this.type = i;
        this.interval = j;
    }
}
