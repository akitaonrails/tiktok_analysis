package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentFeePromotionBasicInfo implements Serializable {
    public static final int $stable = 0;

    @C09CT("is_not_meet_promotion_threshold")
    public Boolean isNotMeetPromotionThreshold;

    @C09CT("payment_method_id")
    public String paymentMethodId;

    @C09CT("promotion_id")
    public String promotionId;

    @C09CT("tenure")
    public String tenure;

    public PaymentFeePromotionBasicInfo() {
        this(null, null, null, null);
    }

    public int hashCode() {
        String str = this.paymentMethodId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tenure;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.promotionId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isNotMeetPromotionThreshold;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean isNotMeetPromotionThreshold() {
        return this.isNotMeetPromotionThreshold;
    }

    public PaymentFeePromotionBasicInfo(String str, String str2, String str3, Boolean bool) {
        this.paymentMethodId = str;
        this.tenure = str2;
        this.promotionId = str3;
        this.isNotMeetPromotionThreshold = bool;
    }
}
