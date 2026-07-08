package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentMethodPayInfo {

    @C09CT("amount")
    public final String amount;

    @C09CT("not_deductable_on_marketing_bind_payment_method")
    public final Boolean notDeductableOnMarketingBindPaymentMethod;

    @C09CT("payment_before_pay_promotion")
    public final String paymentBeforePayPromotion;

    @C09CT("payment_method")
    public final PaymentMethodInfo paymentMethod;

    @C09CT("promotion_id")
    public final String promotionId;

    public PaymentMethodPayInfo() {
        this(null, null, null, null, null);
    }

    public PaymentMethodPayInfo(String str, PaymentMethodInfo paymentMethodInfo, String str2, String str3, Boolean bool) {
        this.amount = str;
        this.paymentMethod = paymentMethodInfo;
        this.paymentBeforePayPromotion = str2;
        this.promotionId = str3;
        this.notDeductableOnMarketingBindPaymentMethod = bool;
    }
}
