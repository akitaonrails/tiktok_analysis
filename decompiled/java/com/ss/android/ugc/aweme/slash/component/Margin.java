package com.ss.android.ugc.aweme.slash.component;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class Margin {

    @C09CT("bottom")
    public final Integer bottom;

    @C09CT("left")
    public final Integer left;

    @C09CT("right")
    public final Integer right;

    @C09CT("top")
    public final Integer top;

    public Margin() {
        this(null, null, null, null);
    }

    public Margin(Integer num, Integer num2, Integer num3, Integer num4) {
        this.left = num;
        this.right = num2;
        this.top = num3;
        this.bottom = num4;
    }
}
