package com.ss.android.ugc.aweme.ecommerce.api.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.api.model.ButtonActionInfo;
import com.ss.android.ugc.aweme.ecommerce.api.model.FetchInfo;
import com.ss.android.ugc.aweme.ecommerce.api.model.LocationInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ButtonActionInfo implements Parcelable {
    public static final Parcelable.Creator<ButtonActionInfo> CREATOR = new Parcelable.Creator<ButtonActionInfo>() { // from class: X.02kj
        @Override // android.os.Parcelable.Creator
        public final ButtonActionInfo createFromParcel(Parcel parcel) {
            FetchInfo fetchInfoCreateFromParcel;
            String string = parcel.readString();
            LocationInfo locationInfoCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                fetchInfoCreateFromParcel = null;
            } else {
                fetchInfoCreateFromParcel = FetchInfo.CREATOR.createFromParcel(parcel);
            }
            FetchInfo fetchInfo = fetchInfoCreateFromParcel;
            if (parcel.readInt() != 0) {
                locationInfoCreateFromParcel = LocationInfo.CREATOR.createFromParcel(parcel);
            }
            return new ButtonActionInfo(string, fetchInfo, locationInfoCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ButtonActionInfo[] newArray(int i) {
            return new ButtonActionInfo[i];
        }
    };

    @C09CT("fetch_info")
    public FetchInfo fetchInfo;

    @C09CT("location_info")
    public LocationInfo locationInfo;

    @C09CT("schema")
    public String schema;

    public ButtonActionInfo() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonActionInfo)) {
            return false;
        }
        ButtonActionInfo buttonActionInfo = (ButtonActionInfo) obj;
        return Intrinsics.LJFF(this.schema, buttonActionInfo.schema) && Intrinsics.LJFF(this.fetchInfo, buttonActionInfo.fetchInfo) && Intrinsics.LJFF(this.locationInfo, buttonActionInfo.locationInfo);
    }

    public final int hashCode() {
        String str = this.schema;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        FetchInfo fetchInfo = this.fetchInfo;
        int iHashCode2 = (iHashCode + (fetchInfo == null ? 0 : fetchInfo.hashCode())) * 31;
        LocationInfo locationInfo = this.locationInfo;
        return iHashCode2 + (locationInfo != null ? locationInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ButtonActionInfo(schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", fetchInfo=");
        sbLIZ.append(this.fetchInfo);
        sbLIZ.append(", locationInfo=");
        sbLIZ.append(this.locationInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.schema);
        FetchInfo fetchInfo = this.fetchInfo;
        if (fetchInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fetchInfo.writeToParcel(parcel, i);
        }
        LocationInfo locationInfo = this.locationInfo;
        if (locationInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            locationInfo.writeToParcel(parcel, i);
        }
    }

    public ButtonActionInfo(String str, FetchInfo fetchInfo, LocationInfo locationInfo) {
        this.schema = str;
        this.fetchInfo = fetchInfo;
        this.locationInfo = locationInfo;
    }
}
