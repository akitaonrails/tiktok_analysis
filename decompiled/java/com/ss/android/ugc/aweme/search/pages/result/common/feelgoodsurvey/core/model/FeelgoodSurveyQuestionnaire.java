package com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class FeelgoodSurveyQuestionnaire implements Serializable {

    @C09CT(alternate = {"custom_text"}, value = "customText")
    public final String customText;

    @C09CT(alternate = {"questionnaire_id"}, value = "questionnaireID")
    public final String questionnaireID;

    @C09CT(alternate = {"show_config"}, value = "showConfig")
    public final FeelgoodShowConfig showConfig;

    @C09CT(alternate = {"submit_id"}, value = "submitID")
    public final String submitID;

    @C09CT(alternate = {"survey_id"}, value = "surveyID")
    public final String surveyID;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeelgoodSurveyQuestionnaire(questionnaireID=");
        sbLIZ.append(this.questionnaireID);
        sbLIZ.append(", submitID=");
        sbLIZ.append(this.submitID);
        sbLIZ.append(", surveyID=");
        sbLIZ.append(this.surveyID);
        sbLIZ.append(", showConfig=");
        sbLIZ.append(this.showConfig);
        sbLIZ.append(", customText=");
        sbLIZ.append(this.customText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FeelgoodSurveyQuestionnaire(String str, String str2, String str3, FeelgoodShowConfig feelgoodShowConfig, String str4) {
        this.questionnaireID = str;
        this.submitID = str2;
        this.surveyID = str3;
        this.showConfig = feelgoodShowConfig;
        this.customText = str4;
    }
}
