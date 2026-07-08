package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.TrackParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class TrackParams implements Parcelable {

    @C09CT("address_result")
    public final String addressResult;
    public static final Parcelable.Creator<TrackParams> CREATOR = new Parcelable.Creator<TrackParams>() { // from class: X.0vXS
        @Override // android.os.Parcelable.Creator
        public final TrackParams createFromParcel(Parcel parcel) {
            return new TrackParams(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TrackParams[] newArray(int i) {
            return new TrackParams[i];
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
        return (obj instanceof TrackParams) && Intrinsics.LJFF(this.addressResult, ((TrackParams) obj).addressResult);
    }

    public final int hashCode() {
        String str = this.addressResult;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TrackParams(addressResult=");
        sbLIZ.append(this.addressResult);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.addressResult);
    }

    public TrackParams(String str) {
        this.addressResult = str;
    }
}
