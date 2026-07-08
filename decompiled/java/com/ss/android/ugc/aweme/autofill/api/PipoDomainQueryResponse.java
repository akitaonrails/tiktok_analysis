package com.ss.android.ugc.aweme.autofill.api;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class PipoDomainQueryResponse implements Serializable {
    public static final int $stable = 0;

    @C09CT("domain")
    public final String domain;

    @C09CT("merchant_id")
    public final String merchantId;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public PipoDomainQueryResponse() {
        this(null, null, null, null);
    }

    public PipoDomainQueryResponse(String str, String str2, Integer num, String str3) {
        this.domain = str;
        this.merchantId = str2;
        this.statusCode = num;
        this.statusMsg = str3;
    }
}
