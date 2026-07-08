package com.bytedance.hybrid.spark.security;

import X.C2188811AlT;
import X.C759490Tql;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;

/* JADX INFO: loaded from: classes13.dex */
public final class ThirdPartyBizCert implements Parcelable {
    public static final C759490Tql CREATOR = new Parcelable.Creator<ThirdPartyBizCert>() { // from class: X.0Tql
        @Override // android.os.Parcelable.Creator
        public final ThirdPartyBizCert createFromParcel(Parcel parcel) {
            return new ThirdPartyBizCert(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ThirdPartyBizCert[] newArray(int i) {
            return new ThirdPartyBizCert[i];
        }
    };
    public final int dataflowId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ThirdPartyBizCert) && this.dataflowId == ((ThirdPartyBizCert) obj).dataflowId;
    }

    public final int hashCode() {
        return this.dataflowId;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ThirdPartyBizCert(dataflowId=");
        sbLIZ.append(this.dataflowId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ThirdPartyBizCert(int i) {
        this.dataflowId = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.dataflowId);
    }
}
