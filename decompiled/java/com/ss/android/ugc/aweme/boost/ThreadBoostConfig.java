package com.ss.android.ugc.aweme.boost;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public final class ThreadBoostConfig {

    @C09CT("boost_stop_interval")
    public final long boostStopInterval;

    @C09CT("enable_polling_after_stop")
    public final boolean enablePollingAfterStop;

    @C09CT("hold_time")
    public final long holdTime;

    @C09CT("re_boost_after_polling")
    public final boolean reBoostAfterPolling;

    @C09CT("re_fetch_after_polling")
    public final boolean reFetchAfterPolling;

    @C09CT("re_fetch_thread_info")
    public final boolean reFetchThreadInfo;

    @C09CT("thread_cpu_core_configs")
    public final List<ThreadCpuCoreConfig> threadCpuCoreConfigs;

    @C09CT("thread_priority_configs")
    public final List<ThreadPriorityConfig> threadPriorityConfigs;

    @C09CT("thread_suspend_configs")
    public final List<ThreadSuspendConfig> threadSuspendConfigs;

    @C09CT("timeout")
    public final long timeout;

    public ThreadBoostConfig() {
        this(new ArrayList(), new ArrayList(), new ArrayList(), 0L, 0L, false, false, false, true, 0L);
    }

    public ThreadBoostConfig(List<ThreadPriorityConfig> list, List<ThreadCpuCoreConfig> list2, List<ThreadSuspendConfig> list3, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4, long j3) {
        this.threadPriorityConfigs = list;
        this.threadCpuCoreConfigs = list2;
        this.threadSuspendConfigs = list3;
        this.holdTime = j;
        this.timeout = j2;
        this.reFetchAfterPolling = z;
        this.reBoostAfterPolling = z2;
        this.enablePollingAfterStop = z3;
        this.reFetchThreadInfo = z4;
        this.boostStopInterval = j3;
    }
}
