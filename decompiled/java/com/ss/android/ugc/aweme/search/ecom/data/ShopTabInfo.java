package com.ss.android.ugc.aweme.search.ecom.data;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes36.dex */
public final class ShopTabInfo implements Serializable {

    @C09CT("selected_color")
    public final String selectedColor;

    @C09CT("shop_tab_type")
    public final int shopTabType;

    @C09CT("text")
    public final String text;

    @C09CT("unselected_color")
    public final String unselectedColor;

    public ShopTabInfo() {
        this(0, null, null, null);
    }

    public ShopTabInfo(int i, String str, String str2, String str3) {
        this.shopTabType = i;
        this.text = str;
        this.selectedColor = str2;
        this.unselectedColor = str3;
    }
}
