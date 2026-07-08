package com.ss.android.ugc.aweme.ecommerce.anchor.utils;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class OrderShopDigest {

    @C09CT("order_sku")
    public final List<OrderSKUDTO> orderSKUs;

    @C09CT("seller_id")
    public final String sellerId;

    public OrderShopDigest(String str, List<OrderSKUDTO> list) {
        this.sellerId = str;
        this.orderSKUs = list;
    }
}
