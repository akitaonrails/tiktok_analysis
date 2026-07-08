package com.ss.android.ugc.aweme.ecommerce.showcase.service.vo;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.ThemeColor;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.TopRatedInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class TopRatedInfo implements Parcelable {
    public static final Parcelable.Creator<TopRatedInfo> CREATOR = new Parcelable.Creator<TopRatedInfo>() { // from class: X.02mM
        @Override // android.os.Parcelable.Creator
        public final TopRatedInfo createFromParcel(Parcel parcel) {
            ThemeColor themeColorCreateFromParcel;
            ThemeColor themeColorCreateFromParcel2;
            boolean z;
            String string = parcel.readString();
            Boolean boolValueOf = null;
            if (parcel.readInt() == 0) {
                themeColorCreateFromParcel = null;
            } else {
                themeColorCreateFromParcel = ThemeColor.CREATOR.createFromParcel(parcel);
            }
            ThemeColor themeColor = themeColorCreateFromParcel;
            if (parcel.readInt() == 0) {
                themeColorCreateFromParcel2 = null;
            } else {
                themeColorCreateFromParcel2 = ThemeColor.CREATOR.createFromParcel(parcel);
            }
            ThemeColor themeColor2 = themeColorCreateFromParcel2;
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            return new TopRatedInfo(string, themeColor, themeColor2, string2, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final TopRatedInfo[] newArray(int i) {
            return new TopRatedInfo[i];
        }
    };

    @C09CT("background_color")
    public final ThemeColor backgroundColor;

    @C09CT("is_only_top_rated")
    public final Boolean onlyTopRated;

    @C09CT("schema")
    public final String schema;

    @C09CT("text")
    public final String text;

    @C09CT("text_color")
    public final ThemeColor textColor;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TopRatedInfo)) {
            return false;
        }
        TopRatedInfo topRatedInfo = (TopRatedInfo) obj;
        return Intrinsics.LJFF(this.text, topRatedInfo.text) && Intrinsics.LJFF(this.textColor, topRatedInfo.textColor) && Intrinsics.LJFF(this.backgroundColor, topRatedInfo.backgroundColor) && Intrinsics.LJFF(this.schema, topRatedInfo.schema) && Intrinsics.LJFF(this.onlyTopRated, topRatedInfo.onlyTopRated);
    }

    public final int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ThemeColor themeColor = this.textColor;
        int iHashCode2 = (iHashCode + (themeColor == null ? 0 : themeColor.hashCode())) * 31;
        ThemeColor themeColor2 = this.backgroundColor;
        int iHashCode3 = (iHashCode2 + (themeColor2 == null ? 0 : themeColor2.hashCode())) * 31;
        String str2 = this.schema;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.onlyTopRated;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TopRatedInfo(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", textColor=");
        sbLIZ.append(this.textColor);
        sbLIZ.append(", backgroundColor=");
        sbLIZ.append(this.backgroundColor);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", onlyTopRated=");
        sbLIZ.append(this.onlyTopRated);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        ThemeColor themeColor = this.textColor;
        if (themeColor == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            themeColor.writeToParcel(parcel, i);
        }
        ThemeColor themeColor2 = this.backgroundColor;
        if (themeColor2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            themeColor2.writeToParcel(parcel, i);
        }
        parcel.writeString(this.schema);
        Boolean bool = this.onlyTopRated;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public TopRatedInfo(String str, ThemeColor themeColor, ThemeColor themeColor2, String str2, Boolean bool) {
        this.text = str;
        this.textColor = themeColor;
        this.backgroundColor = themeColor2;
        this.schema = str2;
        this.onlyTopRated = bool;
    }
}
