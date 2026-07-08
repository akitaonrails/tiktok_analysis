package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class OrderShopDigestV2 {

    @C09CT("delivery_option")
    public final Integer deliveryOption;

    @C09CT("order_sku")
    public final List<OrderSKUDTOV2> orderSKUs;

    @C09CT("seller_id")
    public final String sellerId;

    public OrderShopDigestV2(String str, List<OrderSKUDTOV2> list, Integer num) {
        this.sellerId = str;
        this.orderSKUs = list;
        this.deliveryOption = num;
    }
}
