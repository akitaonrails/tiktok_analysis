package com.bytedance.goda.v2.model.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.goda.v2.model.dto.GodaV2StyleColor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class GodaV2StyleColor implements Parcelable {
    public static final Parcelable.Creator<GodaV2StyleColor> CREATOR = new Parcelable.Creator<GodaV2StyleColor>() { // from class: X.0kwQ
        @Override // android.os.Parcelable.Creator
        public final GodaV2StyleColor createFromParcel(Parcel parcel) {
            return new GodaV2StyleColor(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GodaV2StyleColor[] newArray(int i) {
            return new GodaV2StyleColor[i];
        }
    };

    @C09CT("color")
    public final String color;

    @C09CT("color_dark")
    public final String darkColor;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GodaV2StyleColor)) {
            return false;
        }
        GodaV2StyleColor godaV2StyleColor = (GodaV2StyleColor) obj;
        return Intrinsics.LJFF(this.color, godaV2StyleColor.color) && Intrinsics.LJFF(this.darkColor, godaV2StyleColor.darkColor);
    }

    public final int hashCode() {
        String str = this.color;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.darkColor;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GodaV2StyleColor(color=");
        sbLIZ.append(this.color);
        sbLIZ.append(", darkColor=");
        sbLIZ.append(this.darkColor);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.color);
        parcel.writeString(this.darkColor);
    }

    public GodaV2StyleColor(String str, String str2) {
        this.color = str;
        this.darkColor = str2;
    }
}
