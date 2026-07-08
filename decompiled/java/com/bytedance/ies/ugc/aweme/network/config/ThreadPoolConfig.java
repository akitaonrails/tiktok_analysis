package com.bytedance.ies.ugc.aweme.network.config;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class ThreadPoolConfig {

    @C09CT("corePoolSize")
    public final int corePoolSize;

    @C09CT("keepAliveTime")
    public final int keepAliveTime;

    @C09CT("maximumPoolSize")
    public final int maximumPoolSize;

    @C09CT("threadPriority")
    public final int threadPriority;

    public ThreadPoolConfig(int i, int i2, int i3, int i4) {
        this.corePoolSize = i;
        this.maximumPoolSize = i2;
        this.keepAliveTime = i3;
        this.threadPriority = i4;
    }
}
