package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class ProductRecommendResponse {

    @C09CT("code")
    public final Integer code;

    @C09CT("data")
    public final ProductRecommendData data;

    @C09CT("message")
    public final String message;

    public ProductRecommendResponse() {
        this(-1, null, null);
    }

    public ProductRecommendResponse(Integer num, String str, ProductRecommendData productRecommendData) {
        this.code = num;
        this.message = str;
        this.data = productRecommendData;
    }
}
