package com.ss.android.ugc.aweme.pipo.cashier.refund.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class RefundOptionTag {

    @C09CT("background_color")
    public final String backgroundColor;

    @C09CT("dark_mode_background_color")
    public final String darkModeBackgroundColor;

    @C09CT("dark_mode_text_color")
    public final String darkTextColor;

    @C09CT("text_color")
    public final String textColor;

    @C09CT("text")
    public final String textName;

    public RefundOptionTag() {
        this(null, null, null, null, null);
    }

    public RefundOptionTag(String str, String str2, String str3, String str4, String str5) {
        this.textName = str;
        this.textColor = str2;
        this.backgroundColor = str3;
        this.darkTextColor = str4;
        this.darkModeBackgroundColor = str5;
    }
}
