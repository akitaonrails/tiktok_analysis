package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import com.ss.android.ugc.aweme.boost.ThreadCpuCoreConfig;
import com.ss.android.ugc.aweme.boost.ThreadPriorityConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public final class ThreadAdjustConfig {

    @C09CT("thread_cpu_core_configs")
    public final List<ThreadCpuCoreConfig> threadCpuCoreConfigs;

    @C09CT("thread_priority_configs")
    public final List<ThreadPriorityConfig> threadPriorityConfigs;

    public ThreadAdjustConfig() {
        this(new ArrayList(), new ArrayList());
    }

    public ThreadAdjustConfig(List<ThreadPriorityConfig> list, List<ThreadCpuCoreConfig> list2) {
        this.threadPriorityConfigs = list;
        this.threadCpuCoreConfigs = list2;
    }
}
