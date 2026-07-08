package com.bytedance.android.livesdk.survey.model;

import X.C09CT;

/* JADX INFO: loaded from: classes8.dex */
public class SurveySubmitRequest {

    @C09CT("content")
    public String content;

    @C09CT("room_id")
    public long roomId;

    @C09CT("survey_id")
    public String surveyId;

    public SurveySubmitRequest(long j, String str, String str2) {
        this.roomId = j;
        this.surveyId = str;
        this.content = str2;
    }
}
