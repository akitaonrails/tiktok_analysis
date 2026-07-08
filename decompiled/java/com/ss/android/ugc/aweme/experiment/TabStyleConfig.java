package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class TabStyleConfig {

    @C09CT("bottom_tab_theme")
    public final Integer bottomTabTheme;

    @C09CT("top_tab_theme")
    public final Integer topTabTheme;

    public TabStyleConfig() {
        this(null, null);
    }

    public TabStyleConfig(Integer num, Integer num2) {
        this.topTabTheme = num;
        this.bottomTabTheme = num2;
    }
}
