package com.bytedance.lynx.hybrid.info.model;

import X.C09CT;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public final class ColdBootInfo {

    @C09CT("code_cache_oids")
    public final List<String> codeCacheOids;

    @C09CT("high_priority_list")
    public final Map<String, List<Object>> high_priority_list;

    @C09CT("md5")
    public final String md5;

    @C09CT("oids")
    public final List<String> oids;

    @C09CT("updated_at")
    public final long updated_at;

    /* JADX WARN: Multi-variable type inference failed */
    public ColdBootInfo(long j, String str, Map<String, ? extends List<Object>> map, List<String> list, List<String> list2) {
        this.updated_at = j;
        this.md5 = str;
        this.high_priority_list = map;
        this.oids = list;
        this.codeCacheOids = list2;
    }
}
