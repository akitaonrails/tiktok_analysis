package com.ss.android.ugc.aweme.pipo.cashier.common.autofill.core.api;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class BaseSignResponse {

    @C09CT("response")
    public String response;

    @C09CT("sign")
    public String sign;

    public BaseSignResponse() {
        this(null, null);
    }

    public BaseSignResponse(String str, String str2) {
        this.response = str;
        this.sign = str2;
    }
}
