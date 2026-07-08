package com.bytedance.crash;

/* JADX INFO: loaded from: classes14.dex */
public interface ICrashCallback {
    void onCrash(CrashType crashType, String str, Thread thread);
}
