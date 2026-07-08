package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class AEPOptimizeConfig {

    @C09CT("enable_cache")
    public final boolean enableCache;

    @C09CT("enable_loading_animation_optimize")
    public final boolean enableLoadingAnimationOptimize;

    @C09CT("enable_preload")
    public final boolean enablePreload;

    public AEPOptimizeConfig() {
        this(false, false, false);
    }

    public AEPOptimizeConfig(boolean z, boolean z2, boolean z3) {
        this.enableCache = z;
        this.enablePreload = z2;
        this.enableLoadingAnimationOptimize = z3;
    }
}
