package com.ss.android.ugc.aweme.minis.api;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.minis.api.MinisRawAdInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class MinisRawAdInfo implements Parcelable {
    public static final Parcelable.Creator<MinisRawAdInfo> CREATOR = new Parcelable.Creator<MinisRawAdInfo>() { // from class: X.0dNw
        @Override // android.os.Parcelable.Creator
        public final MinisRawAdInfo createFromParcel(Parcel parcel) {
            Long lValueOf;
            Integer numValueOf = null;
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new MinisRawAdInfo(lValueOf, numValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MinisRawAdInfo[] newArray(int i) {
            return new MinisRawAdInfo[i];
        }
    };

    @C09CT("creative_id")
    public Long creativeId;

    @C09CT("log_extra")
    public String logExtra;

    @C09CT("system_origin")
    public Integer systemOrigin;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MinisRawAdInfo)) {
            return false;
        }
        MinisRawAdInfo minisRawAdInfo = (MinisRawAdInfo) obj;
        return Intrinsics.LJFF(this.creativeId, minisRawAdInfo.creativeId) && Intrinsics.LJFF(this.systemOrigin, minisRawAdInfo.systemOrigin) && Intrinsics.LJFF(this.logExtra, minisRawAdInfo.logExtra);
    }

    public final int hashCode() {
        Long l = this.creativeId;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.systemOrigin;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.logExtra;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MinisRawAdInfo(creativeId=");
        sbLIZ.append(this.creativeId);
        sbLIZ.append(", systemOrigin=");
        sbLIZ.append(this.systemOrigin);
        sbLIZ.append(", logExtra=");
        sbLIZ.append(this.logExtra);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.creativeId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Integer num = this.systemOrigin;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.logExtra);
    }

    public MinisRawAdInfo(Long l, Integer num, String str) {
        this.creativeId = l;
        this.systemOrigin = num;
        this.logExtra = str;
    }
}
