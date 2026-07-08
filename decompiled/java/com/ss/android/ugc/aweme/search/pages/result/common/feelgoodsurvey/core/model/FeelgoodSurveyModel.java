package com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class FeelgoodSurveyModel implements Serializable {

    @C09CT("questionnaire")
    public final FeelgoodSurveyQuestionnaire questionnaire;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeelgoodSurveyModel(questionnaire=");
        sbLIZ.append(this.questionnaire);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FeelgoodSurveyModel(FeelgoodSurveyQuestionnaire feelgoodSurveyQuestionnaire) {
        this.questionnaire = feelgoodSurveyQuestionnaire;
    }
}
