package com.ss.android.ugc.aweme.ecommerce.search.suggest.model;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class TextConfig {

    @C09CT("bg_color")
    public final String bgColor;

    @C09CT("bg_dark_color")
    public final String bgDarkColor;

    @C09CT("highlight_color")
    public final String highLightColor;

    @C09CT("highlight_dark_color")
    public final String highLightDarkColor;

    @C09CT("text_size")
    public final Integer textSize;

    @C09CT("text_weight")
    public final Integer textWeight;

    public TextConfig() {
        this(null, null, null, null, null, null);
    }

    public TextConfig(String str, String str2, Integer num, Integer num2, String str3, String str4) {
        this.highLightColor = str;
        this.bgColor = str2;
        this.textSize = num;
        this.textWeight = num2;
        this.bgDarkColor = str3;
        this.highLightDarkColor = str4;
    }
}
