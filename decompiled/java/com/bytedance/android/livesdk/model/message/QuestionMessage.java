package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class QuestionMessage extends AbstractC1136060ffY {

    @C09CT("data")
    public Question question;

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        Question question = this.question;
        return (question == null || question.user == null || TextUtils.isEmpty(question.content)) ? false : true;
    }

    public QuestionMessage() {
        this.type = C001A.QUESTION;
    }
}
