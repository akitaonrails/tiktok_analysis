package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import webcast.data.UserIdentity;

/* JADX INFO: loaded from: classes.dex */
public class ChatResult {

    @C09CT("background_image")
    public ImageModel background;

    @C09CT("comment_tray")
    public CommentTray commentTray;

    @C09CT("content")
    public String content;

    @C09CT("content_language")
    public String contentLanguage;

    @C09CT("display_text")
    public Text displayText;

    @C09CT("fullscreen_text_color")
    public String fullScreenTextColor;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("msg_id")
    public long msgId;

    @C09CT("user")
    public User user;

    @C09CT("user_identity")
    public UserIdentity userIdentity;

    public ImageModel getBackground() {
        return this.background;
    }

    public CommentTray getCommentTray() {
        return this.commentTray;
    }

    public String getContent() {
        return this.content;
    }

    public String getContentLanguage() {
        return this.contentLanguage;
    }

    public Text getDisplayText() {
        return this.displayText;
    }

    public String getFullScreenTextColor() {
        return this.fullScreenTextColor;
    }

    public long getId() {
        return this.id;
    }

    public long getMsgId() {
        return this.msgId;
    }

    public User getUser() {
        return this.user;
    }

    public void setBackground(ImageModel imageModel) {
        this.background = imageModel;
    }

    public void setCommentTray(CommentTray commentTray) {
        this.commentTray = commentTray;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setDisplayText(Text text) {
        this.displayText = text;
    }

    public void setFullScreenTextColor(String str) {
        this.fullScreenTextColor = str;
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setMsgId(long j) {
        this.msgId = j;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
