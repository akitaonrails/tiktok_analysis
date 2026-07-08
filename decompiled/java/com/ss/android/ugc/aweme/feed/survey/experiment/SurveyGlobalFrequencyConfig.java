package com.ss.android.ugc.aweme.feed.survey.experiment;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public final class SurveyGlobalFrequencyConfig {

    @C09CT("skip_global_frequency_control")
    public List<String> skipGlobalFrequencyControl;

    @C09CT("survey_global_frequency_day")
    public int surveyGlobalFrequencyDay;

    @C09CT("survey_global_frequency_display_time")
    public int surveyGlobalFrequencyDisplayTime;

    public SurveyGlobalFrequencyConfig() {
        this(0, 0, new ArrayList());
    }

    public SurveyGlobalFrequencyConfig(int i, int i2, List<String> list) {
        this.surveyGlobalFrequencyDay = i;
        this.surveyGlobalFrequencyDisplayTime = i2;
        this.skipGlobalFrequencyControl = list;
    }
}
