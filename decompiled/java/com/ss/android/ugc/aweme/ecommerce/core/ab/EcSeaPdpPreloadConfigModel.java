package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class EcSeaPdpPreloadConfigModel {

    @C09CT("preload_scenes")
    public final EcSeaPdpPreloadSceneConfig preloadScene;

    @C09CT("schema_config")
    public final Map<String, ECSeaPdpCardConfig> schemaConfig;

    public EcSeaPdpPreloadConfigModel() {
        this(null, null);
    }

    public EcSeaPdpPreloadConfigModel(EcSeaPdpPreloadSceneConfig ecSeaPdpPreloadSceneConfig, Map<String, ECSeaPdpCardConfig> map) {
        this.preloadScene = ecSeaPdpPreloadSceneConfig;
        this.schemaConfig = map;
    }
}
