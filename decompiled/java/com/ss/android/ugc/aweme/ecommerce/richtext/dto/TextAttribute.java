package com.ss.android.ugc.aweme.ecommerce.richtext.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.CustomColor;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.Font;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.TextAttribute;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class TextAttribute implements Parcelable {
    public static final Parcelable.Creator<TextAttribute> CREATOR = new Parcelable.Creator<TextAttribute>() { // from class: X.02mg
        @Override // android.os.Parcelable.Creator
        public final TextAttribute createFromParcel(Parcel parcel) {
            Font fontCreateFromParcel;
            boolean z;
            Boolean boolValueOf;
            boolean z2;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            CustomColor customColorCreateFromParcel;
            CustomColor customColorCreateFromParcel2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            Integer numValueOf = null;
            if (parcel.readInt() == 0) {
                fontCreateFromParcel = null;
            } else {
                fontCreateFromParcel = Font.CREATOR.createFromParcel(parcel);
            }
            Font font = fontCreateFromParcel;
            boolean z3 = true;
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
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolValueOf2 = Boolean.valueOf(z2);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                if (parcel.readInt() == 0) {
                    z3 = false;
                }
                boolValueOf3 = Boolean.valueOf(z3);
            }
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
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new TextAttribute(string, string2, font, boolValueOf, boolValueOf2, boolValueOf3, customColor, customColor2, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final TextAttribute[] newArray(int i) {
            return new TextAttribute[i];
        }
    };

    @C09CT("background_color")
    public CustomColor backgroundColor;

    @C09CT("font")
    public Font font;

    @C09CT("font_color")
    public CustomColor fontColor;

    @C09CT("has_strike")
    public Boolean hasStrike;

    @C09CT("has_underline")
    public Boolean hasUnderline;

    @C09CT("is_italic")
    public Boolean isItalic;

    @C09CT("num_of_lines")
    public Integer lines;

    @C09CT("link")
    public String link;

    @C09CT("text")
    public String text;

    public TextAttribute() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAttribute)) {
            return false;
        }
        TextAttribute textAttribute = (TextAttribute) obj;
        return Intrinsics.LJFF(this.text, textAttribute.text) && Intrinsics.LJFF(this.link, textAttribute.link) && Intrinsics.LJFF(this.font, textAttribute.font) && Intrinsics.LJFF(this.hasUnderline, textAttribute.hasUnderline) && Intrinsics.LJFF(this.hasStrike, textAttribute.hasStrike) && Intrinsics.LJFF(this.isItalic, textAttribute.isItalic) && Intrinsics.LJFF(this.fontColor, textAttribute.fontColor) && Intrinsics.LJFF(this.backgroundColor, textAttribute.backgroundColor) && Intrinsics.LJFF(this.lines, textAttribute.lines);
    }

    public final int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.link;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Font font = this.font;
        int iHashCode3 = (iHashCode2 + (font == null ? 0 : font.hashCode())) * 31;
        Boolean bool = this.hasUnderline;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hasStrike;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isItalic;
        int iHashCode6 = (iHashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        CustomColor customColor = this.fontColor;
        int iHashCode7 = (iHashCode6 + (customColor == null ? 0 : customColor.hashCode())) * 31;
        CustomColor customColor2 = this.backgroundColor;
        int iHashCode8 = (iHashCode7 + (customColor2 == null ? 0 : customColor2.hashCode())) * 31;
        Integer num = this.lines;
        return iHashCode8 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextAttribute(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", link=");
        sbLIZ.append(this.link);
        sbLIZ.append(", font=");
        sbLIZ.append(this.font);
        sbLIZ.append(", hasUnderline=");
        sbLIZ.append(this.hasUnderline);
        sbLIZ.append(", hasStrike=");
        sbLIZ.append(this.hasStrike);
        sbLIZ.append(", isItalic=");
        sbLIZ.append(this.isItalic);
        sbLIZ.append(", fontColor=");
        sbLIZ.append(this.fontColor);
        sbLIZ.append(", backgroundColor=");
        sbLIZ.append(this.backgroundColor);
        sbLIZ.append(", lines=");
        sbLIZ.append(this.lines);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        parcel.writeString(this.link);
        Font font = this.font;
        if (font == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            font.writeToParcel(parcel, i);
        }
        Boolean bool = this.hasUnderline;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.hasStrike;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.isItalic;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
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
        Integer num = this.lines;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    public static TextAttribute LIZ(TextAttribute textAttribute, String str, CustomColor customColor, int i) {
        String str2;
        Font font;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        CustomColor customColor2;
        CustomColor customColor3 = customColor;
        String str3 = str;
        if ((i & 1) != 0) {
            str3 = textAttribute.text;
        }
        Integer num = null;
        if ((i & 2) != 0) {
            str2 = textAttribute.link;
        } else {
            str2 = null;
        }
        if ((i & 4) != 0) {
            font = textAttribute.font;
        } else {
            font = null;
        }
        if ((i & 8) != 0) {
            bool = textAttribute.hasUnderline;
        } else {
            bool = null;
        }
        if ((i & 16) != 0) {
            bool2 = textAttribute.hasStrike;
        } else {
            bool2 = null;
        }
        if ((i & 32) != 0) {
            bool3 = textAttribute.isItalic;
        } else {
            bool3 = null;
        }
        if ((i & 64) != 0) {
            customColor3 = textAttribute.fontColor;
        }
        if ((i & 128) != 0) {
            customColor2 = textAttribute.backgroundColor;
        } else {
            customColor2 = null;
        }
        if ((i & 256) != 0) {
            num = textAttribute.lines;
        }
        return new TextAttribute(str3, str2, font, bool, bool2, bool3, customColor3, customColor2, num);
    }

    public TextAttribute(String str, String str2, Font font, Boolean bool, Boolean bool2, Boolean bool3, CustomColor customColor, CustomColor customColor2, Integer num) {
        this.text = str;
        this.link = str2;
        this.font = font;
        this.hasUnderline = bool;
        this.hasStrike = bool2;
        this.isItalic = bool3;
        this.fontColor = customColor;
        this.backgroundColor = customColor2;
        this.lines = num;
    }
}
