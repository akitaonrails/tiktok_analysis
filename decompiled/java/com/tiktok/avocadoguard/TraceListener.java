package com.tiktok.avocadoguard;

/* JADX INFO: loaded from: classes4.dex */
public interface TraceListener {
    void onLoadLibrary(String str);

    void onLog(String str);

    void onTraceFinish();
}
