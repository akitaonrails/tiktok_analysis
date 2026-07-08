package com.ss.android.ugc.aweme.minis.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.minis.model.MinisExtraConfig;
import com.ss.android.ugc.aweme.minis.model.MinisNavbarConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class MinisExtraConfig implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<MinisExtraConfig> CREATOR = new Parcelable.Creator<MinisExtraConfig>() { // from class: X.0cum
        @Override // android.os.Parcelable.Creator
        public final MinisExtraConfig createFromParcel(Parcel parcel) {
            MinisNavbarConfig minisNavbarConfigCreateFromParcel;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                minisNavbarConfigCreateFromParcel = null;
            } else {
                minisNavbarConfigCreateFromParcel = MinisNavbarConfig.CREATOR.createFromParcel(parcel);
            }
            return new MinisExtraConfig(string, string2, minisNavbarConfigCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final MinisExtraConfig[] newArray(int i) {
            return new MinisExtraConfig[i];
        }
    };

    @C09CT("client_key")
    public final String clientKey;

    @C09CT("name")
    public final String name;

    @C09CT("navbar")
    public final MinisNavbarConfig navbar;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MinisExtraConfig)) {
            return false;
        }
        MinisExtraConfig minisExtraConfig = (MinisExtraConfig) obj;
        return Intrinsics.LJFF(this.clientKey, minisExtraConfig.clientKey) && Intrinsics.LJFF(this.name, minisExtraConfig.name) && Intrinsics.LJFF(this.navbar, minisExtraConfig.navbar);
    }

    public final int hashCode() {
        String str = this.clientKey;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        MinisNavbarConfig minisNavbarConfig = this.navbar;
        return iHashCode2 + (minisNavbarConfig != null ? minisNavbarConfig.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MinisExtraConfig(clientKey=");
        sbLIZ.append(this.clientKey);
        sbLIZ.append(", name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", navbar=");
        sbLIZ.append(this.navbar);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.clientKey);
        parcel.writeString(this.name);
        MinisNavbarConfig minisNavbarConfig = this.navbar;
        if (minisNavbarConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            minisNavbarConfig.writeToParcel(parcel, i);
        }
    }

    public MinisExtraConfig(String str, String str2, MinisNavbarConfig minisNavbarConfig) {
        this.clientKey = str;
        this.name = str2;
        this.navbar = minisNavbarConfig;
    }
}
