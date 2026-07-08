package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public class QuestionSlideDownMessage extends AbstractC1136060ffY {

    @C09CT("question_id")
    public long questionId;

    @Override // X.AbstractC1136060ffY, com.ss.ugc.live.sdk.message.data.IMessage
    public final int consumingStrategy() {
        return 2;
    }

    public QuestionSlideDownMessage() {
        this.type = C001A.QUESTION_SLIDE_DOWN_MESSAGE;
    }
}
