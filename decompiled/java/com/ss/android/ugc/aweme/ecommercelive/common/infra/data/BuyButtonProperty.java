package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;
import X.C1744060vUC;
import java.io.Serializable;

/* JADX INFO: loaded from: classes33.dex */
public final class BuyButtonProperty implements Serializable {
    public static final C1744060vUC Companion = new C1744060vUC();

    @C09CT("background_color")
    public String backgroundColor;

    @C09CT("background_color_dark_mode")
    public String backgroundColorDarkMode;

    @C09CT("display_text")
    public String displayText;

    @C09CT("display_text_color")
    public String displayTextColor;

    @C09CT("display_text_color_dark_mode")
    public String displayTextColorDarkMode;

    @C09CT("toast")
    public String toast;

    public BuyButtonProperty() {
        this(null, null, null, null, null, null);
    }

    public final void setBackgroundColor(String str) {
        this.backgroundColor = str;
    }

    public final void setBackgroundColorDarkMode(String str) {
        this.backgroundColorDarkMode = str;
    }

    public final void setDisplayText(String str) {
        this.displayText = str;
    }

    public final void setDisplayTextColor(String str) {
        this.displayTextColor = str;
    }

    public final void setDisplayTextColorDarkMode(String str) {
        this.displayTextColorDarkMode = str;
    }

    public final void setToast(String str) {
        this.toast = str;
    }

    public BuyButtonProperty(String str, String str2, String str3, String str4, String str5, String str6) {
        this.displayText = str;
        this.displayTextColor = str2;
        this.backgroundColor = str3;
        this.displayTextColorDarkMode = str4;
        this.backgroundColorDarkMode = str5;
        this.toast = str6;
    }
}
