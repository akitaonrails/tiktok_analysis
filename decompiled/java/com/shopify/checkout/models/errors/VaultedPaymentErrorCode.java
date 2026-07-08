package com.shopify.checkout.models.errors;

import X.C08FF;

/* JADX INFO: loaded from: classes17.dex */
public enum VaultedPaymentErrorCode {
    InvalidSession("invalid_session"),
    InvalidPaymentInfo("invalid_payment_info");

    public final String LL;

    public static VaultedPaymentErrorCode valueOf(String str) {
        return (VaultedPaymentErrorCode) C08FF.LIZ(VaultedPaymentErrorCode.class, str);
    }

    public final String getValue() {
        return this.LL;
    }

    VaultedPaymentErrorCode(String str) {
        this.LL = str;
    }
}
