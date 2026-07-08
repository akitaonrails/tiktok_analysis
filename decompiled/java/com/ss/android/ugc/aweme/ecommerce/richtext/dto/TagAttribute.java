package com.ss.android.ugc.aweme.ecommerce.richtext.dto;

import X.C09CT;
import X.C2188811AlT;
import android.graphics.Insets;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.CustomColor;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.Font;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.Icon;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.TagAttribute;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class TagAttribute implements Parcelable {
    public static final Parcelable.Creator<TagAttribute> CREATOR = new Parcelable.Creator<TagAttribute>() { // from class: X.02pB
        @Override // android.os.Parcelable.Creator
        public final TagAttribute createFromParcel(Parcel parcel) {
            Icon iconCreateFromParcel;
            Font fontCreateFromParcel;
            CustomColor customColorCreateFromParcel;
            CustomColor customColorCreateFromParcel2;
            Float fValueOf;
            Float fValueOf2 = null;
            if (parcel.readInt() == 0) {
                iconCreateFromParcel = null;
            } else {
                iconCreateFromParcel = Icon.CREATOR.createFromParcel(parcel);
            }
            Icon icon = iconCreateFromParcel;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                fontCreateFromParcel = null;
            } else {
                fontCreateFromParcel = Font.CREATOR.createFromParcel(parcel);
            }
            Font font = fontCreateFromParcel;
            if (parcel.readInt() == 0) {
                customColorCreateFromParcel = null;
            } else {
                customColorCreateFromParcel = CustomColor.CREATOR.createFromParcel(parcel);
            }
            CustomColor customColor = customColorCreateFromParcel;
            if (parcel.readInt() == 0) {
                customColorCreateFromParcel2 = null;
            } else {
                customColorCreateFromParcel2 = CustomColor.CREATOR.createFromParcel(parcel);
            }
            CustomColor customColor2 = customColorCreateFromParcel2;
            Insets insets = (Insets) parcel.readParcelable(TagAttribute.class.getClassLoader());
            if (parcel.readInt() == 0) {
                fValueOf = null;
            } else {
                fValueOf = Float.valueOf(parcel.readFloat());
            }
            if (parcel.readInt() != 0) {
                fValueOf2 = Float.valueOf(parcel.readFloat());
            }
            return new TagAttribute(icon, string, font, customColor, customColor2, insets, fValueOf, fValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final TagAttribute[] newArray(int i) {
            return new TagAttribute[i];
        }
    };

    @C09CT("background_color")
    public final CustomColor backgroundColor;

    @C09CT("font")
    public final Font font;

    @C09CT("font_color")
    public final CustomColor fontColor;

    @C09CT("icon")
    public final Icon icon;

    @C09CT("insets")
    public final Insets insets;

    @C09CT("corner_radius")
    public final Float radius;

    @C09CT("spacing")
    public final Float spacing;

    @C09CT("text")
    public final String text;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TagAttribute)) {
            return false;
        }
        TagAttribute tagAttribute = (TagAttribute) obj;
        return Intrinsics.LJFF(this.icon, tagAttribute.icon) && Intrinsics.LJFF(this.text, tagAttribute.text) && Intrinsics.LJFF(this.font, tagAttribute.font) && Intrinsics.LJFF(this.fontColor, tagAttribute.fontColor) && Intrinsics.LJFF(this.backgroundColor, tagAttribute.backgroundColor) && Intrinsics.LJFF(this.insets, tagAttribute.insets) && Intrinsics.LJFF(this.spacing, tagAttribute.spacing) && Intrinsics.LJFF(this.radius, tagAttribute.radius);
    }

    public final int hashCode() {
        Icon icon = this.icon;
        int iHashCode = (icon == null ? 0 : icon.hashCode()) * 31;
        String str = this.text;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Font font = this.font;
        int iHashCode3 = (iHashCode2 + (font == null ? 0 : font.hashCode())) * 31;
        CustomColor customColor = this.fontColor;
        int iHashCode4 = (iHashCode3 + (customColor == null ? 0 : customColor.hashCode())) * 31;
        CustomColor customColor2 = this.backgroundColor;
        int iHashCode5 = (iHashCode4 + (customColor2 == null ? 0 : customColor2.hashCode())) * 31;
        Insets insets = this.insets;
        int iHashCode6 = (iHashCode5 + (insets == null ? 0 : insets.hashCode())) * 31;
        Float f = this.spacing;
        int iHashCode7 = (iHashCode6 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.radius;
        return iHashCode7 + (f2 != null ? f2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TagAttribute(icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", font=");
        sbLIZ.append(this.font);
        sbLIZ.append(", fontColor=");
        sbLIZ.append(this.fontColor);
        sbLIZ.append(", backgroundColor=");
        sbLIZ.append(this.backgroundColor);
        sbLIZ.append(", insets=");
        sbLIZ.append(this.insets);
        sbLIZ.append(", spacing=");
        sbLIZ.append(this.spacing);
        sbLIZ.append(", radius=");
        sbLIZ.append(this.radius);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Icon icon = this.icon;
        if (icon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            icon.writeToParcel(parcel, i);
        }
        parcel.writeString(this.text);
        Font font = this.font;
        if (font == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            font.writeToParcel(parcel, i);
        }
        CustomColor customColor = this.fontColor;
        if (customColor == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            customColor.writeToParcel(parcel, i);
        }
        CustomColor customColor2 = this.backgroundColor;
        if (customColor2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            customColor2.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.insets, i);
        Float f = this.spacing;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        Float f2 = this.radius;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f2.floatValue());
        }
    }

    public TagAttribute(Icon icon, String str, Font font, CustomColor customColor, CustomColor customColor2, Insets insets, Float f, Float f2) {
        this.icon = icon;
        this.text = str;
        this.font = font;
        this.fontColor = customColor;
        this.backgroundColor = customColor2;
        this.insets = insets;
        this.spacing = f;
        this.radius = f2;
    }
}
