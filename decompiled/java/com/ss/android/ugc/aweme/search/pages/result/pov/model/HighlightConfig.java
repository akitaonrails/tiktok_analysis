package com.ss.android.ugc.aweme.search.pages.result.pov.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes32.dex */
public final class HighlightConfig implements Serializable {

    @C09CT("bottom_padding")
    public final int bottomPadding;

    @C09CT("color")
    public final String color;

    @C09CT("top_padding")
    public final int topPadding;

    public HighlightConfig() {
        this(null, 0, 0);
    }

    public HighlightConfig(String str, int i, int i2) {
        this.color = str;
        this.topPadding = i;
        this.bottomPadding = i2;
    }
}
