package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.PudoAddress;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PudoAddress implements Parcelable {

    @C09CT("shipping_address")
    public Address address;

    @C09CT("da_info")
    public String daInfo;

    @C09CT("distance")
    public String distance;

    @C09CT("selected")
    public Boolean selected;

    @C09CT("working_time_unfold_icon")
    public Icon unfoldIcon;
    public static final Parcelable.Creator<PudoAddress> CREATOR = new Parcelable.Creator<PudoAddress>() { // from class: X.02iX
        @Override // android.os.Parcelable.Creator
        public final PudoAddress createFromParcel(Parcel parcel) {
            Address addressCreateFromParcel;
            boolean z;
            String string = parcel.readString();
            Boolean boolValueOf = null;
            if (parcel.readInt() == 0) {
                addressCreateFromParcel = null;
            } else {
                addressCreateFromParcel = Address.CREATOR.createFromParcel(parcel);
            }
            Address address = addressCreateFromParcel;
            Icon icon = (Icon) parcel.readParcelable(PudoAddress.class.getClassLoader());
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            return new PudoAddress(string, address, icon, boolValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PudoAddress[] newArray(int i) {
            return new PudoAddress[i];
        }
    };
    public static final int $stable = 8;

    public PudoAddress() {
        this(null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PudoAddress)) {
            return false;
        }
        PudoAddress pudoAddress = (PudoAddress) obj;
        return Intrinsics.LJFF(this.distance, pudoAddress.distance) && Intrinsics.LJFF(this.address, pudoAddress.address) && Intrinsics.LJFF(this.unfoldIcon, pudoAddress.unfoldIcon) && Intrinsics.LJFF(this.selected, pudoAddress.selected) && Intrinsics.LJFF(this.daInfo, pudoAddress.daInfo);
    }

    public final int hashCode() {
        String str = this.distance;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Address address = this.address;
        int iHashCode2 = (iHashCode + (address == null ? 0 : address.hashCode())) * 31;
        Icon icon = this.unfoldIcon;
        int iHashCode3 = (iHashCode2 + (icon == null ? 0 : icon.hashCode())) * 31;
        Boolean bool = this.selected;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.daInfo;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PudoAddress(distance=");
        sbLIZ.append(this.distance);
        sbLIZ.append(", address=");
        sbLIZ.append(this.address);
        sbLIZ.append(", unfoldIcon=");
        sbLIZ.append(this.unfoldIcon);
        sbLIZ.append(", selected=");
        sbLIZ.append(this.selected);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.distance);
        Address address = this.address;
        if (address == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            address.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.unfoldIcon, i);
        Boolean bool = this.selected;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.daInfo);
    }

    public PudoAddress(String str, Address address, Icon icon, Boolean bool, String str2) {
        this.distance = str;
        this.address = address;
        this.unfoldIcon = icon;
        this.selected = bool;
        this.daInfo = str2;
    }
}
