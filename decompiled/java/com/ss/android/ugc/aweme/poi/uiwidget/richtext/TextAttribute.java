package com.ss.android.ugc.aweme.poi.uiwidget.richtext;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class TextAttribute implements Serializable {

    @C09CT("bg_color")
    public final String bgColor;

    @C09CT("font")
    public final String font;

    @C09CT("font_color")
    public final String fontColor;

    @C09CT("has_strike")
    public final Boolean hasStrike;

    @C09CT("has_underline")
    public final Boolean hasUnderline;

    public TextAttribute(String str, String str2, String str3, Boolean bool, Boolean bool2) {
        this.font = str;
        this.fontColor = str2;
        this.bgColor = str3;
        this.hasUnderline = bool;
        this.hasStrike = bool2;
    }
}
