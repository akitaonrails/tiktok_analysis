package com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class TabItemBorder {

    @C09CT("border_width")
    public Float borderWidth;

    @C09CT("corner_radius")
    public Float cornerRadius;

    public TabItemBorder() {
        this(null, null);
    }

    public TabItemBorder(Float f, Float f2) {
        this.cornerRadius = f;
        this.borderWidth = f2;
    }
}
