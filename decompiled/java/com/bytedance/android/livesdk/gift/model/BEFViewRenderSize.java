package com.bytedance.android.livesdk.gift.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class BEFViewRenderSize {

    @C09CT("h")
    public int height;

    @C09CT("w")
    public int with;

    public BEFViewRenderSize() {
        this(0, 0);
    }

    public BEFViewRenderSize(int i, int i2) {
        this.with = i;
        this.height = i2;
    }
}
