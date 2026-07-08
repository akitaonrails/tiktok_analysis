package com.bytedance.android.livesdk.survey.model;

import X.C09CT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes8.dex */
public final class SurveySecondQuestion {

    @C09CT("content")
    public String content;

    @C09CT("is_other")
    public boolean isOther;

    @C09CT("option_id")
    public long optionId;

    public final int hashCode() {
        return (((this.content.hashCode() * 31) + C786410Ut5.Y2(this.optionId)) * 31) + C786410Ut5.Z2(this.isOther);
    }

    public SurveySecondQuestion() {
        this("", -1L, false);
    }

    public SurveySecondQuestion(String str, long j, boolean z) {
        this.content = str;
        this.optionId = j;
        this.isOther = z;
    }
}
