package com.ss.android.ugc.aweme.commercialize.quickconversion.shopify.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class ShopifySkuCheckoutProductDetailResponseResultError implements Serializable {
    public static final int $stable = 8;

    @C09CT("code")
    public Long code;

    @C09CT("data")
    public String data;

    @C09CT("message")
    public String message;

    public ShopifySkuCheckoutProductDetailResponseResultError() {
        this(0L, "", "");
    }

    public final void setCode(Long l) {
        this.code = l;
    }

    public final void setData(String str) {
        this.data = str;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public ShopifySkuCheckoutProductDetailResponseResultError(Long l, String str, String str2) {
        this.code = l;
        this.message = str;
        this.data = str2;
    }
}
