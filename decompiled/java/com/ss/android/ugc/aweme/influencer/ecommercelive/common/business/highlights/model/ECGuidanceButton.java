package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class ECGuidanceButton implements Serializable {
    public static final int $stable = 0;

    @C09CT("background_color")
    public final String backgroundColor;

    @C09CT("background_color_dark_mode")
    public final String backgroundColorDarkMode;

    @C09CT("callback_scene")
    public final Integer callbackScene;

    @C09CT("schema")
    public final String schema;

    @C09CT("text")
    public final String text;

    @C09CT("text_color")
    public final String textColor;

    @C09CT("text_color_dark_mode")
    public final String textColorDarkMode;

    public ECGuidanceButton() {
        this(null, null, null, null, null, null, null);
    }

    public ECGuidanceButton(String str, String str2, String str3, String str4, String str5, String str6, Integer num) {
        this.text = str;
        this.schema = str2;
        this.backgroundColor = str3;
        this.backgroundColorDarkMode = str4;
        this.textColor = str5;
        this.textColorDarkMode = str6;
        this.callbackScene = num;
    }
}
