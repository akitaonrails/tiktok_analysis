package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class NativeMemDexReclaimPara {

    @C09CT("enable_when")
    public int enableWhen;

    @C09CT("munlock_in_bg")
    public boolean mUnlockInBg;

    @C09CT("mulock_memory_level")
    public int mUnlockMemoryLevel;

    @C09CT("mlock_max_kb")
    public int mlockMaxKb;

    @C09CT("mlock_memory_level")
    public int mlockMemoryLevel;

    @C09CT("mlock_percent")
    public int mlockPercent;

    @C09CT("reclaim_level")
    public int reclaimLevel;

    @C09CT("reclaim_percent")
    public int reclaimPercent;

    public NativeMemDexReclaimPara() {
        this(-1, -1, -1, -1, -1, -1, false, 0);
    }

    public final int getEnableWhen() {
        return this.enableWhen;
    }

    public final boolean getMUnlockInBg() {
        return this.mUnlockInBg;
    }

    public final int getMUnlockMemoryLevel() {
        return this.mUnlockMemoryLevel;
    }

    public final int getMlockMaxKb() {
        return this.mlockMaxKb;
    }

    public final int getMlockMemoryLevel() {
        return this.mlockMemoryLevel;
    }

    public final int getMlockPercent() {
        return this.mlockPercent;
    }

    public final int getReclaimLevel() {
        return this.reclaimLevel;
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

    public final void setMUnlockMemoryLevel(int i) {
        this.mUnlockMemoryLevel = i;
    }

    public final void setMlockMaxKb(int i) {
        this.mlockMaxKb = i;
    }

    public final void setMlockMemoryLevel(int i) {
        this.mlockMemoryLevel = i;
    }

    public final void setMlockPercent(int i) {
        this.mlockPercent = i;
    }

    public final void setReclaimLevel(int i) {
        this.reclaimLevel = i;
    }

    public final void setReclaimPercent(int i) {
        this.reclaimPercent = i;
    }

    public NativeMemDexReclaimPara(int i, int i2, int i3, int i4, int i5, int i6, boolean z, int i7) {
        this.enableWhen = i;
        this.mlockMemoryLevel = i2;
        this.mlockPercent = i3;
        this.mUnlockMemoryLevel = i4;
        this.reclaimLevel = i5;
        this.reclaimPercent = i6;
        this.mUnlockInBg = z;
        this.mlockMaxKb = i7;
    }
}
