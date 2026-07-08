package com.ss.android.ugc.aweme.hometab.base.tabicon.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class RealIconSizeModel {

    @C09CT("disable_check_real_icon_size")
    public final boolean disableCheckIconSize;

    @C09CT("icon_size_ratio_error")
    public final float iconSizeRatioError;

    public RealIconSizeModel() {
        this(false, 0.02f);
    }

    public RealIconSizeModel(boolean z, float f) {
        this.disableCheckIconSize = z;
        this.iconSizeRatioError = f;
    }
}
