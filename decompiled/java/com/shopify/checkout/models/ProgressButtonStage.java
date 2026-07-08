package com.shopify.checkout.models;

import X.C08FF;

/* JADX INFO: loaded from: classes17.dex */
public enum ProgressButtonStage {
    Review("review"),
    Pay("pay");

    public final String LL;

    public static ProgressButtonStage valueOf(String str) {
        return (ProgressButtonStage) C08FF.LIZ(ProgressButtonStage.class, str);
    }

    public final String getValue() {
        return this.LL;
    }

    ProgressButtonStage(String str) {
        this.LL = str;
    }
}
