package com.ss.android.ugc.aweme.ecommerce.showcase.service.vo;

import X.C09CT;
import X.C2188811AlT;
import X.C960203pA;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.ThemeColor;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes2.dex */
public final class ThemeColor implements Parcelable {
    public static final Parcelable.Creator<ThemeColor> CREATOR = new Parcelable.Creator<ThemeColor>() { // from class: X.02kW
        @Override // android.os.Parcelable.Creator
        public final ThemeColor createFromParcel(Parcel parcel) {
            return new ThemeColor(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ThemeColor[] newArray(int i) {
            return new ThemeColor[i];
        }
    };

    @C09CT("dark")
    public String dark;

    @C09CT("light")
    public String light;

    public ThemeColor() {
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
        if (!(obj instanceof ThemeColor)) {
            return false;
        }
        ThemeColor themeColor = (ThemeColor) obj;
        return Intrinsics.LJFF(this.light, themeColor.light) && Intrinsics.LJFF(this.dark, themeColor.dark);
    }

    public final int hashCode() {
        String str = this.light;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.dark;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ThemeColor(light=");
        sbLIZ.append(this.light);
        sbLIZ.append(", dark=");
        sbLIZ.append(this.dark);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.light);
        parcel.writeString(this.dark);
    }

    public static String LIZIZ(String str) {
        if (str != null && str.length() != 0 && str.length() == 9 && u.LJJIIJZLJL(str, "#", false)) {
            return "#" + str.substring(7) + str.substring(1, 7);
        }
        return str;
    }

    public final String LIZ(Context context) {
        if (C960203pA.LIZIZ(context)) {
            return LIZIZ(this.dark);
        }
        return LIZIZ(this.light);
    }

    public ThemeColor(String str, String str2) {
        this.light = str;
        this.dark = str2;
    }
}
