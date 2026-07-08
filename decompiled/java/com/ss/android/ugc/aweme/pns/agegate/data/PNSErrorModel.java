package com.ss.android.ugc.aweme.pns.agegate.data;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class PNSErrorModel implements Serializable {

    @C09CT("appeal_url")
    public final String appealUrl;

    @C09CT("error_code")
    public final Integer errorCode;

    @C09CT("error_message")
    public final String errorMessage;

    @C09CT("error_type")
    public final Integer errorType;

    public PNSErrorModel() {
        this(null, null, null, null);
    }

    public PNSErrorModel(Integer num, String str, String str2, Integer num2) {
        this.errorType = num;
        this.errorMessage = str;
        this.appealUrl = str2;
        this.errorCode = num2;
    }
}
