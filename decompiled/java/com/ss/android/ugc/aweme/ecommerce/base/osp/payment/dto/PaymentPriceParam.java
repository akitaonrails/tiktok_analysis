package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentPriceParam {

    @C09CT("card_bin")
    public final String cardBin;

    @C09CT("consultation_id")
    public final String consultationId;

    @C09CT("is_installment")
    public Boolean isInstallment;

    @C09CT("payment_price_version_id")
    public final String paymentPriceVersionId;

    @C09CT("payment_service_extra_token")
    public final String paymentServiceFeeToken;

    @C09CT("payment_unit_id")
    public final String paymentUnitId;

    public PaymentPriceParam(String str, String str2, String str3, String str4, String str5, Boolean bool) {
        this.paymentPriceVersionId = str;
        this.paymentUnitId = str2;
        this.paymentServiceFeeToken = str3;
        this.cardBin = str4;
        this.consultationId = str5;
        this.isInstallment = bool;
    }
}
