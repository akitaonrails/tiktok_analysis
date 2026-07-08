package com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.PreOrderInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PreOrderInfo implements Parcelable {

    @C09CT("shipping_days")
    public Integer shippingDays;

    @C09CT("shipping_text")
    public String shippingText;
    public static final Parcelable.Creator<PreOrderInfo> CREATOR = new Parcelable.Creator<PreOrderInfo>() { // from class: X.02oa
        @Override // android.os.Parcelable.Creator
        public final PreOrderInfo createFromParcel(Parcel parcel) {
            Integer numValueOf;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new PreOrderInfo(string, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final PreOrderInfo[] newArray(int i) {
            return new PreOrderInfo[i];
        }
    };
    public static final int $stable = 8;

    public PreOrderInfo() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreOrderInfo)) {
            return false;
        }
        PreOrderInfo preOrderInfo = (PreOrderInfo) obj;
        return Intrinsics.LJFF(this.shippingText, preOrderInfo.shippingText) && Intrinsics.LJFF(this.shippingDays, preOrderInfo.shippingDays);
    }

    public final int hashCode() {
        String str = this.shippingText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.shippingDays;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreOrderInfo(shippingText=");
        sbLIZ.append(this.shippingText);
        sbLIZ.append(", shippingDays=");
        sbLIZ.append(this.shippingDays);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeString(this.shippingText);
        Integer num = this.shippingDays;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }

    public PreOrderInfo(String str, Integer num) {
        this.shippingText = str;
        this.shippingDays = num;
    }
}
