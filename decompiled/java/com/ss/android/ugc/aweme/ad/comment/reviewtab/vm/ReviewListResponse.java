package com.ss.android.ugc.aweme.ad.comment.reviewtab.vm;

import X.C09CT;
import X.C1844150y5d;
import com.ss.android.ugc.aweme.ad.comment.reviewtab.model.ConvertInfo;
import com.ss.android.ugc.aweme.ad.comment.reviewtab.model.Review;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class ReviewListResponse extends C1844150y5d {

    @C09CT("convert_info")
    public final ConvertInfo convertInfo;

    @C09CT("reviews")
    public final List<Review> reviewList;

    public ReviewListResponse() {
        this(null, null);
    }

    public final ConvertInfo getConvertInfo() {
        return this.convertInfo;
    }

    public final List<Review> getReviewList() {
        return this.reviewList;
    }

    public ReviewListResponse(List<Review> list, ConvertInfo convertInfo) {
        this.reviewList = list;
        this.convertInfo = convertInfo;
    }
}
