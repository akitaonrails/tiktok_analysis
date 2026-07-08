package com.ss.android.ugc.aweme.ecommercebase.monitor;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class ClientLogReportRequest {

    @C09CT("error_code")
    public final int errorCode;

    @C09CT("error_msg")
    public final String errorMsg;

    @C09CT("scene_type")
    public final int sceneType;

    public ClientLogReportRequest() {
        this(0, 0, null);
    }

    public ClientLogReportRequest(int i, int i2, String str) {
        this.sceneType = i;
        this.errorCode = i2;
        this.errorMsg = str;
    }
}
