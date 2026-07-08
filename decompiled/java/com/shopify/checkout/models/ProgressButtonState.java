package com.shopify.checkout.models;

import X.C08FF;

/* JADX INFO: loaded from: classes17.dex */
public enum ProgressButtonState {
    Loading("loading"),
    Disabled("disabled"),
    Enabled("enabled");

    public final String LL;

    public static ProgressButtonState valueOf(String str) {
        return (ProgressButtonState) C08FF.LIZ(ProgressButtonState.class, str);
    }

    public final String getValue() {
        return this.LL;
    }

    ProgressButtonState(String str) {
        this.LL = str;
    }
}
