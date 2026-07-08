package com.ss.android.ugc.aweme.setting;

import X.C09CT;

/* JADX INFO: loaded from: classes23.dex */
public final class ExpandRegionBean {

    @C09CT("bottom_expand")
    public final int bottomExpand;

    @C09CT("is_enable")
    public final boolean isEnable;

    @C09CT("left_expand")
    public final int leftExpand;

    @C09CT("right_expand")
    public final int rightExpand;

    @C09CT("top_expand")
    public final int topExpand;

    public ExpandRegionBean() {
        this(false, 0, 0, 0, 0);
    }

    public ExpandRegionBean(boolean z, int i, int i2, int i3, int i4) {
        this.isEnable = z;
        this.topExpand = i;
        this.bottomExpand = i2;
        this.leftExpand = i3;
        this.rightExpand = i4;
    }
}
