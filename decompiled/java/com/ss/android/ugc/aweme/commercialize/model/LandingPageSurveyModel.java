package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CS;
import X.C09CT;
import com.ss.android.ugc.aweme.utils.JsonToStringAdapter;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class LandingPageSurveyModel implements Serializable {

    @C09CT("disable_iab_slide_exit")
    public final int disableIabSlideExit;

    @C09CT("enable_landing_page_survey")
    public boolean enableLandingPageSurvey;

    @C09CT("page_dwell_time")
    public long pageDwellTime;

    @C09CT("schema_url")
    public String schemaUrl;

    @C09CT("show_survey_in_loading")
    public final int showSurveyInLoading;

    @C09CT("show_survey_time_interval")
    public long showSurveyTimeInterval;

    @C09CT("skip_survey_if_submitted")
    public final int skipSurveyIfSubmitted;

    @C09CT("survey_config")
    @C09CS(JsonToStringAdapter.class)
    public final String surveyConfig;

    @C09CT("survey_id")
    public final String surveyId;

    public LandingPageSurveyModel() {
        this(false, 0L, 0L, "", null, null, 0, 0, 0);
    }

    public final void setEnableLandingPageSurvey(boolean z) {
        this.enableLandingPageSurvey = z;
    }

    public final void setPageDwellTime(long j) {
        this.pageDwellTime = j;
    }

    public final void setSchemaUrl(String str) {
        this.schemaUrl = str;
    }

    public final void setShowSurveyTimeInterval(long j) {
        this.showSurveyTimeInterval = j;
    }

    public LandingPageSurveyModel(boolean z, long j, long j2, String str, String str2, String str3, int i, int i2, int i3) {
        this.enableLandingPageSurvey = z;
        this.showSurveyTimeInterval = j;
        this.pageDwellTime = j2;
        this.schemaUrl = str;
        this.surveyId = str2;
        this.surveyConfig = str3;
        this.showSurveyInLoading = i;
        this.disableIabSlideExit = i2;
        this.skipSurveyIfSubmitted = i3;
    }
}
