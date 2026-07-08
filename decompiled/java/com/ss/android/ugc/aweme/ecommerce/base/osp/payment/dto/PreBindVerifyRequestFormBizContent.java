package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import X.C900203fU;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class PreBindVerifyRequestFormBizContent {

    @C09CT("amount")
    public final String amount;

    @C09CT("biz_merchant_id")
    public final String bizMerchantUserId;

    @C09CT("cashier_type")
    public final String cashierType;

    @C09CT("configuration")
    public final C900203fU configuration;

    @C09CT("country_or_region")
    public final String countryOrRegion;

    @C09CT("currency")
    public final String currency;

    @C09CT("elements")
    public final List<PaymentElement> elements;

    @C09CT("initiator_type")
    public final String initiatorType;

    @C09CT("merchant_id")
    public final String merchantId;

    @C09CT("merchant_user_id")
    public final String merchantUserId;

    @C09CT("payment_method_id")
    public final String paymentMethodId;

    @C09CT("pipo_error_code_params")
    public String pipoErrorCodeParams;

    @C09CT("request_id")
    public final String requestId;

    @C09CT("risk_info")
    public final String riskInfo;

    @C09CT("scene_tag")
    public final List<String> sceneTag;

    @C09CT("source")
    public final String source;

    public PreBindVerifyRequestFormBizContent(String str, String str2, String str3, String str4, String str5, String str6, String str7, C900203fU c900203fU, String str8, String str9, String str10, String str11, List<PaymentElement> list, String str12, List<String> list2, String str13) {
        this.merchantUserId = str;
        this.merchantId = str2;
        this.bizMerchantUserId = str3;
        this.paymentMethodId = str4;
        this.currency = str5;
        this.riskInfo = str6;
        this.countryOrRegion = str7;
        this.configuration = c900203fU;
        this.cashierType = str8;
        this.initiatorType = str9;
        this.source = str10;
        this.amount = str11;
        this.elements = list;
        this.requestId = str12;
        this.sceneTag = list2;
        this.pipoErrorCodeParams = str13;
    }
}
