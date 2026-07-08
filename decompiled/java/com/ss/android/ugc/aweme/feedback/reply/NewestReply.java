package com.ss.android.ugc.aweme.feedback.reply;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class NewestReply {

    @C09CT("err_code")
    public final int errCode;

    @C09CT("message")
    public final String message;

    @C09CT("data")
    public final ReplyInfo replyInfo;

    public NewestReply() {
        this("", 0, null);
    }

    public NewestReply(String str, int i, ReplyInfo replyInfo) {
        this.message = str;
        this.errCode = i;
        this.replyInfo = replyInfo;
    }
}
