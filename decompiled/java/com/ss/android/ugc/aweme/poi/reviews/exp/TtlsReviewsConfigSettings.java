package com.ss.android.ugc.aweme.poi.reviews.exp;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class TtlsReviewsConfigSettings {
    public static final TtlsReviewsConfigModel LIZ = new TtlsReviewsConfigModel(3);

    public static final class TtlsReviewsConfigModel {

        @C09CT("poi_detail_reviews_num_limit")
        public final int poiDetailReviewsLimit;

        public TtlsReviewsConfigModel(int i) {
            this.poiDetailReviewsLimit = i;
        }
    }
}
