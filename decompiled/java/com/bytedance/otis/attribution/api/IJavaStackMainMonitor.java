package com.bytedance.otis.attribution.api;

import X.C1777610wMJ;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes35.dex */
public interface IJavaStackMainMonitor {
    ArrayList<C1777610wMJ> getStack(byte[] bArr);

    int getStageCount();

    long getStartTime();

    void reset();

    void setListener(IJavaStackMainMonitorCallback iJavaStackMainMonitorCallback);

    void setStageCount(int i);

    void start(String str, boolean z);

    void stop(boolean z);
}
