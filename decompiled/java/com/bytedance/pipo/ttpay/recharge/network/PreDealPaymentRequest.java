package com.bytedance.pipo.ttpay.recharge.network;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class PreDealPaymentRequest implements Serializable {

    @C09CT("configuration")
    public final Configuration configuration;

    @C09CT("country_or_region")
    public final String countryOrRegion;

    @C09CT("is_need_store_payment_method")
    public final Boolean isNeedStorePaymentMethod;

    @C09CT("merchant_id")
    public final String merchantId;

    @C09CT("merchant_user_id")
    public final String merchantUserId;

    @C09CT("payment_method")
    public final PaymentMethodInfo paymentMethodInfo;

    @C09CT("pc_product_code")
    public final String pcProductCode;

    @C09CT("pipo_error_code_params")
    public final String pipoErrorCodeParams;

    @C09CT("return_link")
    public final String returnLink;

    @C09CT("risk_info")
    public final String riskInfo;

    @C09CT("trade_id")
    public final String tradeId;

    @C09CT("trade_type")
    public final String tradeType;

    public final Boolean isNeedStorePaymentMethod() {
        return this.isNeedStorePaymentMethod;
    }

    public PreDealPaymentRequest(String str, String str2, String str3, String str4, String str5, PaymentMethodInfo paymentMethodInfo, String str6, Configuration configuration, String str7, Boolean bool, String str8, String str9) {
        this.merchantId = str;
        this.merchantUserId = str2;
        this.tradeType = str3;
        this.pcProductCode = str4;
        this.countryOrRegion = str5;
        this.paymentMethodInfo = paymentMethodInfo;
        this.riskInfo = str6;
        this.configuration = configuration;
        this.tradeId = str7;
        this.isNeedStorePaymentMethod = bool;
        this.returnLink = str8;
        this.pipoErrorCodeParams = str9;
    }
}
