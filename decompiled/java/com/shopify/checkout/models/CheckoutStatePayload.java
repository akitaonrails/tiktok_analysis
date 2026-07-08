package com.shopify.checkout.models;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class CheckoutStatePayload {

    @C09CT("buyer")
    public final BuyerInfo buyer;

    @C09CT("cart")
    public final CartInfo cart;

    @C09CT("deliveries")
    public final List<Object> deliveries;

    @C09CT("flowType")
    public final String flowType;

    public CheckoutStatePayload(String str, CartInfo cartInfo, BuyerInfo buyerInfo, List<Object> list) {
        this.flowType = str;
        this.cart = cartInfo;
        this.buyer = buyerInfo;
        this.deliveries = list;
    }
}
