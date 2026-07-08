package com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.CartEntry;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class BundleAddItemsToCartData {

    @C09CT("madd_item_results")
    public final List<AddItemResult> addItemResults;

    @C09CT("cart_entry")
    public final CartEntry cartEntry;

    @C09CT("exception_ux")
    public final ExceptionUX exceptionUX;

    public BundleAddItemsToCartData(ExceptionUX exceptionUX, CartEntry cartEntry, List<AddItemResult> list) {
        this.exceptionUX = exceptionUX;
        this.cartEntry = cartEntry;
        this.addItemResults = list;
    }
}
