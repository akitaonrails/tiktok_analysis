package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class AddonUIConfig {

    @C09CT("addon_product_checkbox_type")
    public Integer checkBoxType;

    @C09CT("addon_product_link_type")
    public Integer linkType;

    @C09CT("display_selected_product_in_shop_group")
    public Boolean selectProductInShopGroup;

    @C09CT("show_separator_between_shop_order")
    public Boolean showSeparator;

    public AddonUIConfig() {
    }

    public AddonUIConfig(Boolean bool, Boolean bool2, Integer num, Integer num2) {
        this.selectProductInShopGroup = bool;
        this.showSeparator = bool2;
        this.linkType = num;
        this.checkBoxType = num2;
    }
}
