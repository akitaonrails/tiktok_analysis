package com.ss.android.ugc.aweme.poi;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiAwemeReviewSummary implements Serializable {

    @C09CT("max_score")
    public final Double maxScore;

    @C09CT("no_rating")
    public final Boolean noRating;

    @C09CT("score")
    public final Double score;

    @C09CT("total_count")
    public final Integer totalCount;

    public PoiAwemeReviewSummary() {
        this(null, null, null, null);
    }

    public PoiAwemeReviewSummary(Integer num, Double d, Double d2, Boolean bool) {
        this.totalCount = num;
        this.score = d;
        this.maxScore = d2;
        this.noRating = bool;
    }
}
