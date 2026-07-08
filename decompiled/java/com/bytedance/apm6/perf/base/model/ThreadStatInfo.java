package com.bytedance.apm6.perf.base.model;

/* JADX INFO: loaded from: classes14.dex */
public class ThreadStatInfo {
    public long threadCpuTime;
    public String threadName;

    public ThreadStatInfo(String str, long j) {
        this.threadName = str;
        this.threadCpuTime = j;
    }
}
