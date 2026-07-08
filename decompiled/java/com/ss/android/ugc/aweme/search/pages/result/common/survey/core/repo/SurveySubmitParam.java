package com.ss.android.ugc.aweme.search.pages.result.common.survey.core.repo;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class SurveySubmitParam {

    @C09CT("keyword")
    public final String keyword;

    @C09CT("survey_answer_rating")
    public final int ratingAnswer;

    @C09CT("search_id")
    public final String searchId;

    @C09CT("survey_id")
    public final String surveyId;

    public SurveySubmitParam(String str, String str2, String str3, int i) {
        this.surveyId = str;
        this.searchId = str2;
        this.keyword = str3;
        this.ratingAnswer = i;
    }
}
