package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonSkuMainOrder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AddonSkuMainOrder implements Parcelable {

    @C09CT("delivery_option")
    public Integer deliveryOption;

    @C09CT("logistics_service_id")
    public String logisticsServiceId;

    @C09CT("main_order_id")
    public String mainOrderId;

    @C09CT("warehouse_id")
    public String warehouseId;
    public static final Parcelable.Creator<AddonSkuMainOrder> CREATOR = new Parcelable.Creator<AddonSkuMainOrder>() { // from class: X.02hV
        @Override // android.os.Parcelable.Creator
        public final AddonSkuMainOrder createFromParcel(Parcel parcel) {
            Integer numValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new AddonSkuMainOrder(string, string2, numValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AddonSkuMainOrder[] newArray(int i) {
            return new AddonSkuMainOrder[i];
        }
    };
    public static final int $stable = 8;

    public AddonSkuMainOrder() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddonSkuMainOrder)) {
            return false;
        }
        AddonSkuMainOrder addonSkuMainOrder = (AddonSkuMainOrder) obj;
        return Intrinsics.LJFF(this.mainOrderId, addonSkuMainOrder.mainOrderId) && Intrinsics.LJFF(this.warehouseId, addonSkuMainOrder.warehouseId) && Intrinsics.LJFF(this.deliveryOption, addonSkuMainOrder.deliveryOption) && Intrinsics.LJFF(this.logisticsServiceId, addonSkuMainOrder.logisticsServiceId);
    }

    public final int hashCode() {
        String str = this.mainOrderId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.warehouseId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.deliveryOption;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.logisticsServiceId;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddonSkuMainOrder(mainOrderId=");
        sbLIZ.append(this.mainOrderId);
        sbLIZ.append(", warehouseId=");
        sbLIZ.append(this.warehouseId);
        sbLIZ.append(", deliveryOption=");
        sbLIZ.append(this.deliveryOption);
        sbLIZ.append(", logisticsServiceId=");
        sbLIZ.append(this.logisticsServiceId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeString(this.mainOrderId);
        parcel.writeString(this.warehouseId);
        Integer num = this.deliveryOption;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.logisticsServiceId);
    }

    public AddonSkuMainOrder(String str, String str2, Integer num, String str3) {
        this.mainOrderId = str;
        this.warehouseId = str2;
        this.deliveryOption = num;
        this.logisticsServiceId = str3;
    }
}
