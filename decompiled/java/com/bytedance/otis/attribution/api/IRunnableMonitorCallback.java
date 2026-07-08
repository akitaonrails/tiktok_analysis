package com.bytedance.otis.attribution.api;

import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes14.dex */
public interface IRunnableMonitorCallback {
    void onLongRunnableCallback(ConcurrentLinkedQueue<RunnableInfoData> concurrentLinkedQueue);
}
