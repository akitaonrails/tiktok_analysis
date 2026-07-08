package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class IndependentPaymentMethodsData {

    @C09CT("combine_payment_info")
    public final IndependentCombinePaymentInfo combinePaymentInfo;

    @C09CT("elevator_bars")
    public final List<ElevatorBar> elevatorBars;

    @C09CT("independent_pricing_param")
    public final Map<String, String> independentPricingParam;

    @C09CT("payment_methods")
    public final List<IndependentPricingPaymentMethodInfo> paymentMethods;

    @C09CT("retain_infos")
    public final List<RetainInfo> retainInfos;

    public IndependentPaymentMethodsData() {
        this(null, null, null, null, null);
    }

    public IndependentPaymentMethodsData(List<IndependentPricingPaymentMethodInfo> list, IndependentCombinePaymentInfo independentCombinePaymentInfo, List<ElevatorBar> list2, List<RetainInfo> list3, Map<String, String> map) {
        this.paymentMethods = list;
        this.combinePaymentInfo = independentCombinePaymentInfo;
        this.elevatorBars = list2;
        this.retainInfos = list3;
        this.independentPricingParam = map;
    }
}
