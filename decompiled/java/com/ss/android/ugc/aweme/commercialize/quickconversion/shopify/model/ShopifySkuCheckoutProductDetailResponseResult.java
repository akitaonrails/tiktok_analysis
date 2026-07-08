package com.ss.android.ugc.aweme.commercialize.quickconversion.shopify.model;

import X.C09CT;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ShopifySkuCheckoutProductDetailResponseResult implements Serializable {
    public static final int $stable = 8;

    @C09CT("content")
    public List<ShopifySkuCheckoutProductDetailResponseResultContent> content;

    @C09CT("isError")
    public Boolean isError;

    public ShopifySkuCheckoutProductDetailResponseResult() {
        this(Collections.emptyList(), Boolean.FALSE);
    }

    public final Boolean isError() {
        return this.isError;
    }

    public final void setContent(List<ShopifySkuCheckoutProductDetailResponseResultContent> list) {
        this.content = list;
    }

    public final void setError(Boolean bool) {
        this.isError = bool;
    }

    public ShopifySkuCheckoutProductDetailResponseResult(List<ShopifySkuCheckoutProductDetailResponseResultContent> list, Boolean bool) {
        this.content = list;
        this.isError = bool;
    }
}
