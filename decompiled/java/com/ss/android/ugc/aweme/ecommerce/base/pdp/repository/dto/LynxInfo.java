package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LynxInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class LynxInfo implements Parcelable {

    @C09CT("lynx_data")
    public final String lynxData;

    @C09CT("schema")
    public final String schema;
    public static final Parcelable.Creator<LynxInfo> CREATOR = new Parcelable.Creator<LynxInfo>() { // from class: X.03w9
        @Override // android.os.Parcelable.Creator
        public final LynxInfo createFromParcel(Parcel parcel) {
            return new LynxInfo(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LynxInfo[] newArray(int i) {
            return new LynxInfo[i];
        }
    };
    public static final int $stable = 8;

    public LynxInfo() {
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
        if (!(obj instanceof LynxInfo)) {
            return false;
        }
        LynxInfo lynxInfo = (LynxInfo) obj;
        return Intrinsics.LJFF(this.lynxData, lynxInfo.lynxData) && Intrinsics.LJFF(this.schema, lynxInfo.schema);
    }

    public final int hashCode() {
        String str = this.lynxData;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.schema;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LynxInfo(lynxData=");
        sbLIZ.append(this.lynxData);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.lynxData);
        parcel.writeString(this.schema);
    }

    public LynxInfo(String str, String str2) {
        this.lynxData = str;
        this.schema = str2;
    }
}
