package com.ss.android.ugc.aweme.model;

import X.C09CT;
import X.C0QNH;
import com.ss.android.ugc.aweme.search.model.ThemeColor;
import com.ss.android.ugc.aweme.search.model.ThemeImage;

/* JADX INFO: loaded from: classes11.dex */
public final class EcSearchDealsSkinData {

    @C09CT("search_deals_background_color")
    public final ThemeColor backgroundColor;

    @C09CT("search_deals_background_image")
    public final ThemeImage backgroundImage;

    @C09CT("search_deals_search_bar_theme")
    public final C0QNH searchBarTheme;

    public EcSearchDealsSkinData() {
        this(C0QNH.DISABLE, null, null);
    }

    public EcSearchDealsSkinData(C0QNH c0qnh, ThemeColor themeColor, ThemeImage themeImage) {
        this.searchBarTheme = c0qnh;
        this.backgroundColor = themeColor;
        this.backgroundImage = themeImage;
    }
}
