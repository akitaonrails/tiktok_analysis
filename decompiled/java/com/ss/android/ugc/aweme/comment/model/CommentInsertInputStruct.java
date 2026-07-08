package com.ss.android.ugc.aweme.comment.model;

/* JADX INFO: loaded from: classes10.dex */
public final class CommentInsertInputStruct extends Comment {
    public final Comment parentComment;

    public final Comment getParentComment() {
        return this.parentComment;
    }

    public CommentInsertInputStruct(Comment comment) {
        this.parentComment = comment;
        setCommentType(9);
    }
}
