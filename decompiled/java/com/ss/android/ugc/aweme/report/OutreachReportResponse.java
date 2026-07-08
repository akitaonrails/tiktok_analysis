package com.ss.android.ugc.aweme.report;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public final class OutreachReportResponse {

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public OutreachReportResponse() {
        this(null, null);
    }

    public OutreachReportResponse(Integer num, String str) {
        this.statusCode = num;
        this.statusMsg = str;
    }
}
