package com.ss.android.ugc.aweme.minis.report.report;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public final class MinisUpdateReportRequest implements Serializable {
    public static final int $stable = 0;

    @C09CT("report_status")
    public final Integer functionReport;

    @C09CT("object_id")
    public final String objectId;

    @C09CT("screenshot_uri")
    public final String screenshotUri;

    public MinisUpdateReportRequest() {
        this("", null, null);
    }

    public MinisUpdateReportRequest(String str, String str2, Integer num) {
        this.objectId = str;
        this.screenshotUri = str2;
        this.functionReport = num;
    }
}
