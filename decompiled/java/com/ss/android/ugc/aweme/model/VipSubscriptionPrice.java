package com.ss.android.ugc.aweme.model;

import X.C09CT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class VipSubscriptionPrice implements Serializable {
    public static final int $stable = 0;

    @C09CT("google_base_plan_id")
    public final String basePlanId;

    @C09CT("discount_price_in_usd")
    public final String discountPriceInUsd;

    @C09CT("local_currency_code")
    public final String localCurrencyCode;

    @C09CT("local_discount_price_amount")
    public final String localDiscountPriceAmount;

    @C09CT("local_price_amount")
    public final String localPriceAmount;

    @C09CT("mp_price_point_id")
    public final String mpPricePointId;

    @C09CT("mp_product_id")
    public final String mpProductId;

    @C09CT("price_in_usd")
    public final String priceInUsd;

    @C09CT("promotion_flag")
    public final String promotionFlag;

    @C09CT("promotion_offer_id")
    public final String promotionOfferId;

    @C09CT("sku_id")
    public final String skuId;

    @C09CT("spu_id")
    public final String spuId;

    @C09CT("voucher_id")
    public final String voucherId;

    public final VipSubscriptionPrice copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        return new VipSubscriptionPrice(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VipSubscriptionPrice)) {
            return false;
        }
        VipSubscriptionPrice vipSubscriptionPrice = (VipSubscriptionPrice) obj;
        return Intrinsics.LJFF(this.spuId, vipSubscriptionPrice.spuId) && Intrinsics.LJFF(this.skuId, vipSubscriptionPrice.skuId) && Intrinsics.LJFF(this.priceInUsd, vipSubscriptionPrice.priceInUsd) && Intrinsics.LJFF(this.localPriceAmount, vipSubscriptionPrice.localPriceAmount) && Intrinsics.LJFF(this.localCurrencyCode, vipSubscriptionPrice.localCurrencyCode) && Intrinsics.LJFF(this.discountPriceInUsd, vipSubscriptionPrice.discountPriceInUsd) && Intrinsics.LJFF(this.localDiscountPriceAmount, vipSubscriptionPrice.localDiscountPriceAmount) && Intrinsics.LJFF(this.voucherId, vipSubscriptionPrice.voucherId) && Intrinsics.LJFF(this.mpProductId, vipSubscriptionPrice.mpProductId) && Intrinsics.LJFF(this.mpPricePointId, vipSubscriptionPrice.mpPricePointId) && Intrinsics.LJFF(this.promotionFlag, vipSubscriptionPrice.promotionFlag) && Intrinsics.LJFF(this.promotionOfferId, vipSubscriptionPrice.promotionOfferId) && Intrinsics.LJFF(this.basePlanId, vipSubscriptionPrice.basePlanId);
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.spuId.hashCode() * 31) + this.skuId.hashCode()) * 31) + this.priceInUsd.hashCode()) * 31) + this.localPriceAmount.hashCode()) * 31) + this.localCurrencyCode.hashCode()) * 31) + this.discountPriceInUsd.hashCode()) * 31) + this.localDiscountPriceAmount.hashCode()) * 31) + this.voucherId.hashCode()) * 31) + this.mpProductId.hashCode()) * 31) + this.mpPricePointId.hashCode()) * 31) + this.promotionFlag.hashCode()) * 31) + this.promotionOfferId.hashCode()) * 31) + this.basePlanId.hashCode();
    }

    public String toString() {
        return "VipSubscriptionPrice(spuId=" + this.spuId + ", skuId=" + this.skuId + ", priceInUsd=" + this.priceInUsd + ", localPriceAmount=" + this.localPriceAmount + ", localCurrencyCode=" + this.localCurrencyCode + ", discountPriceInUsd=" + this.discountPriceInUsd + ", localDiscountPriceAmount=" + this.localDiscountPriceAmount + ", voucherId=" + this.voucherId + ", mpProductId=" + this.mpProductId + ", mpPricePointId=" + this.mpPricePointId + ", promotionFlag=" + this.promotionFlag + ", promotionOfferId=" + this.promotionOfferId + ", basePlanId=" + this.basePlanId + ')';
    }

    public VipSubscriptionPrice() {
        this("", "", "", "", "", "", "", "", "", "", "", "", "");
    }

    public VipSubscriptionPrice(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        this.spuId = str;
        this.skuId = str2;
        this.priceInUsd = str3;
        this.localPriceAmount = str4;
        this.localCurrencyCode = str5;
        this.discountPriceInUsd = str6;
        this.localDiscountPriceAmount = str7;
        this.voucherId = str8;
        this.mpProductId = str9;
        this.mpPricePointId = str10;
        this.promotionFlag = str11;
        this.promotionOfferId = str12;
        this.basePlanId = str13;
    }
}
