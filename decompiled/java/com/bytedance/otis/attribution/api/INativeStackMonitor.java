package com.bytedance.otis.attribution.api;

import java.io.File;

/* JADX INFO: loaded from: classes35.dex */
public interface INativeStackMonitor {
    void addListener(File file, String str, INativeStackMonitorCallback iNativeStackMonitorCallback);

    long getCurrentTimeMs(String str);

    void start(String str);

    void stop(String str);
}
