package com.bytedance.android.livesdkapi.depend.model.live.debug;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class GetQuestionnaireContentResponse implements Serializable {

    @C09CT("questions")
    public List<Question> questions;

    public GetQuestionnaireContentResponse(List<Question> list) {
        this.questions = list;
    }

    public final void setQuestions(List<Question> list) {
        this.questions = list;
    }
}
