package com.ss.android.ugc.aweme.pipo.cashier.agentbridge;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class DelegatePaymentRequest {

    @C09CT("agent_platform")
    public final String agentPlatform;

    @C09CT("constraints")
    public final DelegatePaymentConstraints constraints;

    @C09CT("country_or_region")
    public final String countryOrRegion;

    @C09CT("instrument_id")
    public final String instrumentId;

    @C09CT("merchant_id")
    public final String merchantId;

    @C09CT("partner_platform")
    public final String partnerPlatform;

    @C09CT("request_time")
    public final String requestTime;

    @C09CT("risk_info")
    public final String riskInfo;

    public DelegatePaymentRequest() {
        this(null, null, "", null, "tiktok_commercialization", null, new DelegatePaymentConstraints(new DelegatePaymentInfo(null, null), true, 86400), null);
    }

    public DelegatePaymentRequest(String str, String str2, String str3, String str4, String str5, String str6, DelegatePaymentConstraints delegatePaymentConstraints, String str7) {
        this.instrumentId = str;
        this.merchantId = str2;
        this.requestTime = str3;
        this.countryOrRegion = str4;
        this.agentPlatform = str5;
        this.partnerPlatform = str6;
        this.constraints = delegatePaymentConstraints;
        this.riskInfo = str7;
    }
}
