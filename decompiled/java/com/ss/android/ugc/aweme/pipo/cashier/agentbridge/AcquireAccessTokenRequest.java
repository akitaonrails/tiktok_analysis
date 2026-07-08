package com.ss.android.ugc.aweme.pipo.cashier.agentbridge;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class AcquireAccessTokenRequest {

    @C09CT("country_or_region")
    public final String countryOrRegion;

    @C09CT("merchant_id")
    public final String merchantId;

    @C09CT("request_time")
    public final String requestTime;

    public AcquireAccessTokenRequest() {
        this(null, "", null);
    }

    public AcquireAccessTokenRequest(String str, String str2, String str3) {
        this.merchantId = str;
        this.requestTime = str2;
        this.countryOrRegion = str3;
    }
}
