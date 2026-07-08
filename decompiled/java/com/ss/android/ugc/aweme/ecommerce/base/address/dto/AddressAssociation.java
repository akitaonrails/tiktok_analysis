package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressAssociation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AddressAssociation implements Parcelable {

    @C09CT("associated_address_id")
    public final String associatedAddressId;
    public static final Parcelable.Creator<AddressAssociation> CREATOR = new Parcelable.Creator<AddressAssociation>() { // from class: X.03s0
        @Override // android.os.Parcelable.Creator
        public final AddressAssociation createFromParcel(Parcel parcel) {
            return new AddressAssociation(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AddressAssociation[] newArray(int i) {
            return new AddressAssociation[i];
        }
    };
    public static final int $stable = 8;

    public AddressAssociation() {
        this(null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AddressAssociation) && Intrinsics.LJFF(this.associatedAddressId, ((AddressAssociation) obj).associatedAddressId);
    }

    public final int hashCode() {
        String str = this.associatedAddressId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddressAssociation(associatedAddressId=");
        sbLIZ.append(this.associatedAddressId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.associatedAddressId);
    }

    public AddressAssociation(String str) {
        this.associatedAddressId = str;
    }
}
