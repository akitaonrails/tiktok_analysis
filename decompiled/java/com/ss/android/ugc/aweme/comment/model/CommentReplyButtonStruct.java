package com.ss.android.ugc.aweme.comment.model;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class CommentReplyButtonStruct extends Comment {
    public Aweme aweme;
    public User awemeAuthor;
    public Comment mComment;
    public String mCommentId;
    public long mCursor;
    public int mExpandSize;
    public boolean mHasMore = true;
    public int mStatus;
    public String mTopIds;
    public int mTopSize;
    public String parentCommentUid;

    public Boolean canPreloadReply() {
        return this.mComment.getCanPreloadCommentReply();
    }

    public int getBindCommentType() {
        return this.mComment.getCommentType();
    }

    public boolean needTranslate() {
        Comment comment = this.mComment;
        if (comment == null) {
            return false;
        }
        return comment.isTranslated;
    }

    public Aweme getAweme() {
        return this.aweme;
    }

    public User getAwemeAuthor() {
        return this.awemeAuthor;
    }

    public int getButtonStatus() {
        return this.mStatus;
    }

    public String getCommentId() {
        return this.mCommentId;
    }

    public long getCursor() {
        return this.mCursor;
    }

    public int getExpandSize() {
        return this.mExpandSize;
    }

    public Comment getParentComment() {
        return this.mComment;
    }

    public String getParentCommentUid() {
        return this.parentCommentUid;
    }

    public String getTopIds() {
        return this.mTopIds;
    }

    public int getTopSize() {
        return this.mTopSize;
    }

    public boolean isHasMore() {
        return this.mHasMore;
    }

    public void addExpandSize(int i) {
        this.mExpandSize += i;
    }

    public void setAwemeAuthor(User user) {
        this.awemeAuthor = user;
    }

    public void setButtonStatus(int i) {
        this.mStatus = i;
    }

    public void setCursor(long j) {
        this.mCursor = j;
    }

    public void setExpandSize(int i) {
        this.mExpandSize = Math.max(i, 0);
    }

    public void setHasMore(boolean z) {
        this.mHasMore = z;
    }

    @Override // com.ss.android.ugc.aweme.comment.model.Comment
    public void setReplyCommentTotal(long j) {
        this.replyCommentTotal = j;
    }

    @Override // com.ss.android.ugc.aweme.comment.model.Comment
    public void setReplyComments(List<Comment> list) {
        List<Comment> list2 = this.replyComments;
        if (list2 == null) {
            this.replyComments = new ArrayList();
        } else {
            list2.clear();
        }
        this.replyComments.addAll(list);
    }

    public void setTopSize(int i) {
        this.mTopSize = Math.max(i, 0);
    }

    public CommentReplyButtonStruct(Comment comment, int i, Aweme aweme) {
        this.mTopIds = "";
        setCommentType(11);
        this.mComment = comment;
        this.awemeId = comment.awemeId;
        this.aweme = aweme;
        this.mCommentId = comment.getCid();
        this.parentCommentUid = comment.getUser().getUid();
        this.cid = String.valueOf(i);
        if (comment.getReplyComments() != null) {
            int size = comment.getReplyComments().size();
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < size; i2++) {
                if (i2 > 0) {
                    sb.append(",");
                }
                sb.append(((Comment) ListProtector.get(comment.getReplyComments(), i2)).getCid());
            }
            this.mTopIds = sb.toString();
            Integer topCount = comment.getTopCount();
            if (topCount != null) {
                this.mTopSize = topCount.intValue();
            } else {
                this.mTopSize = size;
            }
            this.mCursor = Math.max(0, size - 1);
            this.mExpandSize = size;
        }
        setReplyCommentTotal(comment.getReplyCommentTotal());
    }
}
