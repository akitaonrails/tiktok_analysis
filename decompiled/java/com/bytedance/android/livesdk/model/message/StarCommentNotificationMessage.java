package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.live.base.model.user.User;

/* JADX INFO: loaded from: classes.dex */
public final class StarCommentNotificationMessage extends AbstractC1136060ffY {

    @C09CT("msg_id")
    public long msgId;

    @C09CT("operator")
    public User operator;

    @C09CT("star_comment_action")
    public int starCommentAction;

    @C09CT("star_comment_message")
    public StarCommentMessage starCommentMessage;

    public StarCommentNotificationMessage() {
        this.type = C001A.STAR_COMMENT_NOTIFICATION_MESSAGE;
    }
}
