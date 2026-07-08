package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class TabTextFontStrategy {

    @C09CT("font_size")
    public final int fontSize;

    @C09CT("font_width")
    public final int fontWidth;

    @C09CT("padding_max")
    public final int paddingMax;

    @C09CT("padding_min")
    public final int paddingMin;

    @C09CT("small_screen")
    public final boolean smallScreen;

    public TabTextFontStrategy() {
        this(17, 16, 12, 100, false);
    }

    public TabTextFontStrategy(int i, int i2, int i3, int i4, boolean z) {
        this.fontSize = i;
        this.paddingMax = i2;
        this.paddingMin = i3;
        this.fontWidth = i4;
        this.smallScreen = z;
    }
}
