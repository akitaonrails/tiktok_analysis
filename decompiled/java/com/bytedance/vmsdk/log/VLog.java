package com.bytedance.vmsdk.log;

import X.C1339180kxA;
import X.C1960007m2;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;

/* JADX INFO: loaded from: classes21.dex */
public class VLog {
    public static long alogNativePtr = 0;
    public static int[] sNativeLevelMap = null;
    public static int sNativeMinLogLevel = 6;
    public static int sTryCounts;

    public static native void nativeInitALogNative(long j, boolean z);

    public static native void nativeInternalLog(int i, String str, String str2);

    public static native void nativeSetNativeMinLogLevel(int i);

    public static void onEnvReady() {
        setMinimumLoggingLevel(4);
    }

    public static void initNativeLogLevelMap() {
        if (sNativeLevelMap == null) {
            sNativeLevelMap = new int[]{0, 0, -1, 0, 0, 1, 2, 3};
        }
    }

    public static boolean detectALogDependence() {
        long jLIZ = C1960007m2.LIZ();
        if (jLIZ != 0) {
            initALog(jLIZ);
            return true;
        }
        int i = sTryCounts + 1;
        sTryCounts = i;
        return i == 120;
    }

    public static void init() {
        try {
            onEnvReady();
            long jLIZ = C1960007m2.LIZ();
            if (jLIZ != 0) {
                initALog(jLIZ);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void loadALogDependency() {
        if (detectALogDependence()) {
            return;
        }
        new PthreadTimer("msdk/log/VLog").schedule(new C1339180kxA(0), 0L, 500L);
    }

    public static long getALogPtr() {
        return alogNativePtr;
    }

    public static void initALogLazy() {
        loadALogDependency();
    }

    public static void initALog(long j) {
        boolean z;
        if (Build.VERSION.SDK_INT > 24) {
            z = true;
        } else {
            z = false;
        }
        alogNativePtr = j;
        nativeInitALogNative(j, z);
    }

    public static void setMinimumLoggingLevel(int i) {
        try {
            initNativeLogLevelMap();
            nativeSetNativeMinLogLevel(sNativeLevelMap[i]);
            if (sNativeMinLogLevel != i) {
                sNativeMinLogLevel = i;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
            sNativeMinLogLevel = 6;
            nativeSetNativeMinLogLevel(sNativeLevelMap[6]);
        }
    }

    public static void d(String str, String str2) {
        internalLog(3, str, str2);
    }

    public static void e(String str, String str2) {
        internalLog(6, str, str2);
    }

    public static void i(String str, String str2) {
        internalLog(4, str, str2);
    }

    public static void v(String str, String str2) {
        internalLog(2, str, str2);
    }

    public static void w(String str, String str2) {
        internalLog(5, str, str2);
    }

    public static void internalLog(int i, String str, String str2) {
        try {
            nativeInternalLog(i, str, str2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
