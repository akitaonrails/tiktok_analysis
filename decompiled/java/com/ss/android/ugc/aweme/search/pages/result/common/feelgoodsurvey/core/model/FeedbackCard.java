package com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class FeedbackCard implements Serializable {

    @C09CT("questionnaire")
    public final FeelgoodSurveyQuestionnaire questionnaire;

    public FeedbackCard(FeelgoodSurveyQuestionnaire feelgoodSurveyQuestionnaire) {
        this.questionnaire = feelgoodSurveyQuestionnaire;
    }
}
