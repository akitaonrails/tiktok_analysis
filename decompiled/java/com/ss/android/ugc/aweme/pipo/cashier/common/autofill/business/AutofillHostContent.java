package com.ss.android.ugc.aweme.pipo.cashier.common.autofill.business;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class AutofillHostContent {
    public Long LIZ;

    @C09CT("mtls_domain")
    public final String host;

    @C09CT("merchant_id")
    public String merchantId;

    @C09CT("merchant_user_id")
    public String merchantUserId;

    public AutofillHostContent(String str, String str2, String str3, Long l) {
        this.host = str;
        this.merchantId = str2;
        this.merchantUserId = str3;
        this.LIZ = l;
    }
}
