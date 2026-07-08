package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentExtra {

    @C09CT("cvv_collected")
    public final Boolean cvvCollected;

    @C09CT("payment_tag")
    public final String paymentTag;

    @C09CT("promotion_activity_type")
    public final Integer promotionActivityType;

    public PaymentExtra(String str, Boolean bool, Integer num) {
        this.paymentTag = str;
        this.cvvCollected = bool;
        this.promotionActivityType = num;
    }

    public static PaymentExtra LIZ(PaymentExtra paymentExtra, Boolean bool, Integer num, int i) {
        String str;
        if ((i & 1) != 0) {
            str = paymentExtra.paymentTag;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            bool = paymentExtra.cvvCollected;
        }
        if ((i & 4) != 0) {
            num = paymentExtra.promotionActivityType;
        }
        paymentExtra.getClass();
        return new PaymentExtra(str, bool, num);
    }
}
