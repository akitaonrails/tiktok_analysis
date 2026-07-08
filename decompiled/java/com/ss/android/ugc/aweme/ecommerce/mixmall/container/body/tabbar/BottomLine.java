package com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class BottomLine {

    @C09CT("dark")
    public ItemStyle dark;

    @C09CT("enable")
    public Integer enable;

    @C09CT("height")
    public Float height;

    @C09CT("light")
    public ItemStyle light;

    public BottomLine() {
        this(null, null, null, null);
    }

    public BottomLine(Integer num, Float f, ItemStyle itemStyle, ItemStyle itemStyle2) {
        this.enable = num;
        this.height = f;
        this.light = itemStyle;
        this.dark = itemStyle2;
    }
}
