package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonOrderSku;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AddonOrderSku implements Parcelable {

    @C09CT("product_id")
    public final String productId;

    @C09CT("quantity")
    public final Integer quantity;

    @C09CT("sku_id")
    public final String skuId;
    public static final Parcelable.Creator<AddonOrderSku> CREATOR = new Parcelable.Creator<AddonOrderSku>() { // from class: X.03Oh
        @Override // android.os.Parcelable.Creator
        public final AddonOrderSku createFromParcel(Parcel parcel) {
            Integer numValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new AddonOrderSku(string, string2, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final AddonOrderSku[] newArray(int i) {
            return new AddonOrderSku[i];
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
        if (!(obj instanceof AddonOrderSku)) {
            return false;
        }
        AddonOrderSku addonOrderSku = (AddonOrderSku) obj;
        return Intrinsics.LJFF(this.productId, addonOrderSku.productId) && Intrinsics.LJFF(this.skuId, addonOrderSku.skuId) && Intrinsics.LJFF(this.quantity, addonOrderSku.quantity);
    }

    public final int hashCode() {
        String str = this.productId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.skuId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.quantity;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddonOrderSku(productId=");
        sbLIZ.append(this.productId);
        sbLIZ.append(", skuId=");
        sbLIZ.append(this.skuId);
        sbLIZ.append(", quantity=");
        sbLIZ.append(this.quantity);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeString(this.productId);
        parcel.writeString(this.skuId);
        Integer num = this.quantity;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }

    public AddonOrderSku(String str, String str2, Integer num) {
        this.productId = str;
        this.skuId = str2;
        this.quantity = num;
    }
}
