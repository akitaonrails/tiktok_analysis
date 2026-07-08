package com.ss.android.ugc.aweme.ecommercebase.promotion.data.style;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class PromotionLabelSingleConfig {
    public transient int LIZ;

    @C09CT("bgColor")
    public final LabelColor bgColor;

    @C09CT("borderColor")
    public final LabelColor borderColor;

    @C09CT("borderWidth")
    public final Float borderWidth;

    @C09CT("countdownBgColor")
    public final LabelColor countdownBgColor;

    @C09CT("countdownColor")
    public final LabelColor countdownColor;

    @C09CT("countdownFont")
    public final Integer countdownFont;

    @C09CT("extraColor")
    public final LabelColor extraColor;

    @C09CT("extraFont")
    public final Integer extraFont;

    @C09CT("extraPosition")
    public final int extraPosition;

    @C09CT("gap")
    public final int gap;

    @C09CT("hide_text_when_countdown")
    public final boolean hideTextWhenCountDown;

    @C09CT("iconSize")
    public final IconSize iconSize;

    @C09CT("ignoreIcon")
    public final boolean ignoreIcon;

    @C09CT("ignoreSuffixIcon")
    public final boolean ignoreSuffixIcon;

    @C09CT("padding")
    public final int padding;

    @C09CT("paddingLeft")
    public final Integer paddingLeft;

    @C09CT("paddingRight")
    public final Integer paddingRight;

    @C09CT("radius")
    public final int radius;

    @C09CT("rtlIcon")
    public final boolean rtlIcon;

    @C09CT("rtlSuffixIcon")
    public final boolean rtlSuffixIcon;

    @C09CT("style")
    public final int style;

    @C09CT("suffixIconSize")
    public final IconSize suffixIconSize;

    @C09CT("textColor")
    public final LabelColor textColor;

    @C09CT("textFont")
    public final int textFont;

    @C09CT("useCountdownText")
    public final boolean useCountdownText;

    public PromotionLabelSingleConfig(int i, LabelColor labelColor, int i2, LabelColor labelColor2, LabelColor labelColor3, Float f, boolean z, LabelColor labelColor4, LabelColor labelColor5, Integer num, boolean z2, int i3, Integer num2, Integer num3, int i4, int i5, IconSize iconSize, boolean z3, boolean z4, boolean z5, boolean z6, IconSize iconSize2, LabelColor labelColor6, Integer num4, int i6) {
        this.style = i;
        this.textColor = labelColor;
        this.textFont = i2;
        this.bgColor = labelColor2;
        this.borderColor = labelColor3;
        this.borderWidth = f;
        this.useCountdownText = z;
        this.countdownColor = labelColor4;
        this.countdownBgColor = labelColor5;
        this.countdownFont = num;
        this.hideTextWhenCountDown = z2;
        this.padding = i3;
        this.paddingLeft = num2;
        this.paddingRight = num3;
        this.gap = i4;
        this.radius = i5;
        this.iconSize = iconSize;
        this.ignoreIcon = z3;
        this.ignoreSuffixIcon = z4;
        this.rtlIcon = z5;
        this.rtlSuffixIcon = z6;
        this.suffixIconSize = iconSize2;
        this.extraColor = labelColor6;
        this.extraFont = num4;
        this.extraPosition = i6;
    }
}
