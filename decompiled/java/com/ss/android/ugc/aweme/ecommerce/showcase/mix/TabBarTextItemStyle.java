package com.ss.android.ugc.aweme.ecommerce.showcase.mix;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class TabBarTextItemStyle {

    @C09CT("inset")
    public final Float[] inset;

    @C09CT("select")
    public final TabBarTextItemSelectStyle select;

    @C09CT("unselect")
    public final TabBarTextItemSelectStyle unselect;

    public TabBarTextItemStyle(Float[] fArr, TabBarTextItemSelectStyle tabBarTextItemSelectStyle, TabBarTextItemSelectStyle tabBarTextItemSelectStyle2) {
        this.inset = fArr;
        this.select = tabBarTextItemSelectStyle;
        this.unselect = tabBarTextItemSelectStyle2;
    }
}
