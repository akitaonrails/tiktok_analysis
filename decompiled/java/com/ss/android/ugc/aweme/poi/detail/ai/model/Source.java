package com.ss.android.ugc.aweme.poi.detail.ai.model;

import X.C09CT;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class Source implements Serializable {

    @C09CT("aweme_id")
    public final String awemeId;

    @C09CT("bottom_desc")
    public final String bottomDesc;

    @C09CT("review")
    public final PoiReviewsApi.PoiReviewModel review;

    @C09CT("review_image_index")
    public final Integer reviewImageIndex;

    @C09CT("source_type")
    public final Integer sourceType;

    @C09CT("start_frame")
    public final String startFrame;

    @C09CT("start_ms")
    public final Long startMs;

    public Source() {
        this(null, null, null, null, null, null, null);
    }

    public Source(String str, String str2, PoiReviewsApi.PoiReviewModel poiReviewModel, Integer num, Integer num2, String str3, Long l) {
        this.awemeId = str;
        this.bottomDesc = str2;
        this.review = poiReviewModel;
        this.reviewImageIndex = num;
        this.sourceType = num2;
        this.startFrame = str3;
        this.startMs = l;
    }
}
