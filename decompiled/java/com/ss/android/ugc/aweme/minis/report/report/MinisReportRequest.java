package com.ss.android.ugc.aweme.minis.report.report;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public final class MinisReportRequest implements Serializable {
    public static final int $stable = 8;

    @C09CT("ads_report")
    public final MinisFunctionReport adsReport;

    @C09CT("client_key")
    public final String clientKey;

    @C09CT("feedback_report")
    public final MinisFunctionReport feedbackReport;

    @C09CT("function_report")
    public final MinisFunctionReport functionReport;

    @C09CT("order_report")
    public final MinisOrderReport orderReport;

    @C09CT("report_type")
    public final int reportType;

    @C09CT("type")
    public Integer type;

    public MinisReportRequest() {
        this("", 0, null, null, null, null, null);
    }

    public final void setType(Integer num) {
        this.type = num;
    }

    public MinisReportRequest(String str, int i, MinisFunctionReport minisFunctionReport, MinisFunctionReport minisFunctionReport2, MinisFunctionReport minisFunctionReport3, MinisOrderReport minisOrderReport, Integer num) {
        this.clientKey = str;
        this.reportType = i;
        this.functionReport = minisFunctionReport;
        this.adsReport = minisFunctionReport2;
        this.feedbackReport = minisFunctionReport3;
        this.orderReport = minisOrderReport;
        this.type = num;
    }
}
