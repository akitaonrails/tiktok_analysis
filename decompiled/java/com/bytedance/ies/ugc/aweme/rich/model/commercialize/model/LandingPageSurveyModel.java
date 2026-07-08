package com.bytedance.ies.ugc.aweme.rich.model.commercialize.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class LandingPageSurveyModel implements Serializable {

    @C09CT("enable_landing_page_survey")
    public boolean enableLandingPageSurvey;

    @C09CT("page_dwell_time")
    public long pageDwellTime;

    @C09CT("schema_url")
    public String schemaUrl;

    @C09CT("show_survey_time_interval")
    public long showSurveyTimeInterval;

    public LandingPageSurveyModel() {
        this(false, 0L, 0L, "");
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

    public LandingPageSurveyModel(boolean z, long j, long j2, String str) {
        this.enableLandingPageSurvey = z;
        this.showSurveyTimeInterval = j;
        this.pageDwellTime = j2;
        this.schemaUrl = str;
    }
}
