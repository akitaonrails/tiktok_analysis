package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class IndependentCreditInfo {

    @C09CT("credit_payment_method")
    public final IndependentPricingPaymentMethodInfo creditPaymentMethod;

    @C09CT("payment_methods")
    public final List<IndependentPricingPaymentMethodInfo> paymentMethods;

    @C09CT("remained_amount")
    public final Amount remainedAmount;

    public IndependentCreditInfo() {
        this(null, null, null);
    }

    public IndependentCreditInfo(IndependentPricingPaymentMethodInfo independentPricingPaymentMethodInfo, List<IndependentPricingPaymentMethodInfo> list, Amount amount) {
        this.creditPaymentMethod = independentPricingPaymentMethodInfo;
        this.paymentMethods = list;
        this.remainedAmount = amount;
    }
}
