package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class SkylightColdStartConfig {
    public static final TypeAdapter ADAPTER = new SkylightColdStartConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable_follow_cold_prefetch")
    public boolean enableFollowColdPrefetch;

    @C09CT("enable_inbox_cold_prefetch")
    public boolean enableInboxColdPrefetch;

    @C09CT("enable_local_cache")
    public boolean enableLocalCache;

    @C09CT("enable_update_both_way")
    public boolean enableUpdateBothWay;

    @C09CT("extra_polling_fetch_count")
    public int extraPollingFetchCount;

    @C09CT("follow_cold_prefetch_expire_time")
    public long followColdPrefetchExpireTime;

    @C09CT("global_fetch_delay_time")
    public int globalFetchDelayTime;

    @C09CT("global_fetch_start_advance")
    public boolean globalFetchStartAdvance;

    @C09CT("global_fetch_strategy")
    public int globalFetchStrategy;

    @C09CT("inbox_cold_prefetch_expire_time")
    public long inboxColdPrefetchExpireTime;

    @C09CT("interval_global_fetch")
    public long intervalGlobalFetchSecond;

    @C09CT("local_cache_expire_time")
    public long localCacheExpireTime;

    @C09CT("local_cache_size")
    public int localCacheSize = 10;
}
