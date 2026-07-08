package com.ss.android.ugc.aweme.search.visualsearch.config;

import X.C09CT;
import X.C2097908Jt;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class VisualSearchRequestBitmapCompressWithSceneModel {

    @C09CT("config_with_scene")
    public final Map<String, VisualSearchBitmapForRequestCompressConfig> configWithScene;

    public VisualSearchRequestBitmapCompressWithSceneModel() {
        this(null, 1, null);
    }

    public VisualSearchRequestBitmapCompressWithSceneModel(Map<String, VisualSearchBitmapForRequestCompressConfig> map) {
        this.configWithScene = map;
    }

    public VisualSearchRequestBitmapCompressWithSceneModel(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C2097908Jt.LIZJ(new Pair("default", new VisualSearchBitmapForRequestCompressConfig(400, 60))) : map);
    }
}
