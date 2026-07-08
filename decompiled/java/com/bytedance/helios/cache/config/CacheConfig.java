package com.bytedance.helios.cache.config;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class CacheConfig {

    @C09CT("cache_groups")
    public final List<CacheGroup> cacheGroups;

    public CacheConfig() {
        this(null, 1, null);
    }

    public CacheConfig(List<CacheGroup> list) {
        this.cacheGroups = list;
    }

    public CacheConfig(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
