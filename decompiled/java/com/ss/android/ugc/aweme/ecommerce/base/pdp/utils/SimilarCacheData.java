package com.ss.android.ugc.aweme.ecommerce.base.pdp.utils;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPrice;

/* JADX INFO: loaded from: classes27.dex */
public final class SimilarCacheData {

    @C09CT("cache_key")
    public final String cacheKey;

    @C09CT("price")
    public final ProductPrice price;

    @C09CT("recommend_params")
    public final RecommendParams recommendParams;

    public SimilarCacheData(String str, RecommendParams recommendParams, ProductPrice productPrice) {
        this.cacheKey = str;
        this.recommendParams = recommendParams;
        this.price = productPrice;
    }
}
