package com.bytedance.otis.attribution.api;

/* JADX INFO: loaded from: classes14.dex */
public interface IRunnableMonitor {
    void setListener(IRunnableMonitorCallback iRunnableMonitorCallback);

    void start(boolean z);

    void stop();
}
