package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.DraftAddress;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class DraftAddress implements Parcelable {

    @C09CT("address")
    public final Address address;

    @C09CT("timestamp")
    public final long timestamp;

    @C09CT("template_type")
    public final int type;

    @C09CT("uid")
    public final String uid;

    @C09CT("unfold_manually")
    public final boolean unfoldAddressManually;
    public static final Parcelable.Creator<DraftAddress> CREATOR = new Parcelable.Creator<DraftAddress>() { // from class: X.0vYl
        @Override // android.os.Parcelable.Creator
        public final DraftAddress createFromParcel(Parcel parcel) {
            boolean z;
            Address addressCreateFromParcel = Address.CREATOR.createFromParcel(parcel);
            long j = parcel.readLong();
            String string = parcel.readString();
            int i = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new DraftAddress(addressCreateFromParcel, j, string, i, z);
        }

        @Override // android.os.Parcelable.Creator
        public final DraftAddress[] newArray(int i) {
            return new DraftAddress[i];
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
        if (!(obj instanceof DraftAddress)) {
            return false;
        }
        DraftAddress draftAddress = (DraftAddress) obj;
        return Intrinsics.LJFF(this.address, draftAddress.address) && this.timestamp == draftAddress.timestamp && Intrinsics.LJFF(this.uid, draftAddress.uid) && this.type == draftAddress.type && this.unfoldAddressManually == draftAddress.unfoldAddressManually;
    }

    public final int hashCode() {
        return (((((((this.address.hashCode() * 31) + C786410Ut5.Y2(this.timestamp)) * 31) + this.uid.hashCode()) * 31) + this.type) * 31) + C786410Ut5.Z2(this.unfoldAddressManually);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DraftAddress(address=");
        sbLIZ.append(this.address);
        sbLIZ.append(", timestamp=");
        sbLIZ.append(this.timestamp);
        sbLIZ.append(", uid=");
        sbLIZ.append(this.uid);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", unfoldAddressManually=");
        sbLIZ.append(this.unfoldAddressManually);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.address.writeToParcel(parcel, i);
        parcel.writeLong(this.timestamp);
        parcel.writeString(this.uid);
        parcel.writeInt(this.type);
        parcel.writeInt(this.unfoldAddressManually ? 1 : 0);
    }

    public DraftAddress(Address address, long j, String str, int i, boolean z) {
        this.address = address;
        this.timestamp = j;
        this.uid = str;
        this.type = i;
        this.unfoldAddressManually = z;
    }
}
