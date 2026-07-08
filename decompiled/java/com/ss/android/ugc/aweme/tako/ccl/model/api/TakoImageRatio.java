package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoImageRatio {

    @C09CT("height")
    public final int height;

    @C09CT("width")
    public final int width;

    public TakoImageRatio() {
        this(900, 1600);
    }

    public TakoImageRatio(int i, int i2) {
        this.width = i;
        this.height = i2;
    }
}
