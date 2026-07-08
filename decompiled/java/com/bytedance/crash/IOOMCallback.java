package com.bytedance.crash;

/* JADX INFO: loaded from: classes14.dex */
public interface IOOMCallback {
    void onCrash(CrashType crashType, Throwable th, Thread thread, long j);
}
