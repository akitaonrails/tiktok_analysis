package com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class TabStyle {

    @C09CT("container")
    public ContainerStyle container;

    @C09CT("fixed_item")
    public FixedItemStyle fixedItem;

    @C09CT("fixed_onboarding_item")
    public FixedItemOnboardingStyle fixedOnboardingItem;

    @C09CT("img_item")
    public TabItemStyle imgItem;

    @C09CT("tab_switch_mode")
    public Integer tabSwitchMode;

    @C09CT("text_item")
    public TabItemStyle textItem;

    public TabStyle() {
        this(null, null, null, null, null, 2);
    }

    public TabStyle(ContainerStyle containerStyle, TabItemStyle tabItemStyle, TabItemStyle tabItemStyle2, FixedItemStyle fixedItemStyle, FixedItemOnboardingStyle fixedItemOnboardingStyle, Integer num) {
        this.container = containerStyle;
        this.textItem = tabItemStyle;
        this.imgItem = tabItemStyle2;
        this.fixedItem = fixedItemStyle;
        this.fixedOnboardingItem = fixedItemOnboardingStyle;
        this.tabSwitchMode = num;
    }
}
