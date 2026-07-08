package com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.LocateDistrictRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class LocateDistrictRequest implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<LocateDistrictRequest> CREATOR = new Parcelable.Creator<LocateDistrictRequest>() { // from class: X.0vS1
        @Override // android.os.Parcelable.Creator
        public final LocateDistrictRequest createFromParcel(Parcel parcel) {
            Region regionCreateFromParcel;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                regionCreateFromParcel = null;
            } else {
                regionCreateFromParcel = Region.CREATOR.createFromParcel(parcel);
            }
            return new LocateDistrictRequest(string, string2, string3, regionCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final LocateDistrictRequest[] newArray(int i) {
            return new LocateDistrictRequest[i];
        }
    };

    @C09CT("address")
    public final String address;

    @C09CT("country")
    public final Region country;

    @C09CT("encrypted_latitude")
    public final String encryptedLatitude;

    @C09CT("encrypted_longitude")
    public final String encryptedLongitude;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocateDistrictRequest)) {
            return false;
        }
        LocateDistrictRequest locateDistrictRequest = (LocateDistrictRequest) obj;
        return Intrinsics.LJFF(this.encryptedLongitude, locateDistrictRequest.encryptedLongitude) && Intrinsics.LJFF(this.encryptedLatitude, locateDistrictRequest.encryptedLatitude) && Intrinsics.LJFF(this.address, locateDistrictRequest.address) && Intrinsics.LJFF(this.country, locateDistrictRequest.country);
    }

    public final int hashCode() {
        String str = this.encryptedLongitude;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.encryptedLatitude;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.address;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Region region = this.country;
        return iHashCode3 + (region != null ? region.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocateDistrictRequest(encryptedLongitude=");
        sbLIZ.append(this.encryptedLongitude);
        sbLIZ.append(", encryptedLatitude=");
        sbLIZ.append(this.encryptedLatitude);
        sbLIZ.append(", address=");
        sbLIZ.append(this.address);
        sbLIZ.append(", country=");
        sbLIZ.append(this.country);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.encryptedLongitude);
        parcel.writeString(this.encryptedLatitude);
        parcel.writeString(this.address);
        Region region = this.country;
        if (region == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            region.writeToParcel(parcel, i);
        }
    }

    public LocateDistrictRequest(String str, String str2, String str3, Region region) {
        this.encryptedLongitude = str;
        this.encryptedLatitude = str2;
        this.address = str3;
        this.country = region;
    }
}
