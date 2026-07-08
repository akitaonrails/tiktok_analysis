package com.ss.android.ugc.aweme.ecommerce.richtext.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.CustomColor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class CustomColor implements Parcelable {
    public static final Parcelable.Creator<CustomColor> CREATOR = new Parcelable.Creator<CustomColor>() { // from class: X.02mi
        @Override // android.os.Parcelable.Creator
        public final CustomColor createFromParcel(Parcel parcel) {
            return new CustomColor(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CustomColor[] newArray(int i) {
            return new CustomColor[i];
        }
    };

    @C09CT("color")
    public String color;

    @C09CT("dark_color")
    public String darkColor;

    public CustomColor() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomColor)) {
            return false;
        }
        CustomColor customColor = (CustomColor) obj;
        return Intrinsics.LJFF(this.darkColor, customColor.darkColor) && Intrinsics.LJFF(this.color, customColor.color);
    }

    public final int hashCode() {
        String str = this.darkColor;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.color;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CustomColor(darkColor=");
        sbLIZ.append(this.darkColor);
        sbLIZ.append(", color=");
        sbLIZ.append(this.color);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.darkColor);
        parcel.writeString(this.color);
    }

    public CustomColor(String str, String str2) {
        this.darkColor = str;
        this.color = str2;
    }
}
