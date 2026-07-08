package com.bytedance.android.livesdkapi.depend.model.live.debug;

import X.C09CT;
import java.io.Serializable;
import java.util.HashSet;

/* JADX INFO: loaded from: classes8.dex */
public final class Answer implements Serializable {

    @C09CT("answers")
    public HashSet<String> answers;

    @C09CT("question_id")
    public long questionId;

    public final void setAnswers(HashSet<String> hashSet) {
        this.answers = hashSet;
    }

    public final void setQuestionId(long j) {
        this.questionId = j;
    }

    public Answer(long j, HashSet<String> hashSet) {
        this.questionId = j;
        this.answers = hashSet;
    }
}
