package com.shopify.checkout.models;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class CheckoutCompletedPayload {

    @C09CT("cart")
    public final CartInfo cart;

    @C09CT("confirmationURL")
    public final String confirmationURL;

    @C09CT("flowType")
    public final String flowType;

    @C09CT("orderDetails")
    public final OrderDetails orderDetails;

    @C09CT("orderId")
    public final String orderId;

    @C09CT("thankYouPageUrl")
    public final String thankYouPageUrl;

    public CheckoutCompletedPayload(String str, OrderDetails orderDetails, String str2, String str3, CartInfo cartInfo, String str4) {
        this.flowType = str;
        this.orderDetails = orderDetails;
        this.confirmationURL = str2;
        this.orderId = str3;
        this.cart = cartInfo;
        this.thankYouPageUrl = str4;
    }
}
