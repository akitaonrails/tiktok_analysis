package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.Comment;

/* JADX INFO: loaded from: classes22.dex */
public class CommentStruct extends Comment {
    public static final long serialVersionUID = 1075399560205544614L;
    public int LL;
    public String LLILLJJLI;
    public boolean LLILLL;

    @C09CT("avatar_icon")
    public UrlModel avatarIcon;

    @C09CT("button_text")
    public String buttonText;

    @C09CT("comment_info")
    public String commentInfo;

    @C09CT("comment_nickname")
    public String commentNickName;

    @C09CT("comment_style")
    public int commentStyle;

    @C09CT("comment_time")
    public long commentTime;

    @C09CT("mock_count")
    public int mockCount;

    @C09CT("mock_creator")
    public int mockCreator;

    @C09CT("show_button_number")
    public int showButtonNumber;

    @C09CT("show_comment_number")
    public int showCommentNumber;

    @C09CT("source")
    public String source;

    @C09CT("tag_text")
    public String tagText;

    @C09CT("title")
    public String title;

    @C09CT("type")
    public int type;

    public boolean showAsDefault() {
        return this.mockCount == 1;
    }

    public boolean showCreatorTag() {
        return this.mockCreator == 1;
    }

    public String getAid() {
        return this.LLILLJJLI;
    }

    public UrlModel getAvatarIcon() {
        return this.avatarIcon;
    }

    public int getAvatarSize() {
        return this.LL;
    }

    public String getButtonText() {
        return this.buttonText;
    }

    public String getCommentInfo() {
        return this.commentInfo;
    }

    public String getCommentNickName() {
        return this.commentNickName;
    }

    public int getCommentStyle() {
        return this.commentStyle;
    }

    public long getCommentTime() {
        return this.commentTime;
    }

    public int getShowButtonNumber() {
        return this.showButtonNumber;
    }

    public int getShowCommentNumber() {
        return this.showCommentNumber;
    }

    public String getSource() {
        return this.source;
    }

    public String getTagText() {
        return this.tagText;
    }

    public String getTitle() {
        return this.title;
    }

    public int getType() {
        return this.type;
    }

    public boolean isAdFake() {
        return this.LLILLL;
    }

    public CommentStruct setAdFake(boolean z) {
        this.LLILLL = z;
        return this;
    }

    public CommentStruct setAid(String str) {
        this.LLILLJJLI = str;
        return this;
    }

    public void setAvatarIcon(UrlModel urlModel) {
        this.avatarIcon = urlModel;
    }

    public void setAvatarSize(int i) {
        this.LL = i;
    }

    public void setButtonText(String str) {
        this.buttonText = str;
    }

    public void setCommentInfo(String str) {
        this.commentInfo = str;
    }

    public void setCommentNickName(String str) {
        this.commentNickName = str;
    }

    public void setCommentStyle(int i) {
        this.commentStyle = i;
    }

    public void setCommentTime(long j) {
        this.commentTime = j;
    }

    public void setShowButtonNumber(int i) {
        this.showButtonNumber = i;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
