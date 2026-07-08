package com.ss.android.ugc.aweme.boost;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class ThreadPriorityConfig {

    @C09CT("thread_name")
    public final String threadName;

    @C09CT("thread_value_diff")
    public final int threadValueDiff;

    public ThreadPriorityConfig() {
        this("", 0);
    }

    public ThreadPriorityConfig(String str, int i) {
        this.threadName = str;
        this.threadValueDiff = i;
    }
}
