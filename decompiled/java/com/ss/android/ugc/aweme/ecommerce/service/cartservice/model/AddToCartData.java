package com.ss.android.ugc.aweme.ecommerce.service.cartservice.model;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.CartEntry;

/* JADX INFO: loaded from: classes2.dex */
public final class AddToCartData {

    @C09CT("cart_entry")
    public final CartEntry cartEntry;

    @C09CT("cart_item_id")
    public final String cartItemId;

    @C09CT("exception_ux")
    public final ExceptionUX exceptionUX;

    @C09CT("post_sku_count")
    public final Integer postSkuCount;

    @C09CT("pre_sku_count")
    public final Integer preSkuCount;

    @C09CT("raw_data")
    public final String rawDataStr;

    public AddToCartData(String str, ExceptionUX exceptionUX, CartEntry cartEntry, Integer num, Integer num2, String str2) {
        this.cartItemId = str;
        this.exceptionUX = exceptionUX;
        this.cartEntry = cartEntry;
        this.preSkuCount = num;
        this.postSkuCount = num2;
        this.rawDataStr = str2;
    }
}
