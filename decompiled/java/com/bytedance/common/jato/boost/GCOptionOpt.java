package com.bytedance.common.jato.boost;

import X.C2104908Ml;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes34.dex */
public class GCOptionOpt {
    public static GCOptionOpt LIZ;
    public static boolean LIZIZ;

    public static native int adjustGCOption(int i, long j, long j2);

    public static native int adjustGCOptionEnd(int i, boolean z, boolean z2);

    public static native int adjustGCOptionStart(int i, boolean z, long j, boolean z2, long j2);

    public static GCOptionOpt LIZLLL() {
        if (LIZ == null) {
            synchronized (GCOptionOpt.class) {
                try {
                    if (LIZ == null) {
                        LIZ = new GCOptionOpt();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZ;
    }

    public final synchronized void LIZ(boolean z, boolean z2) {
        if (C2104908Ml.LIZIZ()) {
            adjustGCOptionEnd(Build.VERSION.SDK_INT, z, z2);
        }
    }

    public final synchronized void LIZIZ(long j, long j2) {
        if (C2104908Ml.LIZIZ() && !LIZIZ) {
            adjustGCOption(Build.VERSION.SDK_INT, j, j2);
            LIZIZ = true;
        }
    }

    public final synchronized void LIZJ(long j, long j2, boolean z, boolean z2) {
        if (C2104908Ml.LIZIZ()) {
            adjustGCOptionStart(Build.VERSION.SDK_INT, z, j, z2, j2);
        }
    }
}
