package com.ss.android.ugc.aweme.ecommerce.api.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.api.model.LocationInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class LocationInfo implements Parcelable {
    public static final Parcelable.Creator<LocationInfo> CREATOR = new Parcelable.Creator<LocationInfo>() { // from class: X.02kk
        @Override // android.os.Parcelable.Creator
        public final LocationInfo createFromParcel(Parcel parcel) {
            return new LocationInfo(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LocationInfo[] newArray(int i) {
            return new LocationInfo[i];
        }
    };

    @C09CT("module")
    public String moduleName;

    @C09CT("module_position_tag")
    public String modulePositionTag;

    public LocationInfo() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationInfo)) {
            return false;
        }
        LocationInfo locationInfo = (LocationInfo) obj;
        return Intrinsics.LJFF(this.moduleName, locationInfo.moduleName) && Intrinsics.LJFF(this.modulePositionTag, locationInfo.modulePositionTag);
    }

    public final int hashCode() {
        String str = this.moduleName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.modulePositionTag;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocationInfo(moduleName=");
        sbLIZ.append(this.moduleName);
        sbLIZ.append(", modulePositionTag=");
        sbLIZ.append(this.modulePositionTag);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.moduleName);
        parcel.writeString(this.modulePositionTag);
    }

    public LocationInfo(String str, String str2) {
        this.moduleName = str;
        this.modulePositionTag = str2;
    }
}
