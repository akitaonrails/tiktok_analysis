package com.ss.android.ugc.aweme.ad.comment.reviewtab.vm;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public final class DiggReviewRequest implements Serializable {

    @C09CT("action_type")
    public final int actionType;

    @C09CT("comment_group_id")
    public final long groupId;

    @C09CT("comment_id")
    public final long id;

    @C09CT("user_id")
    public final long userId;

    public DiggReviewRequest() {
        this(0L, 0L, 0L, 1);
    }

    public final int getActionType() {
        return this.actionType;
    }

    public final long getGroupId() {
        return this.groupId;
    }

    public final long getId() {
        return this.id;
    }

    public final long getUserId() {
        return this.userId;
    }

    public DiggReviewRequest(long j, long j2, long j3, int i) {
        this.id = j;
        this.groupId = j2;
        this.userId = j3;
        this.actionType = i;
    }
}
