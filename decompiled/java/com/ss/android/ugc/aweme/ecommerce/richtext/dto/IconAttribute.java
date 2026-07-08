package com.ss.android.ugc.aweme.ecommerce.richtext.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.Icon;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.IconAttribute;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.Size;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class IconAttribute implements Parcelable {
    public static final Parcelable.Creator<IconAttribute> CREATOR = new Parcelable.Creator<IconAttribute>() { // from class: X.02mm
        @Override // android.os.Parcelable.Creator
        public final IconAttribute createFromParcel(Parcel parcel) {
            Size sizeCreateFromParcel;
            Icon iconCreateFromParcel;
            Integer numValueOf = null;
            if (parcel.readInt() == 0) {
                sizeCreateFromParcel = null;
            } else {
                sizeCreateFromParcel = Size.CREATOR.createFromParcel(parcel);
            }
            Size size = sizeCreateFromParcel;
            if (parcel.readInt() == 0) {
                iconCreateFromParcel = null;
            } else {
                iconCreateFromParcel = Icon.CREATOR.createFromParcel(parcel);
            }
            Icon icon = iconCreateFromParcel;
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new IconAttribute(size, icon, string, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final IconAttribute[] newArray(int i) {
            return new IconAttribute[i];
        }
    };

    @C09CT("alignment")
    public Integer alignment;

    @C09CT("icon")
    public Icon icon;

    @C09CT("link")
    public String link;

    @C09CT("size")
    public Size size;

    public IconAttribute() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IconAttribute)) {
            return false;
        }
        IconAttribute iconAttribute = (IconAttribute) obj;
        return Intrinsics.LJFF(this.size, iconAttribute.size) && Intrinsics.LJFF(this.icon, iconAttribute.icon) && Intrinsics.LJFF(this.link, iconAttribute.link) && Intrinsics.LJFF(this.alignment, iconAttribute.alignment);
    }

    public final int hashCode() {
        Size size = this.size;
        int iHashCode = (size == null ? 0 : size.hashCode()) * 31;
        Icon icon = this.icon;
        int iHashCode2 = (iHashCode + (icon == null ? 0 : icon.hashCode())) * 31;
        String str = this.link;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.alignment;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IconAttribute(size=");
        sbLIZ.append(this.size);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", link=");
        sbLIZ.append(this.link);
        sbLIZ.append(", alignment=");
        sbLIZ.append(this.alignment);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Size size = this.size;
        if (size == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            size.writeToParcel(parcel, i);
        }
        Icon icon = this.icon;
        if (icon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            icon.writeToParcel(parcel, i);
        }
        parcel.writeString(this.link);
        Integer num = this.alignment;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    public IconAttribute(Size size, Icon icon, String str, Integer num) {
        this.size = size;
        this.icon = icon;
        this.link = str;
        this.alignment = num;
    }
}
