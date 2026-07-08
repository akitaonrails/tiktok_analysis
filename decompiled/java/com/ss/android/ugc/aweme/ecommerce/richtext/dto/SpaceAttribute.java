package com.ss.android.ugc.aweme.ecommerce.richtext.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.CustomColor;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.Size;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.SpaceAttribute;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SpaceAttribute implements Parcelable {
    public static final Parcelable.Creator<SpaceAttribute> CREATOR = new Parcelable.Creator<SpaceAttribute>() { // from class: X.02mn
        @Override // android.os.Parcelable.Creator
        public final SpaceAttribute createFromParcel(Parcel parcel) {
            CustomColor customColorCreateFromParcel;
            Integer numValueOf;
            Size sizeCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                customColorCreateFromParcel = null;
            } else {
                customColorCreateFromParcel = CustomColor.CREATOR.createFromParcel(parcel);
            }
            CustomColor customColor = customColorCreateFromParcel;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                sizeCreateFromParcel = Size.CREATOR.createFromParcel(parcel);
            }
            return new SpaceAttribute(customColor, numValueOf, sizeCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SpaceAttribute[] newArray(int i) {
            return new SpaceAttribute[i];
        }
    };

    @C09CT("alignment")
    public Integer alignment;

    @C09CT("color")
    public CustomColor color;

    @C09CT("size")
    public Size size;

    public SpaceAttribute() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpaceAttribute)) {
            return false;
        }
        SpaceAttribute spaceAttribute = (SpaceAttribute) obj;
        return Intrinsics.LJFF(this.color, spaceAttribute.color) && Intrinsics.LJFF(this.alignment, spaceAttribute.alignment) && Intrinsics.LJFF(this.size, spaceAttribute.size);
    }

    public final int hashCode() {
        CustomColor customColor = this.color;
        int iHashCode = (customColor == null ? 0 : customColor.hashCode()) * 31;
        Integer num = this.alignment;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Size size = this.size;
        return iHashCode2 + (size != null ? size.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SpaceAttribute(color=");
        sbLIZ.append(this.color);
        sbLIZ.append(", alignment=");
        sbLIZ.append(this.alignment);
        sbLIZ.append(", size=");
        sbLIZ.append(this.size);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        CustomColor customColor = this.color;
        if (customColor == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            customColor.writeToParcel(parcel, i);
        }
        Integer num = this.alignment;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Size size = this.size;
        if (size == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            size.writeToParcel(parcel, i);
        }
    }

    public SpaceAttribute(CustomColor customColor, Integer num, Size size) {
        this.color = customColor;
        this.alignment = num;
        this.size = size;
    }
}
