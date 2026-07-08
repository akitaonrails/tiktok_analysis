package com.ss.android.ugc.aweme.memory;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class MemReliefParameters {

    @C09CT("openTrimMemory")
    public final boolean openTrimMemory;

    @C09CT("trimMemLevel")
    public final int[] trimMemLevel;

    public MemReliefParameters() {
        this(false, new int[0]);
    }

    public MemReliefParameters(boolean z, int[] iArr) {
        this.openTrimMemory = z;
        this.trimMemLevel = iArr;
    }
}
