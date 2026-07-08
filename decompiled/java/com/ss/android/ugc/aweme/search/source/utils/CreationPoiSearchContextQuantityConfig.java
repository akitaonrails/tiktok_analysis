package com.ss.android.ugc.aweme.search.source.utils;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class CreationPoiSearchContextQuantityConfig {

    @C09CT("poi_feed_scene_num")
    public final int poiFeedSceneNum;

    @C09CT("poi_recommend_scene_num")
    public final int poiRecommendSceneNum;

    @C09CT("poi_search_scene_query_num")
    public final int poiSearchSceneQueryNum;

    @C09CT("poi_search_scene_session_num")
    public final int poiSearchSceneSessionNum;

    public CreationPoiSearchContextQuantityConfig() {
        this(6, 20, 30, 30);
    }

    public CreationPoiSearchContextQuantityConfig(int i, int i2, int i3, int i4) {
        this.poiSearchSceneSessionNum = i;
        this.poiSearchSceneQueryNum = i2;
        this.poiRecommendSceneNum = i3;
        this.poiFeedSceneNum = i4;
    }
}
