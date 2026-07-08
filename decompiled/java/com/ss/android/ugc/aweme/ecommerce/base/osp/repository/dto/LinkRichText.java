package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.RichTextExtraInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class LinkRichText implements Parcelable {

    @C09CT("action_icon")
    public Icon actionIcon;

    @C09CT("arguments")
    public Map<String, LinkText> arguments;

    @C09CT("text_dark_color")
    public String darkTextColor;

    @C09CT("extra_info")
    public RichTextExtraInfo extraInfo;

    @C09CT("number_of_lines")
    public Integer lines;

    @C09CT("link")
    public String link;

    @C09CT("prefix_icon")
    public Icon prefixIcon;

    @C09CT("suffix_icon")
    public Icon suffixIcon;

    @C09CT("template")
    public String template;

    @C09CT("text_color")
    public String textColor;

    @C09CT("text_color_type")
    public Integer textColorType;

    @C09CT("text_font_type")
    public Integer textFontType;
    public static final Parcelable.Creator<LinkRichText> CREATOR = new Parcelable.Creator<LinkRichText>() { // from class: X.02mN
        @Override // android.os.Parcelable.Creator
        public final LinkRichText createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            LinkText linkTextCreateFromParcel;
            RichTextExtraInfo richTextExtraInfoCreateFromParcel;
            Integer numValueOf;
            Integer numValueOf2;
            String string = parcel.readString();
            Integer numValueOf3 = null;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    String string2 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        linkTextCreateFromParcel = null;
                    } else {
                        linkTextCreateFromParcel = LinkText.CREATOR.createFromParcel(parcel);
                    }
                    linkedHashMap.put(string2, linkTextCreateFromParcel);
                }
            }
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            Icon icon = (Icon) parcel.readParcelable(LinkRichText.class.getClassLoader());
            Icon icon2 = (Icon) parcel.readParcelable(LinkRichText.class.getClassLoader());
            if (parcel.readInt() == 0) {
                richTextExtraInfoCreateFromParcel = null;
            } else {
                richTextExtraInfoCreateFromParcel = RichTextExtraInfo.CREATOR.createFromParcel(parcel);
            }
            RichTextExtraInfo richTextExtraInfo = richTextExtraInfoCreateFromParcel;
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
            Icon icon3 = (Icon) parcel.readParcelable(LinkRichText.class.getClassLoader());
            if (parcel.readInt() != 0) {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            return new LinkRichText(string, linkedHashMap, string3, string4, string5, icon, icon2, richTextExtraInfo, numValueOf, numValueOf2, icon3, numValueOf3);
        }

        @Override // android.os.Parcelable.Creator
        public final LinkRichText[] newArray(int i) {
            return new LinkRichText[i];
        }
    };
    public static final int $stable = 8;

    public LinkRichText() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkRichText)) {
            return false;
        }
        LinkRichText linkRichText = (LinkRichText) obj;
        return Intrinsics.LJFF(this.template, linkRichText.template) && Intrinsics.LJFF(this.arguments, linkRichText.arguments) && Intrinsics.LJFF(this.textColor, linkRichText.textColor) && Intrinsics.LJFF(this.darkTextColor, linkRichText.darkTextColor) && Intrinsics.LJFF(this.link, linkRichText.link) && Intrinsics.LJFF(this.prefixIcon, linkRichText.prefixIcon) && Intrinsics.LJFF(this.suffixIcon, linkRichText.suffixIcon) && Intrinsics.LJFF(this.extraInfo, linkRichText.extraInfo) && Intrinsics.LJFF(this.textColorType, linkRichText.textColorType) && Intrinsics.LJFF(this.textFontType, linkRichText.textFontType) && Intrinsics.LJFF(this.actionIcon, linkRichText.actionIcon) && Intrinsics.LJFF(this.lines, linkRichText.lines);
    }

    public final int hashCode() {
        String str = this.template;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<String, LinkText> map = this.arguments;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.textColor;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.darkTextColor;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.link;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Icon icon = this.prefixIcon;
        int iHashCode6 = (iHashCode5 + (icon == null ? 0 : icon.hashCode())) * 31;
        Icon icon2 = this.suffixIcon;
        int iHashCode7 = (iHashCode6 + (icon2 == null ? 0 : icon2.hashCode())) * 31;
        RichTextExtraInfo richTextExtraInfo = this.extraInfo;
        int iHashCode8 = (iHashCode7 + (richTextExtraInfo == null ? 0 : richTextExtraInfo.hashCode())) * 31;
        Integer num = this.textColorType;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.textFontType;
        int iHashCode10 = (iHashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Icon icon3 = this.actionIcon;
        int iHashCode11 = (iHashCode10 + (icon3 == null ? 0 : icon3.hashCode())) * 31;
        Integer num3 = this.lines;
        return iHashCode11 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return "LinkRichText(template=" + this.template + ", arguments=" + this.arguments + ", textColor=" + this.textColor + ", darkTextColor=" + this.darkTextColor + ", link=" + this.link + ", prefixIcon=" + this.prefixIcon + ", suffixIcon=" + this.suffixIcon + ", extraInfo=" + this.extraInfo + ", textColorType=" + this.textColorType + ", textFontType=" + this.textFontType + ", actionIcon=" + this.actionIcon + ", lines=" + this.lines + ')';
    }

    public static LinkRichText LIZ(LinkRichText linkRichText) {
        return new LinkRichText(linkRichText.template, linkRichText.arguments, linkRichText.textColor, linkRichText.darkTextColor, linkRichText.link, null, null, linkRichText.extraInfo, linkRichText.textColorType, linkRichText.textFontType, linkRichText.actionIcon, linkRichText.lines);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LIZIZ(android.content.Context r2) {
        /*
            r1 = this;
            r0 = 0
            boolean r0 = X.C1744700vVE.LJ(r2, r0)
            if (r0 == 0) goto L1a
            java.lang.String r0 = r1.darkTextColor
            if (r0 == 0) goto L27
            int r0 = X.C0HEZ.LIZIZ(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L13:
            if (r0 == 0) goto L27
            int r0 = r0.intValue()
            return r0
        L1a:
            java.lang.String r0 = r1.textColor
            if (r0 == 0) goto L27
            int r0 = X.C0HEZ.LIZIZ(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L13
        L27:
            r0 = 2131100622(0x7f0603ce, float:1.781363E38)
            int r0 = X.C960203pA.LIZ(r0, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText.LIZIZ(android.content.Context):int");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.template);
        Map<String, LinkText> map = this.arguments;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, LinkText> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                LinkText value = entry.getValue();
                if (value == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    value.writeToParcel(parcel, i);
                }
            }
        }
        parcel.writeString(this.textColor);
        parcel.writeString(this.darkTextColor);
        parcel.writeString(this.link);
        parcel.writeParcelable(this.prefixIcon, i);
        parcel.writeParcelable(this.suffixIcon, i);
        RichTextExtraInfo richTextExtraInfo = this.extraInfo;
        if (richTextExtraInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(richTextExtraInfo.daInfo);
        }
        Integer num = this.textColorType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.textFontType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeParcelable(this.actionIcon, i);
        Integer num3 = this.lines;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
    }

    public LinkRichText(String str, Map<String, LinkText> map, String str2, String str3, String str4, Icon icon, Icon icon2, RichTextExtraInfo richTextExtraInfo, Integer num, Integer num2, Icon icon3, Integer num3) {
        this.template = str;
        this.arguments = map;
        this.textColor = str2;
        this.darkTextColor = str3;
        this.link = str4;
        this.prefixIcon = icon;
        this.suffixIcon = icon2;
        this.extraInfo = richTextExtraInfo;
        this.textColorType = num;
        this.textFontType = num2;
        this.actionIcon = icon3;
        this.lines = num3;
    }
}
