package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class ProductRecommendData {

    @C09CT("code")
    public Integer code;

    @C09CT("recommendation_module_map")
    public final Map<String, RecommendFeedData> feedMap;

    @C09CT("message")
    public final String message;

    public ProductRecommendData() {
        this(-1, null, null);
    }

    public ProductRecommendData(Integer num, String str, Map<String, RecommendFeedData> map) {
        this.code = num;
        this.message = str;
        this.feedMap = map;
    }
}
