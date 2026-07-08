package com.ss.android.ugc.aweme.pipo.probe.core.infoupload;

import X.C09CT;

/* JADX INFO: loaded from: classes3.dex */
public final class ProbeUploadResponse {

    @C09CT("data")
    public final ProbeUploadResponseData data;

    @C09CT("error_code")
    public final String errorCode;

    @C09CT("error_message")
    public final String errorMessage;

    @C09CT("factor")
    public final Number factor;

    @C09CT("result_code")
    public final String resultCode;

    public ProbeUploadResponse() {
        this(null, null, null, null, null);
    }

    public ProbeUploadResponse(String str, String str2, String str3, Number number, ProbeUploadResponseData probeUploadResponseData) {
        this.resultCode = str;
        this.errorCode = str2;
        this.errorMessage = str3;
        this.factor = number;
        this.data = probeUploadResponseData;
    }
}
