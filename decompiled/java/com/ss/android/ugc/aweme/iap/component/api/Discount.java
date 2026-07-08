package com.ss.android.ugc.aweme.iap.component.api;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class Discount {

    @C09CT("discount_iap_id")
    public final String discountIapId;

    @C09CT("footer")
    public final FooterOverride footer;

    @C09CT("free_trial_info")
    public final FreeTrialInfo freeTrialInfo;

    @C09CT("local_price_amount")
    public final String localPriceAmount;

    @C09CT("offer_end_timestamp")
    public final Long offerEndTimestamp;

    @C09CT("offer_start_timestamp")
    public final Long offerStartTimestamp;

    @C09CT("price_in_usd")
    public final String priceInUsd;

    @C09CT("promotion_id")
    public final Long promotionId;

    @C09CT("promotion_offer_id")
    public final String promotionOfferId;

    @C09CT("type")
    public final Integer type;

    @C09CT("value")
    public final Float value;

    @C09CT("voucher_id")
    public final String voucherId;

    public Discount() {
        this(null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Discount)) {
            return false;
        }
        Discount discount = (Discount) obj;
        return Intrinsics.LJFF(this.priceInUsd, discount.priceInUsd) && Intrinsics.LJFF(this.localPriceAmount, discount.localPriceAmount) && Intrinsics.LJFF(this.value, discount.value) && Intrinsics.LJFF(this.type, discount.type) && Intrinsics.LJFF(this.offerStartTimestamp, discount.offerStartTimestamp) && Intrinsics.LJFF(this.offerEndTimestamp, discount.offerEndTimestamp) && Intrinsics.LJFF(this.voucherId, discount.voucherId) && Intrinsics.LJFF(this.promotionId, discount.promotionId) && Intrinsics.LJFF(this.discountIapId, discount.discountIapId) && Intrinsics.LJFF(this.freeTrialInfo, discount.freeTrialInfo) && Intrinsics.LJFF(this.footer, discount.footer) && Intrinsics.LJFF(this.promotionOfferId, discount.promotionOfferId);
    }

    public final int hashCode() {
        String str = this.priceInUsd;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.localPriceAmount;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Float f = this.value;
        int iHashCode3 = (iHashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        Integer num = this.type;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.offerStartTimestamp;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.offerEndTimestamp;
        int iHashCode6 = (iHashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str3 = this.voucherId;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l3 = this.promotionId;
        int iHashCode8 = (iHashCode7 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str4 = this.discountIapId;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        FreeTrialInfo freeTrialInfo = this.freeTrialInfo;
        int iHashCode10 = (iHashCode9 + (freeTrialInfo == null ? 0 : freeTrialInfo.hashCode())) * 31;
        FooterOverride footerOverride = this.footer;
        int iHashCode11 = (iHashCode10 + (footerOverride == null ? 0 : footerOverride.hashCode())) * 31;
        String str5 = this.promotionOfferId;
        return iHashCode11 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        return "Discount(priceInUsd=" + this.priceInUsd + ", localPriceAmount=" + this.localPriceAmount + ", value=" + this.value + ", type=" + this.type + ", offerStartTimestamp=" + this.offerStartTimestamp + ", offerEndTimestamp=" + this.offerEndTimestamp + ", voucherId=" + this.voucherId + ", promotionId=" + this.promotionId + ", discountIapId=" + this.discountIapId + ", freeTrialInfo=" + this.freeTrialInfo + ", footer=" + this.footer + ", promotionOfferId=" + this.promotionOfferId + ')';
    }

    public Discount(String str, String str2, Float f, Integer num, Long l, Long l2, String str3, Long l3, String str4, FreeTrialInfo freeTrialInfo, FooterOverride footerOverride, String str5) {
        this.priceInUsd = str;
        this.localPriceAmount = str2;
        this.value = f;
        this.type = num;
        this.offerStartTimestamp = l;
        this.offerEndTimestamp = l2;
        this.voucherId = str3;
        this.promotionId = l3;
        this.discountIapId = str4;
        this.freeTrialInfo = freeTrialInfo;
        this.footer = footerOverride;
        this.promotionOfferId = str5;
    }
}
