package com.ss.android.ugc.aweme.search.performance.asyncprefetch.config;

import X.C09CT;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class AsyncLoadConfig {

    @C09CT("pre_async_bind_whitelist")
    public final Set<Integer> bindWhitelist;

    @C09CT("pre_async_create_whitelist")
    public final Set<Integer> createWhitelist;

    @C09CT("async_bind")
    public final boolean enableAsyncBind;

    @C09CT("async_create")
    public final boolean enableAsyncCreate;

    @C09CT("enable_debug_info")
    public final boolean enableDebugInfo;

    @C09CT("enable_post_value")
    public final boolean enablePostValue;

    @C09CT("enable_preload_after_first")
    public final boolean enablePreloadAfterFirst;

    @C09CT("enable_scroll_pre_bind")
    public final boolean enableScrollAsyncBind;

    @C09CT("pre_lynx_type_whitelist")
    public final Set<String> lynxWhitelist;

    @C09CT("open_origin_prefetch")
    public final boolean openPrefetch;

    @C09CT("pre_load_count")
    public final int preloadCount;

    @C09CT("pre_scroll_distance")
    public final int scrollDistanceToPreLoad;

    @C09CT("strategy_version")
    public final long strategyVersion;

    @C09CT("async_time_out")
    public final long timeOut;

    public AsyncLoadConfig() {
        this(false, false, false, false, false, false, true, null, null, new HashSet(), 50L, 20, 2, 0L);
    }

    public AsyncLoadConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, Set<Integer> set, Set<Integer> set2, Set<String> set3, long j, int i, int i2, long j2) {
        this.enableAsyncCreate = z;
        this.enableAsyncBind = z2;
        this.enableDebugInfo = z3;
        this.enableScrollAsyncBind = z4;
        this.enablePostValue = z5;
        this.enablePreloadAfterFirst = z6;
        this.openPrefetch = z7;
        this.createWhitelist = set;
        this.bindWhitelist = set2;
        this.lynxWhitelist = set3;
        this.timeOut = j;
        this.scrollDistanceToPreLoad = i;
        this.preloadCount = i2;
        this.strategyVersion = j2;
    }
}
