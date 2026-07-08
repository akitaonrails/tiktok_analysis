package com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class TabIndicator {

    @C09CT("border")
    public TabItemBorder border;

    @C09CT("bottom")
    public Float bottom;

    @C09CT("dark")
    public ItemStyle dark;

    @C09CT("enable")
    public Integer enable;

    @C09CT("h_inset")
    public Float hInset;

    @C09CT("height")
    public Float height;

    @C09CT("light")
    public ItemStyle light;

    public TabIndicator() {
        this(null, null, null, null, null, null, null);
    }

    public TabIndicator(Integer num, Float f, Float f2, Float f3, TabItemBorder tabItemBorder, ItemStyle itemStyle, ItemStyle itemStyle2) {
        this.enable = num;
        this.height = f;
        this.hInset = f2;
        this.bottom = f3;
        this.border = tabItemBorder;
        this.light = itemStyle;
        this.dark = itemStyle2;
    }
}
