package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticsMeta;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class LogisticsMeta implements Parcelable {

    @C09CT("delivery_option")
    public final Integer deliveryOption;

    @C09CT("event_tracking")
    public final String eventTracking;

    @C09CT("free_shipping")
    public final Boolean freeShipping;

    @C09CT("logistics_service_id")
    public final String logisticsServiceId;

    @C09CT("no_ship_addr")
    public final Boolean noShipAddr;

    @C09CT("original_price_val")
    public final String originalPriceVal;

    @C09CT("promotion_da_info")
    public final String promotionDaInfo;

    @C09CT("reach_able")
    public final Boolean reachable;

    @C09CT("shipping_fee")
    public final com.ss.android.ugc.aweme.ecommerce.base.common.model.Price shippingFee;

    @C09CT("voucher_da_info")
    public final String voucherDaInfo;
    public static final Parcelable.Creator<LogisticsMeta> CREATOR = new Parcelable.Creator<LogisticsMeta>() { // from class: X.02pV
        @Override // android.os.Parcelable.Creator
        public final LogisticsMeta createFromParcel(Parcel parcel) {
            Integer numValueOf;
            boolean z;
            Boolean boolValueOf;
            boolean z2;
            Boolean boolValueOf2;
            Price priceCreateFromParcel;
            String string = parcel.readString();
            Boolean boolValueOf3 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            boolean z3 = true;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolValueOf2 = Boolean.valueOf(z2);
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                priceCreateFromParcel = null;
            } else {
                priceCreateFromParcel = Price.CREATOR.createFromParcel(parcel);
            }
            Price price = priceCreateFromParcel;
            if (parcel.readInt() != 0) {
                if (parcel.readInt() == 0) {
                    z3 = false;
                }
                boolValueOf3 = Boolean.valueOf(z3);
            }
            return new LogisticsMeta(string, numValueOf, boolValueOf, boolValueOf2, string2, string3, string4, price, boolValueOf3, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LogisticsMeta[] newArray(int i) {
            return new LogisticsMeta[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogisticsMeta)) {
            return false;
        }
        LogisticsMeta logisticsMeta = (LogisticsMeta) obj;
        return Intrinsics.LJFF(this.logisticsServiceId, logisticsMeta.logisticsServiceId) && Intrinsics.LJFF(this.deliveryOption, logisticsMeta.deliveryOption) && Intrinsics.LJFF(this.freeShipping, logisticsMeta.freeShipping) && Intrinsics.LJFF(this.reachable, logisticsMeta.reachable) && Intrinsics.LJFF(this.eventTracking, logisticsMeta.eventTracking) && Intrinsics.LJFF(this.voucherDaInfo, logisticsMeta.voucherDaInfo) && Intrinsics.LJFF(this.promotionDaInfo, logisticsMeta.promotionDaInfo) && Intrinsics.LJFF(this.shippingFee, logisticsMeta.shippingFee) && Intrinsics.LJFF(this.noShipAddr, logisticsMeta.noShipAddr) && Intrinsics.LJFF(this.originalPriceVal, logisticsMeta.originalPriceVal);
    }

    public final int hashCode() {
        String str = this.logisticsServiceId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.deliveryOption;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.freeShipping;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.reachable;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.eventTracking;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.voucherDaInfo;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.promotionDaInfo;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        com.ss.android.ugc.aweme.ecommerce.base.common.model.Price price = this.shippingFee;
        int iHashCode8 = (iHashCode7 + (price == null ? 0 : price.hashCode())) * 31;
        Boolean bool3 = this.noShipAddr;
        int iHashCode9 = (iHashCode8 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str5 = this.originalPriceVal;
        return iHashCode9 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LogisticsMeta(logisticsServiceId=");
        sbLIZ.append(this.logisticsServiceId);
        sbLIZ.append(", deliveryOption=");
        sbLIZ.append(this.deliveryOption);
        sbLIZ.append(", freeShipping=");
        sbLIZ.append(this.freeShipping);
        sbLIZ.append(", reachable=");
        sbLIZ.append(this.reachable);
        sbLIZ.append(", eventTracking=");
        sbLIZ.append(this.eventTracking);
        sbLIZ.append(", voucherDaInfo=");
        sbLIZ.append(this.voucherDaInfo);
        sbLIZ.append(", promotionDaInfo=");
        sbLIZ.append(this.promotionDaInfo);
        sbLIZ.append(", shippingFee=");
        sbLIZ.append(this.shippingFee);
        sbLIZ.append(", noShipAddr=");
        sbLIZ.append(this.noShipAddr);
        sbLIZ.append(", originalPriceVal=");
        sbLIZ.append(this.originalPriceVal);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.logisticsServiceId);
        Integer num = this.deliveryOption;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Boolean bool = this.freeShipping;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.reachable;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.eventTracking);
        parcel.writeString(this.voucherDaInfo);
        parcel.writeString(this.promotionDaInfo);
        com.ss.android.ugc.aweme.ecommerce.base.common.model.Price price = this.shippingFee;
        if (price == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            price.writeToParcel(parcel, i);
        }
        Boolean bool3 = this.noShipAddr;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.originalPriceVal);
    }

    public LogisticsMeta(String str, Integer num, Boolean bool, Boolean bool2, String str2, String str3, String str4, com.ss.android.ugc.aweme.ecommerce.base.common.model.Price price, Boolean bool3, String str5) {
        this.logisticsServiceId = str;
        this.deliveryOption = num;
        this.freeShipping = bool;
        this.reachable = bool2;
        this.eventTracking = str2;
        this.voucherDaInfo = str3;
        this.promotionDaInfo = str4;
        this.shippingFee = price;
        this.noShipAddr = bool3;
        this.originalPriceVal = str5;
    }
}
