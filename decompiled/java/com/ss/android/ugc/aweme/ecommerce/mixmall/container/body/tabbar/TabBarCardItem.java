package com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar;

import X.C09CT;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes.dex */
public final class TabBarCardItem {

    @C09CT("tabs_data")
    public List<TabItem> data;

    @C09CT("right_fixed_item_btm")
    public BTMModel rightFixedItemBTM;

    @C09CT("right_fixed_item_data")
    public RightFixedItemData rightFixedItemData;

    @C09CT("tabs_style")
    public TabStyle style;

    @C09CT("tabs_btm")
    public List<BTMModel> tabsBTM;

    public TabBarCardItem() {
        this(null, null, null, null, null);
    }

    public final FixedItemData LIZ() {
        String str;
        FixedItemAsset fixedItemAsset;
        RightFixedItemData rightFixedItemData = this.rightFixedItemData;
        FixedItemAsset fixedItemAsset2 = null;
        if (rightFixedItemData == null || (((str = rightFixedItemData.schema) == null || a0.LJJJIL(str)) && rightFixedItemData.icon == null)) {
            return null;
        }
        String str2 = rightFixedItemData.schema;
        RightFixedItemIconData rightFixedItemIconData = rightFixedItemData.icon;
        if (rightFixedItemIconData != null) {
            fixedItemAsset = rightFixedItemIconData.light;
            fixedItemAsset2 = rightFixedItemIconData.dark;
        } else {
            fixedItemAsset = null;
        }
        return new FixedItemData(str2, fixedItemAsset, fixedItemAsset2);
    }

    public TabBarCardItem(List<TabItem> list, TabStyle tabStyle, List<BTMModel> list2, RightFixedItemData rightFixedItemData, BTMModel bTMModel) {
        this.data = list;
        this.style = tabStyle;
        this.tabsBTM = list2;
        this.rightFixedItemData = rightFixedItemData;
        this.rightFixedItemBTM = bTMModel;
    }
}
