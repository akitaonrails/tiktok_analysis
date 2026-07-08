package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;

/* JADX INFO: loaded from: classes32.dex */
public final class InfoParams {
    public static final int $stable = 0;

    @C09CT("survey")
    public final SurveyInfo surveyInfo;

    public InfoParams() {
        this(null);
    }

    public InfoParams(SurveyInfo surveyInfo) {
        this.surveyInfo = surveyInfo;
    }
}
