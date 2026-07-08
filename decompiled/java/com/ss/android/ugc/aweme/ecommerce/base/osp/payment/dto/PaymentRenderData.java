package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PaymentBillSummary;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PaymentPlaceOrderButton;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentRenderData {

    @C09CT("payment_methods")
    public final List<PaymentMethod> paymentMethods;

    @C09CT("payment_methods_data")
    public final PaymentMethodsData paymentMethodsData;

    @C09CT("payment_place_order_button")
    public final PaymentPlaceOrderButton paymentPlaceOrderButton;

    @C09CT("service_extra_token")
    public final String paymentServiceFeeToken;

    @C09CT("payment_summary")
    public final List<PaymentBillSummary> paymentSummary;

    public PaymentRenderData(List<PaymentMethod> list, List<PaymentBillSummary> list2, String str, PaymentMethodsData paymentMethodsData, PaymentPlaceOrderButton paymentPlaceOrderButton) {
        this.paymentMethods = list;
        this.paymentSummary = list2;
        this.paymentServiceFeeToken = str;
        this.paymentMethodsData = paymentMethodsData;
        this.paymentPlaceOrderButton = paymentPlaceOrderButton;
    }
}
