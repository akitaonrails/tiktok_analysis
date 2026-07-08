package com.ss.android.ugc.aweme.ecommerce.base.common.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.TextColorString;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class TextColorString implements Parcelable, Serializable {

    @C09CT("color")
    public String color;

    @C09CT("dark_color")
    public String darkColor;
    public static final Parcelable.Creator<TextColorString> CREATOR = new Parcelable.Creator<TextColorString>() { // from class: X.02ZN
        @Override // android.os.Parcelable.Creator
        public final TextColorString createFromParcel(Parcel parcel) {
            return new TextColorString(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TextColorString[] newArray(int i) {
            return new TextColorString[i];
        }
    };
    public static final int $stable = 8;

    public TextColorString() {
    }

    public final TextColorString copy(String str, String str2) {
        return new TextColorString(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextColorString)) {
            return false;
        }
        TextColorString textColorString = (TextColorString) obj;
        return Intrinsics.LJFF(this.darkColor, textColorString.darkColor) && Intrinsics.LJFF(this.color, textColorString.color);
    }

    public int hashCode() {
        String str = this.darkColor;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.color;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextColorString(darkColor=");
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

    public final String getColor() {
        return this.color;
    }

    public final String getDarkColor() {
        return this.darkColor;
    }

    public TextColorString(String str, String str2) {
        this.darkColor = str;
        this.color = str2;
    }
}
