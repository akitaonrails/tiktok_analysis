package com.shopify.checkout.models.errors;

import X.C08FF;

/* JADX INFO: loaded from: classes17.dex */
public enum UnrecoverableErrorCode {
    SdkNotEnabled("sdk_not_enabled"),
    InvalidCheckoutUrl("invalid_checkout_url");

    public final String LL;

    public static UnrecoverableErrorCode valueOf(String str) {
        return (UnrecoverableErrorCode) C08FF.LIZ(UnrecoverableErrorCode.class, str);
    }

    public final String getValue() {
        return this.LL;
    }

    UnrecoverableErrorCode(String str) {
        this.LL = str;
    }
}
