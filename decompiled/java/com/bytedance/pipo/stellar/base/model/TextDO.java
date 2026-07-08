package com.bytedance.pipo.stellar.base.model;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class TextDO extends BaseWidgetDO {

    @C09CT("bold_color")
    public final ColorDO boldColor;

    @C09CT("bold_font")
    public final String boldFont;

    @C09CT("color")
    public final ColorDO color;

    @C09CT("content")
    public final String content;

    @C09CT("font")
    public final String font;

    @C09CT("font_token")
    public final String fontToken;

    @C09CT("force_bold_font")
    public final String forceBoldFont;

    @C09CT("force_font")
    public final String forceFont;

    @C09CT("force_link_font")
    public final String forceLinkFont;

    @C09CT("gravity")
    public final String gravity;

    @C09CT("link_color")
    public final ColorDO linkColor;

    @C09CT("link_font")
    public final String linkFont;

    @C09CT("number_of_lines")
    public final Integer maxLine;

    @C09CT("text_type")
    public final String textType;

    public TextDO() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final TextDO copy(String str, String str2, String str3, String str4, ColorDO colorDO, String str5, String str6, ColorDO colorDO2, String str7, ColorDO colorDO3, String str8, String str9, String str10, Integer num) {
        return new TextDO(str, str2, str3, str4, colorDO, str5, str6, colorDO2, str7, colorDO3, str8, str9, str10, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextDO)) {
            return false;
        }
        TextDO textDO = (TextDO) obj;
        return Intrinsics.LJFF(this.content, textDO.content) && Intrinsics.LJFF(this.gravity, textDO.gravity) && Intrinsics.LJFF(this.font, textDO.font) && Intrinsics.LJFF(this.fontToken, textDO.fontToken) && Intrinsics.LJFF(this.color, textDO.color) && Intrinsics.LJFF(this.textType, textDO.textType) && Intrinsics.LJFF(this.boldFont, textDO.boldFont) && Intrinsics.LJFF(this.boldColor, textDO.boldColor) && Intrinsics.LJFF(this.linkFont, textDO.linkFont) && Intrinsics.LJFF(this.linkColor, textDO.linkColor) && Intrinsics.LJFF(this.forceFont, textDO.forceFont) && Intrinsics.LJFF(this.forceBoldFont, textDO.forceBoldFont) && Intrinsics.LJFF(this.forceLinkFont, textDO.forceLinkFont) && Intrinsics.LJFF(this.maxLine, textDO.maxLine);
    }

    public int hashCode() {
        String str = this.content;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.gravity;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.font;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.fontToken;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ColorDO colorDO = this.color;
        int iHashCode5 = (iHashCode4 + (colorDO == null ? 0 : colorDO.hashCode())) * 31;
        String str5 = this.textType;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.boldFont;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        ColorDO colorDO2 = this.boldColor;
        int iHashCode8 = (iHashCode7 + (colorDO2 == null ? 0 : colorDO2.hashCode())) * 31;
        String str7 = this.linkFont;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        ColorDO colorDO3 = this.linkColor;
        int iHashCode10 = (iHashCode9 + (colorDO3 == null ? 0 : colorDO3.hashCode())) * 31;
        String str8 = this.forceFont;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.forceBoldFont;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.forceLinkFont;
        int iHashCode13 = (iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Integer num = this.maxLine;
        return iHashCode13 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "TextDO(content=" + this.content + ", gravity=" + this.gravity + ", font=" + this.font + ", fontToken=" + this.fontToken + ", color=" + this.color + ", textType=" + this.textType + ", boldFont=" + this.boldFont + ", boldColor=" + this.boldColor + ", linkFont=" + this.linkFont + ", linkColor=" + this.linkColor + ", forceFont=" + this.forceFont + ", forceBoldFont=" + this.forceBoldFont + ", forceLinkFont=" + this.forceLinkFont + ", maxLine=" + this.maxLine + ')';
    }

    public final ColorDO getBoldColor() {
        return this.boldColor;
    }

    public final String getBoldFont() {
        return this.boldFont;
    }

    public final ColorDO getColor() {
        return this.color;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getFont() {
        return this.font;
    }

    public final String getFontToken() {
        return this.fontToken;
    }

    public final String getForceBoldFont() {
        return this.forceBoldFont;
    }

    public final String getForceFont() {
        return this.forceFont;
    }

    public final String getForceLinkFont() {
        return this.forceLinkFont;
    }

    public final String getGravity() {
        return this.gravity;
    }

    public final ColorDO getLinkColor() {
        return this.linkColor;
    }

    public final String getLinkFont() {
        return this.linkFont;
    }

    public final Integer getMaxLine() {
        return this.maxLine;
    }

    public final String getTextType() {
        return this.textType;
    }

    public TextDO(String str, String str2, String str3, String str4, ColorDO colorDO, String str5, String str6, ColorDO colorDO2, String str7, ColorDO colorDO3, String str8, String str9, String str10, Integer num) {
        super(null, null, 1, null, null);
        this.content = str;
        this.gravity = str2;
        this.font = str3;
        this.fontToken = str4;
        this.color = colorDO;
        this.textType = str5;
        this.boldFont = str6;
        this.boldColor = colorDO2;
        this.linkFont = str7;
        this.linkColor = colorDO3;
        this.forceFont = str8;
        this.forceBoldFont = str9;
        this.forceLinkFont = str10;
        this.maxLine = num;
    }
}
