package com.ss.android.ugc.aweme.service.earlyfeedback;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class SurveyUIOptimizationExperimentData {

    @C09CT("apply_questionnaires")
    public final List<String> applyQuestionnaires;

    @C09CT("is_enable")
    public final boolean isEnable;

    public SurveyUIOptimizationExperimentData() {
        this(false, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SurveyUIOptimizationExperimentData)) {
            return false;
        }
        SurveyUIOptimizationExperimentData surveyUIOptimizationExperimentData = (SurveyUIOptimizationExperimentData) obj;
        return this.isEnable == surveyUIOptimizationExperimentData.isEnable && Intrinsics.LJFF(this.applyQuestionnaires, surveyUIOptimizationExperimentData.applyQuestionnaires);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.isEnable) * 31;
        List<String> list = this.applyQuestionnaires;
        return iZ2 + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SurveyUIOptimizationExperimentData(isEnable=");
        sbLIZ.append(this.isEnable);
        sbLIZ.append(", applyQuestionnaires=");
        sbLIZ.append(this.applyQuestionnaires);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SurveyUIOptimizationExperimentData(boolean z, List<String> list) {
        this.isEnable = z;
        this.applyQuestionnaires = list;
    }
}
