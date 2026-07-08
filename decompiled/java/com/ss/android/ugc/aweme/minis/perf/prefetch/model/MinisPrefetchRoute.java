package com.ss.android.ugc.aweme.minis.perf.prefetch.model;

import X.C09CT;
import X.C1504380pFc;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public final class MinisPrefetchRoute implements Serializable {

    @C09CT("")
    public final Map<String, MinisPrefetchRouteConfig> configs;

    @C09CT("path")
    public String path;
    public static final C1504380pFc Companion = new Object() { // from class: X.0pFc
    };
    public static final int $stable = 8;

    public final void setPath(String str) {
        this.path = str;
    }

    public MinisPrefetchRoute(String str, Map<String, MinisPrefetchRouteConfig> map) {
        this.path = str;
        this.configs = map;
    }
}
