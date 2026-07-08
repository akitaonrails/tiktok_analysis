package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class PreviewBenefitPoint implements Serializable {

    @C09CT("icon_text")
    public final ProductImage iconText;

    @C09CT("text")
    public final String text;

    @C09CT("text_color")
    public final String textColor;

    @C09CT("text_font")
    public final Integer textFont;

    public PreviewBenefitPoint() {
        this(null, null, null, null);
    }

    public PreviewBenefitPoint(String str, String str2, Integer num, ProductImage productImage) {
        this.text = str;
        this.textColor = str2;
        this.textFont = num;
        this.iconText = productImage;
    }
}
