package com.ss.android.ugc.aweme.commercialize.quickconversion.api.shopify.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public final class ShopifySkuCheckoutProductOption implements Serializable {

    @C09CT("name")
    public final String name;

    @C09CT("values")
    public final List<String> values;

    public final String getName() {
        return this.name;
    }

    public final List<String> getValues() {
        return this.values;
    }

    public ShopifySkuCheckoutProductOption(String str, List<String> list) {
        this.name = str;
        this.values = list;
    }
}
