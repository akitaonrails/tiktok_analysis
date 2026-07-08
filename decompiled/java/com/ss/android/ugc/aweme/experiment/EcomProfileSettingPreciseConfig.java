package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes31.dex */
public final class EcomProfileSettingPreciseConfig {

    @C09CT("preload_enable")
    public final boolean preloadCommonClass;

    @C09CT("preload_osp_class")
    public final boolean preloadOspEnable;

    @C09CT("preload_pb_class")
    public final boolean preloadPbClass;

    @C09CT("profile_enable")
    public final boolean profileEnable;

    public EcomProfileSettingPreciseConfig() {
        this(false, false, false, false);
    }

    public EcomProfileSettingPreciseConfig(boolean z, boolean z2, boolean z3, boolean z4) {
        this.profileEnable = z;
        this.preloadCommonClass = z2;
        this.preloadPbClass = z3;
        this.preloadOspEnable = z4;
    }
}
