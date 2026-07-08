package com.ss.android.ugc.aweme.feed.model.search;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class PromotionTextStyle implements Serializable {

    @C09CT("font_size")
    public int fontSize = 13;

    @C09CT("font_color")
    public String fontColor = "#99FFFFFF";

    public final String getFontColor() {
        return this.fontColor;
    }

    public final int getFontSize() {
        return this.fontSize;
    }

    public final void setFontColor(String str) {
        this.fontColor = str;
    }

    public final void setFontSize(int i) {
        this.fontSize = i;
    }
}
