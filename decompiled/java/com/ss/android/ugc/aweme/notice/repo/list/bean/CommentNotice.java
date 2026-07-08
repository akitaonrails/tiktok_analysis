package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public class CommentNotice implements Serializable {

    @C09CT("alias_dark_mode_cover")
    public UrlModel aliasDarkModeCover;

    @C09CT("avatar_badge_url")
    public UrlModel avatarBadgeUrl;

    @C09CT("aweme")
    public Aweme aweme;

    @C09CT("comment")
    public Comment comment;

    @C09CT("comment_type")
    public int commentType;

    @C09CT("content")
    public String content;

    @C09CT("dark_mode_cover")
    public UrlModel darkModeCover;

    @C09CT("forward_id")
    public String forwardId;

    @C09CT("alias_aweme_invalid")
    public boolean isAliasAwemeInvalid;

    @C09CT("aweme_invalid")
    public boolean isAwemeInvalid;

    @C09CT("level1_comment")
    public Comment level1Comment;

    @C09CT("label_text")
    public String mLabelText;

    @C09CT("label_type")
    public int mLabelType;

    @C09CT("parent_id")
    public String parentId;

    @C09CT("relation_label")
    public RelationDynamicLabel relationLabel;

    @C09CT("reply_comment")
    public Comment replyComment;

    public boolean isReplyWithVideo() {
        int i = this.commentType;
        return i == 17 || i == 18 || i == 19;
    }

    public UrlModel getAliasDarkModeCover() {
        return this.aliasDarkModeCover;
    }

    public UrlModel getAvatarBadgeUrl() {
        return this.avatarBadgeUrl;
    }

    public Aweme getAweme() {
        return this.aweme;
    }

    public Comment getComment() {
        return this.comment;
    }

    public int getCommentType() {
        return this.commentType;
    }

    public String getContent() {
        return this.content;
    }

    public UrlModel getDarkModeCover() {
        return this.darkModeCover;
    }

    public String getForwardId() {
        return this.forwardId;
    }

    public String getLabelText() {
        return this.mLabelText;
    }

    public int getLabelType() {
        return this.mLabelType;
    }

    public Comment getLevel1Comment() {
        return this.level1Comment;
    }

    public String getParentId() {
        return this.parentId;
    }

    public RelationDynamicLabel getRelationLabel() {
        return this.relationLabel;
    }

    public Comment getReplyComment() {
        return this.replyComment;
    }

    public boolean isAliasAwemeInvalid() {
        return this.isAliasAwemeInvalid;
    }

    public boolean isAwemeInvalid() {
        return this.isAwemeInvalid;
    }

    public void setAvatarBadgeUrl(UrlModel urlModel) {
        this.avatarBadgeUrl = urlModel;
    }

    public void setAweme(Aweme aweme) {
        this.aweme = aweme;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public void setCommentType(int i) {
        this.commentType = i;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setForwardId(String str) {
        this.forwardId = str;
    }

    public void setLabelText(String str) {
        this.mLabelText = str;
    }

    public void setLabelType(int i) {
        this.mLabelType = i;
    }

    public void setLevel1Comment(Comment comment) {
        this.level1Comment = comment;
    }

    public void setParentId(String str) {
        this.parentId = str;
    }

    public void setRelationLabel(RelationDynamicLabel relationDynamicLabel) {
        this.relationLabel = relationDynamicLabel;
    }

    public void setReplyComment(Comment comment) {
        this.replyComment = comment;
    }
}
