package com.bytedance.pipo.stellar.base.model;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class CompoundComponentDO extends BaseWidgetDO {

    @C09CT("background")
    public final IconBackgroundDO background;

    @C09CT("bold_color")
    public final ColorDO boldColor;

    @C09CT("bold_font")
    public final String boldFont;

    @C09CT("component_show")
    public final String componentShow;

    @C09CT("content")
    public final String content;

    @C09CT("dark")
    public final Image dark;

    @C09CT("data_type")
    public final String dataType;

    @C09CT("disabled")
    public final Integer disabled;

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

    @C09CT("height")
    public final String height;

    @C09CT("icon")
    public final ImageDO icon;

    @C09CT("icon_color")
    public final ColorDO iconColor;

    @C09CT("icon_token")
    public final String iconToken;

    @C09CT("light")
    public final Image light;

    @C09CT("link_color")
    public final ColorDO linkColor;

    @C09CT("link_font")
    public final String linkFont;

    @C09CT("number_of_lines")
    public final Integer maxLine;

    @C09CT("icon_name")
    public final String name;

    @C09CT("retry_count")
    public final Integer retryCount;

    @C09CT("scale_type")
    public final Integer scaleType;

    @C09CT("size")
    public final String size;

    @C09CT("color")
    public final ColorDO textColor;

    @C09CT("text_type")
    public final String textType;

    @C09CT("type")
    public final Integer type;

    @C09CT("variant")
    public final String variant;

    @C09CT("width")
    public final String width;

    public CompoundComponentDO() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "1");
    }

    public final CompoundComponentDO copy(String str, String str2, String str3, String str4, String str5, ColorDO colorDO, String str6, String str7, ColorDO colorDO2, String str8, ColorDO colorDO3, String str9, String str10, String str11, Integer num, Integer num2, String str12, String str13, String str14, ColorDO colorDO4, IconBackgroundDO iconBackgroundDO, Image image, Image image2, Integer num3, String str15, Integer num4, String str16, String str17, ImageDO imageDO, Integer num5, String str18) {
        return new CompoundComponentDO(str, str2, str3, str4, str5, colorDO, str6, str7, colorDO2, str8, colorDO3, str9, str10, str11, num, num2, str12, str13, str14, colorDO4, iconBackgroundDO, image, image2, num3, str15, num4, str16, str17, imageDO, num5, str18);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompoundComponentDO)) {
            return false;
        }
        CompoundComponentDO compoundComponentDO = (CompoundComponentDO) obj;
        return Intrinsics.LJFF(this.dataType, compoundComponentDO.dataType) && Intrinsics.LJFF(this.content, compoundComponentDO.content) && Intrinsics.LJFF(this.gravity, compoundComponentDO.gravity) && Intrinsics.LJFF(this.font, compoundComponentDO.font) && Intrinsics.LJFF(this.fontToken, compoundComponentDO.fontToken) && Intrinsics.LJFF(this.textColor, compoundComponentDO.textColor) && Intrinsics.LJFF(this.textType, compoundComponentDO.textType) && Intrinsics.LJFF(this.boldFont, compoundComponentDO.boldFont) && Intrinsics.LJFF(this.boldColor, compoundComponentDO.boldColor) && Intrinsics.LJFF(this.linkFont, compoundComponentDO.linkFont) && Intrinsics.LJFF(this.linkColor, compoundComponentDO.linkColor) && Intrinsics.LJFF(this.forceFont, compoundComponentDO.forceFont) && Intrinsics.LJFF(this.forceBoldFont, compoundComponentDO.forceBoldFont) && Intrinsics.LJFF(this.forceLinkFont, compoundComponentDO.forceLinkFont) && Intrinsics.LJFF(this.maxLine, compoundComponentDO.maxLine) && Intrinsics.LJFF(this.type, compoundComponentDO.type) && Intrinsics.LJFF(this.width, compoundComponentDO.width) && Intrinsics.LJFF(this.height, compoundComponentDO.height) && Intrinsics.LJFF(this.name, compoundComponentDO.name) && Intrinsics.LJFF(this.iconColor, compoundComponentDO.iconColor) && Intrinsics.LJFF(this.background, compoundComponentDO.background) && Intrinsics.LJFF(this.light, compoundComponentDO.light) && Intrinsics.LJFF(this.dark, compoundComponentDO.dark) && Intrinsics.LJFF(this.scaleType, compoundComponentDO.scaleType) && Intrinsics.LJFF(this.iconToken, compoundComponentDO.iconToken) && Intrinsics.LJFF(this.retryCount, compoundComponentDO.retryCount) && Intrinsics.LJFF(this.size, compoundComponentDO.size) && Intrinsics.LJFF(this.variant, compoundComponentDO.variant) && Intrinsics.LJFF(this.icon, compoundComponentDO.icon) && Intrinsics.LJFF(this.disabled, compoundComponentDO.disabled) && Intrinsics.LJFF(this.componentShow, compoundComponentDO.componentShow);
    }

    public int hashCode() {
        String str = this.dataType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.content;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.gravity;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.font;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.fontToken;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        ColorDO colorDO = this.textColor;
        int iHashCode6 = (iHashCode5 + (colorDO == null ? 0 : colorDO.hashCode())) * 31;
        String str6 = this.textType;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.boldFont;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        ColorDO colorDO2 = this.boldColor;
        int iHashCode9 = (iHashCode8 + (colorDO2 == null ? 0 : colorDO2.hashCode())) * 31;
        String str8 = this.linkFont;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        ColorDO colorDO3 = this.linkColor;
        int iHashCode11 = (iHashCode10 + (colorDO3 == null ? 0 : colorDO3.hashCode())) * 31;
        String str9 = this.forceFont;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.forceBoldFont;
        int iHashCode13 = (iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.forceLinkFont;
        int iHashCode14 = (iHashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Integer num = this.maxLine;
        int iHashCode15 = (iHashCode14 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.type;
        int iHashCode16 = (iHashCode15 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str12 = this.width;
        int iHashCode17 = (iHashCode16 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.height;
        int iHashCode18 = (iHashCode17 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.name;
        int iHashCode19 = (iHashCode18 + (str14 == null ? 0 : str14.hashCode())) * 31;
        ColorDO colorDO4 = this.iconColor;
        int iHashCode20 = (iHashCode19 + (colorDO4 == null ? 0 : colorDO4.hashCode())) * 31;
        IconBackgroundDO iconBackgroundDO = this.background;
        int iHashCode21 = (iHashCode20 + (iconBackgroundDO == null ? 0 : iconBackgroundDO.hashCode())) * 31;
        Image image = this.light;
        int iHashCode22 = (iHashCode21 + (image == null ? 0 : image.hashCode())) * 31;
        Image image2 = this.dark;
        int iHashCode23 = (iHashCode22 + (image2 == null ? 0 : image2.hashCode())) * 31;
        Integer num3 = this.scaleType;
        int iHashCode24 = (iHashCode23 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str15 = this.iconToken;
        int iHashCode25 = (iHashCode24 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Integer num4 = this.retryCount;
        int iHashCode26 = (iHashCode25 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str16 = this.size;
        int iHashCode27 = (iHashCode26 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.variant;
        int iHashCode28 = (iHashCode27 + (str17 == null ? 0 : str17.hashCode())) * 31;
        ImageDO imageDO = this.icon;
        int iHashCode29 = (iHashCode28 + (imageDO == null ? 0 : imageDO.hashCode())) * 31;
        Integer num5 = this.disabled;
        int iHashCode30 = (iHashCode29 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str18 = this.componentShow;
        return iHashCode30 + (str18 != null ? str18.hashCode() : 0);
    }

    public String toString() {
        return "CompoundComponentDO(dataType=" + this.dataType + ", content=" + this.content + ", gravity=" + this.gravity + ", font=" + this.font + ", fontToken=" + this.fontToken + ", textColor=" + this.textColor + ", textType=" + this.textType + ", boldFont=" + this.boldFont + ", boldColor=" + this.boldColor + ", linkFont=" + this.linkFont + ", linkColor=" + this.linkColor + ", forceFont=" + this.forceFont + ", forceBoldFont=" + this.forceBoldFont + ", forceLinkFont=" + this.forceLinkFont + ", maxLine=" + this.maxLine + ", type=" + this.type + ", width=" + this.width + ", height=" + this.height + ", name=" + this.name + ", iconColor=" + this.iconColor + ", background=" + this.background + ", light=" + this.light + ", dark=" + this.dark + ", scaleType=" + this.scaleType + ", iconToken=" + this.iconToken + ", retryCount=" + this.retryCount + ", size=" + this.size + ", variant=" + this.variant + ", icon=" + this.icon + ", disabled=" + this.disabled + ", componentShow=" + this.componentShow + ')';
    }

    public final IconBackgroundDO getBackground() {
        return this.background;
    }

    public final ColorDO getBoldColor() {
        return this.boldColor;
    }

    public final String getBoldFont() {
        return this.boldFont;
    }

    public final String getComponentShow() {
        return this.componentShow;
    }

    public final String getContent() {
        return this.content;
    }

    public final Image getDark() {
        return this.dark;
    }

    public final String getDataType() {
        return this.dataType;
    }

    public final Integer getDisabled() {
        return this.disabled;
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

    public final String getHeight() {
        return this.height;
    }

    public final ImageDO getIcon() {
        return this.icon;
    }

    public final ColorDO getIconColor() {
        return this.iconColor;
    }

    public final String getIconToken() {
        return this.iconToken;
    }

    public final Image getLight() {
        return this.light;
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

    public final String getName() {
        return this.name;
    }

    public final Integer getRetryCount() {
        return this.retryCount;
    }

    public final Integer getScaleType() {
        return this.scaleType;
    }

    public final String getSize() {
        return this.size;
    }

    public final ColorDO getTextColor() {
        return this.textColor;
    }

    public final String getTextType() {
        return this.textType;
    }

    public final Integer getType() {
        return this.type;
    }

    public final String getVariant() {
        return this.variant;
    }

    public final String getWidth() {
        return this.width;
    }

    public CompoundComponentDO(String str, String str2, String str3, String str4, String str5, ColorDO colorDO, String str6, String str7, ColorDO colorDO2, String str8, ColorDO colorDO3, String str9, String str10, String str11, Integer num, Integer num2, String str12, String str13, String str14, ColorDO colorDO4, IconBackgroundDO iconBackgroundDO, Image image, Image image2, Integer num3, String str15, Integer num4, String str16, String str17, ImageDO imageDO, Integer num5, String str18) {
        super(null, null, 1, null, null);
        this.dataType = str;
        this.content = str2;
        this.gravity = str3;
        this.font = str4;
        this.fontToken = str5;
        this.textColor = colorDO;
        this.textType = str6;
        this.boldFont = str7;
        this.boldColor = colorDO2;
        this.linkFont = str8;
        this.linkColor = colorDO3;
        this.forceFont = str9;
        this.forceBoldFont = str10;
        this.forceLinkFont = str11;
        this.maxLine = num;
        this.type = num2;
        this.width = str12;
        this.height = str13;
        this.name = str14;
        this.iconColor = colorDO4;
        this.background = iconBackgroundDO;
        this.light = image;
        this.dark = image2;
        this.scaleType = num3;
        this.iconToken = str15;
        this.retryCount = num4;
        this.size = str16;
        this.variant = str17;
        this.icon = imageDO;
        this.disabled = num5;
        this.componentShow = str18;
    }
}
