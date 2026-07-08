package com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class PayRequestPaymentMethod {

    @C09CT("installment_option_id")
    public final String installmentOptionId;

    @C09CT("installment_plan_id")
    public final String installmentPlanId;

    @C09CT("method_id")
    public final String methodId;

    @C09CT("method_type")
    public final String methodType;

    @C09CT("payment_elements")
    public List<PayRequestElement> paymentElements;

    @C09CT("payment_method")
    public final String paymentMethod;

    @C09CT("payment_method_id")
    public final String paymentMethodId;

    @C09CT("payment_method_token")
    public final String paymentMethodToken;

    @C09CT("payment_option_id")
    public final String paymentOptionId;

    @C09CT("payment_unit_id")
    public final String paymentUnitId;

    @C09CT("tenure")
    public final Long tenure;

    @C09CT("trade_type")
    public final String tradeType;

    public PayRequestPaymentMethod() {
        this(null, null, null, null, null, "PAYIN", null, null, null, null, null, null);
    }

    public PayRequestPaymentMethod(String str, String str2, String str3, String str4, String str5, String str6, List<PayRequestElement> list, String str7, String str8, Long l, String str9, String str10) {
        this.paymentMethodId = str;
        this.paymentMethodToken = str2;
        this.methodType = str3;
        this.paymentMethod = str4;
        this.methodId = str5;
        this.tradeType = str6;
        this.paymentElements = list;
        this.paymentOptionId = str7;
        this.paymentUnitId = str8;
        this.tenure = l;
        this.installmentPlanId = str9;
        this.installmentOptionId = str10;
    }
}
