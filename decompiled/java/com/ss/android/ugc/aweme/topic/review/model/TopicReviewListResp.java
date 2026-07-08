package com.ss.android.ugc.aweme.topic.review.model;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
public final class TopicReviewListResp {

    @C09CT("cursor")
    public final long cursor;

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("review_list")
    public final List<TopicReview> reviewList;

    public TopicReviewListResp() {
        this(null, 0L, false, 7, null);
    }

    public TopicReviewListResp(List<TopicReview> list, long j, boolean z) {
        this.reviewList = list;
        this.cursor = j;
        this.hasMore = z;
    }

    public TopicReviewListResp(List list, long j, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? false : z);
    }
}
