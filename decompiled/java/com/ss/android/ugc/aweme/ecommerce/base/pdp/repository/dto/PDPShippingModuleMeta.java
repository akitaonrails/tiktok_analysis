package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticsMeta;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPShippingModuleMeta;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PDPShippingModuleMeta implements Parcelable {

    @C09CT("delivery_flag")
    public final String deliveryFlag;

    @C09CT("delivery_info")
    public final String deliveryInfo;

    @C09CT("disable_click_action")
    public final Boolean disableClickAction;

    @C09CT("edt_type")
    public final String edtType;

    @C09CT("free_shipping_threshold_price")
    public final String freeShippingThresholdPrice;

    @C09CT("logistic")
    public final LogisticsMeta logistic;
    public static final Parcelable.Creator<PDPShippingModuleMeta> CREATOR = new Parcelable.Creator<PDPShippingModuleMeta>() { // from class: X.03Dj
        @Override // android.os.Parcelable.Creator
        public final PDPShippingModuleMeta createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            LogisticsMeta logisticsMetaCreateFromParcel = null;
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
            if (parcel.readInt() != 0) {
                logisticsMetaCreateFromParcel = LogisticsMeta.CREATOR.createFromParcel(parcel);
            }
            return new PDPShippingModuleMeta(string, string2, string3, string4, boolValueOf, logisticsMetaCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PDPShippingModuleMeta[] newArray(int i) {
            return new PDPShippingModuleMeta[i];
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
        if (!(obj instanceof PDPShippingModuleMeta)) {
            return false;
        }
        PDPShippingModuleMeta pDPShippingModuleMeta = (PDPShippingModuleMeta) obj;
        return Intrinsics.LJFF(this.deliveryInfo, pDPShippingModuleMeta.deliveryInfo) && Intrinsics.LJFF(this.deliveryFlag, pDPShippingModuleMeta.deliveryFlag) && Intrinsics.LJFF(this.edtType, pDPShippingModuleMeta.edtType) && Intrinsics.LJFF(this.freeShippingThresholdPrice, pDPShippingModuleMeta.freeShippingThresholdPrice) && Intrinsics.LJFF(this.disableClickAction, pDPShippingModuleMeta.disableClickAction) && Intrinsics.LJFF(this.logistic, pDPShippingModuleMeta.logistic);
    }

    public final int hashCode() {
        String str = this.deliveryInfo;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.deliveryFlag;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.edtType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.freeShippingThresholdPrice;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.disableClickAction;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        LogisticsMeta logisticsMeta = this.logistic;
        return iHashCode5 + (logisticsMeta != null ? logisticsMeta.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PDPShippingModuleMeta(deliveryInfo=");
        sbLIZ.append(this.deliveryInfo);
        sbLIZ.append(", deliveryFlag=");
        sbLIZ.append(this.deliveryFlag);
        sbLIZ.append(", edtType=");
        sbLIZ.append(this.edtType);
        sbLIZ.append(", freeShippingThresholdPrice=");
        sbLIZ.append(this.freeShippingThresholdPrice);
        sbLIZ.append(", disableClickAction=");
        sbLIZ.append(this.disableClickAction);
        sbLIZ.append(", logistic=");
        sbLIZ.append(this.logistic);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.deliveryInfo);
        parcel.writeString(this.deliveryFlag);
        parcel.writeString(this.edtType);
        parcel.writeString(this.freeShippingThresholdPrice);
        Boolean bool = this.disableClickAction;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        LogisticsMeta logisticsMeta = this.logistic;
        if (logisticsMeta == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            logisticsMeta.writeToParcel(parcel, i);
        }
    }

    public PDPShippingModuleMeta(String str, String str2, String str3, String str4, Boolean bool, LogisticsMeta logisticsMeta) {
        this.deliveryInfo = str;
        this.deliveryFlag = str2;
        this.edtType = str3;
        this.freeShippingThresholdPrice = str4;
        this.disableClickAction = bool;
        this.logistic = logisticsMeta;
    }
}
