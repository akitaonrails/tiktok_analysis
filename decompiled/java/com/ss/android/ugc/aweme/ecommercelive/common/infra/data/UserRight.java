package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.Color;

/* JADX INFO: loaded from: classes33.dex */
public final class UserRight {

    @C09CT("color")
    public final Color color;

    @C09CT("text")
    public final String text;

    @C09CT("text_font")
    public final Integer textFont;

    public UserRight() {
        this(null, 24, null);
    }

    public UserRight(String str, Integer num, Color color) {
        this.text = str;
        this.textFont = num;
        this.color = color;
    }
}
