package com.ss.android.ugc.aweme.ecommerce.mall.settings;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class EcMixMallPreloadConfigV2Model {

    @C09CT("enable_full_preload_if_no_cache")
    public final Integer enableFullPreloadIfNoCache;

    @C09CT("preload_scenes")
    public final EcMixMallPreloadSceneConfigV2Model preloadScene;

    @C09CT("schema_config")
    public final Map<String, ECMixMallCardConfigV2> schemaConfig;

    public EcMixMallPreloadConfigV2Model() {
        this(null, null, 0);
    }

    public EcMixMallPreloadConfigV2Model(EcMixMallPreloadSceneConfigV2Model ecMixMallPreloadSceneConfigV2Model, Map<String, ECMixMallCardConfigV2> map, Integer num) {
        this.preloadScene = ecMixMallPreloadSceneConfigV2Model;
        this.schemaConfig = map;
        this.enableFullPreloadIfNoCache = num;
    }
}
