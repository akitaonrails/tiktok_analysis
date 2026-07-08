package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class SoftReferenceLruConfig {

    @C09CT("lru_soft_epoch")
    public int lruSoftEpoch;

    @C09CT("lru_soft_interval")
    public int lruSoftInterval;

    public SoftReferenceLruConfig() {
        this(0, 0);
    }

    public final void setLruSoftEpoch(int i) {
        this.lruSoftEpoch = i;
    }

    public final void setLruSoftInterval(int i) {
        this.lruSoftInterval = i;
    }

    public SoftReferenceLruConfig(int i, int i2) {
        this.lruSoftInterval = i;
        this.lruSoftEpoch = i2;
    }
}
