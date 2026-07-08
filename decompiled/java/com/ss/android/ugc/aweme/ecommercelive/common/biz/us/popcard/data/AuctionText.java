package com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data;

import X.C09CT;

/* JADX INFO: loaded from: classes7.dex */
public final class AuctionText {

    @C09CT("default_color")
    public final Color defaultColor;

    @C09CT("default_text")
    public final String defaultText;

    @C09CT("winner_color")
    public final Color winnerColor;

    @C09CT("winner_text")
    public final String winnerText;

    public AuctionText() {
        this(null, null, null, null);
    }

    public AuctionText(String str, String str2, Color color, Color color2) {
        this.defaultText = str;
        this.winnerText = str2;
        this.defaultColor = color;
        this.winnerColor = color2;
    }
}
