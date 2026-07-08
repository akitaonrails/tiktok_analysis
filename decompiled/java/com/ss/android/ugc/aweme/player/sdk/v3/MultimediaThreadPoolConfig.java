package com.ss.android.ugc.aweme.player.sdk.v3;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class MultimediaThreadPoolConfig {

    @C09CT("core_task_pool_size")
    public int coreTaskPoolSize;

    @C09CT("enable_force_create_thread")
    public boolean forceCreateThread;

    @C09CT("core_pool_size")
    public int corePoolSize = 2;

    @C09CT("max_pool_size")
    public int maxPoolSize = 5;

    @C09CT("max_task_pool_size")
    public int maxTaskPoolSize = 1;

    @C09CT("vod_handler_thread_priority")
    public int vodThreadPriority = -20;

    @C09CT("live_handler_thread_priority")
    public int liveThreadPriority = -20;
}
