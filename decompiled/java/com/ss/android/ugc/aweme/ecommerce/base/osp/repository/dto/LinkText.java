package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.InterfaceC1294060jmO;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkText;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class LinkText implements Parcelable, Serializable {

    @C09CT("color")
    public String color;

    @C09CT("dark_color")
    public String darkColor;

    @C09CT("end_time")
    public String endTime;

    @C09CT("format")
    public String format;

    @C09CT("has_strike")
    public Boolean hasStrike;

    @C09CT("has_underscore")
    public Boolean hasUnderscore;

    @C09CT("icon")
    public Icon icon;

    @C09CT("is_bold")
    public Boolean isBold;

    @C09CT("is_third_party_link")
    public Boolean isThirdPartyLink;

    @C09CT("link")
    public String link;

    @C09CT("link_text_type")
    public Integer linkTextType;

    @C09CT("name")
    public String name;

    @C09CT("show_arrow")
    public Boolean showArrow;

    @C09CT("text")
    public String text;

    @C09CT("text_color")
    public Integer textColor;

    @C09CT("text_font_type")
    public Integer textFontType;

    @C09CT("text_raw_color")
    public CommonColor textRawColor;
    public static final Parcelable.Creator<LinkText> CREATOR = new Parcelable.Creator<LinkText>() { // from class: X.02mf
        @Override // android.os.Parcelable.Creator
        public final LinkText createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            boolean z2;
            Boolean boolValueOf2;
            boolean z3;
            Boolean boolValueOf3;
            Integer numValueOf;
            boolean z4;
            Boolean boolValueOf4;
            CommonColor commonColorCreateFromParcel;
            boolean z5;
            Boolean boolValueOf5;
            Integer numValueOf2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
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
            String string5 = parcel.readString();
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
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolValueOf3 = Boolean.valueOf(z3);
            }
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolValueOf4 = Boolean.valueOf(z4);
            }
            if (parcel.readInt() == 0) {
                commonColorCreateFromParcel = null;
            } else {
                commonColorCreateFromParcel = CommonColor.CREATOR.createFromParcel(parcel);
            }
            CommonColor commonColor = commonColorCreateFromParcel;
            if (parcel.readInt() == 0) {
                boolValueOf5 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                boolValueOf5 = Boolean.valueOf(z5);
            }
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            Icon icon = (Icon) parcel.readParcelable(LinkText.class.getClassLoader());
            if (parcel.readInt() != 0) {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            return new LinkText(string, string2, string3, string4, boolValueOf, string5, boolValueOf2, boolValueOf3, string6, string7, numValueOf, boolValueOf4, commonColor, boolValueOf5, numValueOf2, icon, numValueOf3);
        }

        @Override // android.os.Parcelable.Creator
        public final LinkText[] newArray(int i) {
            return new LinkText[i];
        }
    };
    public static final int $stable = 8;

    public LinkText() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getColor$annotations() {
    }

    public final LinkText copy(String str, String str2, String str3, String str4, Boolean bool, String str5, Boolean bool2, Boolean bool3, String str6, String str7, Integer num, Boolean bool4, CommonColor commonColor, Boolean bool5, Integer num2, Icon icon, Integer num3) {
        return new LinkText(str, str2, str3, str4, bool, str5, bool2, bool3, str6, str7, num, bool4, commonColor, bool5, num2, icon, num3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkText)) {
            return false;
        }
        LinkText linkText = (LinkText) obj;
        return Intrinsics.LJFF(this.text, linkText.text) && Intrinsics.LJFF(this.format, linkText.format) && Intrinsics.LJFF(this.endTime, linkText.endTime) && Intrinsics.LJFF(this.link, linkText.link) && Intrinsics.LJFF(this.isThirdPartyLink, linkText.isThirdPartyLink) && Intrinsics.LJFF(this.name, linkText.name) && Intrinsics.LJFF(this.isBold, linkText.isBold) && Intrinsics.LJFF(this.hasUnderscore, linkText.hasUnderscore) && Intrinsics.LJFF(this.color, linkText.color) && Intrinsics.LJFF(this.darkColor, linkText.darkColor) && Intrinsics.LJFF(this.textColor, linkText.textColor) && Intrinsics.LJFF(this.showArrow, linkText.showArrow) && Intrinsics.LJFF(this.textRawColor, linkText.textRawColor) && Intrinsics.LJFF(this.hasStrike, linkText.hasStrike) && Intrinsics.LJFF(this.linkTextType, linkText.linkTextType) && Intrinsics.LJFF(this.icon, linkText.icon) && Intrinsics.LJFF(this.textFontType, linkText.textFontType);
    }

    public int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.format;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.endTime;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.link;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.isThirdPartyLink;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.name;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool2 = this.isBold;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.hasUnderscore;
        int iHashCode8 = (iHashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str6 = this.color;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.darkColor;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num = this.textColor;
        int iHashCode11 = (iHashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool4 = this.showArrow;
        int iHashCode12 = (iHashCode11 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        CommonColor commonColor = this.textRawColor;
        int iHashCode13 = (iHashCode12 + (commonColor == null ? 0 : commonColor.hashCode())) * 31;
        Boolean bool5 = this.hasStrike;
        int iHashCode14 = (iHashCode13 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num2 = this.linkTextType;
        int iHashCode15 = (iHashCode14 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Icon icon = this.icon;
        int iHashCode16 = (iHashCode15 + (icon == null ? 0 : icon.hashCode())) * 31;
        Integer num3 = this.textFontType;
        return iHashCode16 + (num3 != null ? num3.hashCode() : 0);
    }

    public String toString() {
        return "LinkText(text=" + this.text + ", format=" + this.format + ", endTime=" + this.endTime + ", link=" + this.link + ", isThirdPartyLink=" + this.isThirdPartyLink + ", name=" + this.name + ", isBold=" + this.isBold + ", hasUnderscore=" + this.hasUnderscore + ", color=" + this.color + ", darkColor=" + this.darkColor + ", textColor=" + this.textColor + ", showArrow=" + this.showArrow + ", textRawColor=" + this.textRawColor + ", hasStrike=" + this.hasStrike + ", linkTextType=" + this.linkTextType + ", icon=" + this.icon + ", textFontType=" + this.textFontType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        parcel.writeString(this.format);
        parcel.writeString(this.endTime);
        parcel.writeString(this.link);
        Boolean bool = this.isThirdPartyLink;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.name);
        Boolean bool2 = this.isBold;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.hasUnderscore;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.color);
        parcel.writeString(this.darkColor);
        Integer num = this.textColor;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Boolean bool4 = this.showArrow;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        CommonColor commonColor = this.textRawColor;
        if (commonColor == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            commonColor.writeToParcel(parcel, i);
        }
        Boolean bool5 = this.hasStrike;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool5.booleanValue() ? 1 : 0);
        }
        Integer num2 = this.linkTextType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeParcelable(this.icon, i);
        Integer num3 = this.textFontType;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
    }

    public final String getColor() {
        return this.color;
    }

    public final String getDarkColor() {
        return this.darkColor;
    }

    public final String getEndTime() {
        return this.endTime;
    }

    public final String getFormat() {
        return this.format;
    }

    public final Boolean getHasStrike() {
        return this.hasStrike;
    }

    public final Boolean getHasUnderscore() {
        return this.hasUnderscore;
    }

    public final Icon getIcon() {
        return this.icon;
    }

    public final String getLink() {
        return this.link;
    }

    public final Integer getLinkTextType() {
        return this.linkTextType;
    }

    public final String getName() {
        return this.name;
    }

    public final Boolean getShowArrow() {
        return this.showArrow;
    }

    public final String getText() {
        return this.text;
    }

    public final Integer getTextColor() {
        return this.textColor;
    }

    public final Integer getTextFontType() {
        return this.textFontType;
    }

    public final CommonColor getTextRawColor() {
        return this.textRawColor;
    }

    public final Boolean isBold() {
        return this.isBold;
    }

    public final Boolean isThirdPartyLink() {
        return this.isThirdPartyLink;
    }

    public LinkText(String str, String str2, String str3, String str4, Boolean bool, String str5, Boolean bool2, Boolean bool3, String str6, String str7, Integer num, Boolean bool4, CommonColor commonColor, Boolean bool5, Integer num2, Icon icon, Integer num3) {
        this.text = str;
        this.format = str2;
        this.endTime = str3;
        this.link = str4;
        this.isThirdPartyLink = bool;
        this.name = str5;
        this.isBold = bool2;
        this.hasUnderscore = bool3;
        this.color = str6;
        this.darkColor = str7;
        this.textColor = num;
        this.showArrow = bool4;
        this.textRawColor = commonColor;
        this.hasStrike = bool5;
        this.linkTextType = num2;
        this.icon = icon;
        this.textFontType = num3;
    }
}
