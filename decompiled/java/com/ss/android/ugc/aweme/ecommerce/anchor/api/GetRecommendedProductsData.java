package com.ss.android.ugc.aweme.ecommerce.anchor.api;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class GetRecommendedProductsData {

    @C09CT("event_tracking")
    public final EventTrackData eventTrack;

    @C09CT("products")
    public final List<RecommendedProductData> products;

    public GetRecommendedProductsData() {
        this(null, null);
    }

    public GetRecommendedProductsData(List<RecommendedProductData> list, EventTrackData eventTrackData) {
        this.products = list;
        this.eventTrack = eventTrackData;
    }
}
