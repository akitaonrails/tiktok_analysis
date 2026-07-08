package com.shopify.checkout.models.errors.violations;

import X.C08FF;

/* JADX INFO: loaded from: classes17.dex */
public enum ViolationErrorType {
    Delivery("delivery"),
    Inventory("inventory");

    public final String LL;

    public static ViolationErrorType valueOf(String str) {
        return (ViolationErrorType) C08FF.LIZ(ViolationErrorType.class, str);
    }

    public final String getValue() {
        return this.LL;
    }

    ViolationErrorType(String str) {
        this.LL = str;
    }
}
