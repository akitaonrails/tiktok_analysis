package com.ss.android.ugc.aweme.ecommerce.mall.settings;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class EcMixMallPreloadSceneConfigV2Model {

    @C09CT("after_cache_render")
    public final List<ECMixMallCardModelV2> afterCacheRender;

    @C09CT("before_mall")
    public final List<ECMixMallCardModelV2> beforeMallConfig;

    @C09CT("click_mall_tab")
    public final List<ECMixMallCardModelV2> clickMallTab;

    public EcMixMallPreloadSceneConfigV2Model() {
        this(null, null, null);
    }

    public EcMixMallPreloadSceneConfigV2Model(List<ECMixMallCardModelV2> list, List<ECMixMallCardModelV2> list2, List<ECMixMallCardModelV2> list3) {
        this.beforeMallConfig = list;
        this.clickMallTab = list2;
        this.afterCacheRender = list3;
    }
}
