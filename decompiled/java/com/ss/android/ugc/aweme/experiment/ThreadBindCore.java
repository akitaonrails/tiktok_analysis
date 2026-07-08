package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class ThreadBindCore {

    @C09CT("bind_cpu_set")
    public int bindCore;

    @C09CT("thread_name")
    public String threadName;

    public ThreadBindCore() {
        this("", 0);
    }

    public final void setBindCore(int i) {
        this.bindCore = i;
    }

    public final void setThreadName(String str) {
        this.threadName = str;
    }

    public ThreadBindCore(String str, int i) {
        this.threadName = str;
        this.bindCore = i;
    }
}
