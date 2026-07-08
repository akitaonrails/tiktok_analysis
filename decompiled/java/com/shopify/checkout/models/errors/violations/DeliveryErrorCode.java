package com.shopify.checkout.models.errors.violations;

import X.C08FF;

/* JADX INFO: loaded from: classes18.dex */
public enum DeliveryErrorCode {
    UnshippableProduct("unshippable_product");

    public final String LL;

    public static DeliveryErrorCode valueOf(String str) {
        return (DeliveryErrorCode) C08FF.LIZ(DeliveryErrorCode.class, str);
    }

    public final String getValue() {
        return this.LL;
    }

    DeliveryErrorCode(String str) {
        this.LL = str;
    }
}
