package com.tiktok.turtle.config;

import X.C09CT;
import com.google.gson.k;

/* JADX INFO: loaded from: classes24.dex */
public final class PrefetchDSL {

    @C09CT("fresh_time")
    public Long freshTime;

    @C09CT("input")
    public k input;

    @C09CT("max_cache_count")
    public Integer maxCacheCount;

    @C09CT("removal_strategy")
    public String removalStrategy;

    @C09CT("retry_on_failure")
    public Boolean retryOnFailure;

    @C09CT("service_name")
    public String serviceName;

    @C09CT("sharable")
    public Boolean sharable;

    public PrefetchDSL(String str, k kVar, Long l, Boolean bool, Boolean bool2, String str2, Integer num) {
        this.serviceName = str;
        this.input = kVar;
        this.freshTime = l;
        this.sharable = bool;
        this.retryOnFailure = bool2;
        this.removalStrategy = str2;
        this.maxCacheCount = num;
    }
}
