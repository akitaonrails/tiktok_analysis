package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.comment.model.Comment;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinFirstlyCommentListResponse implements Serializable {

    @C09CT("comments")
    public final List<Comment> comments;

    @C09CT("cursor")
    public final Integer cursor;

    @C09CT("fold_comment_cursor")
    public final Integer foldCommentCursor;

    @C09CT("has_fold_comment")
    public final Boolean hasFoldComment;

    @C09CT("has_more")
    public final Boolean hasMore;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("total")
    public final Integer total;

    public BulletinFirstlyCommentListResponse() {
        this(null, null, null, null, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BulletinFirstlyCommentListResponse(List<? extends Comment> list, Integer num, Boolean bool, Integer num2, Boolean bool2, Integer num3, Integer num4) {
        this.comments = list;
        this.cursor = num;
        this.hasMore = bool;
        this.total = num2;
        this.hasFoldComment = bool2;
        this.foldCommentCursor = num3;
        this.statusCode = num4;
    }
}
