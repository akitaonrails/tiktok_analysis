package com.ss.android.ugc.aweme.pipo.cashier.common.risk;

import X.C09CT;
import com.ss.android.ugc.aweme.pipo.cashier.common.pay.api.Configuration;

/* JADX INFO: loaded from: classes27.dex */
public final class AuthenPreRiskRequest {

    @C09CT("configuration")
    public final Configuration configuration;

    @C09CT("country_or_region")
    public final String countryOrRegion;

    @C09CT("merchant_id")
    public final String merchantId;

    @C09CT("merchant_user_id")
    public final String merchantUserId;

    @C09CT("payment_method_id")
    public final String paymentMethodId;

    @C09CT("pipo_error_code_params")
    public String pipoErrorCodeParams;

    @C09CT("risk_info")
    public final String riskInfo;

    public AuthenPreRiskRequest() {
        this(null, null, null, null, null, new Configuration(null, null, null, null, null, null, null, null, null, null, 1023, null), null);
    }

    public AuthenPreRiskRequest(String str, String str2, String str3, String str4, String str5, Configuration configuration, String str6) {
        this.merchantId = str;
        this.merchantUserId = str2;
        this.paymentMethodId = str3;
        this.riskInfo = str4;
        this.countryOrRegion = str5;
        this.configuration = configuration;
        this.pipoErrorCodeParams = str6;
    }
}
