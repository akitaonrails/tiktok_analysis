package com.ss.android.ugc.aweme.autofill.api;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AdAutofillGetValidPiListResponse implements Serializable {
    public static final int $stable = 0;

    @C09CT("error_code")
    public final String errorCode;

    @C09CT("error_message")
    public final String errorMessage;

    @C09CT("pi_list")
    public final String maskInstrumentInfo;

    @C09CT("result_code")
    public final String resultCode;

    public AdAutofillGetValidPiListResponse() {
        this(null, null, null, null);
    }

    public AdAutofillGetValidPiListResponse(String str, String str2, String str3, String str4) {
        this.maskInstrumentInfo = str;
        this.resultCode = str2;
        this.errorCode = str3;
        this.errorMessage = str4;
    }
}
