package com.ss.android.ugc.aweme.ecommerce.showcase.mix;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class TabBarStyle {

    @C09CT("container")
    public final TabBarContainerStyle container;

    @C09CT("img_item")
    public final TabBarImageItemStyle imgItem;

    @C09CT("text_item")
    public final TabBarTextItemStyle textItem;

    public TabBarStyle(TabBarContainerStyle tabBarContainerStyle, TabBarTextItemStyle tabBarTextItemStyle, TabBarImageItemStyle tabBarImageItemStyle) {
        this.container = tabBarContainerStyle;
        this.textItem = tabBarTextItemStyle;
        this.imgItem = tabBarImageItemStyle;
    }
}
