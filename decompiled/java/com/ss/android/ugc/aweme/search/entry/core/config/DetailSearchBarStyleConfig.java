package com.ss.android.ugc.aweme.search.entry.core.config;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public final class DetailSearchBarStyleConfig {

    @C09CT("detail_search_bar_background_color_style")
    public final int bgColorStyle;

    @C09CT("detail_search_bar_border_style")
    public final int borderStyle;

    @C09CT("detail_search_bar_placeholder_enhance")
    public final int placeHolderEnhance;

    @C09CT("detail_search_bar_placeholder_word_change")
    public final int placeHolderWordChange;

    public DetailSearchBarStyleConfig() {
        this(0, 0, 0, 0);
    }

    public DetailSearchBarStyleConfig(int i, int i2, int i3, int i4) {
        this.borderStyle = i;
        this.placeHolderWordChange = i2;
        this.bgColorStyle = i3;
        this.placeHolderEnhance = i4;
    }
}
