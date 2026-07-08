package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class AddItemToCartEvent {

    @C09CT("product_id")
    public final String productId;

    @C09CT("state")
    public final boolean state;

    public AddItemToCartEvent() {
        this(false, null);
    }

    public AddItemToCartEvent(boolean z, String str) {
        this.state = z;
        this.productId = str;
    }
}
