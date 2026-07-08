package com.ss.android.ugc.aweme.ecommerce.arch;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class SpaceInfo {

    @C09CT("item_gap_h")
    public final float colSpace;

    @C09CT("item_gap_v")
    public final float rowSpace;

    public SpaceInfo() {
        this(0.0f, 0.0f);
    }

    public SpaceInfo(float f, float f2) {
        this.rowSpace = f;
        this.colSpace = f2;
    }
}
