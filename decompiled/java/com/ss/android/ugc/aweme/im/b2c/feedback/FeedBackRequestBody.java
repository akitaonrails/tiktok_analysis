package com.ss.android.ugc.aweme.im.b2c.feedback;

import X.C09CT;

/* JADX INFO: loaded from: classes3.dex */
public final class FeedBackRequestBody {

    @C09CT("msg_feedback")
    public final FeedBackData feedBackData;

    @C09CT("feedback_enum")
    public final Integer feedbackEnum;

    public FeedBackRequestBody() {
        this(null, null);
    }

    public FeedBackRequestBody(Integer num, FeedBackData feedBackData) {
        this.feedbackEnum = num;
        this.feedBackData = feedBackData;
    }
}
