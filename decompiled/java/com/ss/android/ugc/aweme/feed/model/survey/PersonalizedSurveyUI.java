package com.ss.android.ugc.aweme.feed.model.survey;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class PersonalizedSurveyUI implements Serializable {

    @C09CT("show_optimized_button_icon")
    public Boolean showOptimizedButtonIcon;

    public PersonalizedSurveyUI() {
        this(Boolean.FALSE);
    }

    public PersonalizedSurveyUI(Boolean bool) {
        this.showOptimizedButtonIcon = bool;
    }
}
