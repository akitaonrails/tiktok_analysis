package com.ss.android.ugc.aweme.minis.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.minis.model.MinisMetaReq;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class MinisMetaReq implements Parcelable {

    @C09CT("client_key")
    public final String clientKey;

    @C09CT("source")
    public final String source;

    @C09CT("stage")
    public final Integer stage;

    @C09CT("ttcode")
    public final String ttcode;
    public static final Parcelable.Creator<MinisMetaReq> CREATOR = new Parcelable.Creator<MinisMetaReq>() { // from class: X.02xp
        @Override // android.os.Parcelable.Creator
        public final MinisMetaReq createFromParcel(Parcel parcel) {
            Integer numValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new MinisMetaReq(string, string2, numValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MinisMetaReq[] newArray(int i) {
            return new MinisMetaReq[i];
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
        if (!(obj instanceof MinisMetaReq)) {
            return false;
        }
        MinisMetaReq minisMetaReq = (MinisMetaReq) obj;
        return Intrinsics.LJFF(this.clientKey, minisMetaReq.clientKey) && Intrinsics.LJFF(this.ttcode, minisMetaReq.ttcode) && Intrinsics.LJFF(this.stage, minisMetaReq.stage) && Intrinsics.LJFF(this.source, minisMetaReq.source);
    }

    public final int hashCode() {
        String str = this.clientKey;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.ttcode;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.stage;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.source;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MinisMetaReq(clientKey=");
        sbLIZ.append(this.clientKey);
        sbLIZ.append(", ttcode=");
        sbLIZ.append(this.ttcode);
        sbLIZ.append(", stage=");
        sbLIZ.append(this.stage);
        sbLIZ.append(", source=");
        sbLIZ.append(this.source);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeString(this.clientKey);
        parcel.writeString(this.ttcode);
        Integer num = this.stage;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.source);
    }

    public MinisMetaReq(String str, String str2, Integer num, String str3) {
        this.clientKey = str;
        this.ttcode = str2;
        this.stage = num;
        this.source = str3;
    }
}
