package com.ss.android.ugc.aweme.comment.model;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class CommentReplyListItem {
    public CommentReplyButtonStruct mButtonStruct;
    public Comment mComment;
    public CommentInsertInputStruct mInsertInputStruct;
    public List<Comment> mReplyComments = new ArrayList();

    public int hashCode() {
        return super.hashCode();
    }

    public CommentReplyButtonStruct getButtonStruct() {
        return this.mButtonStruct;
    }

    public Comment getComment() {
        return this.mComment;
    }

    public CommentInsertInputStruct getInsertInputStruct() {
        return this.mInsertInputStruct;
    }

    public List<Comment> getReplyComments() {
        return this.mReplyComments;
    }

    public boolean equals(Object obj) {
        Comment comment;
        if ((obj instanceof CommentReplyListItem) && (comment = this.mComment) != null) {
            return comment.equals(((CommentReplyListItem) obj).mComment);
        }
        return super.equals(obj);
    }

    public void setButtonStruct(CommentReplyButtonStruct commentReplyButtonStruct) {
        this.mButtonStruct = commentReplyButtonStruct;
    }

    public void setComment(Comment comment) {
        this.mComment = comment;
    }

    public void setInsertInputStruct(CommentInsertInputStruct commentInsertInputStruct) {
        this.mInsertInputStruct = commentInsertInputStruct;
    }

    public void setReplyComments(List<Comment> list) {
        this.mReplyComments = list;
    }
}
