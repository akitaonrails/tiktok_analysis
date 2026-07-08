package com.ss.android.ugc.aweme.player.sdk.v3;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class MultimediaThreadPoolConfigV2 {

    @C09CT("idle_init_cnt_v2")
    public int idleInitCnt = 2;

    @C09CT("max_idle_size_v2")
    public int maxIdleSize = 5;

    @C09CT("core_task_pool_size_v2")
    public int coreTaskPoolSize = 1;

    @C09CT("max_task_pool_size_v2")
    public int maxTaskPoolSize = 3;

    @C09CT("vod_handler_thread_priority_v2")
    public int vodThreadPriority = -20;

    @C09CT("live_handler_thread_priority_v2")
    public int liveThreadPriority = -20;

    @C09CT("controller_handler_thread_priority_v2")
    public int controllerThreadPriority = -20;

    @C09CT("recycle_timeout_ms_v2")
    public long recycleTimeoutMs = 10000;

    @C09CT("replenish_count_v2")
    public int replenishCount = 1;
}
