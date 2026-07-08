package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class CreatorToolsActionCardInfo {
    public final Integer LIZ;

    @C09CT("background_color")
    public final String backgroundColor;

    @C09CT("background_color_dark_mode")
    public final String backgroundColorDarkMode;

    @C09CT("card_button_title")
    public final String cardButtonTitle;

    @C09CT("card_highlight_text")
    public final String cardHighlightText;

    @C09CT("card_overall_text")
    public final String cardOverallText;

    @C09CT("display_text_color")
    public final String displayTextColor;

    @C09CT("display_text_color_dark_mode")
    public final String displayTextColorDarkMode;

    @C09CT("show_time_ms")
    public final Long showTimeMs;

    @C09CT("toast")
    public final String toast;

    public CreatorToolsActionCardInfo() {
        this(null, null, null, null, null, null, null, null, null, null);
    }

    public CreatorToolsActionCardInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l, Integer num) {
        this.cardOverallText = str;
        this.cardHighlightText = str2;
        this.cardButtonTitle = str3;
        this.backgroundColorDarkMode = str4;
        this.backgroundColor = str5;
        this.displayTextColorDarkMode = str6;
        this.displayTextColor = str7;
        this.toast = str8;
        this.showTimeMs = l;
        this.LIZ = num;
    }
}
