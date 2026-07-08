package com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.config;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class UserRelationTagStyle {

    @C09CT("background_color")
    public final String backgroundColor;

    @C09CT("background_color_dark")
    public final String darkBackgroundColor;

    @C09CT("font_color_dark")
    public final String darkFontColor;

    @C09CT("font_color")
    public final String fontColor;

    @C09CT("highlight_type")
    public final int highlightType;

    public UserRelationTagStyle() {
        this(3, "#80161823", "#FFF1F1F2", "#80FFFFFF", "#FF252525");
    }

    public UserRelationTagStyle(int i, String str, String str2, String str3, String str4) {
        this.highlightType = i;
        this.fontColor = str;
        this.backgroundColor = str2;
        this.darkFontColor = str3;
        this.darkBackgroundColor = str4;
    }
}
