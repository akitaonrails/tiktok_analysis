package com.ss.android.ugc.aweme.pipo.cashier.common.pay.api;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class GeneralQueryRequestBody {

    @C09CT("biz_id")
    public final String bizId;

    @C09CT("configuration")
    public final Configuration configuration;

    @C09CT("merchant_id")
    public final String merchantId;

    @C09CT("merchant_user_id")
    public final String merchantUserId;

    @C09CT("out_pay_id")
    public final String outPayId;

    @C09CT("payment_reference")
    public final String paymentReference;

    @C09CT("pipo_error_code_params")
    public String pipoErrorCodeParams;

    public GeneralQueryRequestBody() {
        this(null, null, null, null, null, new Configuration(null, null, null, null, null, null, null, null, null, null, 1023, null), null);
    }

    public GeneralQueryRequestBody(String str, String str2, String str3, String str4, String str5, Configuration configuration, String str6) {
        this.merchantId = str;
        this.merchantUserId = str2;
        this.paymentReference = str3;
        this.outPayId = str4;
        this.bizId = str5;
        this.configuration = configuration;
        this.pipoErrorCodeParams = str6;
    }
}
