package com.bytedance.applog.log;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes35.dex */
public class NativeLogWrapper {
    public static void LIZ() {
        try {
            nativeSetLogEnable(true);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static native void nativeSetLogEnable(boolean z);
}
