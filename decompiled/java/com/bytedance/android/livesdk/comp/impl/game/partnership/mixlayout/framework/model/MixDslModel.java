package com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.model;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class MixDslModel {

    @C09CT("basic_info")
    public final MixBasicInfoModel basicInfo;

    @C09CT("floating_info")
    public final MixFloatingInfoModel floatingInfo;

    @C09CT("tab_info")
    public final MixTabInfoModel tabInfo;

    public MixDslModel() {
        this(new MixBasicInfoModel(null, 1, null), new MixTabInfoModel(null, null, 3, null), new MixFloatingInfoModel(null, 1, null));
    }

    public MixDslModel(MixBasicInfoModel mixBasicInfoModel) {
        this(mixBasicInfoModel, new MixTabInfoModel(null, null, 3, null), new MixFloatingInfoModel(null, 1, null));
    }

    public MixDslModel(MixBasicInfoModel mixBasicInfoModel, MixTabInfoModel mixTabInfoModel) {
        this(mixBasicInfoModel, mixTabInfoModel, new MixFloatingInfoModel(null, 1, null));
    }

    public MixDslModel(MixBasicInfoModel mixBasicInfoModel, MixTabInfoModel mixTabInfoModel, MixFloatingInfoModel mixFloatingInfoModel) {
        this.basicInfo = mixBasicInfoModel;
        this.tabInfo = mixTabInfoModel;
        this.floatingInfo = mixFloatingInfoModel;
    }
}
