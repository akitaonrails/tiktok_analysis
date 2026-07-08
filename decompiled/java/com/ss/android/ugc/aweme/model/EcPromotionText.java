package com.ss.android.ugc.aweme.model;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class EcPromotionText {

    @C09CT("bg_color")
    public final String bgColor;

    @C09CT("bg_dark_color")
    public final String bgDarkColor;

    @C09CT("content")
    public final String content;

    @C09CT("style")
    public final String style;

    @C09CT("text_color")
    public final String textColor;

    @C09CT("text_dark_color")
    public final String textDarkColor;

    public EcPromotionText() {
        this(null, null, null, null, null, null);
    }

    public EcPromotionText(String str, String str2, String str3, String str4, String str5, String str6) {
        this.content = str;
        this.style = str2;
        this.textColor = str3;
        this.textDarkColor = str4;
        this.bgColor = str5;
        this.bgDarkColor = str6;
    }
}
