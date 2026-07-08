package com.shopify.checkout.models;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class BuyerInfo {

    @C09CT("acceptsMarketing")
    public final boolean acceptsMarketing;

    @C09CT("email")
    public final String email;

    @C09CT("selectedPaymentMethod")
    public final PaymentMethod selectedPaymentMethod;

    @C09CT("selectedShippingAddress")
    public final Address selectedShippingAddress;

    public BuyerInfo() {
        this(null, false, null, null);
    }

    public BuyerInfo(String str, boolean z, PaymentMethod paymentMethod, Address address) {
        this.email = str;
        this.acceptsMarketing = z;
        this.selectedPaymentMethod = paymentMethod;
        this.selectedShippingAddress = address;
    }
}
