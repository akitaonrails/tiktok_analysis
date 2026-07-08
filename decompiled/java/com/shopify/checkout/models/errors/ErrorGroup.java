package com.shopify.checkout.models.errors;

import X.C08FF;

/* JADX INFO: loaded from: classes17.dex */
public enum ErrorGroup {
    VIOLATION("violation"),
    CHECKOUT("checkout"),
    INTERNAL("internal"),
    VAULTED_PAYMENT("vaulted_payment"),
    DEFAULTS("defaults"),
    UNRECOVERABLE("unrecoverable");

    public final String LL;

    public static ErrorGroup valueOf(String str) {
        return (ErrorGroup) C08FF.LIZ(ErrorGroup.class, str);
    }

    public final String getValue() {
        return this.LL;
    }

    ErrorGroup(String str) {
        this.LL = str;
    }
}
