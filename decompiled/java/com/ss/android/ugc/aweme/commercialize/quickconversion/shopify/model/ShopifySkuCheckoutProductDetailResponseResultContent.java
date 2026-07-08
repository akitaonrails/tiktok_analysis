package com.ss.android.ugc.aweme.commercialize.quickconversion.shopify.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class ShopifySkuCheckoutProductDetailResponseResultContent implements Serializable {
    public static final int $stable = 8;

    @C09CT("text")
    public String text;

    @C09CT("type")
    public String type;

    public ShopifySkuCheckoutProductDetailResponseResultContent() {
        this("", "");
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public ShopifySkuCheckoutProductDetailResponseResultContent(String str, String str2) {
        this.type = str;
        this.text = str2;
    }
}
