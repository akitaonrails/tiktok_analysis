package com.ss.android.ugc.aweme.hometab.base.tabicon.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class DynamicTabConfigModel {

    @C09CT("distinguish_tab_position_config")
    public final DistinguishTabPositionModel distinguishTabPositionConfig;

    @C09CT("real_icon_size_config")
    public final RealIconSizeModel realIconSizeConfig;

    @C09CT("safe_icon_size")
    public final SafeIconSizeModel safeIconSize;

    public DynamicTabConfigModel() {
        this(null, null, null);
    }

    public DynamicTabConfigModel(SafeIconSizeModel safeIconSizeModel, RealIconSizeModel realIconSizeModel, DistinguishTabPositionModel distinguishTabPositionModel) {
        this.safeIconSize = safeIconSizeModel;
        this.realIconSizeConfig = realIconSizeModel;
        this.distinguishTabPositionConfig = distinguishTabPositionModel;
    }
}
