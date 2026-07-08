package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class LandingPageDataModel implements Serializable {

    @C09CT("icon")
    public final String icon;

    @C09CT("icon_color")
    public final String iconColor;

    @C09CT("icon_path")
    public final String iconPath;

    @C09CT("loading_format_cdn")
    public final String loadingFormatCdn;

    public final String getIcon() {
        return this.icon;
    }

    public final String getIconColor() {
        return this.iconColor;
    }

    public final String getIconPath() {
        return this.iconPath;
    }

    public final String getLoadingFormatCdn() {
        return this.loadingFormatCdn;
    }
}
