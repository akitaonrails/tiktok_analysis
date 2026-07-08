package com.ss.android.ugc.aweme.minis.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.minis.model.PreloadSubpackageInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class PreloadSubpackageInfo implements Parcelable {

    @C09CT("isStartup")
    public final boolean isStartup;

    @C09CT("size")
    public final String size;

    @C09CT("subPkgName")
    public final String subPkgName;
    public static final Parcelable.Creator<PreloadSubpackageInfo> CREATOR = new Parcelable.Creator<PreloadSubpackageInfo>() { // from class: X.09YR
        @Override // android.os.Parcelable.Creator
        public final PreloadSubpackageInfo createFromParcel(Parcel parcel) {
            boolean z;
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new PreloadSubpackageInfo(string, z, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PreloadSubpackageInfo[] newArray(int i) {
            return new PreloadSubpackageInfo[i];
        }
    };
    public static final int $stable = 8;

    public PreloadSubpackageInfo() {
        this(null, false, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreloadSubpackageInfo)) {
            return false;
        }
        PreloadSubpackageInfo preloadSubpackageInfo = (PreloadSubpackageInfo) obj;
        return Intrinsics.LJFF(this.subPkgName, preloadSubpackageInfo.subPkgName) && this.isStartup == preloadSubpackageInfo.isStartup && Intrinsics.LJFF(this.size, preloadSubpackageInfo.size);
    }

    public final int hashCode() {
        String str = this.subPkgName;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Z2(this.isStartup)) * 31;
        String str2 = this.size;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreloadSubpackageInfo(subPkgName=");
        sbLIZ.append(this.subPkgName);
        sbLIZ.append(", isStartup=");
        sbLIZ.append(this.isStartup);
        sbLIZ.append(", size=");
        sbLIZ.append(this.size);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.subPkgName);
        parcel.writeInt(this.isStartup ? 1 : 0);
        parcel.writeString(this.size);
    }

    public PreloadSubpackageInfo(String str, boolean z, String str2) {
        this.subPkgName = str;
        this.isStartup = z;
        this.size = str2;
    }
}
