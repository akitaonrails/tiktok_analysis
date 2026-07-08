package com.ss.android.ugc.aweme.search.source.neo.model;

import X.C09CT;
import defpackage.q0;

/* JADX INFO: loaded from: classes11.dex */
public final class PoiJsonData {

    @C09CT("creation_poi_feed_scene_info")
    public final q0<FeedSceneInfo> creationPoiFeedSceneInfo;

    @C09CT("creation_poi_recommend_scene_info")
    public final q0<CreationPoiClickInfo> creationPoiRecommendSceneInfo;

    @C09CT("creation_poi_search_scene_info")
    public final q0<CreationPoiSearchSessionInfo> creationPoiSearchSceneInfo;

    public PoiJsonData(q0<CreationPoiClickInfo> q0Var, q0<FeedSceneInfo> q0Var2, q0<CreationPoiSearchSessionInfo> q0Var3) {
        this.creationPoiRecommendSceneInfo = q0Var;
        this.creationPoiFeedSceneInfo = q0Var2;
        this.creationPoiSearchSceneInfo = q0Var3;
    }
}
