package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class TextDisplay {

    @C09CT("highlight_part")
    public String highlightPart;

    @C09CT("right_icon")
    public ECImage rightIcon;

    @C09CT("right_icon_dark")
    public ECImage rightIconDark;

    @C09CT("whole_text")
    public String wholeText;

    public TextDisplay() {
        this(null, null, null, null);
    }

    public TextDisplay(String str, String str2, ECImage eCImage, ECImage eCImage2) {
        this.highlightPart = str;
        this.wholeText = str2;
        this.rightIcon = eCImage;
        this.rightIconDark = eCImage2;
    }
}
