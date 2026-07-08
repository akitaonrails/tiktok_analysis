package com.ss.android.ugc.aweme.shortvideo.edit.effectdebugger;

import X.C09CT;

/* JADX INFO: loaded from: classes6.dex */
public final class ColorConfig {

    @C09CT("Alpha")
    public final Double alpha;

    @C09CT("BackgroundColor")
    public final String backgroundColor;

    @C09CT("BtnBorderColor")
    public final String btnBorderColor;

    @C09CT("ButtonColor")
    public final String buttonColor;

    @C09CT("IconColor")
    public final String iconColor;

    @C09CT("InputBoxColor")
    public final String inputBoxColor;

    @C09CT("TextColor")
    public final String textColor;

    public ColorConfig(String str, String str2, String str3, String str4, String str5, String str6, Double d) {
        this.buttonColor = str;
        this.backgroundColor = str2;
        this.iconColor = str3;
        this.textColor = str4;
        this.btnBorderColor = str5;
        this.inputBoxColor = str6;
        this.alpha = d;
    }
}
