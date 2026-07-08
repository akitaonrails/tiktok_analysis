package com.ss.android.ugc.aweme.im.streak.impl.exp;

import X.C09CT;

/* JADX INFO: loaded from: classes3.dex */
public final class DMStreakWidgetDefaultOffsetConfig {

    @C09CT("bottom")
    public final int bottom;

    @C09CT("left")
    public final int left;

    @C09CT("right")
    public final int right;

    @C09CT("top")
    public final int top;

    public DMStreakWidgetDefaultOffsetConfig() {
        this(12, 4, -8, -8);
    }

    public DMStreakWidgetDefaultOffsetConfig(int i, int i2, int i3, int i4) {
        this.top = i;
        this.bottom = i2;
        this.left = i3;
        this.right = i4;
    }
}
