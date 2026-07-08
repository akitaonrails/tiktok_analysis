package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class WhenAnrDexReclaimPara {

    @C09CT("anr_level")
    public int anrLevel;

    @C09CT("enable")
    public boolean enable;

    @C09CT("mlock_percent")
    public int mLockPercent;

    @C09CT("munlock_anr_level")
    public int mULockAnrLevel;

    @C09CT("munlock_in_bg")
    public boolean mUnlockInBg;

    @C09CT("mlock_max_kb")
    public int mlockMaxKb;

    @C09CT("reclaim_percent")
    public int reclaimPercent;

    public WhenAnrDexReclaimPara() {
        this(false, -1, -1, -1, -1, false, 0);
    }

    public final int getAnrLevel() {
        return this.anrLevel;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final int getMLockPercent() {
        return this.mLockPercent;
    }

    public final int getMULockAnrLevel() {
        return this.mULockAnrLevel;
    }

    public final boolean getMUnlockInBg() {
        return this.mUnlockInBg;
    }

    public final int getMlockMaxKb() {
        return this.mlockMaxKb;
    }

    public final int getReclaimPercent() {
        return this.reclaimPercent;
    }

    public final void setAnrLevel(int i) {
        this.anrLevel = i;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void setMLockPercent(int i) {
        this.mLockPercent = i;
    }

    public final void setMULockAnrLevel(int i) {
        this.mULockAnrLevel = i;
    }

    public final void setMUnlockInBg(boolean z) {
        this.mUnlockInBg = z;
    }

    public final void setMlockMaxKb(int i) {
        this.mlockMaxKb = i;
    }

    public final void setReclaimPercent(int i) {
        this.reclaimPercent = i;
    }

    public WhenAnrDexReclaimPara(boolean z, int i, int i2, int i3, int i4, boolean z2, int i5) {
        this.enable = z;
        this.anrLevel = i;
        this.reclaimPercent = i2;
        this.mLockPercent = i3;
        this.mULockAnrLevel = i4;
        this.mUnlockInBg = z2;
        this.mlockMaxKb = i5;
    }
}
