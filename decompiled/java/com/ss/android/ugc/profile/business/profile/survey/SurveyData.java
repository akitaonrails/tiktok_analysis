package com.ss.android.ugc.profile.business.profile.survey;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class SurveyData {

    @C09CT("answer1")
    public String answer1;

    @C09CT("answer2")
    public String answer2;

    @C09CT("dialog_id")
    public int dialogId;

    @C09CT("orig_answer1")
    public String originAnswer1;

    @C09CT("orig_answer2")
    public String originAnswer2;

    @C09CT("original_id")
    public int originId;

    @C09CT("orig_question")
    public String originalQuestion;

    @C09CT("question")
    public String question;

    @C09CT("end_sub_title")
    public String resultDesc;

    @C09CT("end_title")
    public String resultTitle;

    @C09CT("title")
    public String title;

    public SurveyData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2, String str8, String str9) {
        this.dialogId = i;
        this.title = str;
        this.question = str2;
        this.answer1 = str3;
        this.answer2 = str4;
        this.resultTitle = str5;
        this.resultDesc = str6;
        this.originalQuestion = str7;
        this.originId = i2;
        this.originAnswer1 = str8;
        this.originAnswer2 = str9;
    }
}
