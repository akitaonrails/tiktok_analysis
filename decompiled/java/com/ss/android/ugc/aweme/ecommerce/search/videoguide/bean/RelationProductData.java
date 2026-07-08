package com.ss.android.ugc.aweme.ecommerce.search.videoguide.bean;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class RelationProductData {

    @C09CT("product_id")
    public final String productId;

    @C09CT("video_timestamp")
    public final Integer videoTimestamp;

    public RelationProductData() {
        this(null, null);
    }

    public RelationProductData(String str, Integer num) {
        this.productId = str;
        this.videoTimestamp = num;
    }
}
