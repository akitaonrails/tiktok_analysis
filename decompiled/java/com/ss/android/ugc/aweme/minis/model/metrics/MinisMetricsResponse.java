package com.ss.android.ugc.aweme.minis.model.metrics;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.minis.model.metrics.MinisMetricsResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class MinisMetricsResponse implements Parcelable {

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;
    public static final Parcelable.Creator<MinisMetricsResponse> CREATOR = new Parcelable.Creator<MinisMetricsResponse>() { // from class: X.0LEN
        @Override // android.os.Parcelable.Creator
        public final MinisMetricsResponse createFromParcel(Parcel parcel) {
            Integer numValueOf;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new MinisMetricsResponse(numValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MinisMetricsResponse[] newArray(int i) {
            return new MinisMetricsResponse[i];
        }
    };
    public static final int $stable = 8;

    public MinisMetricsResponse() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MinisMetricsResponse)) {
            return false;
        }
        MinisMetricsResponse minisMetricsResponse = (MinisMetricsResponse) obj;
        return Intrinsics.LJFF(this.statusCode, minisMetricsResponse.statusCode) && Intrinsics.LJFF(this.statusMsg, minisMetricsResponse.statusMsg);
    }

    public final int hashCode() {
        Integer num = this.statusCode;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.statusMsg;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MinisMetricsResponse(statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", statusMsg=");
        sbLIZ.append(this.statusMsg);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
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

    public MinisMetricsResponse(Integer num, String str) {
        this.statusCode = num;
        this.statusMsg = str;
    }
}
