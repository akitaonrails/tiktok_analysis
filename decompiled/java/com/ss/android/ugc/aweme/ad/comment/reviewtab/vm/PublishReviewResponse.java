package com.ss.android.ugc.aweme.ad.comment.reviewtab.vm;

import X.C09CT;
import X.C1844150y5d;

/* JADX INFO: loaded from: classes28.dex */
public final class PublishReviewResponse extends C1844150y5d {

    @C09CT("country")
    public final String country;

    @C09CT("comment_group_id")
    public final long groupId;

    @C09CT("comment_id")
    public final long id;

    public PublishReviewResponse() {
        this(0L, 0L, null);
    }

    public final String getCountry() {
        return this.country;
    }

    public final long getGroupId() {
        return this.groupId;
    }

    public final long getId() {
        return this.id;
    }

    public PublishReviewResponse(long j, long j2, String str) {
        this.id = j;
        this.groupId = j2;
        this.country = str;
    }
}
