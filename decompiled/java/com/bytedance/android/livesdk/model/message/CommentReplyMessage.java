package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes.dex */
public final class CommentReplyMessage extends AbstractC1136060ffY {
    public int LL;
    public volatile boolean LLILLJJLI;

    @C09CT("comment_content")
    public String commentContent;

    @C09CT("comment_id")
    public long commentId;

    @C09CT("icon")
    public ImageModel icon;

    @C09CT("public_area_message_common")
    public PublicAreaMessageCommon publicAreaMessageCommon;

    @C09CT("reply_content")
    public String replyContent;

    @C09CT("source")
    public int source;

    @C09CT("stay_duration_ms")
    public long stayDurationMs;

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        return true;
    }

    public CommentReplyMessage() {
        this.type = C001A.COMMENT_REPLY_MESSAGE;
        this.commentContent = "";
        this.replyContent = "";
    }
}
