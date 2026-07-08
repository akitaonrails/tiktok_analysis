package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class CalcPaymentMethodPriceData {

    @C09CT("payment_methods")
    public final List<PaymentMethod> paymentMethods;

    @C09CT("payment_methods_data")
    public final PaymentMethodsData paymentMethodsData;

    @C09CT("payment_price")
    public final List<PaymentPrice> paymentPrice;

    @C09CT("service_extra_token")
    public final String paymentServiceFeeToken;

    public CalcPaymentMethodPriceData(List<PaymentMethod> list, List<PaymentPrice> list2, String str, PaymentMethodsData paymentMethodsData) {
        this.paymentMethods = list;
        this.paymentPrice = list2;
        this.paymentServiceFeeToken = str;
        this.paymentMethodsData = paymentMethodsData;
    }
}
