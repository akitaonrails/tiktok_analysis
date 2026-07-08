package com.ss.android.ugc.aweme.minis.report.api;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class MinisCreateReportResponse implements Serializable {
    public static final int $stable = 0;

    @C09CT("object_id")
    public final String objectId;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public MinisCreateReportResponse(String str, Integer num, String str2) {
        this.objectId = str;
        this.statusCode = num;
        this.statusMsg = str2;
    }
}
