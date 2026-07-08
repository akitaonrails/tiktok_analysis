package com.ss.android.ugc.aweme.feed.model.survey;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class OnboardingSurvey implements Serializable {

    @C09CT("in_experiment")
    public Boolean inExperiment;

    @C09CT("show_survey")
    public Boolean showSurvey;

    public OnboardingSurvey() {
        this(Boolean.FALSE, Boolean.FALSE);
    }

    public OnboardingSurvey(Boolean bool, Boolean bool2) {
        this.inExperiment = bool;
        this.showSurvey = bool2;
    }
}
