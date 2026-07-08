package com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class FeelgoodSurveyQuestion implements Serializable {

    @C09CT(alternate = {"display_condition"}, value = "displayCondition")
    public final DisplayCondition displayCondition;

    @C09CT(alternate = {"multi_choice_data"}, value = "multiChoiceData")
    public final FeelgoodMultiChoiceData multiChoiceData;

    @C09CT(alternate = {"question_key"}, value = "questionKey")
    public final String questionKey;

    @C09CT(alternate = {"question_type"}, value = "questionType")
    public final Integer questionType;

    @C09CT(alternate = {"rating_data"}, value = "ratingData")
    public final RatingData ratingData;

    @C09CT(alternate = {"single_choice_data"}, value = "singleChoiceData")
    public final FeelgoodSingleChoiceData singleChoiceData;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeelgoodSurveyQuestion(questionType=");
        sbLIZ.append(this.questionType);
        sbLIZ.append(", questionKey=");
        sbLIZ.append(this.questionKey);
        sbLIZ.append(", singleChoiceData=");
        sbLIZ.append(this.singleChoiceData);
        sbLIZ.append(", multiChoiceData=");
        sbLIZ.append(this.multiChoiceData);
        sbLIZ.append(", ratingData=");
        sbLIZ.append(this.ratingData);
        sbLIZ.append(", displayCondition=");
        sbLIZ.append(this.displayCondition);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FeelgoodSurveyQuestion(Integer num, String str, FeelgoodSingleChoiceData feelgoodSingleChoiceData, FeelgoodMultiChoiceData feelgoodMultiChoiceData, RatingData ratingData, DisplayCondition displayCondition) {
        this.questionType = num;
        this.questionKey = str;
        this.singleChoiceData = feelgoodSingleChoiceData;
        this.multiChoiceData = feelgoodMultiChoiceData;
        this.ratingData = ratingData;
        this.displayCondition = displayCondition;
    }
}
