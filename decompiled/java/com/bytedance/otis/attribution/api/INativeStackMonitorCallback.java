package com.bytedance.otis.attribution.api;

/* JADX INFO: loaded from: classes31.dex */
public interface INativeStackMonitorCallback {
    String getExtraInfo();

    String getStageInfo(long j);

    void onCallback(String str);
}
