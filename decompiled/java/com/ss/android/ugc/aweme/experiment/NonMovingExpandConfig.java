package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class NonMovingExpandConfig {

    @C09CT("free")
    public int freeThreshold;

    @C09CT("gc")
    public int gcThreshold;

    public NonMovingExpandConfig() {
        this(0, 0);
    }

    public final void setFreeThreshold(int i) {
        this.freeThreshold = i;
    }

    public final void setGcThreshold(int i) {
        this.gcThreshold = i;
    }

    public NonMovingExpandConfig(int i, int i2) {
        this.freeThreshold = i;
        this.gcThreshold = i2;
    }
}
