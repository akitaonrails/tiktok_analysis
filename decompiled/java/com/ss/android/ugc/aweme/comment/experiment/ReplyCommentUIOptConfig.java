package com.ss.android.ugc.aweme.comment.experiment;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public final class ReplyCommentUIOptConfig implements Serializable {

    @C09CT("button_group_rearrange")
    public final int buttonGroupReArrange;

    @C09CT("reply_comment_info_style")
    public final int replyInfoStyle;

    @C09CT("send_btn_style")
    public final int sendBtnStyle;

    @C09CT("show_reply_user_avatar")
    public final int showReplyUserAvatar;

    public ReplyCommentUIOptConfig() {
        this(0, 0, 0, 0);
    }

    public ReplyCommentUIOptConfig(int i, int i2, int i3, int i4) {
        this.showReplyUserAvatar = i;
        this.buttonGroupReArrange = i2;
        this.sendBtnStyle = i3;
        this.replyInfoStyle = i4;
    }
}
