package com.ss.android.ugc.aweme.ecommerce.search.suggest.model;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class RightsInfo {

    @C09CT("dark_icon")
    public final IconModel darkIcon;

    @C09CT("light_icon")
    public final IconModel lightIcon;

    @C09CT("text")
    public final String text;

    @C09CT("text_config")
    public final TextConfig textConfig;

    public RightsInfo() {
        this(null, null, null, null);
    }

    public RightsInfo(IconModel iconModel, IconModel iconModel2, TextConfig textConfig, String str) {
        this.darkIcon = iconModel;
        this.lightIcon = iconModel2;
        this.textConfig = textConfig;
        this.text = str;
    }
}
