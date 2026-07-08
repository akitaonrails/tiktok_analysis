package com.ss.android.ugc.aweme.minis.model.iaa;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.minis.model.iaa.MinisAdPlacementValidateResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class MinisAdPlacementValidateResponse implements Parcelable {

    @C09CT("rit")
    public String rit;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;
    public static final Parcelable.Creator<MinisAdPlacementValidateResponse> CREATOR = new Parcelable.Creator<MinisAdPlacementValidateResponse>() { // from class: X.0iI0
        @Override // android.os.Parcelable.Creator
        public final MinisAdPlacementValidateResponse createFromParcel(Parcel parcel) {
            Integer numValueOf;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new MinisAdPlacementValidateResponse(string, numValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MinisAdPlacementValidateResponse[] newArray(int i) {
            return new MinisAdPlacementValidateResponse[i];
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
        if (!(obj instanceof MinisAdPlacementValidateResponse)) {
            return false;
        }
        MinisAdPlacementValidateResponse minisAdPlacementValidateResponse = (MinisAdPlacementValidateResponse) obj;
        return Intrinsics.LJFF(this.rit, minisAdPlacementValidateResponse.rit) && Intrinsics.LJFF(this.statusCode, minisAdPlacementValidateResponse.statusCode) && Intrinsics.LJFF(this.statusMsg, minisAdPlacementValidateResponse.statusMsg);
    }

    public final int hashCode() {
        String str = this.rit;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.statusCode;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.statusMsg;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MinisAdPlacementValidateResponse(rit=");
        sbLIZ.append(this.rit);
        sbLIZ.append(", statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", statusMsg=");
        sbLIZ.append(this.statusMsg);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeString(this.rit);
        Integer num = this.statusCode;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.statusMsg);
    }

    public MinisAdPlacementValidateResponse(String str, Integer num, String str2) {
        this.rit = str;
        this.statusCode = num;
        this.statusMsg = str2;
    }
}
