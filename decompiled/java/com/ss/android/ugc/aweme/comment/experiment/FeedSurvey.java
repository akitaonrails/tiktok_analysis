package com.ss.android.ugc.aweme.comment.experiment;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class FeedSurvey implements Serializable {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id;

    @C09CT("questions")
    public Question[] questions;

    @C09CT("key")
    public String surveyKey;

    @C09CT("title")
    public String title;

    public FeedSurvey() {
        this("", "", "", null);
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setQuestions(Question[] questionArr) {
        this.questions = questionArr;
    }

    public final void setSurveyKey(String str) {
        this.surveyKey = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public FeedSurvey(String str, String str2, String str3, Question[] questionArr) {
        this.surveyKey = str;
        this.id = str2;
        this.title = str3;
        this.questions = questionArr;
    }
}
