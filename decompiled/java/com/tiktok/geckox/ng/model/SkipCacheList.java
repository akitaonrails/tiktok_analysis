package com.tiktok.geckox.ng.model;

import X.C09CT;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class SkipCacheList {

    @C09CT("default_aks")
    public final List<String> defaultAks;

    @C09CT("other_aks")
    public final Map<String, List<String>> otherAks;

    public SkipCacheList() {
        this(null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SkipCacheList(List<String> list, Map<String, ? extends List<String>> map) {
        this.defaultAks = list;
        this.otherAks = map;
    }
}
