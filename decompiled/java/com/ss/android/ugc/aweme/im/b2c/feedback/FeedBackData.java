package com.ss.android.ugc.aweme.im.b2c.feedback;

import X.C09CT;

/* JADX INFO: loaded from: classes3.dex */
public final class FeedBackData {

    @C09CT("conversation_short_id")
    public final String convShortId;

    @C09CT("feedback_polarity")
    public final Integer feedbackPolarity;

    @C09CT("server_msg_id")
    public final String msgId;

    @C09CT("target_user_id")
    public final String userId;

    public FeedBackData() {
        this(null, null, null, null);
    }

    public FeedBackData(String str, String str2, String str3, Integer num) {
        this.userId = str;
        this.convShortId = str2;
        this.msgId = str3;
        this.feedbackPolarity = num;
    }
}
