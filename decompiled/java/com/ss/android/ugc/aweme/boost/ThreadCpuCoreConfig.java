package com.ss.android.ugc.aweme.boost;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class ThreadCpuCoreConfig {

    @C09CT("cpu_bind_core_type")
    public final int cpuBindCoreType;

    @C09CT("thread_name")
    public final String threadName;

    public ThreadCpuCoreConfig() {
        this("", 2);
    }

    public ThreadCpuCoreConfig(String str, int i) {
        this.threadName = str;
        this.cpuBindCoreType = i;
    }
}
