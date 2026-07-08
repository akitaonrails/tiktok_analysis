package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.game.model.GuessTemplate;

/* JADX INFO: loaded from: classes.dex */
public final class GuessQuestionAuditMessage extends AbstractC1136060ffY {

    @C09CT("guess_template")
    public GuessTemplate guessTemplate;

    public GuessQuestionAuditMessage() {
        this.type = C001A.GUESS_QUESTION_AUDIT_MESSAGE;
    }
}
