package com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class ContainerStyle {

    @C09CT("border")
    public TabItemBorder border;

    @C09CT("bottom_line")
    public BottomLine bottomLine;

    @C09CT("dark")
    public ItemStyle dark;

    @C09CT("height")
    public Float height;

    @C09CT("indicator")
    public TabIndicator indicator;

    @C09CT("inset")
    public List<Float> inset;

    @C09CT("item_h_gap")
    public Float itemHGap;

    @C09CT("light")
    public ItemStyle light;

    public ContainerStyle() {
        this(null, null, null, null, null, null, null, null);
    }

    public ContainerStyle(Float f, List<Float> list, Float f2, TabItemBorder tabItemBorder, TabIndicator tabIndicator, BottomLine bottomLine, ItemStyle itemStyle, ItemStyle itemStyle2) {
        this.height = f;
        this.inset = list;
        this.itemHGap = f2;
        this.border = tabItemBorder;
        this.indicator = tabIndicator;
        this.bottomLine = bottomLine;
        this.light = itemStyle;
        this.dark = itemStyle2;
    }
}
