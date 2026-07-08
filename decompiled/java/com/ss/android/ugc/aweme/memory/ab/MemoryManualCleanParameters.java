package com.ss.android.ugc.aweme.memory.ab;

import X.C09CT;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes4.dex */
public final class MemoryManualCleanParameters {
    public static final int $stable = 0;

    @C09CT("adjGC")
    public final boolean adjGC;

    @C09CT("adjGCBytes")
    public final long adjGCBytes;

    @C09CT("delayStop")
    public final long delayStop;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("softRef")
    public final boolean softRef;

    @C09CT("softRefBytes")
    public final long softRefBytes;

    public MemoryManualCleanParameters() {
        this(false, Mp4ScreenVideoLoadTimeout.CONTROL, false, 30000L, false, 30000L);
    }

    public MemoryManualCleanParameters(boolean z, long j, boolean z2, long j2, boolean z3, long j3) {
        this.enable = z;
        this.delayStop = j;
        this.softRef = z2;
        this.softRefBytes = j2;
        this.adjGC = z3;
        this.adjGCBytes = j3;
    }
}
