package com.ss.android.ugc.aweme.ad.comment.reviewtab.vm;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes28.dex */
public final class DeleteReviewRequest implements Serializable {

    @C09CT("comment_id")
    public final long id;

    @C09CT("user_id")
    public final long userId;

    public DeleteReviewRequest() {
        this(0L, 0L);
    }

    public final long getId() {
        return this.id;
    }

    public final long getUserId() {
        return this.userId;
    }

    public DeleteReviewRequest(long j, long j2) {
        this.id = j;
        this.userId = j2;
    }
}
