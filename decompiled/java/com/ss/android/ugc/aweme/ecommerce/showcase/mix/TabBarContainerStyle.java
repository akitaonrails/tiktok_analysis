package com.ss.android.ugc.aweme.ecommerce.showcase.mix;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class TabBarContainerStyle extends ColorStyle {

    @C09CT("bottom_line")
    public final TabBarCommonStyle bottomLine;

    @C09CT("height")
    public final Float height;

    @C09CT("indicator")
    public final TabBarCommonStyle indicator;

    @C09CT("inset")
    public final Float[] inset;

    @C09CT("layout_type")
    public final Integer layoutType;

    @C09CT("min_item_width")
    public final Float minItemWidth;

    public TabBarContainerStyle(Integer num, Float f, Float f2, Float[] fArr, TabBarCommonStyle tabBarCommonStyle, TabBarCommonStyle tabBarCommonStyle2) {
        super("", "");
        this.layoutType = num;
        this.minItemWidth = f;
        this.height = f2;
        this.inset = fArr;
        this.indicator = tabBarCommonStyle;
        this.bottomLine = tabBarCommonStyle2;
    }
}
