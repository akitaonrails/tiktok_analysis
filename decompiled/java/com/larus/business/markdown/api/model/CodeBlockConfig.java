package com.larus.business.markdown.api.model;

import X.C786410Ut5;

/* JADX INFO: loaded from: classes33.dex */
public final class CodeBlockConfig {
    public final Integer backgroundColor;
    public final Integer blockBackgroundColor;
    public final Integer blockBorderColor;
    public final Integer blockBorderWidth;
    public final float blockCodeTextLineSpace;
    public final Integer blockMargin;
    public final Integer codeBlockWidth;
    public final String codeCopyTitle;
    public final CodeStyle codeStyle;
    public final Integer codeTextColor;
    public final int codeTextSize;
    public final Integer codeTitleBackgroundColor;
    public final int codeTitleSize;
    public final Integer cornerRadius;
    public final boolean enableCodeCopyButton;
    public final boolean enableCodeFullScreenButton;
    public final boolean enableLineNumber;
    public final boolean enableScroll;
    public final Integer lineNumberColor;
    public final Integer titleBgColor;
    public final TitleStyle titleStyle;

    public CodeBlockConfig() {
        this(null, null, 0, false, "", false, null, TitleStyle.NORMAL, CodeStyle.NORMAL, null, null, null, 0, null, false, false, null, null, null, null, 1.5f);
    }

    public int hashCode() {
        Integer num = this.cornerRadius;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.titleBgColor;
        int iHashCode2 = (((((((((iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31) + this.codeTitleSize) * 31) + C786410Ut5.Z2(this.enableCodeFullScreenButton)) * 31) + this.codeCopyTitle.hashCode()) * 31) + C786410Ut5.Z2(this.enableCodeCopyButton)) * 31;
        Integer num3 = this.codeTitleBackgroundColor;
        int iHashCode3 = (((((iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31) + this.titleStyle.hashCode()) * 31) + this.codeStyle.hashCode()) * 31;
        Integer num4 = this.backgroundColor;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.blockBackgroundColor;
        int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.codeTextColor;
        int iHashCode6 = (((iHashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31) + this.codeTextSize) * 31;
        Integer num7 = this.blockMargin;
        int iHashCode7 = (((((iHashCode6 + (num7 == null ? 0 : num7.hashCode())) * 31) + C786410Ut5.Z2(this.enableScroll)) * 31) + C786410Ut5.Z2(this.enableLineNumber)) * 31;
        Integer num8 = this.lineNumberColor;
        int iHashCode8 = (iHashCode7 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.codeBlockWidth;
        int iHashCode9 = (iHashCode8 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.blockBorderColor;
        int iHashCode10 = (iHashCode9 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.blockBorderWidth;
        return ((iHashCode10 + (num11 != null ? num11.hashCode() : 0)) * 31) + Float.floatToIntBits(this.blockCodeTextLineSpace);
    }

    public CodeBlockConfig(Integer num, Integer num2, int i, boolean z, String str, boolean z2, Integer num3, TitleStyle titleStyle, CodeStyle codeStyle, Integer num4, Integer num5, Integer num6, int i2, Integer num7, boolean z3, boolean z4, Integer num8, Integer num9, Integer num10, Integer num11, float f) {
        this.cornerRadius = num;
        this.titleBgColor = num2;
        this.codeTitleSize = i;
        this.enableCodeFullScreenButton = z;
        this.codeCopyTitle = str;
        this.enableCodeCopyButton = z2;
        this.codeTitleBackgroundColor = num3;
        this.titleStyle = titleStyle;
        this.codeStyle = codeStyle;
        this.backgroundColor = num4;
        this.blockBackgroundColor = num5;
        this.codeTextColor = num6;
        this.codeTextSize = i2;
        this.blockMargin = num7;
        this.enableScroll = z3;
        this.enableLineNumber = z4;
        this.lineNumberColor = num8;
        this.codeBlockWidth = num9;
        this.blockBorderColor = num10;
        this.blockBorderWidth = num11;
        this.blockCodeTextLineSpace = f;
    }
}
