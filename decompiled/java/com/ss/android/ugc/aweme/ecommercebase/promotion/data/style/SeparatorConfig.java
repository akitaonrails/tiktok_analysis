package com.ss.android.ugc.aweme.ecommercebase.promotion.data.style;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class SeparatorConfig {

    @C09CT("color")
    public final LabelColor color;

    @C09CT("font")
    public final Integer font;

    @C09CT("gap")
    public final Integer gap;

    @C09CT("symbol")
    public final String symbol;

    public SeparatorConfig(String str, LabelColor labelColor, Integer num, Integer num2) {
        this.symbol = str;
        this.color = labelColor;
        this.font = num;
        this.gap = num2;
    }
}
