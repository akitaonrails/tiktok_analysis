package com.ss.android.ugc.aweme.compliance.business.search.feedback;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes13.dex */
public final class SurveyConfig implements Serializable {
    public static final int $stable = 8;

    @C09CT("question_data")
    public final List<QuestionData> questionData;

    @C09CT("survey_config_id")
    public final String surveyConfigId;

    @C09CT("survey_title")
    public final String surveyTitle;

    public SurveyConfig() {
        this(null, null, null, 7, null);
    }

    public SurveyConfig(String str, String str2, List<QuestionData> list) {
        this.surveyConfigId = str;
        this.surveyTitle = str2;
        this.questionData = list;
    }

    public SurveyConfig(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? C13BV.INSTANCE : list);
    }
}
