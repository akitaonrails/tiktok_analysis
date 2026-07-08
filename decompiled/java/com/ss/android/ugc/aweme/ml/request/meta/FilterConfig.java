package com.ss.android.ugc.aweme.ml.request.meta;

import X.C09CT;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class FilterConfig {

    @C09CT("custom_filter")
    public final Set<String> customFilter;

    @C09CT("header_filter")
    public final Map<String, Set<String>> headerFilter;

    @C09CT("index_filter")
    public final Set<Integer> indexFilter;

    @C09CT("query_filter")
    public final Map<String, Set<String>> queryFilter;

    public FilterConfig() {
        this(null, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FilterConfig(Map<String, ? extends Set<String>> map, Map<String, ? extends Set<String>> map2, Set<Integer> set, Set<String> set2) {
        this.headerFilter = map;
        this.queryFilter = map2;
        this.indexFilter = set;
        this.customFilter = set2;
    }
}
