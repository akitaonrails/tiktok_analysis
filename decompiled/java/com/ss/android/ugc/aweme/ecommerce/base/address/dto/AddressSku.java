package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressSku;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AddressSku implements Parcelable {

    @C09CT("product_id")
    public final String productId;

    @C09CT("room_id")
    public final String roomID;

    @C09CT("sku_id")
    public final String skuId;
    public static final Parcelable.Creator<AddressSku> CREATOR = new Parcelable.Creator<AddressSku>() { // from class: X.03rU
        @Override // android.os.Parcelable.Creator
        public final AddressSku createFromParcel(Parcel parcel) {
            return new AddressSku(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AddressSku[] newArray(int i) {
            return new AddressSku[i];
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
        if (!(obj instanceof AddressSku)) {
            return false;
        }
        AddressSku addressSku = (AddressSku) obj;
        return Intrinsics.LJFF(this.productId, addressSku.productId) && Intrinsics.LJFF(this.skuId, addressSku.skuId) && Intrinsics.LJFF(this.roomID, addressSku.roomID);
    }

    public final int hashCode() {
        String str = this.productId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.skuId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.roomID;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddressSku(productId=");
        sbLIZ.append(this.productId);
        sbLIZ.append(", skuId=");
        sbLIZ.append(this.skuId);
        sbLIZ.append(", roomID=");
        sbLIZ.append(this.roomID);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.productId);
        parcel.writeString(this.skuId);
        parcel.writeString(this.roomID);
    }

    public AddressSku(String str, String str2, String str3) {
        this.productId = str;
        this.skuId = str2;
        this.roomID = str3;
    }
}
