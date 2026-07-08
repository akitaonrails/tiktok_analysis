package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class EcSeaPdpPreloadSceneConfig {

    @C09CT("cache_render_end")
    public final EcSeaPdpPreloadSceneModel cacheRenderEnd;

    @C09CT("no_cache_preload")
    public final EcSeaPdpPreloadSceneModel noCachePreload;

    @C09CT("online_render_end")
    public final EcSeaPdpPreloadSceneModel onlineRenderEnd;

    @C09CT("router_jump")
    public final EcSeaPdpPreloadSceneModel routerJump;

    public EcSeaPdpPreloadSceneConfig() {
        this(null, null, null, null);
    }

    public EcSeaPdpPreloadSceneConfig(EcSeaPdpPreloadSceneModel ecSeaPdpPreloadSceneModel, EcSeaPdpPreloadSceneModel ecSeaPdpPreloadSceneModel2, EcSeaPdpPreloadSceneModel ecSeaPdpPreloadSceneModel3, EcSeaPdpPreloadSceneModel ecSeaPdpPreloadSceneModel4) {
        this.routerJump = ecSeaPdpPreloadSceneModel;
        this.noCachePreload = ecSeaPdpPreloadSceneModel2;
        this.cacheRenderEnd = ecSeaPdpPreloadSceneModel3;
        this.onlineRenderEnd = ecSeaPdpPreloadSceneModel4;
    }
}
