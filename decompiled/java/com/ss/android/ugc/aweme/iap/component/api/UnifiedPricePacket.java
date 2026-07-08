package com.ss.android.ugc.aweme.iap.component.api;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class UnifiedPricePacket {

    @C09CT("discount")
    public final Discount discount;

    @C09CT("google_base_plan_id")
    public final String googleBasePlanId;

    @C09CT("iap_id")
    public final String iapId;

    @C09CT("internal_iap_id")
    public final String internalIapId;

    @C09CT("local_currency_code")
    public final String localCurrencyCode;

    @C09CT("local_currency_symbol")
    public final String localCurrencySymbol;

    @C09CT("local_price_amount")
    public final String localPriceAmount;

    @C09CT("mp_price_point_id")
    public final String mpPricePointId;

    @C09CT("mp_product_id")
    public final String mpProductId;

    @C09CT("price_in_usd")
    public final String priceInUsd;

    @C09CT("time_unit")
    public final String timeUnit;

    public UnifiedPricePacket() {
        this(null, null, null, null, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnifiedPricePacket)) {
            return false;
        }
        UnifiedPricePacket unifiedPricePacket = (UnifiedPricePacket) obj;
        return Intrinsics.LJFF(this.priceInUsd, unifiedPricePacket.priceInUsd) && Intrinsics.LJFF(this.localPriceAmount, unifiedPricePacket.localPriceAmount) && Intrinsics.LJFF(this.localCurrencyCode, unifiedPricePacket.localCurrencyCode) && Intrinsics.LJFF(this.discount, unifiedPricePacket.discount) && Intrinsics.LJFF(this.iapId, unifiedPricePacket.iapId) && Intrinsics.LJFF(this.mpProductId, unifiedPricePacket.mpProductId) && Intrinsics.LJFF(this.mpPricePointId, unifiedPricePacket.mpPricePointId) && Intrinsics.LJFF(this.googleBasePlanId, unifiedPricePacket.googleBasePlanId) && Intrinsics.LJFF(this.localCurrencySymbol, unifiedPricePacket.localCurrencySymbol) && Intrinsics.LJFF(this.timeUnit, unifiedPricePacket.timeUnit) && Intrinsics.LJFF(this.internalIapId, unifiedPricePacket.internalIapId);
    }

    public final int hashCode() {
        String str = this.priceInUsd;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.localPriceAmount;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.localCurrencyCode;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Discount discount = this.discount;
        int iHashCode4 = (iHashCode3 + (discount == null ? 0 : discount.hashCode())) * 31;
        String str4 = this.iapId;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.mpProductId;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.mpPricePointId;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.googleBasePlanId;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.localCurrencySymbol;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.timeUnit;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.internalIapId;
        return iHashCode10 + (str10 != null ? str10.hashCode() : 0);
    }

    public final String toString() {
        return "UnifiedPricePacket(priceInUsd=" + this.priceInUsd + ", localPriceAmount=" + this.localPriceAmount + ", localCurrencyCode=" + this.localCurrencyCode + ", discount=" + this.discount + ", iapId=" + this.iapId + ", mpProductId=" + this.mpProductId + ", mpPricePointId=" + this.mpPricePointId + ", googleBasePlanId=" + this.googleBasePlanId + ", localCurrencySymbol=" + this.localCurrencySymbol + ", timeUnit=" + this.timeUnit + ", internalIapId=" + this.internalIapId + ')';
    }

    public UnifiedPricePacket(String str, String str2, String str3, Discount discount, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.priceInUsd = str;
        this.localPriceAmount = str2;
        this.localCurrencyCode = str3;
        this.discount = discount;
        this.iapId = str4;
        this.mpProductId = str5;
        this.mpPricePointId = str6;
        this.googleBasePlanId = str7;
        this.localCurrencySymbol = str8;
        this.timeUnit = str9;
        this.internalIapId = str10;
    }
}
