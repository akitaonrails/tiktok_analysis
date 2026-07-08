package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: loaded from: classes29.dex */
public class AtMe {

    @C09CT("avatar_badge_url")
    public UrlModel avatarBadgeUrl;

    @C09CT("aweme")
    public Aweme aweme;

    @C09CT("comment")
    public Comment comment;

    @C09CT("comment_status")
    public int commentStatus = -1;

    @C09CT("content")
    public String content;

    @C09CT("dark_mode_image_url")
    public UrlModel darkModeImageUrl;

    @C09CT("sticker")
    public Emoji emoji;

    @C09CT("image_url")
    public UrlModel imageUrl;

    @C09CT("aweme_invalid")
    public boolean isAwemeInvalid;

    @C09CT("item_status")
    public int itemStatus;

    @C09CT("level1_comment")
    public Comment level1Comment;

    @C09CT("label_text")
    public String mLabelText;

    @C09CT("label_type")
    public int mLabelType;

    @C09CT("relation_label")
    public RelationDynamicLabel relationLabel;

    @C09CT("reply_comment")
    public Comment replyComment;

    @C09CT("schema_url")
    public String schemaUrl;

    @C09CT("sub_type")
    public int subType;

    @C09CT("title")
    public String title;

    @C09CT("user_info")
    public User user;

    public UrlModel getAvatarBadgeUrl() {
        return this.avatarBadgeUrl;
    }

    public Aweme getAweme() {
        return this.aweme;
    }

    public Comment getComment() {
        return this.comment;
    }

    public int getCommentStatus() {
        return this.commentStatus;
    }

    public String getContent() {
        return this.content;
    }

    public UrlModel getDarkModeImageUrl() {
        return this.darkModeImageUrl;
    }

    public Emoji getEmoji() {
        return this.emoji;
    }

    public UrlModel getImageUrl() {
        return this.imageUrl;
    }

    public int getItemStatus() {
        return this.itemStatus;
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

    public RelationDynamicLabel getRelationLabel() {
        return this.relationLabel;
    }

    public Comment getReplyComment() {
        return this.replyComment;
    }

    public String getSchemaUrl() {
        return this.schemaUrl;
    }

    public int getSubType() {
        return this.subType;
    }

    public String getTitle() {
        return this.title;
    }

    public User getUser() {
        return this.user;
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

    public void setCommentStatus(int i) {
        this.commentStatus = i;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setEmoji(Emoji emoji) {
        this.emoji = emoji;
    }

    public void setImageUrl(UrlModel urlModel) {
        this.imageUrl = urlModel;
    }

    public void setItemStatus(int i) {
        this.itemStatus = i;
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

    public void setRelationLabel(RelationDynamicLabel relationDynamicLabel) {
        this.relationLabel = relationDynamicLabel;
    }

    public void setReplyComment(Comment comment) {
        this.replyComment = comment;
    }

    public void setSchemaUrl(String str) {
        this.schemaUrl = str;
    }

    public void setSubType(int i) {
        this.subType = i;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
