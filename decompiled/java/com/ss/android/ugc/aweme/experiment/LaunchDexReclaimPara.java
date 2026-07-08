package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class LaunchDexReclaimPara {

    @C09CT("enable_when")
    public int enableWhen;

    @C09CT("munlock_in_bg")
    public boolean mUnlockInBg;

    @C09CT("mlock_max_kb")
    public int mlockMaxKb;

    @C09CT("mlock_percent")
    public int mlockPercent;

    @C09CT("reclaim_percent")
    public int reclaimPercent;

    public LaunchDexReclaimPara() {
        this(-1, -1, -1, false, 0);
    }

    public final int getEnableWhen() {
        return this.enableWhen;
    }

    public final boolean getMUnlockInBg() {
        return this.mUnlockInBg;
    }

    public final int getMlockMaxKb() {
        return this.mlockMaxKb;
    }

    public final int getMlockPercent() {
        return this.mlockPercent;
    }

    public final int getReclaimPercent() {
        return this.reclaimPercent;
    }

    public final void setEnableWhen(int i) {
        this.enableWhen = i;
    }

    public final void setMUnlockInBg(boolean z) {
        this.mUnlockInBg = z;
    }

    public final void setMlockMaxKb(int i) {
        this.mlockMaxKb = i;
    }

    public final void setMlockPercent(int i) {
        this.mlockPercent = i;
    }

    public final void setReclaimPercent(int i) {
        this.reclaimPercent = i;
    }

    public LaunchDexReclaimPara(int i, int i2, int i3, boolean z, int i4) {
        this.enableWhen = i;
        this.reclaimPercent = i2;
        this.mlockPercent = i3;
        this.mUnlockInBg = z;
        this.mlockMaxKb = i4;
    }
}
