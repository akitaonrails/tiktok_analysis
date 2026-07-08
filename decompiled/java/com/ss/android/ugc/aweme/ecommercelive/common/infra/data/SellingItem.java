package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;

/* JADX INFO: loaded from: classes7.dex */
public final class SellingItem {

    @C09CT("da_info")
    public final DaInfo daInfo;

    @C09CT("icon")
    public final com.ss.android.ugc.aweme.ecommerce.richtext.dto.Icon icon;

    @C09CT("opt_show_text")
    public final String optShowText;

    @C09CT("selling_item_type")
    public final int sellingItemType;

    @C09CT("show_text")
    public final String showText;

    public SellingItem() {
        this(null, 0, null, null, null);
    }

    public SellingItem(String str, int i, DaInfo daInfo, String str2, com.ss.android.ugc.aweme.ecommerce.richtext.dto.Icon icon) {
        this.showText = str;
        this.sellingItemType = i;
        this.daInfo = daInfo;
        this.optShowText = str2;
        this.icon = icon;
    }
}
