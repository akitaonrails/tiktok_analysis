package com.bytedance.applog.priority;

import kotlin.Pair;

/* JADX INFO: loaded from: classes35.dex */
public interface PriorityCallback {
    boolean allowIsolateReport(String str, String str2);

    PriorityHttpResponse doHttpPost(String str, byte[] bArr, Pair<String, String> pair);

    String getHeaderJson();

    boolean isMonitorEnabled();

    boolean isNetworkAvailable();

    boolean isStageEnabled();

    String isolateKey();

    void monitorError(String str, String str2);

    void monitorIncreaseStats(String str, int i);

    void monitorLatency(int i, int i2, int i3);

    void monitorStage(String str, String str2, int i, int i2, String str3, String str4, long j);

    void printLog(int i, String str);
}
