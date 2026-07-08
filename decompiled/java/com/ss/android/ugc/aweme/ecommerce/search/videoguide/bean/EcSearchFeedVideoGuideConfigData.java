package com.ss.android.ugc.aweme.ecommerce.search.videoguide.bean;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class EcSearchFeedVideoGuideConfigData {

    @C09CT("diversion_entrance_resources")
    public final List<EcSearchFeedVideoEntranceRes> entranceResources;

    @C09CT("route_scene")
    public final Integer routeScene;

    @C09CT("schema")
    public final String schema;

    public EcSearchFeedVideoGuideConfigData() {
        this(null, null, null);
    }

    public EcSearchFeedVideoGuideConfigData(List<EcSearchFeedVideoEntranceRes> list, String str, Integer num) {
        this.entranceResources = list;
        this.schema = str;
        this.routeScene = num;
    }
}
