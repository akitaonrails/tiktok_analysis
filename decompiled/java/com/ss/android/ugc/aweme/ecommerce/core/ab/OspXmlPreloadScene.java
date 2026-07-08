package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;
import X.C2097608Jq;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class OspXmlPreloadScene {

    @C09CT("preload_xml_list")
    public final Map<String, Integer> preloadActivityXmlList;

    @C09CT("preload_xml_app_list")
    public final Map<String, Integer> preloadXmlAppList;

    public OspXmlPreloadScene() {
        this(C2097608Jq.LJ(), C2097608Jq.LJ());
    }

    public OspXmlPreloadScene(Map<String, Integer> map, Map<String, Integer> map2) {
        this.preloadXmlAppList = map;
        this.preloadActivityXmlList = map2;
    }
}
