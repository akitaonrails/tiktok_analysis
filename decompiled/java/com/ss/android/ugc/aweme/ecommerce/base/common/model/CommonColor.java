package com.ss.android.ugc.aweme.ecommerce.base.common.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class CommonColor implements Parcelable, Serializable {

    @C09CT("color")
    public String color;

    @C09CT("dark_color")
    public String darkColor;

    @C09CT("token")
    public String token;
    public static final Parcelable.Creator<CommonColor> CREATOR = new Parcelable.Creator<CommonColor>() { // from class: X.02i7
        @Override // android.os.Parcelable.Creator
        public final CommonColor createFromParcel(Parcel parcel) {
            return new CommonColor(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CommonColor[] newArray(int i) {
            return new CommonColor[i];
        }
    };
    public static final int $stable = 8;

    public CommonColor() {
    }

    public final CommonColor copy(String str, String str2, String str3) {
        return new CommonColor(str, str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonColor)) {
            return false;
        }
        CommonColor commonColor = (CommonColor) obj;
        return Intrinsics.LJFF(this.darkColor, commonColor.darkColor) && Intrinsics.LJFF(this.color, commonColor.color) && Intrinsics.LJFF(this.token, commonColor.token);
    }

    public int hashCode() {
        String str = this.darkColor;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.color;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.token;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommonColor(darkColor=");
        sbLIZ.append(this.darkColor);
        sbLIZ.append(", color=");
        sbLIZ.append(this.color);
        sbLIZ.append(", token=");
        sbLIZ.append(this.token);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.darkColor);
        parcel.writeString(this.color);
        parcel.writeString(this.token);
    }

    public final String getColor() {
        return this.color;
    }

    public final String getDarkColor() {
        return this.darkColor;
    }

    public final String getToken() {
        return this.token;
    }

    public CommonColor(String str, String str2, String str3) {
        this.darkColor = str;
        this.color = str2;
        this.token = str3;
    }
}
