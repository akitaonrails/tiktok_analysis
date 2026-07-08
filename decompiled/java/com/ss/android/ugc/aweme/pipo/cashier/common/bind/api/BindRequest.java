package com.ss.android.ugc.aweme.pipo.cashier.common.bind.api;

import X.C09CT;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POPayElement;
import com.ss.android.ugc.aweme.pipo.cashier.common.pay.api.Configuration;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class BindRequest {

    @C09CT("cashier_type")
    public final String cashierType;

    @C09CT("commute_type")
    public final int commuteType;

    @C09CT("configuration")
    public final Configuration configuration;

    @C09CT("country_or_region")
    public final String countryOrRegion;

    @C09CT("elements")
    public final List<POPayElement> elements;

    @C09CT("merchant_id")
    public final String merchantId;

    @C09CT("merchant_user_id")
    public final String merchantUserId;

    @C09CT("payment_method_id")
    public final String paymentMethodId;

    @C09CT("payment_reference")
    public final String paymentReference;

    @C09CT("pipo_error_code_params")
    public String pipoErrorCodeParams;

    @C09CT("request_id")
    public final String requestId;

    @C09CT("return_link")
    public final String returnLink;

    @C09CT("risk_info")
    public final String riskInfo;

    public BindRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Configuration configuration, String str9, List<POPayElement> list, String str10) {
        this.merchantId = str;
        this.merchantUserId = str2;
        this.paymentMethodId = str3;
        this.countryOrRegion = str4;
        this.riskInfo = str5;
        this.returnLink = str6;
        this.requestId = str7;
        this.cashierType = str8;
        this.commuteType = i;
        this.configuration = configuration;
        this.paymentReference = str9;
        this.elements = list;
        this.pipoErrorCodeParams = str10;
    }
}
