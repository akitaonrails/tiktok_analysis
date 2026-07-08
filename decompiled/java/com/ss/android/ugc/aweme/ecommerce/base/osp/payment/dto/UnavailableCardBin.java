package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class UnavailableCardBin {

    @C09CT("card_bin")
    public String cardBin;

    @C09CT("payment_tips")
    public PaymentTip paymentTips;

    public UnavailableCardBin() {
    }

    public UnavailableCardBin(String str, PaymentTip paymentTip) {
        this.cardBin = str;
        this.paymentTips = paymentTip;
    }
}
