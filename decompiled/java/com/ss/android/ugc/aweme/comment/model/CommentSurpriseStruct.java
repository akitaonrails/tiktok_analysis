package com.ss.android.ugc.aweme.comment.model;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentSurpriseStruct {
    public final Comment comment;
    public final CommentSurprise commentSurprise;
    public final boolean isFakeComment;

    public final boolean isFakeComment() {
        return this.isFakeComment;
    }

    public CommentSurpriseStruct(Comment comment, CommentSurprise commentSurprise, boolean z) {
        this.comment = comment;
        this.commentSurprise = commentSurprise;
        this.isFakeComment = z;
    }
}
