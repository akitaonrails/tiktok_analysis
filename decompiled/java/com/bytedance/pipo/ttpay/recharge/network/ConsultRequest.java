package com.bytedance.pipo.ttpay.recharge.network;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class ConsultRequest implements Serializable {

    @C09CT("amount")
    public final Amount amount;

    @C09CT("country_or_region")
    public final String countryOrRegion;

    @C09CT("merchant_id")
    public final String merchantId;

    @C09CT("merchant_user_id")
    public final String merchantUserId;

    @C09CT("payment_method_info")
    public final PaymentMethodInfo paymentMethodInfo;

    @C09CT("pc_product_code")
    public final String pcProductCode;

    @C09CT("pipo_error_code_params")
    public final String pipoErrorCodeParams;

    @C09CT("product_code")
    public final String productCode;

    @C09CT("risk_info")
    public final String riskInfo;

    @C09CT("trade_type")
    public final String tradeType;

    @C09CT("unified_pd_code")
    public final String unifiedPdCode;

    public ConsultRequest(String str, String str2, String str3, String str4, String str5, String str6, Amount amount, PaymentMethodInfo paymentMethodInfo, String str7, String str8, String str9) {
        this.merchantId = str;
        this.merchantUserId = str2;
        this.tradeType = str3;
        this.pcProductCode = str4;
        this.productCode = str5;
        this.countryOrRegion = str6;
        this.amount = amount;
        this.paymentMethodInfo = paymentMethodInfo;
        this.riskInfo = str7;
        this.unifiedPdCode = str8;
        this.pipoErrorCodeParams = str9;
    }
}
