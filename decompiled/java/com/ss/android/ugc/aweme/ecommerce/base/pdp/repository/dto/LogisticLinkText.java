package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class LogisticLinkText implements Parcelable {

    @C09CT("color")
    public String color;

    @C09CT("dark_color")
    public String darkColor;

    @C09CT("has_underscore")
    public Boolean hasUnderscore;

    @C09CT("icon_type")
    public Integer iconType;

    @C09CT("is_bold")
    public Boolean isBold;

    @C09CT("is_italic")
    public Boolean isItalic;

    @C09CT("link")
    public String link;

    @C09CT("replace_with_icon")
    public Boolean replaceWithIcon;

    @C09CT("text")
    public String text;

    @C09CT("text_color_type")
    public Integer textColorType;

    @C09CT("text_font_type")
    public Integer textFontType;
    public static final Parcelable.Creator<LogisticLinkText> CREATOR = new Parcelable.Creator<LogisticLinkText>() { // from class: X.02mQ
        @Override // android.os.Parcelable.Creator
        public final LogisticLinkText createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            boolean z2;
            Boolean boolValueOf2;
            boolean z3;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            Integer numValueOf;
            Integer numValueOf2;
            String string = parcel.readString();
            boolean z4 = true;
            Integer numValueOf3 = null;
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
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolValueOf3 = Boolean.valueOf(z3);
            }
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                if (parcel.readInt() == 0) {
                    z4 = false;
                }
                boolValueOf4 = Boolean.valueOf(z4);
            }
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            return new LogisticLinkText(string, boolValueOf, boolValueOf2, string2, string3, boolValueOf3, boolValueOf4, numValueOf, numValueOf2, numValueOf3, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LogisticLinkText[] newArray(int i) {
            return new LogisticLinkText[i];
        }
    };
    public static final int $stable = 8;

    public LogisticLinkText() {
        this(null, null, null, null, null, null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogisticLinkText)) {
            return false;
        }
        LogisticLinkText logisticLinkText = (LogisticLinkText) obj;
        return Intrinsics.LJFF(this.text, logisticLinkText.text) && Intrinsics.LJFF(this.isBold, logisticLinkText.isBold) && Intrinsics.LJFF(this.hasUnderscore, logisticLinkText.hasUnderscore) && Intrinsics.LJFF(this.color, logisticLinkText.color) && Intrinsics.LJFF(this.darkColor, logisticLinkText.darkColor) && Intrinsics.LJFF(this.isItalic, logisticLinkText.isItalic) && Intrinsics.LJFF(this.replaceWithIcon, logisticLinkText.replaceWithIcon) && Intrinsics.LJFF(this.iconType, logisticLinkText.iconType) && Intrinsics.LJFF(this.textColorType, logisticLinkText.textColorType) && Intrinsics.LJFF(this.textFontType, logisticLinkText.textFontType) && Intrinsics.LJFF(this.link, logisticLinkText.link);
    }

    public final int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.isBold;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hasUnderscore;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.color;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.darkColor;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool3 = this.isItalic;
        int iHashCode6 = (iHashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.replaceWithIcon;
        int iHashCode7 = (iHashCode6 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Integer num = this.iconType;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.textColorType;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.textFontType;
        int iHashCode10 = (iHashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str4 = this.link;
        return iHashCode10 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return "LogisticLinkText(text=" + this.text + ", isBold=" + this.isBold + ", hasUnderscore=" + this.hasUnderscore + ", color=" + this.color + ", darkColor=" + this.darkColor + ", isItalic=" + this.isItalic + ", replaceWithIcon=" + this.replaceWithIcon + ", iconType=" + this.iconType + ", textColorType=" + this.textColorType + ", textFontType=" + this.textFontType + ", link=" + this.link + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        Boolean bool = this.isBold;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.hasUnderscore;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.color);
        parcel.writeString(this.darkColor);
        Boolean bool3 = this.isItalic;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Boolean bool4 = this.replaceWithIcon;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        Integer num = this.iconType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.textColorType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.textFontType;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeString(this.link);
    }

    public LogisticLinkText(String str, Boolean bool, Boolean bool2, String str2, String str3, Boolean bool3, Boolean bool4, Integer num, Integer num2, Integer num3, String str4) {
        this.text = str;
        this.isBold = bool;
        this.hasUnderscore = bool2;
        this.color = str2;
        this.darkColor = str3;
        this.isItalic = bool3;
        this.replaceWithIcon = bool4;
        this.iconType = num;
        this.textColorType = num2;
        this.textFontType = num3;
        this.link = str4;
    }
}
