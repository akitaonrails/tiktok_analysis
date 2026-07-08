package com.bytedance.helios.cache.config;

import X.C09CT;
import X.C13BV;
import X.C2097608Jq;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class CacheGroup {

    @C09CT("api_ids")
    public final List<Integer> apiIds;

    @C09CT("filter")
    public final String filter;

    @C09CT("params")
    public final Map<String, String> params;

    @C09CT("store")
    public final String store;

    @C09CT("strategy")
    public final String strategy;

    public CacheGroup() {
        this(null, null, null, null, null, 31, null);
    }

    public CacheGroup(String str, String str2, List<Integer> list, Map<String, String> map, String str3) {
        this.store = str;
        this.strategy = str2;
        this.apiIds = list;
        this.params = map;
        this.filter = str3;
    }

    public CacheGroup(String str, String str2, List list, Map map, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "map" : str, (i & 2) != 0 ? "persist" : str2, (i & 4) != 0 ? C13BV.INSTANCE : list, (i & 8) != 0 ? C2097608Jq.LJ() : map, (i & 16) != 0 ? "" : str3);
    }
}
