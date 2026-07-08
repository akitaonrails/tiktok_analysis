package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes4.dex */
public final class MemSimdConfig {

    @C09CT("blockSoList")
    public String[] blockSoList;

    @C09CT("onlyUnalign")
    public boolean onlyUnalign;

    @C09CT("sizeLeft")
    public long sizeLeft;

    @C09CT("type")
    public int type;

    @C09CT("whiteSoList")
    public String[] whiteSoList;

    public MemSimdConfig() {
        this(-1, null, null, -1L, false);
    }

    public final void setBlockSoList(String[] strArr) {
        this.blockSoList = strArr;
    }

    public final void setOnlyUnalign(boolean z) {
        this.onlyUnalign = z;
    }

    public final void setSizeLeft(long j) {
        this.sizeLeft = j;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setWhiteSoList(String[] strArr) {
        this.whiteSoList = strArr;
    }

    public MemSimdConfig(int i, String[] strArr, String[] strArr2, long j, boolean z) {
        this.type = i;
        this.blockSoList = strArr;
        this.whiteSoList = strArr2;
        this.sizeLeft = j;
        this.onlyUnalign = z;
    }
}
