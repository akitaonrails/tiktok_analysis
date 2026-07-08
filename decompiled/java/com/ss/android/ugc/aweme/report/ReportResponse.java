package com.ss.android.ugc.aweme.report;

import X.C09CT;
import X.C20677215ve;
import java.io.Serializable;

/* JADX INFO: loaded from: classes32.dex */
public final class ReportResponse implements Serializable {
    public static final C20677215ve Companion = new Object() { // from class: X.15ve
    };

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public ReportResponse() {
        this(null, null);
    }

    public ReportResponse(Integer num, String str) {
        this.statusCode = num;
        this.statusMsg = str;
    }
}
