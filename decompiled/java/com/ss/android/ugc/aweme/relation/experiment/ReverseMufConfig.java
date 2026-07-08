package com.ss.android.ugc.aweme.relation.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class ReverseMufConfig {

    @C09CT("disable")
    public boolean[] disable;

    @C09CT("muf_upper_bound")
    public int[] mufUpperBounds;

    public ReverseMufConfig() {
        this(new boolean[]{false, false}, new int[]{20, 10000});
    }

    public ReverseMufConfig(boolean[] zArr, int[] iArr) {
        this.disable = zArr;
        this.mufUpperBounds = iArr;
    }
}
