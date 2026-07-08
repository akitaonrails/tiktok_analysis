package com.bytedance.android.livesdk.model;

import X.C09CT;

/* JADX INFO: loaded from: classes8.dex */
public final class CommentReply {
    public volatile boolean LIZ;

    @C09CT("anchor_feedback_status")
    public int anchorFeedbackStatus;

    @C09CT("comment_id")
    public long commentId;

    @C09CT("reply_id")
    public long replyId;

    @C09CT("reply_time_ms")
    public long replyTimeMs;

    @C09CT("source")
    public int source;

    @C09CT("comment_content")
    public String commentContent = "";

    @C09CT("reply_content")
    public String replyContent = "";

    @C09CT("user_name")
    public String userName = "";
}
