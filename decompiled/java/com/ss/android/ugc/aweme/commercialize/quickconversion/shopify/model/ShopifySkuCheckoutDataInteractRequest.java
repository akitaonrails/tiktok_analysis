package com.ss.android.ugc.aweme.commercialize.quickconversion.shopify.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class ShopifySkuCheckoutDataInteractRequest implements Serializable {
    public static final int $stable = 0;

    @C09CT("data")
    public final String data;

    @C09CT("extra")
    public final String extra;

    @C09CT("type")
    public final String type;

    public ShopifySkuCheckoutDataInteractRequest() {
        this(null, null, null);
    }

    public ShopifySkuCheckoutDataInteractRequest(String str, String str2, String str3) {
        this.type = str;
        this.data = str2;
        this.extra = str3;
    }
}
