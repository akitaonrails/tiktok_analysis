package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentMarketingInfo {

    @C09CT("marketing_bank_code")
    public final String bankCode;

    @C09CT("is_not_meet_promotion_threshold")
    public final Boolean isNotMeetPromotionThreshold;

    @C09CT("payment_method_id")
    public final String paymentMethodId;

    @C09CT("promotion_amount")
    public final String promotionAmountVal;

    @C09CT("promotion_desc_header")
    public final String promotionDescHeader;

    @C09CT("promotion_id")
    public final String promotionId;

    @C09CT("tenure")
    public final String tenure;

    public PaymentMarketingInfo(String str, String str2, String str3, String str4, String str5, Boolean bool, String str6) {
        this.promotionId = str;
        this.paymentMethodId = str2;
        this.promotionAmountVal = str3;
        this.bankCode = str4;
        this.promotionDescHeader = str5;
        this.isNotMeetPromotionThreshold = bool;
        this.tenure = str6;
    }
}
