package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public class QuestionSelectMessage extends AbstractC1136060ffY {

    @C09CT("data")
    public Question question;

    @Override // X.AbstractC1136060ffY, com.ss.ugc.live.sdk.message.data.IMessage
    public final int consumingStrategy() {
        return 2;
    }

    public QuestionSelectMessage() {
        this.type = C001A.QUESTION_SELECT_MESSAGE;
    }
}
