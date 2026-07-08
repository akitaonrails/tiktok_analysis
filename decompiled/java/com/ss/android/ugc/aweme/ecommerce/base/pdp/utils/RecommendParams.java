package com.ss.android.ugc.aweme.ecommerce.base.pdp.utils;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class RecommendParams {

    @C09CT("related_gid_info")
    public final RelatedGidInfo relatedGidInfo;

    @C09CT("similar_prod_info")
    public final SimilarProdInfo similarProductInfo;

    public RecommendParams(RelatedGidInfo relatedGidInfo, SimilarProdInfo similarProdInfo) {
        this.relatedGidInfo = relatedGidInfo;
        this.similarProductInfo = similarProdInfo;
    }
}
