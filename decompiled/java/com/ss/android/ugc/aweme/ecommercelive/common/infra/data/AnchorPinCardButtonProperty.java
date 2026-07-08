package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;
import X.C212185181v;
import java.io.Serializable;

/* JADX INFO: loaded from: classes33.dex */
public final class AnchorPinCardButtonProperty implements Serializable {
    public static final C212185181v Companion = new Object() { // from class: X.181v
    };

    @C09CT("background_color")
    public final String backgroundColor;

    @C09CT("background_color_dark_mode")
    public final String backgroundColorDarkMode;

    @C09CT("display_text")
    public final String displayText;

    @C09CT("display_text_color")
    public final String displayTextColor;

    @C09CT("display_text_color_dark_mode")
    public final String displayTextColorDarkMode;

    @C09CT("toast")
    public final String toast;

    public AnchorPinCardButtonProperty(String str, String str2, String str3, String str4, String str5, String str6) {
        this.backgroundColor = str;
        this.backgroundColorDarkMode = str2;
        this.displayText = str3;
        this.displayTextColor = str4;
        this.displayTextColorDarkMode = str5;
        this.toast = str6;
    }
}
