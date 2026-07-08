package com.ss.android.ugc.aweme.pgc.hybrid.xbridge.impl.speech;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class SpeechErrorResponse {

    @C09CT("err_code")
    public final Integer errorCode;

    @C09CT("err_msg")
    public final String errorMsg;

    public SpeechErrorResponse() {
        this(null, "");
    }

    public SpeechErrorResponse(Integer num, String str) {
        this.errorCode = num;
        this.errorMsg = str;
    }
}
