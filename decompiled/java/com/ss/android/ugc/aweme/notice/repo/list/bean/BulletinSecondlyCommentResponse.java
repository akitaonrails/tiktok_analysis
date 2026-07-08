package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.comment.model.Comment;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinSecondlyCommentResponse implements Serializable {

    @C09CT("comments")
    public final List<Comment> comments;

    @C09CT("cursor")
    public final Integer cursor;

    @C09CT("has_more")
    public final Boolean hasMore;

    @C09CT("status_code")
    public final Integer statusCode;

    public BulletinSecondlyCommentResponse() {
        this(null, -1, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BulletinSecondlyCommentResponse(List<? extends Comment> list, Integer num, Integer num2, Boolean bool) {
        this.comments = list;
        this.statusCode = num;
        this.cursor = num2;
        this.hasMore = bool;
    }
}
