package com.ss.android.ugc.aweme.tako.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoFeedbackConfigModel {

    @C09CT("aibot_report_schema")
    public String aiBotReportSchema;

    @C09CT("tako_feedback_schema")
    public String takoFeedbackSchema;

    public TakoFeedbackConfigModel() {
        this("", "https://inapp.tiktokv.com/web-inapp/search-web-inapp/report-page/index.html");
    }

    public TakoFeedbackConfigModel(String str, String str2) {
        this.takoFeedbackSchema = str;
        this.aiBotReportSchema = str2;
    }
}
