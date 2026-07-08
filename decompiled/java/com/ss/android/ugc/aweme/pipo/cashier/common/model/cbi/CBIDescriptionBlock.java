package com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class CBIDescriptionBlock {

    @C09CT("background_color")
    public final String backgroundColor;

    @C09CT("dark_mode_background_color")
    public final String darkBackgroundColor;

    @C09CT("dark_mode_icon_url")
    public final String darkIconUrl;

    @C09CT("dark_mode_text_color")
    public final String darkTextColor;

    @C09CT("icon_url")
    public final String iconUrl;

    @C09CT("text")
    public final String text;

    @C09CT("text_color")
    public final String textColor;

    public CBIDescriptionBlock() {
        this(null, null, null, null, null, null, null);
    }

    public CBIDescriptionBlock(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.iconUrl = str;
        this.darkIconUrl = str2;
        this.text = str3;
        this.textColor = str4;
        this.backgroundColor = str5;
        this.darkTextColor = str6;
        this.darkBackgroundColor = str7;
    }
}
