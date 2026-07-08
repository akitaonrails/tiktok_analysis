package com.bytedance.android.livesdkapi.depend.model.live.debug;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class Question implements Serializable {

    @C09CT("answers")
    public List<String> answers;

    @C09CT("display_value")
    public String displayValue;

    @C09CT("question_content")
    public String questionContent;

    @C09CT("question_id")
    public long questionId;

    @C09CT("question_type")
    public int questionType;

    @C09CT("required")
    public boolean required;

    @C09CT("cascade_answers")
    public List<CascadeAnswer> subValue;

    public final void setAnswers(List<String> list) {
        this.answers = list;
    }

    public final void setDisplayValue(String str) {
        this.displayValue = str;
    }

    public final void setQuestionContent(String str) {
        this.questionContent = str;
    }

    public final void setQuestionId(long j) {
        this.questionId = j;
    }

    public final void setQuestionType(int i) {
        this.questionType = i;
    }

    public final void setRequired(boolean z) {
        this.required = z;
    }

    public final void setSubValue(List<CascadeAnswer> list) {
        this.subValue = list;
    }

    public Question(long j, int i, String str, List<String> list, boolean z, List<CascadeAnswer> list2, String str2) {
        this.questionId = j;
        this.questionType = i;
        this.questionContent = str;
        this.answers = list;
        this.required = z;
        this.subValue = list2;
        this.displayValue = str2;
    }
}
