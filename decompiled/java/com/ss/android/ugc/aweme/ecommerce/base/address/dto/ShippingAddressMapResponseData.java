package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ShippingAddressMapResponseData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ShippingAddressMapResponseData implements Parcelable {

    @C09CT("shipping_address")
    public final Address address;

    @C09CT("input_item_data")
    public final InputItemData inputItemData;
    public static final Parcelable.Creator<ShippingAddressMapResponseData> CREATOR = new Parcelable.Creator<ShippingAddressMapResponseData>() { // from class: X.0371
        @Override // android.os.Parcelable.Creator
        public final ShippingAddressMapResponseData createFromParcel(Parcel parcel) {
            InputItemData inputItemDataCreateFromParcel;
            Address addressCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                inputItemDataCreateFromParcel = null;
            } else {
                inputItemDataCreateFromParcel = InputItemData.CREATOR.createFromParcel(parcel);
            }
            InputItemData inputItemData = inputItemDataCreateFromParcel;
            if (parcel.readInt() != 0) {
                addressCreateFromParcel = Address.CREATOR.createFromParcel(parcel);
            }
            return new ShippingAddressMapResponseData(inputItemData, addressCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ShippingAddressMapResponseData[] newArray(int i) {
            return new ShippingAddressMapResponseData[i];
        }
    };
    public static final int $stable = 8;

    public ShippingAddressMapResponseData() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShippingAddressMapResponseData)) {
            return false;
        }
        ShippingAddressMapResponseData shippingAddressMapResponseData = (ShippingAddressMapResponseData) obj;
        return Intrinsics.LJFF(this.inputItemData, shippingAddressMapResponseData.inputItemData) && Intrinsics.LJFF(this.address, shippingAddressMapResponseData.address);
    }

    public final int hashCode() {
        InputItemData inputItemData = this.inputItemData;
        int iHashCode = (inputItemData == null ? 0 : inputItemData.hashCode()) * 31;
        Address address = this.address;
        return iHashCode + (address != null ? address.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShippingAddressMapResponseData(inputItemData=");
        sbLIZ.append(this.inputItemData);
        sbLIZ.append(", address=");
        sbLIZ.append(this.address);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        InputItemData inputItemData = this.inputItemData;
        if (inputItemData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inputItemData.writeToParcel(parcel, i);
        }
        Address address = this.address;
        if (address == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            address.writeToParcel(parcel, i);
        }
    }

    public ShippingAddressMapResponseData(InputItemData inputItemData, Address address) {
        this.inputItemData = inputItemData;
        this.address = address;
    }
}
