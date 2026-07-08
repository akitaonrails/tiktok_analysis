package com.ss.android.ugc.aweme.commercialize.quickconversion.shopify.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class ShopifySkuCheckoutProductDetailResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("error")
    public ShopifySkuCheckoutProductDetailResponseResultError error;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public Integer id;

    @C09CT("jsonrpc")
    public String jsonrpc;

    @C09CT("result")
    public ShopifySkuCheckoutProductDetailResponseResult result;

    public ShopifySkuCheckoutProductDetailResponse() {
        this("", 1, null, null);
    }

    public final void setError(ShopifySkuCheckoutProductDetailResponseResultError shopifySkuCheckoutProductDetailResponseResultError) {
        this.error = shopifySkuCheckoutProductDetailResponseResultError;
    }

    public final void setId(Integer num) {
        this.id = num;
    }

    public final void setJsonrpc(String str) {
        this.jsonrpc = str;
    }

    public final void setResult(ShopifySkuCheckoutProductDetailResponseResult shopifySkuCheckoutProductDetailResponseResult) {
        this.result = shopifySkuCheckoutProductDetailResponseResult;
    }

    public ShopifySkuCheckoutProductDetailResponse(String str, Integer num, ShopifySkuCheckoutProductDetailResponseResult shopifySkuCheckoutProductDetailResponseResult, ShopifySkuCheckoutProductDetailResponseResultError shopifySkuCheckoutProductDetailResponseResultError) {
        this.jsonrpc = str;
        this.id = num;
        this.result = shopifySkuCheckoutProductDetailResponseResult;
        this.error = shopifySkuCheckoutProductDetailResponseResultError;
    }
}
