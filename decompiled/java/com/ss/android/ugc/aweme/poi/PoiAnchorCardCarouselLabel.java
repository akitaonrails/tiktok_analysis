package com.ss.android.ugc.aweme.poi;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiAnchorCardCarouselLabel implements Serializable {

    @C09CT("font")
    public final String font;

    @C09CT("has_strikethrough")
    public final Boolean hasStrikethrough;

    @C09CT("text")
    public final String text;

    @C09CT("text_color")
    public final String textColor;

    public PoiAnchorCardCarouselLabel() {
        this(null, null, null, null);
    }

    public PoiAnchorCardCarouselLabel(String str, String str2, String str3, Boolean bool) {
        this.text = str;
        this.font = str2;
        this.textColor = str3;
        this.hasStrikethrough = bool;
    }
}
