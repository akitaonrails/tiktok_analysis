package com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.model;

import X.C09CT;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchReviewAggregationHorizontalLoadMoreResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("aggregation_pros_cons")
    public final Map<String, Object> aggregationProsCons;

    @C09CT("cursor")
    public final Integer cursor;

    @C09CT("has_more")
    public final Integer hasMore;

    @C09CT("review_aggregation")
    public final Map<String, Object> reviewAggregation;

    @C09CT("status_code")
    public final Integer statusCode;

    public SearchReviewAggregationHorizontalLoadMoreResponse() {
        this(null, null, null, null, null);
    }

    public SearchReviewAggregationHorizontalLoadMoreResponse(Integer num, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Integer num2, Integer num3) {
        this.statusCode = num;
        this.reviewAggregation = map;
        this.aggregationProsCons = map2;
        this.cursor = num2;
        this.hasMore = num3;
    }
}
