package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickStyle;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Padding;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class BrickStyle implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<BrickStyle> CREATOR = new Parcelable.Creator<BrickStyle>() { // from class: X.03vB
        @Override // android.os.Parcelable.Creator
        public final BrickStyle createFromParcel(Parcel parcel) {
            Float fValueOf;
            Padding paddingCreateFromParcel;
            boolean z;
            Boolean boolValueOf;
            Integer numValueOf = null;
            if (parcel.readInt() == 0) {
                fValueOf = null;
            } else {
                fValueOf = Float.valueOf(parcel.readFloat());
            }
            if (parcel.readInt() == 0) {
                paddingCreateFromParcel = null;
            } else {
                paddingCreateFromParcel = Padding.CREATOR.createFromParcel(parcel);
            }
            Padding padding = paddingCreateFromParcel;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new BrickStyle(fValueOf, padding, boolValueOf, string, string2, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final BrickStyle[] newArray(int i) {
            return new BrickStyle[i];
        }
    };

    @C09CT("background_color")
    public final String backgroundColor;

    @C09CT("background_color_dark")
    public final String backgroundColorDark;

    @C09CT("collapse_height")
    public final Integer collapseHeight;

    @C09CT("height")
    public final Float height;

    @C09CT("padding")
    public final Padding padding;

    @C09CT("show_divider")
    public final Boolean showDivider;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrickStyle)) {
            return false;
        }
        BrickStyle brickStyle = (BrickStyle) obj;
        return Intrinsics.LJFF(this.height, brickStyle.height) && Intrinsics.LJFF(this.padding, brickStyle.padding) && Intrinsics.LJFF(this.showDivider, brickStyle.showDivider) && Intrinsics.LJFF(this.backgroundColor, brickStyle.backgroundColor) && Intrinsics.LJFF(this.backgroundColorDark, brickStyle.backgroundColorDark) && Intrinsics.LJFF(this.collapseHeight, brickStyle.collapseHeight);
    }

    public final int hashCode() {
        Float f = this.height;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        Padding padding = this.padding;
        int iHashCode2 = (iHashCode + (padding == null ? 0 : padding.hashCode())) * 31;
        Boolean bool = this.showDivider;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.backgroundColor;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.backgroundColorDark;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.collapseHeight;
        return iHashCode5 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BrickStyle(height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", padding=");
        sbLIZ.append(this.padding);
        sbLIZ.append(", showDivider=");
        sbLIZ.append(this.showDivider);
        sbLIZ.append(", backgroundColor=");
        sbLIZ.append(this.backgroundColor);
        sbLIZ.append(", backgroundColorDark=");
        sbLIZ.append(this.backgroundColorDark);
        sbLIZ.append(", collapseHeight=");
        sbLIZ.append(this.collapseHeight);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Float f = this.height;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        Padding padding = this.padding;
        if (padding == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            padding.writeToParcel(parcel, i);
        }
        Boolean bool = this.showDivider;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.backgroundColor);
        parcel.writeString(this.backgroundColorDark);
        Integer num = this.collapseHeight;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    public BrickStyle(Float f, Padding padding, Boolean bool, String str, String str2, Integer num) {
        this.height = f;
        this.padding = padding;
        this.showDivider = bool;
        this.backgroundColor = str;
        this.backgroundColorDark = str2;
        this.collapseHeight = num;
    }
}
