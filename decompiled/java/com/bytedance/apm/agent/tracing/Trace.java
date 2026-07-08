package com.bytedance.apm.agent.tracing;

/* JADX INFO: loaded from: classes14.dex */
public class Trace {
    public String className;
    public long entryTime;
    public long exitTime;
    public String extraData;
    public String methodName;
    public String scene;
    public String traceType;

    public Trace() {
    }

    public void setExitTime(long j) {
        this.exitTime = j;
    }

    public void setExtraData(String str) {
        this.extraData = str;
    }

    public Trace(String str, String str2, long j, String str3) {
        this.className = str;
        this.methodName = str2;
        this.entryTime = j;
        this.traceType = str3;
    }

    public Trace(String str, String str2, String str3, long j, String str4) {
        this.scene = str;
        this.className = str2;
        this.methodName = str3;
        this.entryTime = j;
        this.traceType = str4;
    }
}
