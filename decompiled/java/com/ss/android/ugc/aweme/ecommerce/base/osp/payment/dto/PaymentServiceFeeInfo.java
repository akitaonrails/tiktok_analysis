package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentServiceFeeInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("hybrid_remained_amount")
    public Amount hybridRemainedAmount;

    @C09CT("payment_fee_promotion_basic_infos")
    public List<PaymentFeePromotionBasicInfo> paymentFeePromotionBasicInfos;

    @C09CT("deduplicated_payment_fee_promotion_texts")
    public List<String> paymentFeePromotionTexts;

    @C09CT("payment_promotion_info")
    public PaymentPromotion paymentPromotionInfo;

    @C09CT("payment_service_fee_amount")
    public Amount paymentServiceFeeAmount;

    @C09CT("payment_service_fee_tips")
    public String paymentServiceFeeTips;

    @C09CT("payment_service_fee_tool_tips")
    public PaymentServiceFeeInfoToolTips paymentServiceFeeToolTips;

    public PaymentServiceFeeInfo() {
        this(null, null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentServiceFeeInfo)) {
            return false;
        }
        PaymentServiceFeeInfo paymentServiceFeeInfo = (PaymentServiceFeeInfo) obj;
        return Intrinsics.LJFF(this.paymentServiceFeeAmount, paymentServiceFeeInfo.paymentServiceFeeAmount) && Intrinsics.LJFF(this.hybridRemainedAmount, paymentServiceFeeInfo.hybridRemainedAmount) && Intrinsics.LJFF(this.paymentServiceFeeTips, paymentServiceFeeInfo.paymentServiceFeeTips) && Intrinsics.LJFF(this.paymentServiceFeeToolTips, paymentServiceFeeInfo.paymentServiceFeeToolTips) && Intrinsics.LJFF(this.paymentPromotionInfo, paymentServiceFeeInfo.paymentPromotionInfo) && Intrinsics.LJFF(this.paymentFeePromotionTexts, paymentServiceFeeInfo.paymentFeePromotionTexts) && Intrinsics.LJFF(this.paymentFeePromotionBasicInfos, paymentServiceFeeInfo.paymentFeePromotionBasicInfos);
    }

    public int hashCode() {
        Amount amount = this.paymentServiceFeeAmount;
        int iHashCode = (amount == null ? 0 : amount.hashCode()) * 31;
        Amount amount2 = this.hybridRemainedAmount;
        int iHashCode2 = (iHashCode + (amount2 == null ? 0 : amount2.hashCode())) * 31;
        String str = this.paymentServiceFeeTips;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        PaymentServiceFeeInfoToolTips paymentServiceFeeInfoToolTips = this.paymentServiceFeeToolTips;
        int iHashCode4 = (iHashCode3 + (paymentServiceFeeInfoToolTips == null ? 0 : paymentServiceFeeInfoToolTips.hashCode())) * 31;
        PaymentPromotion paymentPromotion = this.paymentPromotionInfo;
        int iHashCode5 = (iHashCode4 + (paymentPromotion == null ? 0 : paymentPromotion.hashCode())) * 31;
        List<String> list = this.paymentFeePromotionTexts;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<PaymentFeePromotionBasicInfo> list2 = this.paymentFeePromotionBasicInfos;
        return iHashCode6 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaymentServiceFeeInfo(paymentServiceFeeAmount=");
        sbLIZ.append(this.paymentServiceFeeAmount);
        sbLIZ.append(", hybridRemainedAmount=");
        sbLIZ.append(this.hybridRemainedAmount);
        sbLIZ.append(", paymentServiceFeeTips=");
        sbLIZ.append(this.paymentServiceFeeTips);
        sbLIZ.append(", paymentServiceFeeToolTips=");
        sbLIZ.append(this.paymentServiceFeeToolTips);
        sbLIZ.append(", paymentPromotionInfo=");
        sbLIZ.append(this.paymentPromotionInfo);
        sbLIZ.append(", paymentFeePromotionTexts=");
        sbLIZ.append(this.paymentFeePromotionTexts);
        sbLIZ.append(", paymentFeePromotionBasicInfos=");
        sbLIZ.append(this.paymentFeePromotionBasicInfos);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PaymentServiceFeeInfo(Amount amount, Amount amount2, String str, PaymentServiceFeeInfoToolTips paymentServiceFeeInfoToolTips, PaymentPromotion paymentPromotion, List<String> list, List<PaymentFeePromotionBasicInfo> list2) {
        this.paymentServiceFeeAmount = amount;
        this.hybridRemainedAmount = amount2;
        this.paymentServiceFeeTips = str;
        this.paymentServiceFeeToolTips = paymentServiceFeeInfoToolTips;
        this.paymentPromotionInfo = paymentPromotion;
        this.paymentFeePromotionTexts = list;
        this.paymentFeePromotionBasicInfos = list2;
    }
}
