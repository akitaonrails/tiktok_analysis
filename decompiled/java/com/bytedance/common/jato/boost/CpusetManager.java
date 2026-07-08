package com.bytedance.common.jato.boost;

import X.C2104908Ml;
import X.C2117208Re;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class CpusetManager {
    public static int[] bigCoreNum;
    public static int[] littleCoreNum;
    public static final Object mInitLock = new Object();
    public static boolean mHasInited = false;

    public static void bindBigCore() {
        bindCore(-1, 2);
    }

    public static void bindLittleCore() {
        bindCore(-1, 1);
    }

    public static void resetCoreBind() {
        resetCoreBind(-1);
    }

    public static native void resetCpuSetTid(int i);

    public static native void setCpuSetTid(int i, int[] iArr);

    public static boolean isReady() {
        return (littleCoreNum == null || bigCoreNum == null) ? false : true;
    }

    public static void init() {
        boolean zLIZ = C2117208Re.LIZ();
        synchronized (mInitLock) {
            try {
                if (mHasInited) {
                    return;
                }
                if (zLIZ) {
                    littleCoreNum = C2117208Re.LIZ;
                    bigCoreNum = C2117208Re.LIZIZ;
                }
                mHasInited = true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void bindBigCore(int i) {
        bindCore(i, 2);
    }

    public static void bindLittleCore(int i) {
        bindCore(i, 1);
    }

    public static void resetCoreBind(int i) {
        if (!C2104908Ml.LIZIZ()) {
            return;
        }
        synchronized (mInitLock) {
            try {
                if (isReady()) {
                    resetCpuSetTid(i);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void bindCore(int i, int i2) {
        int[] iArr;
        if (!C2104908Ml.LIZIZ()) {
            return;
        }
        synchronized (mInitLock) {
            try {
                if (i2 == 2) {
                    iArr = bigCoreNum;
                } else if (i2 == 1) {
                    iArr = littleCoreNum;
                }
                if (iArr != null && isReady()) {
                    setCpuSetTid(i, iArr);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
