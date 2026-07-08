package com.ss.android.ugc.aweme.ecommerce.api.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.api.model.FetchInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class FetchInfo implements Parcelable {
    public static final Parcelable.Creator<FetchInfo> CREATOR = new Parcelable.Creator<FetchInfo>() { // from class: X.02kl
        @Override // android.os.Parcelable.Creator
        public final FetchInfo createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new FetchInfo(numValueOf, string, string2, numValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final FetchInfo[] newArray(int i) {
            return new FetchInfo[i];
        }
    };

    @C09CT("change_type")
    public Integer changeType;

    @C09CT("event_name")
    public String eventName;

    @C09CT("fetch_api_type")
    public Integer fetchAPI;

    @C09CT("server_issued_params")
    public String serverIssuedParams;

    public FetchInfo() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FetchInfo)) {
            return false;
        }
        FetchInfo fetchInfo = (FetchInfo) obj;
        return Intrinsics.LJFF(this.fetchAPI, fetchInfo.fetchAPI) && Intrinsics.LJFF(this.serverIssuedParams, fetchInfo.serverIssuedParams) && Intrinsics.LJFF(this.eventName, fetchInfo.eventName) && Intrinsics.LJFF(this.changeType, fetchInfo.changeType);
    }

    public final int hashCode() {
        Integer num = this.fetchAPI;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.serverIssuedParams;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.eventName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.changeType;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FetchInfo(fetchAPI=");
        sbLIZ.append(this.fetchAPI);
        sbLIZ.append(", serverIssuedParams=");
        sbLIZ.append(this.serverIssuedParams);
        sbLIZ.append(", eventName=");
        sbLIZ.append(this.eventName);
        sbLIZ.append(", changeType=");
        sbLIZ.append(this.changeType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.fetchAPI;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.serverIssuedParams);
        parcel.writeString(this.eventName);
        Integer num2 = this.changeType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    public FetchInfo(Integer num, String str, String str2, Integer num2) {
        this.fetchAPI = num;
        this.serverIssuedParams = str;
        this.eventName = str2;
        this.changeType = num2;
    }
}
