package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class PrePageFaultConfig {

    @C09CT("dex_mlock_percent")
    public int dexMlockPercent;

    @C09CT("dex_munlock_in_bg")
    public boolean dexMunlockInBg;

    @C09CT("dex_reclaim_percent")
    public int dexReclaimPercent;

    public PrePageFaultConfig() {
        this(0, 0, false);
    }

    public final void setDexMlockPercent(int i) {
        this.dexMlockPercent = i;
    }

    public final void setDexMunlockInBg(boolean z) {
        this.dexMunlockInBg = z;
    }

    public final void setDexReclaimPercent(int i) {
        this.dexReclaimPercent = i;
    }

    public PrePageFaultConfig(int i, int i2, boolean z) {
        this.dexReclaimPercent = i;
        this.dexMlockPercent = i2;
        this.dexMunlockInBg = z;
    }
}
