package com.ss.android.ugc.aweme.minis.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.minis.model.GetUserIdByOpenIdResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class GetUserIdByOpenIdResponse implements Parcelable {

    @C09CT("error")
    public final Integer error;

    @C09CT("error_description")
    public final String errorDescription;

    @C09CT("user_id")
    public final String userId;
    public static final Parcelable.Creator<GetUserIdByOpenIdResponse> CREATOR = new Parcelable.Creator<GetUserIdByOpenIdResponse>() { // from class: X.0JPi
        @Override // android.os.Parcelable.Creator
        public final GetUserIdByOpenIdResponse createFromParcel(Parcel parcel) {
            Integer numValueOf;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new GetUserIdByOpenIdResponse(string, numValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GetUserIdByOpenIdResponse[] newArray(int i) {
            return new GetUserIdByOpenIdResponse[i];
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
        if (!(obj instanceof GetUserIdByOpenIdResponse)) {
            return false;
        }
        GetUserIdByOpenIdResponse getUserIdByOpenIdResponse = (GetUserIdByOpenIdResponse) obj;
        return Intrinsics.LJFF(this.userId, getUserIdByOpenIdResponse.userId) && Intrinsics.LJFF(this.error, getUserIdByOpenIdResponse.error) && Intrinsics.LJFF(this.errorDescription, getUserIdByOpenIdResponse.errorDescription);
    }

    public final int hashCode() {
        String str = this.userId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.error;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.errorDescription;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GetUserIdByOpenIdResponse(userId=");
        sbLIZ.append(this.userId);
        sbLIZ.append(", error=");
        sbLIZ.append(this.error);
        sbLIZ.append(", errorDescription=");
        sbLIZ.append(this.errorDescription);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeString(this.userId);
        Integer num = this.error;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.errorDescription);
    }

    public GetUserIdByOpenIdResponse(String str, Integer num, String str2) {
        this.userId = str;
        this.error = num;
        this.errorDescription = str2;
    }
}
