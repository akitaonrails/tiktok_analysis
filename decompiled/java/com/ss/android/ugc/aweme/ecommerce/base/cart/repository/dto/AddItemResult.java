package com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class AddItemResult {

    @C09CT("cart_item_id")
    public final String cartItemId;

    @C09CT("extra_info")
    public final AddItemExtra extra;

    @C09CT("post_sku_count")
    public final Integer postSkuCount;

    @C09CT("pre_sku_count")
    public final Integer preSkuCount;

    @C09CT("add_result_status")
    public final Integer result;

    @C09CT("sku_id")
    public final String skuId;

    public AddItemResult(String str, String str2, Integer num, Integer num2, Integer num3, AddItemExtra addItemExtra) {
        this.cartItemId = str;
        this.skuId = str2;
        this.preSkuCount = num;
        this.postSkuCount = num2;
        this.result = num3;
        this.extra = addItemExtra;
    }
}
