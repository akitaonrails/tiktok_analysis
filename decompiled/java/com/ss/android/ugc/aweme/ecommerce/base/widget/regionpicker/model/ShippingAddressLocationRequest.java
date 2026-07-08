package com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.ShippingAddressLocationRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class ShippingAddressLocationRequest implements Parcelable {

    @C09CT("shipping_address")
    public final Address address;

    @C09CT("pre_log_id")
    public final String preLogId;
    public static final Parcelable.Creator<ShippingAddressLocationRequest> CREATOR = new Parcelable.Creator<ShippingAddressLocationRequest>() { // from class: X.0vUz
        @Override // android.os.Parcelable.Creator
        public final ShippingAddressLocationRequest createFromParcel(Parcel parcel) {
            Address addressCreateFromParcel;
            if (parcel.readInt() == 0) {
                addressCreateFromParcel = null;
            } else {
                addressCreateFromParcel = Address.CREATOR.createFromParcel(parcel);
            }
            return new ShippingAddressLocationRequest(addressCreateFromParcel, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShippingAddressLocationRequest[] newArray(int i) {
            return new ShippingAddressLocationRequest[i];
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
        if (!(obj instanceof ShippingAddressLocationRequest)) {
            return false;
        }
        ShippingAddressLocationRequest shippingAddressLocationRequest = (ShippingAddressLocationRequest) obj;
        return Intrinsics.LJFF(this.address, shippingAddressLocationRequest.address) && Intrinsics.LJFF(this.preLogId, shippingAddressLocationRequest.preLogId);
    }

    public final int hashCode() {
        Address address = this.address;
        int iHashCode = (address == null ? 0 : address.hashCode()) * 31;
        String str = this.preLogId;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShippingAddressLocationRequest(address=");
        sbLIZ.append(this.address);
        sbLIZ.append(", preLogId=");
        sbLIZ.append(this.preLogId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Address address = this.address;
        if (address == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            address.writeToParcel(parcel, i);
        }
        parcel.writeString(this.preLogId);
    }

    public ShippingAddressLocationRequest(Address address, String str) {
        this.address = address;
        this.preLogId = str;
    }
}
