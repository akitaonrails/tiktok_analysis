package com.bytedance.otis.attribution.api;

import java.io.File;

/* JADX INFO: loaded from: classes35.dex */
public interface IJavaStackBackMonitor {
    void setListener(File file, IJavaStackBackMonitorCallback iJavaStackBackMonitorCallback);

    void start();

    void stop();
}
