package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PayRiskControlParam;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class CalcPaymentMethodPriceRequest {

    @C09CT("combo_Id")
    public final String comboId;

    @C09CT("consultation_id")
    public final String consultationId;

    @C09CT("payment_methods_data")
    public final IndependentPaymentMethodsData independentPaymentMethodsData;

    @C09CT("independent_pricing_param")
    public final Map<String, String> independentPricingParam;

    @C09CT("last_pay_order_id")
    public final String lastPayOrderId;

    @C09CT("order_ids")
    public final List<String> orderIds;

    @C09CT("pay_risk_control_param")
    public final PayRiskControlParam payRiskControlParam;

    @C09CT("payment_methods")
    public final List<IndependentPricingPaymentMethodInfo> paymentMethods;

    public CalcPaymentMethodPriceRequest(String str, List<String> list, String str2, PayRiskControlParam payRiskControlParam, List<IndependentPricingPaymentMethodInfo> list2, String str3, IndependentPaymentMethodsData independentPaymentMethodsData, Map<String, String> map) {
        this.comboId = str;
        this.orderIds = list;
        this.lastPayOrderId = str2;
        this.payRiskControlParam = payRiskControlParam;
        this.paymentMethods = list2;
        this.consultationId = str3;
        this.independentPaymentMethodsData = independentPaymentMethodsData;
        this.independentPricingParam = map;
    }
}
