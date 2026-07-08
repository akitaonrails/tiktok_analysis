package com.bytedance.otis.attribution.api;

/* JADX INFO: loaded from: classes35.dex */
public interface IJarvisMonitorService {
    IJavaStackBackMonitor createJavaStackBackMonitor();

    IJavaStackMainMonitor createJavaStackMainMonitor(int i);

    INativeStackMonitor createNativeStackMonitor();

    void initJarvisJavaMonitor();

    String[] symbolize(long[] jArr);
}
