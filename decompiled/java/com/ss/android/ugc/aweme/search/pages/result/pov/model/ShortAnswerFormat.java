package com.ss.android.ugc.aweme.search.pages.result.pov.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes32.dex */
public final class ShortAnswerFormat implements Serializable {

    @C09CT("font")
    public final String font;

    @C09CT("head_level")
    public final int headLevel;

    @C09CT("highlight_config")
    public final HighlightConfig highlightConfig;

    @C09CT("paragraph_spacing")
    public final int paragraphSpacing;

    public ShortAnswerFormat() {
        this(null, 0, null, 0);
    }

    public ShortAnswerFormat(String str, int i, HighlightConfig highlightConfig, int i2) {
        this.font = str;
        this.paragraphSpacing = i;
        this.highlightConfig = highlightConfig;
        this.headLevel = i2;
    }
}
