package com.ss.android.ugc.aweme.minis.model.payment.subscription;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.DiscountInfo;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.InnerGetSubscriptionTierInfoResponseData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class InnerGetSubscriptionTierInfoResponseData implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<InnerGetSubscriptionTierInfoResponseData> CREATOR = new Parcelable.Creator<InnerGetSubscriptionTierInfoResponseData>() { // from class: X.0wVD
        @Override // android.os.Parcelable.Creator
        public final InnerGetSubscriptionTierInfoResponseData createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Long lValueOf;
            DiscountInfo discountInfoCreateFromParcel;
            DiscountInfo discountInfoCreateFromParcel2;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            if (parcel.readInt() == 0) {
                discountInfoCreateFromParcel = null;
            } else {
                discountInfoCreateFromParcel = DiscountInfo.CREATOR.createFromParcel(parcel);
            }
            DiscountInfo discountInfo = discountInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                discountInfoCreateFromParcel2 = null;
            } else {
                discountInfoCreateFromParcel2 = DiscountInfo.CREATOR.createFromParcel(parcel);
            }
            return new InnerGetSubscriptionTierInfoResponseData(string, numValueOf, string2, string3, string4, string5, string6, lValueOf, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, discountInfo, discountInfoCreateFromParcel2);
        }

        @Override // android.os.Parcelable.Creator
        public final InnerGetSubscriptionTierInfoResponseData[] newArray(int i) {
            return new InnerGetSubscriptionTierInfoResponseData[i];
        }
    };

    @C09CT("base_plan_id")
    public final String basePlanId;

    @C09CT("currency")
    public final String currency;

    @C09CT("deduct_cycle")
    public final Integer deductCycle;

    @C09CT("deduct_type")
    public final String deductType;

    @C09CT("discount_info")
    public final DiscountInfo discountInfo;

    @C09CT("next_deduct_time")
    public final Long nextDeductTime;

    @C09CT("offer_id")
    public final String offerId;

    @C09CT("price")
    public final String price;

    @C09CT("qcpx_discount_amount")
    public final String qcpxDiscountAmount;

    @C09CT("qcpx_discount_rate")
    public final String qcpxDiscountRate;

    @C09CT("qcpx_price")
    public final String qcpxPrice;

    @C09CT("qcpx_web_discount_amount")
    public final String qcpxWebDiscountAmount;

    @C09CT("qcpx_web_discount_rate")
    public final String qcpxWebDiscountRate;

    @C09CT("qcpx_web_price")
    public final String qcpxWebPrice;

    @C09CT("sku_id")
    public final String skuId;

    @C09CT("symbol")
    public final String symbol;

    @C09CT("tier_id")
    public final String tierId;

    @C09CT("web_discount_info")
    public final DiscountInfo webDiscountInfo;

    @C09CT("web_price")
    public final String webPrice;

    @C09CT("web_price_discount_amount")
    public final String webPriceDiscountAmount;

    @C09CT("web_price_discount_rate")
    public final String webPriceDiscountRate;

    public InnerGetSubscriptionTierInfoResponseData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InnerGetSubscriptionTierInfoResponseData)) {
            return false;
        }
        InnerGetSubscriptionTierInfoResponseData innerGetSubscriptionTierInfoResponseData = (InnerGetSubscriptionTierInfoResponseData) obj;
        return Intrinsics.LJFF(this.tierId, innerGetSubscriptionTierInfoResponseData.tierId) && Intrinsics.LJFF(this.deductCycle, innerGetSubscriptionTierInfoResponseData.deductCycle) && Intrinsics.LJFF(this.deductType, innerGetSubscriptionTierInfoResponseData.deductType) && Intrinsics.LJFF(this.price, innerGetSubscriptionTierInfoResponseData.price) && Intrinsics.LJFF(this.currency, innerGetSubscriptionTierInfoResponseData.currency) && Intrinsics.LJFF(this.symbol, innerGetSubscriptionTierInfoResponseData.symbol) && Intrinsics.LJFF(this.basePlanId, innerGetSubscriptionTierInfoResponseData.basePlanId) && Intrinsics.LJFF(this.nextDeductTime, innerGetSubscriptionTierInfoResponseData.nextDeductTime) && Intrinsics.LJFF(this.skuId, innerGetSubscriptionTierInfoResponseData.skuId) && Intrinsics.LJFF(this.qcpxPrice, innerGetSubscriptionTierInfoResponseData.qcpxPrice) && Intrinsics.LJFF(this.qcpxDiscountRate, innerGetSubscriptionTierInfoResponseData.qcpxDiscountRate) && Intrinsics.LJFF(this.qcpxDiscountAmount, innerGetSubscriptionTierInfoResponseData.qcpxDiscountAmount) && Intrinsics.LJFF(this.qcpxWebPrice, innerGetSubscriptionTierInfoResponseData.qcpxWebPrice) && Intrinsics.LJFF(this.qcpxWebDiscountRate, innerGetSubscriptionTierInfoResponseData.qcpxWebDiscountRate) && Intrinsics.LJFF(this.qcpxWebDiscountAmount, innerGetSubscriptionTierInfoResponseData.qcpxWebDiscountAmount) && Intrinsics.LJFF(this.webPrice, innerGetSubscriptionTierInfoResponseData.webPrice) && Intrinsics.LJFF(this.webPriceDiscountRate, innerGetSubscriptionTierInfoResponseData.webPriceDiscountRate) && Intrinsics.LJFF(this.webPriceDiscountAmount, innerGetSubscriptionTierInfoResponseData.webPriceDiscountAmount) && Intrinsics.LJFF(this.offerId, innerGetSubscriptionTierInfoResponseData.offerId) && Intrinsics.LJFF(this.discountInfo, innerGetSubscriptionTierInfoResponseData.discountInfo) && Intrinsics.LJFF(this.webDiscountInfo, innerGetSubscriptionTierInfoResponseData.webDiscountInfo);
    }

    public final int hashCode() {
        String str = this.tierId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.deductCycle;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.deductType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.price;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.currency;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.symbol;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.basePlanId;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l = this.nextDeductTime;
        int iHashCode8 = (iHashCode7 + (l == null ? 0 : l.hashCode())) * 31;
        String str7 = this.skuId;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.qcpxPrice;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.qcpxDiscountRate;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.qcpxDiscountAmount;
        int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.qcpxWebPrice;
        int iHashCode13 = (iHashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.qcpxWebDiscountRate;
        int iHashCode14 = (iHashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.qcpxWebDiscountAmount;
        int iHashCode15 = (iHashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.webPrice;
        int iHashCode16 = (iHashCode15 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.webPriceDiscountRate;
        int iHashCode17 = (iHashCode16 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.webPriceDiscountAmount;
        int iHashCode18 = (iHashCode17 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.offerId;
        int iHashCode19 = (iHashCode18 + (str17 == null ? 0 : str17.hashCode())) * 31;
        DiscountInfo discountInfo = this.discountInfo;
        int iHashCode20 = (iHashCode19 + (discountInfo == null ? 0 : discountInfo.hashCode())) * 31;
        DiscountInfo discountInfo2 = this.webDiscountInfo;
        return iHashCode20 + (discountInfo2 != null ? discountInfo2.hashCode() : 0);
    }

    public final String toString() {
        return "InnerGetSubscriptionTierInfoResponseData(tierId=" + this.tierId + ", deductCycle=" + this.deductCycle + ", deductType=" + this.deductType + ", price=" + this.price + ", currency=" + this.currency + ", symbol=" + this.symbol + ", basePlanId=" + this.basePlanId + ", nextDeductTime=" + this.nextDeductTime + ", skuId=" + this.skuId + ", qcpxPrice=" + this.qcpxPrice + ", qcpxDiscountRate=" + this.qcpxDiscountRate + ", qcpxDiscountAmount=" + this.qcpxDiscountAmount + ", qcpxWebPrice=" + this.qcpxWebPrice + ", qcpxWebDiscountRate=" + this.qcpxWebDiscountRate + ", qcpxWebDiscountAmount=" + this.qcpxWebDiscountAmount + ", webPrice=" + this.webPrice + ", webPriceDiscountRate=" + this.webPriceDiscountRate + ", webPriceDiscountAmount=" + this.webPriceDiscountAmount + ", offerId=" + this.offerId + ", discountInfo=" + this.discountInfo + ", webDiscountInfo=" + this.webDiscountInfo + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.tierId);
        Integer num = this.deductCycle;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.deductType);
        parcel.writeString(this.price);
        parcel.writeString(this.currency);
        parcel.writeString(this.symbol);
        parcel.writeString(this.basePlanId);
        Long l = this.nextDeductTime;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.skuId);
        parcel.writeString(this.qcpxPrice);
        parcel.writeString(this.qcpxDiscountRate);
        parcel.writeString(this.qcpxDiscountAmount);
        parcel.writeString(this.qcpxWebPrice);
        parcel.writeString(this.qcpxWebDiscountRate);
        parcel.writeString(this.qcpxWebDiscountAmount);
        parcel.writeString(this.webPrice);
        parcel.writeString(this.webPriceDiscountRate);
        parcel.writeString(this.webPriceDiscountAmount);
        parcel.writeString(this.offerId);
        DiscountInfo discountInfo = this.discountInfo;
        if (discountInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            discountInfo.writeToParcel(parcel, i);
        }
        DiscountInfo discountInfo2 = this.webDiscountInfo;
        if (discountInfo2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            discountInfo2.writeToParcel(parcel, i);
        }
    }

    public InnerGetSubscriptionTierInfoResponseData(String str, Integer num, String str2, String str3, String str4, String str5, String str6, Long l, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, DiscountInfo discountInfo, DiscountInfo discountInfo2) {
        this.tierId = str;
        this.deductCycle = num;
        this.deductType = str2;
        this.price = str3;
        this.currency = str4;
        this.symbol = str5;
        this.basePlanId = str6;
        this.nextDeductTime = l;
        this.skuId = str7;
        this.qcpxPrice = str8;
        this.qcpxDiscountRate = str9;
        this.qcpxDiscountAmount = str10;
        this.qcpxWebPrice = str11;
        this.qcpxWebDiscountRate = str12;
        this.qcpxWebDiscountAmount = str13;
        this.webPrice = str14;
        this.webPriceDiscountRate = str15;
        this.webPriceDiscountAmount = str16;
        this.offerId = str17;
        this.discountInfo = discountInfo;
        this.webDiscountInfo = discountInfo2;
    }
}
