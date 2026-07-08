package com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class TabItemSelect {

    @C09CT("border")
    public TabItemBorder border;

    @C09CT("dark")
    public ItemStyle dark;

    @C09CT("light")
    public ItemStyle light;

    public TabItemSelect() {
        this(null, null, null);
    }

    public TabItemSelect(TabItemBorder tabItemBorder, ItemStyle itemStyle, ItemStyle itemStyle2) {
        this.border = tabItemBorder;
        this.light = itemStyle;
        this.dark = itemStyle2;
    }
}
