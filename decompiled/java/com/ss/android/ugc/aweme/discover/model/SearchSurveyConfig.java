package com.ss.android.ugc.aweme.discover.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchSurveyConfig implements Serializable {

    @C09CT("enabled")
    public boolean enabled;

    @C09CT("survey_id")
    public String surveyId;

    @C09CT("show_delay")
    public long showDelay = 5;

    @C09CT("result_delay")
    public long submitResultDelay = 2;

    @C09CT("show_duration")
    public long showDuration = 5;

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final long getShowDelay() {
        return this.showDelay;
    }

    public final long getShowDuration() {
        return this.showDuration;
    }

    public final long getSubmitResultDelay() {
        return this.submitResultDelay;
    }

    public final String getSurveyId() {
        return this.surveyId;
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    public final void setShowDelay(long j) {
        this.showDelay = j;
    }

    public final void setShowDuration(long j) {
        this.showDuration = j;
    }

    public final void setSubmitResultDelay(long j) {
        this.submitResultDelay = j;
    }

    public final void setSurveyId(String str) {
        this.surveyId = str;
    }
}
