package com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.style;

import X.C09CT;

/* JADX INFO: loaded from: classes31.dex */
public final class HeightInfo {

    @C09CT("estimated")
    public float estimatedHeight;

    @C09CT("fixed")
    public int fixHeight;

    public HeightInfo() {
        this(0, 0.0f);
    }

    public HeightInfo(int i, float f) {
        this.fixHeight = i;
        this.estimatedHeight = f;
    }
}
