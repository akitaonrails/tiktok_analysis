package com.ss.android.ugc.aweme.ecommerce.base.payment.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentParams {

    @C09CT("amount")
    public final String amount;

    @C09CT("amount_before_payment_promotion")
    public final String amountBeforePaymentPromotion;

    @C09CT("charge_id")
    public final String chargeId;

    @C09CT("currency")
    public final String currency;

    @C09CT("payment_action_id")
    public final String paymentActionId;

    @C09CT("payment_reference")
    public final String paymentReference;

    @C09CT("pipo_quote_amount")
    public final String pipoQuoteAmount;

    @C09CT("poll_pay_status_when_abort")
    public final Boolean pollPayStatusWhenBreak;

    @C09CT("sub_merchant_id")
    public final String subMerchantId;

    public PaymentParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, String str8) {
        this.amount = str;
        this.chargeId = str2;
        this.currency = str3;
        this.paymentReference = str4;
        this.subMerchantId = str5;
        this.amountBeforePaymentPromotion = str6;
        this.paymentActionId = str7;
        this.pollPayStatusWhenBreak = bool;
        this.pipoQuoteAmount = str8;
    }
}
