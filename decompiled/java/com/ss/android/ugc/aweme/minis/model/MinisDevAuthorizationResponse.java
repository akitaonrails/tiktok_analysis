package com.ss.android.ugc.aweme.minis.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.minis.model.MinisDevAuthorizationResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class MinisDevAuthorizationResponse implements Parcelable {

    @C09CT("is_target_user")
    public final Boolean isTargetUser;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;
    public static final Parcelable.Creator<MinisDevAuthorizationResponse> CREATOR = new Parcelable.Creator<MinisDevAuthorizationResponse>() { // from class: X.0iHm
        @Override // android.os.Parcelable.Creator
        public final MinisDevAuthorizationResponse createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            Integer numValueOf = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new MinisDevAuthorizationResponse(boolValueOf, numValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MinisDevAuthorizationResponse[] newArray(int i) {
            return new MinisDevAuthorizationResponse[i];
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
        if (!(obj instanceof MinisDevAuthorizationResponse)) {
            return false;
        }
        MinisDevAuthorizationResponse minisDevAuthorizationResponse = (MinisDevAuthorizationResponse) obj;
        return Intrinsics.LJFF(this.isTargetUser, minisDevAuthorizationResponse.isTargetUser) && Intrinsics.LJFF(this.statusCode, minisDevAuthorizationResponse.statusCode) && Intrinsics.LJFF(this.statusMsg, minisDevAuthorizationResponse.statusMsg);
    }

    public final int hashCode() {
        Boolean bool = this.isTargetUser;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.statusCode;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.statusMsg;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MinisDevAuthorizationResponse(isTargetUser=");
        sbLIZ.append(this.isTargetUser);
        sbLIZ.append(", statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", statusMsg=");
        sbLIZ.append(this.statusMsg);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.isTargetUser;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Integer num = this.statusCode;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.statusMsg);
    }

    public MinisDevAuthorizationResponse(Boolean bool, Integer num, String str) {
        this.isTargetUser = bool;
        this.statusCode = num;
        this.statusMsg = str;
    }
}
