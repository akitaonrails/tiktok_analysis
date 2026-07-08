package com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.model;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchReviewAggregationLoadMoreResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("cursor")
    public final Integer cursor;

    @C09CT("has_more")
    public final Integer hasMore;
    public final C01GW items$delegate;

    @C09CT("items")
    public final List<Map<?, ?>> itemsRawData;

    @C09CT("status_code")
    public final Integer statusCode;

    public SearchReviewAggregationLoadMoreResponse() {
        this(null, null, null, null);
    }

    public final List<Map<?, ?>> getItems() {
        return (List) this.items$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchReviewAggregationLoadMoreResponse(Integer num, Integer num2, List<? extends Map<?, ?>> list, Integer num3) {
        this.statusCode = num;
        this.cursor = num2;
        this.itemsRawData = list;
        this.hasMore = num3;
        this.items$delegate = C452501pT.LIZIZ(new AwS546S0100000_2(this, 785));
    }
}
