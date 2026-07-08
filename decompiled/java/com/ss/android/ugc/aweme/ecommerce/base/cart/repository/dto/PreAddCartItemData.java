package com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class PreAddCartItemData {

    @C09CT("cart_item_data")
    public final AddItemToCartRequest addCartItemReqData;

    @C09CT("pass_through_params")
    public final String passThroughParams;

    public PreAddCartItemData(AddItemToCartRequest addItemToCartRequest, String str) {
        this.addCartItemReqData = addItemToCartRequest;
        this.passThroughParams = str;
    }
}
