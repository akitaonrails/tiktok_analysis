package com.bytedance.pipo.ttpay.recharge.network;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class SubmitPaymentRequestContent implements Serializable {

    @C09CT("configuration")
    public final Configuration configuration;

    @C09CT("country_or_region")
    public final String countryOrRegion;

    @C09CT("expired_time")
    public final Long expiredTime;

    @C09CT("fund_type")
    public final String fundType;

    @C09CT("payment_instrument_info")
    public final PaymentInstrumentInfo paymentInstrumentInfo;

    @C09CT("payment_method_info")
    public final PaymentMethodInfo paymentMethodInfo;

    @C09CT("payment_params")
    public final List<PaymentParam> paymentParams;

    @C09CT("pc_product_code")
    public final String pcProductCode;

    @C09CT("request_amount")
    public final Amount requestAmount;

    @C09CT("request_merchant_id")
    public final String requestMerchantId;

    @C09CT("request_order_id")
    public final String requestOrderId;

    @C09CT("request_source")
    public final String requestSource;

    @C09CT("return_link")
    public final String returnLink;

    @C09CT("risk_info")
    public final String riskInfo;

    @C09CT("scene_code")
    public final String sceneCode;

    @C09CT("store_payment_method")
    public final Boolean storePaymentMethod;

    @C09CT("unified_pd_code")
    public final String unifiedPdCode;

    public SubmitPaymentRequestContent() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public SubmitPaymentRequestContent(Long l, String str, String str2, PaymentMethodInfo paymentMethodInfo, PaymentInstrumentInfo paymentInstrumentInfo, List<PaymentParam> list, Boolean bool, String str3, String str4, String str5, String str6, Amount amount, String str7, String str8, Configuration configuration, String str9, String str10) {
        this.expiredTime = l;
        this.requestOrderId = str;
        this.requestMerchantId = str2;
        this.paymentMethodInfo = paymentMethodInfo;
        this.paymentInstrumentInfo = paymentInstrumentInfo;
        this.paymentParams = list;
        this.storePaymentMethod = bool;
        this.countryOrRegion = str3;
        this.fundType = str4;
        this.pcProductCode = str5;
        this.sceneCode = str6;
        this.requestAmount = amount;
        this.riskInfo = str7;
        this.returnLink = str8;
        this.configuration = configuration;
        this.unifiedPdCode = str9;
        this.requestSource = str10;
    }
}
