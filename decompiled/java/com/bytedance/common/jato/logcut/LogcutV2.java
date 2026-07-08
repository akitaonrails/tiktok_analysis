package com.bytedance.common.jato.logcut;

import X.C2104908Ml;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes27.dex */
public class LogcutV2 {
    public static int LIZ;
    public static LogcutV2 LIZIZ;

    public static native int initLogCutInternal(int i, int i2);

    public native void startLogcut(int i);

    public native void stopLogcut();

    public static LogcutV2 LIZ() {
        if (LIZIZ == null) {
            synchronized (LogcutV2.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new LogcutV2();
                        try {
                            initLogCutInternal(LIZ, Build.VERSION.SDK_INT);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    static {
        C2104908Ml.LIZIZ();
        LIZ = 3;
        LIZIZ = null;
    }
}
