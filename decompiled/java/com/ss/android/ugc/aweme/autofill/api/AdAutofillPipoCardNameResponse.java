package com.ss.android.ugc.aweme.autofill.api;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AdAutofillPipoCardNameResponse implements Serializable {
    public static final int $stable = 0;

    @C09CT("error_code")
    public final String errorCode;

    @C09CT("error_message")
    public final String errorMessage;

    @C09CT("fill_info")
    public final String fillInfo;

    @C09CT("result_code")
    public final String resultCode;

    public AdAutofillPipoCardNameResponse() {
        this(null, null, null, null);
    }

    public AdAutofillPipoCardNameResponse(String str, String str2, String str3, String str4) {
        this.resultCode = str;
        this.errorCode = str2;
        this.errorMessage = str3;
        this.fillInfo = str4;
    }
}
