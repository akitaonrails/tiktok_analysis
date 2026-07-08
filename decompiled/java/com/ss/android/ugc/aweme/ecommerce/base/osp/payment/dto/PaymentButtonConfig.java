package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentButtonConfig {

    @C09CT("oneclick_page")
    public PaymentButtonStyle oneClickPayPage;

    @C09CT("recommend_and_paypage")
    public PaymentButtonStyle recommendAndPayPage;

    @C09CT("second_pay_page")
    public PaymentButtonStyle secondPayPage;

    public PaymentButtonConfig() {
        this(null, null, null);
    }

    public PaymentButtonConfig(PaymentButtonStyle paymentButtonStyle, PaymentButtonStyle paymentButtonStyle2, PaymentButtonStyle paymentButtonStyle3) {
        this.recommendAndPayPage = paymentButtonStyle;
        this.secondPayPage = paymentButtonStyle2;
        this.oneClickPayPage = paymentButtonStyle3;
    }
}
