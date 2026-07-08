package com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class FeelgoodPageConfig implements Serializable {

    @C09CT(alternate = {"header_config"}, value = "headerConfig")
    public final FeelgoodHeaderConfig headerConfig;

    @C09CT(alternate = {"question_list"}, value = "questionList")
    public final List<FeelgoodSurveyQuestion> questionList;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeelgoodPageConfig(headerConfig=");
        sbLIZ.append(this.headerConfig);
        sbLIZ.append(", questionList=");
        sbLIZ.append(this.questionList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FeelgoodPageConfig(FeelgoodHeaderConfig feelgoodHeaderConfig, List<FeelgoodSurveyQuestion> list) {
        this.headerConfig = feelgoodHeaderConfig;
        this.questionList = list;
    }
}
