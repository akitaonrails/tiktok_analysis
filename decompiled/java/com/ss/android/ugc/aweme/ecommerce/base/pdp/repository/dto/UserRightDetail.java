package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.TextColorString;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDesc;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDetail;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class UserRightDetail implements Parcelable {

    @C09CT("background_image")
    public Icon background;

    @C09CT("desc_expand")
    public Boolean descExpand;

    @C09CT("description")
    public String description;

    @C09CT("detail_page_schema")
    public String detailPageSchema;

    @C09CT("expand_desc_count")
    public Integer expandDescCount;

    @C09CT("expose")
    public Boolean expose;

    @C09CT("flag")
    public Integer flag;

    @C09CT("header_background_image")
    public Icon headerBackgroundImage;

    @C09CT("header_font_color")
    public String headerFontColor;

    @C09CT("header_font_dark_color")
    public String headerFontDarkColor;

    @C09CT("icon")
    public Icon icon;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id;

    @C09CT("name")
    public String name;

    @C09CT("name_en")
    public String nameEn;

    @C09CT("popup_style")
    public Integer popupStyle;

    @C09CT("right_style")
    public Integer rightStyle;

    @C09CT("schema")
    public String schema;

    @C09CT("show_chevron")
    public Boolean showChevron;

    @C09CT("show_popup")
    public Boolean showPopup;

    @C09CT("text_color")
    public TextColorString textColor;

    @C09CT("theme_color")
    public Integer themeColor;

    @C09CT("title_font")
    public Integer titleFont;

    @C09CT("user_right_desc")
    public List<UserRightDesc> userRightDesc;
    public static final Parcelable.Creator<UserRightDetail> CREATOR = new Parcelable.Creator<UserRightDetail>() { // from class: X.02ZM
        @Override // android.os.Parcelable.Creator
        public final UserRightDetail createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            boolean z;
            Boolean boolValueOf;
            boolean z2;
            Boolean boolValueOf2;
            Integer numValueOf;
            boolean z3;
            Boolean boolValueOf3;
            Integer numValueOf2;
            Integer numValueOf3;
            Boolean boolValueOf4;
            Integer numValueOf4;
            Integer numValueOf5;
            Integer numValueOf6;
            String string = parcel.readString();
            String string2 = parcel.readString();
            Icon icon = (Icon) parcel.readParcelable(UserRightDetail.class.getClassLoader());
            boolean z4 = false;
            TextColorString textColorStringCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(UserRightDesc.CREATOR.createFromParcel(parcel));
                }
            }
            String string3 = parcel.readString();
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
            String string4 = parcel.readString();
            Icon icon2 = (Icon) parcel.readParcelable(UserRightDetail.class.getClassLoader());
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
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
            Icon icon3 = (Icon) parcel.readParcelable(UserRightDetail.class.getClassLoader());
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf3 = null;
            } else {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z4 = true;
                }
                boolValueOf4 = Boolean.valueOf(z4);
            }
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf4 = null;
            } else {
                numValueOf4 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf5 = null;
            } else {
                numValueOf5 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf6 = null;
            } else {
                numValueOf6 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                textColorStringCreateFromParcel = TextColorString.CREATOR.createFromParcel(parcel);
            }
            return new UserRightDetail(string, string2, icon, arrayList, string3, boolValueOf, boolValueOf2, string4, icon2, numValueOf, boolValueOf3, icon3, numValueOf2, numValueOf3, boolValueOf4, string5, string6, numValueOf4, numValueOf5, numValueOf6, textColorStringCreateFromParcel, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UserRightDetail[] newArray(int i) {
            return new UserRightDetail[i];
        }
    };
    public static final int $stable = 8;

    public UserRightDetail() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserRightDetail)) {
            return false;
        }
        UserRightDetail userRightDetail = (UserRightDetail) obj;
        return Intrinsics.LJFF(this.id, userRightDetail.id) && Intrinsics.LJFF(this.name, userRightDetail.name) && Intrinsics.LJFF(this.icon, userRightDetail.icon) && Intrinsics.LJFF(this.userRightDesc, userRightDetail.userRightDesc) && Intrinsics.LJFF(this.description, userRightDetail.description) && Intrinsics.LJFF(this.descExpand, userRightDetail.descExpand) && Intrinsics.LJFF(this.expose, userRightDetail.expose) && Intrinsics.LJFF(this.nameEn, userRightDetail.nameEn) && Intrinsics.LJFF(this.background, userRightDetail.background) && Intrinsics.LJFF(this.flag, userRightDetail.flag) && Intrinsics.LJFF(this.showChevron, userRightDetail.showChevron) && Intrinsics.LJFF(this.headerBackgroundImage, userRightDetail.headerBackgroundImage) && Intrinsics.LJFF(this.themeColor, userRightDetail.themeColor) && Intrinsics.LJFF(this.popupStyle, userRightDetail.popupStyle) && Intrinsics.LJFF(this.showPopup, userRightDetail.showPopup) && Intrinsics.LJFF(this.headerFontColor, userRightDetail.headerFontColor) && Intrinsics.LJFF(this.headerFontDarkColor, userRightDetail.headerFontDarkColor) && Intrinsics.LJFF(this.titleFont, userRightDetail.titleFont) && Intrinsics.LJFF(this.expandDescCount, userRightDetail.expandDescCount) && Intrinsics.LJFF(this.rightStyle, userRightDetail.rightStyle) && Intrinsics.LJFF(this.textColor, userRightDetail.textColor) && Intrinsics.LJFF(this.schema, userRightDetail.schema) && Intrinsics.LJFF(this.detailPageSchema, userRightDetail.detailPageSchema);
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Icon icon = this.icon;
        int iHashCode3 = (iHashCode2 + (icon == null ? 0 : icon.hashCode())) * 31;
        List<UserRightDesc> list = this.userRightDesc;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.description;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.descExpand;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.expose;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str4 = this.nameEn;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Icon icon2 = this.background;
        int iHashCode9 = (iHashCode8 + (icon2 == null ? 0 : icon2.hashCode())) * 31;
        Integer num = this.flag;
        int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool3 = this.showChevron;
        int iHashCode11 = (iHashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Icon icon3 = this.headerBackgroundImage;
        int iHashCode12 = (iHashCode11 + (icon3 == null ? 0 : icon3.hashCode())) * 31;
        Integer num2 = this.themeColor;
        int iHashCode13 = (iHashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.popupStyle;
        int iHashCode14 = (iHashCode13 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool4 = this.showPopup;
        int iHashCode15 = (iHashCode14 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str5 = this.headerFontColor;
        int iHashCode16 = (iHashCode15 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.headerFontDarkColor;
        int iHashCode17 = (iHashCode16 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num4 = this.titleFont;
        int iHashCode18 = (iHashCode17 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.expandDescCount;
        int iHashCode19 = (iHashCode18 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.rightStyle;
        int iHashCode20 = (iHashCode19 + (num6 == null ? 0 : num6.hashCode())) * 31;
        TextColorString textColorString = this.textColor;
        int iHashCode21 = (iHashCode20 + (textColorString == null ? 0 : textColorString.hashCode())) * 31;
        String str7 = this.schema;
        int iHashCode22 = (iHashCode21 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.detailPageSchema;
        return iHashCode22 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        return "UserRightDetail(id=" + this.id + ", name=" + this.name + ", icon=" + this.icon + ", userRightDesc=" + this.userRightDesc + ", description=" + this.description + ", descExpand=" + this.descExpand + ", expose=" + this.expose + ", nameEn=" + this.nameEn + ", background=" + this.background + ", flag=" + this.flag + ", showChevron=" + this.showChevron + ", headerBackgroundImage=" + this.headerBackgroundImage + ", themeColor=" + this.themeColor + ", popupStyle=" + this.popupStyle + ", showPopup=" + this.showPopup + ", headerFontColor=" + this.headerFontColor + ", headerFontDarkColor=" + this.headerFontDarkColor + ", titleFont=" + this.titleFont + ", expandDescCount=" + this.expandDescCount + ", rightStyle=" + this.rightStyle + ", textColor=" + this.textColor + ", schema=" + this.schema + ", detailPageSchema=" + this.detailPageSchema + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeParcelable(this.icon, i);
        List<UserRightDesc> list = this.userRightDesc;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<UserRightDesc> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.description);
        Boolean bool = this.descExpand;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.expose;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.nameEn);
        parcel.writeParcelable(this.background, i);
        Integer num = this.flag;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Boolean bool3 = this.showChevron;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        parcel.writeParcelable(this.headerBackgroundImage, i);
        Integer num2 = this.themeColor;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.popupStyle;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Boolean bool4 = this.showPopup;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.headerFontColor);
        parcel.writeString(this.headerFontDarkColor);
        Integer num4 = this.titleFont;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        Integer num5 = this.expandDescCount;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
        Integer num6 = this.rightStyle;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num6.intValue());
        }
        TextColorString textColorString = this.textColor;
        if (textColorString == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textColorString.writeToParcel(parcel, i);
        }
        parcel.writeString(this.schema);
        parcel.writeString(this.detailPageSchema);
    }

    public UserRightDetail(String str, String str2, Icon icon, List<UserRightDesc> list, String str3, Boolean bool, Boolean bool2, String str4, Icon icon2, Integer num, Boolean bool3, Icon icon3, Integer num2, Integer num3, Boolean bool4, String str5, String str6, Integer num4, Integer num5, Integer num6, TextColorString textColorString, String str7, String str8) {
        this.id = str;
        this.name = str2;
        this.icon = icon;
        this.userRightDesc = list;
        this.description = str3;
        this.descExpand = bool;
        this.expose = bool2;
        this.nameEn = str4;
        this.background = icon2;
        this.flag = num;
        this.showChevron = bool3;
        this.headerBackgroundImage = icon3;
        this.themeColor = num2;
        this.popupStyle = num3;
        this.showPopup = bool4;
        this.headerFontColor = str5;
        this.headerFontDarkColor = str6;
        this.titleFont = num4;
        this.expandDescCount = num5;
        this.rightStyle = num6;
        this.textColor = textColorString;
        this.schema = str7;
        this.detailPageSchema = str8;
    }
}
