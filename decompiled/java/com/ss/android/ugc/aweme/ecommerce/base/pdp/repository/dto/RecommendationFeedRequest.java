package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class RecommendationFeedRequest {

    @C09CT("passthrough_map")
    public final Map<String, String> passThroughMap;

    @C09CT("product_id")
    public final String productId;

    @C09CT("scenes")
    public final List<String> scenes;

    public RecommendationFeedRequest(String str, List<String> list, Map<String, String> map) {
        this.productId = str;
        this.scenes = list;
        this.passThroughMap = map;
    }
}
