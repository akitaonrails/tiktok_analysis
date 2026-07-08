package com.ss.android.ugc.aweme.feed.model.survey;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PersonalizedOnboardingSurvey implements Serializable {

    @C09CT("enable_personalized_onboarding_survey")
    public Boolean enablePersonalizedOnboardingSurvey;

    @C09CT("survey_name")
    public String surveyName;

    public PersonalizedOnboardingSurvey() {
        this(Boolean.FALSE, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersonalizedOnboardingSurvey)) {
            return false;
        }
        PersonalizedOnboardingSurvey personalizedOnboardingSurvey = (PersonalizedOnboardingSurvey) obj;
        return Intrinsics.LJFF(this.enablePersonalizedOnboardingSurvey, personalizedOnboardingSurvey.enablePersonalizedOnboardingSurvey) && Intrinsics.LJFF(this.surveyName, personalizedOnboardingSurvey.surveyName);
    }

    public int hashCode() {
        Boolean bool = this.enablePersonalizedOnboardingSurvey;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.surveyName;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PersonalizedOnboardingSurvey(enablePersonalizedOnboardingSurvey=");
        sbLIZ.append(this.enablePersonalizedOnboardingSurvey);
        sbLIZ.append(", surveyName=");
        sbLIZ.append(this.surveyName);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PersonalizedOnboardingSurvey(Boolean bool, String str) {
        this.enablePersonalizedOnboardingSurvey = bool;
        this.surveyName = str;
    }
}
