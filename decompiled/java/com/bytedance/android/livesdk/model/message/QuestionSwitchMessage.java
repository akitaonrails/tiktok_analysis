package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public class QuestionSwitchMessage extends AbstractC1136060ffY {

    @C09CT("on")
    public boolean on;

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        return true;
    }

    @Override // X.AbstractC1136060ffY, com.ss.ugc.live.sdk.message.data.IMessage
    public final int consumingStrategy() {
        return 2;
    }

    public final Boolean LIZ() {
        return Boolean.valueOf(this.on);
    }

    public QuestionSwitchMessage() {
        this.type = C001A.QUESTION_SWITCH_MESSAGE;
    }
}
