package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.dto.BorderStyle;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.CustomColor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class BorderStyle implements Parcelable {

    @C09CT("border_color")
    public final CustomColor borderColor;

    @C09CT("border_radius")
    public final Integer borderRadius;

    @C09CT("border_width")
    public final Integer borderWidth;
    public static final Parcelable.Creator<BorderStyle> CREATOR = new Parcelable.Creator<BorderStyle>() { // from class: X.0vtV
        @Override // android.os.Parcelable.Creator
        public final BorderStyle createFromParcel(Parcel parcel) {
            Integer numValueOf;
            CustomColor customColor = (CustomColor) parcel.readParcelable(BorderStyle.class.getClassLoader());
            Integer numValueOf2 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new BorderStyle(customColor, numValueOf, numValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final BorderStyle[] newArray(int i) {
            return new BorderStyle[i];
        }
    };
    public static final int $stable = 8;

    public BorderStyle() {
        this(null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderStyle)) {
            return false;
        }
        BorderStyle borderStyle = (BorderStyle) obj;
        return Intrinsics.LJFF(this.borderColor, borderStyle.borderColor) && Intrinsics.LJFF(this.borderRadius, borderStyle.borderRadius) && Intrinsics.LJFF(this.borderWidth, borderStyle.borderWidth);
    }

    public final int hashCode() {
        CustomColor customColor = this.borderColor;
        int iHashCode = (customColor == null ? 0 : customColor.hashCode()) * 31;
        Integer num = this.borderRadius;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.borderWidth;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BorderStyle(borderColor=");
        sbLIZ.append(this.borderColor);
        sbLIZ.append(", borderRadius=");
        sbLIZ.append(this.borderRadius);
        sbLIZ.append(", borderWidth=");
        sbLIZ.append(this.borderWidth);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.borderColor, i);
        Integer num = this.borderRadius;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.borderWidth;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    public BorderStyle(CustomColor customColor, Integer num, Integer num2) {
        this.borderColor = customColor;
        this.borderRadius = num;
        this.borderWidth = num2;
    }
}
