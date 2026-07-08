package com.ss.android.ugc.aweme.minis.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.minis.model.MinisNavbarConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class MinisNavbarConfig implements Parcelable {

    @C09CT("bgColorDark")
    public final String bgColorDark;

    @C09CT("bgColorLight")
    public final String bgColorLight;

    @C09CT("style")
    public final String style;
    public static final Parcelable.Creator<MinisNavbarConfig> CREATOR = new Parcelable.Creator<MinisNavbarConfig>() { // from class: X.0cun
        @Override // android.os.Parcelable.Creator
        public final MinisNavbarConfig createFromParcel(Parcel parcel) {
            return new MinisNavbarConfig(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MinisNavbarConfig[] newArray(int i) {
            return new MinisNavbarConfig[i];
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
        if (!(obj instanceof MinisNavbarConfig)) {
            return false;
        }
        MinisNavbarConfig minisNavbarConfig = (MinisNavbarConfig) obj;
        return Intrinsics.LJFF(this.style, minisNavbarConfig.style) && Intrinsics.LJFF(this.bgColorLight, minisNavbarConfig.bgColorLight) && Intrinsics.LJFF(this.bgColorDark, minisNavbarConfig.bgColorDark);
    }

    public final int hashCode() {
        int iHashCode = this.style.hashCode() * 31;
        String str = this.bgColorLight;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.bgColorDark;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MinisNavbarConfig(style=");
        sbLIZ.append(this.style);
        sbLIZ.append(", bgColorLight=");
        sbLIZ.append(this.bgColorLight);
        sbLIZ.append(", bgColorDark=");
        sbLIZ.append(this.bgColorDark);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.style);
        parcel.writeString(this.bgColorLight);
        parcel.writeString(this.bgColorDark);
    }

    public MinisNavbarConfig(String str, String str2, String str3) {
        this.style = str;
        this.bgColorLight = str2;
        this.bgColorDark = str3;
    }
}
