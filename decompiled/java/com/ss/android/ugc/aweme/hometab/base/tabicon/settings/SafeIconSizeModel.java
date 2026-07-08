package com.ss.android.ugc.aweme.hometab.base.tabicon.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class SafeIconSizeModel {

    @C09CT("bottom_safe_icon_size")
    public final IconSizeModel bottomSafeIconSize;

    @C09CT("top_safe_icon_size")
    public final IconSizeModel topSafeIconSize;

    public SafeIconSizeModel() {
        this(null, null);
    }

    public SafeIconSizeModel(IconSizeModel iconSizeModel, IconSizeModel iconSizeModel2) {
        this.topSafeIconSize = iconSizeModel;
        this.bottomSafeIconSize = iconSizeModel2;
    }
}
