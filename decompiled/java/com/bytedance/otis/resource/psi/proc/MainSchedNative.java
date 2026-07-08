package com.bytedance.otis.resource.psi.proc;

import X.C2185091AfT;
import X.C786410Ut5;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes34.dex */
public final class MainSchedNative {
    public static final boolean LIZ;
    public static volatile boolean LIZIZ;
    public static final C2185091AfT LIZJ = new ThreadLocal<long[]>() { // from class: X.1AfT
        @Override // java.lang.ThreadLocal
        public final long[] initialValue() {
            return new long[3];
        }
    };

    public static native boolean initGcHooksNative(int i, int i2);

    public static native boolean queryGcUnionNative(long j, long j2, long[] jArr);

    public static native boolean readMainSchedNative(int i, long[] jArr);

    public static native boolean readSchedstatJniNative(int i, long[] jArr);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1AfT] */
    static {
        boolean z;
        try {
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper != null) {
                mainLooper.getThread();
                C786410Ut5.u3();
            }
            System.loadLibrary("resource_psi");
            z = true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            z = false;
        }
        LIZ = z;
    }

    public static void LIZ(int i) {
        if (!LIZ || LIZIZ) {
            return;
        }
        synchronized (MainSchedNative.class) {
            try {
                if (LIZIZ) {
                    return;
                }
                try {
                    initGcHooksNative(i, Build.VERSION.SDK_INT);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                LIZIZ = true;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    public static boolean LIZJ(int i, long[] jArr) {
        if (LIZ && jArr.length >= 7) {
            try {
                return readMainSchedNative(i, jArr);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return false;
    }

    public static boolean LIZLLL(int i, long[] jArr) {
        if (LIZ && jArr.length >= 3) {
            try {
                return readSchedstatJniNative(i, jArr);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return false;
    }

    public static boolean LIZIZ(long j, long j2, long[] jArr) {
        if (LIZ && jArr.length >= 3 && j2 > j) {
            LIZ(Process.myPid());
            try {
                return queryGcUnionNative(j, j2, jArr);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return false;
            }
        }
        return false;
    }
}
