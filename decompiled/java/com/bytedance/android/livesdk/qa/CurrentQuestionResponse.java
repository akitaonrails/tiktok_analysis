package com.bytedance.android.livesdk.qa;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.Question;

/* JADX INFO: loaded from: classes13.dex */
public final class CurrentQuestionResponse {

    @C09CT("current_question")
    public QuestionEx currentQuestion;

    public CurrentQuestionResponse() {
        this(new QuestionEx(new Question(), 0L, 0, false, false, false, 0L, 0, 0));
    }

    public CurrentQuestionResponse(QuestionEx questionEx) {
        this.currentQuestion = questionEx;
    }
}
