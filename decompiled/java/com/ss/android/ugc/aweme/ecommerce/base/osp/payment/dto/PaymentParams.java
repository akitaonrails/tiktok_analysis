package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PayRiskControlParam;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentParams {

    @C09CT("consultation_id")
    public final String consultationId;

    @C09CT("payment_methods_data")
    public final IndependentPaymentMethodsData independentPaymentMethodsData;

    @C09CT("independent_pricing_param")
    public final Map<String, String> independentPricingParam;

    @C09CT("pay_risk_control_param")
    public final PayRiskControlParam payRiskControlParam;

    @C09CT("payment_methods")
    public final List<IndependentPricingPaymentMethodInfo> paymentMethods;

    public PaymentParams() {
        this(null, null, null, null, null);
    }

    public PaymentParams(List<IndependentPricingPaymentMethodInfo> list, String str, IndependentPaymentMethodsData independentPaymentMethodsData, Map<String, String> map, PayRiskControlParam payRiskControlParam) {
        this.paymentMethods = list;
        this.consultationId = str;
        this.independentPaymentMethodsData = independentPaymentMethodsData;
        this.independentPricingParam = map;
        this.payRiskControlParam = payRiskControlParam;
    }
}
