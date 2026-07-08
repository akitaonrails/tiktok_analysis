package com.ss.android.ugc.aweme.ecommerce.base.combinepayment.payment.dto;

import X.C09CT;
import com.google.gson.n;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class RiskContextContent {

    @C09CT("country_or_region")
    public final String countryOrRegion;

    @C09CT("merchant_user_id")
    public final String merchantUserId;

    @C09CT("nonce")
    public final String nonce;

    @C09CT("payment_elements")
    public final Map<String, String> paymentElements;

    @C09CT("payment_method_id")
    public final String paymentMethodId;

    @C09CT("payment_method_token")
    public final String paymentMethodToken;

    @C09CT("pipo_error_code_params")
    public String pipoErrorCodeParams;

    @C09CT("pre_risk_id")
    public final String preRiskId;

    @C09CT("risk_info")
    public final n riskInfo;

    @C09CT("scenario")
    public final String scenario;

    public RiskContextContent(String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map, n nVar, String str7, String str8) {
        this.preRiskId = str;
        this.countryOrRegion = str2;
        this.merchantUserId = str3;
        this.scenario = str4;
        this.paymentMethodId = str5;
        this.paymentMethodToken = str6;
        this.paymentElements = map;
        this.riskInfo = nVar;
        this.nonce = str7;
        this.pipoErrorCodeParams = str8;
    }
}
