package com.bytedance.android.livesdk.survey.model;

import X.C09CT;

/* JADX INFO: loaded from: classes8.dex */
public class SurveySubmitContent {

    @C09CT("input")
    public String input;

    @C09CT("option_id")
    public long optionId;

    @C09CT("question_id")
    public String questionId;

    @C09CT("second_option_id")
    public String secondOptionId;

    public SurveySubmitContent(String str, long j) {
        this.questionId = str;
        this.optionId = j;
    }

    public SurveySubmitContent(String str, long j, String str2, String str3) {
        this.questionId = str;
        this.optionId = j;
        this.secondOptionId = str2;
        this.input = str3;
    }
}
