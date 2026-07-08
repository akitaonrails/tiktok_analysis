package com.ss.android.ugc.aweme.aigc.asynctask.net;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.aigc.asynctask.net.QuotaStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class QuotaStruct implements Parcelable {

    @C09CT("job_type")
    public final String jobType;

    @C09CT("quota")
    public final Integer quota;

    @C09CT("quota_remain")
    public final Integer quotaRemain;
    public static final Parcelable.Creator<QuotaStruct> CREATOR = new Parcelable.Creator<QuotaStruct>() { // from class: X.0LUz
        @Override // android.os.Parcelable.Creator
        public final QuotaStruct createFromParcel(Parcel parcel) {
            Integer numValueOf;
            String string = parcel.readString();
            Integer numValueOf2 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new QuotaStruct(string, numValueOf, numValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final QuotaStruct[] newArray(int i) {
            return new QuotaStruct[i];
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
        if (!(obj instanceof QuotaStruct)) {
            return false;
        }
        QuotaStruct quotaStruct = (QuotaStruct) obj;
        return Intrinsics.LJFF(this.jobType, quotaStruct.jobType) && Intrinsics.LJFF(this.quotaRemain, quotaStruct.quotaRemain) && Intrinsics.LJFF(this.quota, quotaStruct.quota);
    }

    public final int hashCode() {
        String str = this.jobType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.quotaRemain;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.quota;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuotaStruct(jobType=");
        sbLIZ.append(this.jobType);
        sbLIZ.append(", quotaRemain=");
        sbLIZ.append(this.quotaRemain);
        sbLIZ.append(", quota=");
        sbLIZ.append(this.quota);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.jobType);
        Integer num = this.quotaRemain;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.quota;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    public QuotaStruct(String str, Integer num, Integer num2) {
        this.jobType = str;
        this.quotaRemain = num;
        this.quota = num2;
    }
}
