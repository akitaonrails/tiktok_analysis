package com.ss.android.ugc.aweme.feedback.reply;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class ReplyInfo {

    @C09CT("feedback_id")
    public final Integer feedbackId;

    @C09CT("has_reply")
    public final Boolean hasReply;

    public ReplyInfo() {
        this(0, Boolean.FALSE);
    }

    public ReplyInfo(Integer num, Boolean bool) {
        this.feedbackId = num;
        this.hasReply = bool;
    }
}
