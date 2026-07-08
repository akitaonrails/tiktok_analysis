package com.ss.android.ugc.aweme.ecommerce.arch;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class Inset {

    @C09CT("margin_bottom")
    public final float marginBottom;

    @C09CT("margin_left")
    public final float marginLeft;

    @C09CT("margin_right")
    public final float marginRight;

    @C09CT("margin_top")
    public final float marginTop;

    public Inset() {
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public Inset(float f, float f2, float f3, float f4) {
        this.marginTop = f;
        this.marginLeft = f2;
        this.marginBottom = f3;
        this.marginRight = f4;
    }
}
