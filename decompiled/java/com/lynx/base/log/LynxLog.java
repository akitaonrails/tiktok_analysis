package com.lynx.base.log;

import X.C0W9U;
import X.C0W9W;
import X.C1285920jZG;
import X.C1C7U;
import X.C2179971ATj;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.LynxBaseEnv;
import com.lynx.tasm.service.ILynxLogService;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;

/* JADX INFO: loaded from: classes21.dex */
public class LynxLog {
    public static int sALogMinLogLevel = 2;
    public static AbsBaseLogDelegate sDebugLoggingDelegate;
    public static boolean sIsJSLogsFromExternalChannelsOpen;
    public static boolean sIsNativeLibLoad;
    public static int sTryCounts;
    public static ILynxLogService service;

    public static void DCHECK(boolean z) {
    }

    public static void DTHROW() {
        DTHROW(null);
    }

    public static void DTHROW(RuntimeException runtimeException) {
    }

    public static void logByAndroidUtil(int i, String str, String str2) {
    }

    public static native void nativeInitALogNative(long j);

    public static native void nativeInitLynxLoggingNative(boolean z);

    public static native void nativeInternalLog(int i, String str, String str2);

    public static native void nativeSetLogOutputByPlatform();

    public static native void nativeSetNativeMinLogLevel(int i);

    public static void setLogOutputChannel() {
        ILynxLogService iLynxLogService = service;
        if (iLynxLogService == null || !iLynxLogService.isLogOutputByPlatform()) {
            return;
        }
        nativeSetLogOutputByPlatform();
    }

    public static void asyncInitLynxNativeLog() {
        if (detectALogDependence()) {
            return;
        }
        final PthreadTimer pthreadTimer = new PthreadTimer("e/log/LynxLog");
        pthreadTimer.schedule(new C0W9W() { // from class: com.lynx.base.log.LynxLog.1
            private void bpea_origin_timer_run() {
                com_lynx_base_log_LynxLog$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                C1C7U.LIZ("LynxLog@e979.asyncInitLynxNativeLog$1");
                boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
                try {
                    bpea_origin_timer_run();
                    if (zLJ) {
                        C0W9U.LJFF();
                    }
                    C1C7U.LIZIZ("LynxLog@e979.asyncInitLynxNativeLog$1");
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (zLJ) {
                        C0W9U.LJFF();
                    }
                    throw th;
                }
            }

            public void com_lynx_base_log_LynxLog$1__run$___twin___() {
                if (LynxLog.detectALogDependence()) {
                    cancel();
                    pthreadTimer.cancel();
                }
            }

            public static void com_lynx_base_log_LynxLog$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                try {
                    anonymousClass1.com_lynx_base_log_LynxLog$1__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        }, 0L, 500L);
    }

    public static boolean detectALogDependence() {
        ILynxLogService iLynxLogService = (ILynxLogService) C1285920jZG.LIZJ().LIZ(ILynxLogService.class);
        service = iLynxLogService;
        long defaultWriteFunction = iLynxLogService != null ? iLynxLogService.getDefaultWriteFunction() : 0L;
        if (defaultWriteFunction != 0) {
            nativeInitALogNative(defaultWriteFunction);
            return true;
        }
        int i = sTryCounts + 1;
        sTryCounts = i;
        return i >= 120;
    }

    public static int getMinimumLoggingLevel() {
        return sALogMinLogLevel;
    }

    public static void initLynxLog(boolean z) {
        try {
            if (!sIsNativeLibLoad) {
                sIsNativeLibLoad = LynxBaseEnv.inst().isNativeLibraryLoaded();
            }
            if (sIsNativeLibLoad) {
                initLynxLogging(z);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void initLynxLogging(boolean z) {
        nativeInitLynxLoggingNative(z);
        asyncInitLynxNativeLog();
        setLogOutputChannel();
    }

    public static void setDebugLoggingDelegate(AbsBaseLogDelegate absBaseLogDelegate) {
        sDebugLoggingDelegate = absBaseLogDelegate;
    }

    public static void setJSLogsFromExternalChannels(boolean z) {
        sIsJSLogsFromExternalChannelsOpen = z;
    }

    public static void setMinimumLoggingLevel(int i) {
        try {
            if (!sIsNativeLibLoad) {
                sIsNativeLibLoad = LynxBaseEnv.inst().isNativeLibraryLoaded();
            }
            if (sIsNativeLibLoad && sALogMinLogLevel < i) {
                sALogMinLogLevel = i;
                nativeSetNativeMinLogLevel(i);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void d(String str, String str2) {
        internalLog(1, str, str2);
    }

    public static void e(String str, String str2) {
        internalLog(4, str, str2);
    }

    public static void i(String str, String str2) {
        internalLog(2, str, str2);
    }

    public static void v(String str, String str2) {
        internalLog(0, str, str2);
    }

    public static void w(String str, String str2) {
        internalLog(3, str, str2);
    }

    public static void internalLog(int i, String str, String str2) {
        if (str2 != null && str != null) {
            logByDebugLoggingDelegate(i, str, str2);
            try {
                if (!sIsNativeLibLoad) {
                    boolean zIsNativeLibraryLoaded = LynxBaseEnv.inst().isNativeLibraryLoaded();
                    sIsNativeLibLoad = zIsNativeLibraryLoaded;
                    if (!zIsNativeLibraryLoaded) {
                        logByAndroidUtil(i, str, str2);
                        return;
                    }
                }
                if (i >= sALogMinLogLevel) {
                    ILynxLogService iLynxLogService = service;
                    if (iLynxLogService != null && iLynxLogService.isLogOutputByPlatform()) {
                        service.logByPlatform(i, str, str2);
                    } else {
                        nativeInternalLog(i, str, str2);
                    }
                }
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static void logByDebugLoggingDelegate(int i, String str, String str2) {
        AbsBaseLogDelegate absBaseLogDelegate = sDebugLoggingDelegate;
        if (absBaseLogDelegate == null) {
            return;
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            absBaseLogDelegate.e(str, str2);
                            return;
                        }
                        return;
                    }
                    absBaseLogDelegate.w(str, str2);
                    return;
                }
                absBaseLogDelegate.i(str, str2);
                return;
            }
            absBaseLogDelegate.d(str, str2);
            return;
        }
        absBaseLogDelegate.v(str, str2);
    }

    public static void log(int i, String str, String str2, int i2, long j, int i3, int i4) {
        if (i > 4) {
            i = 4;
        }
        try {
            ILynxLogService iLynxLogService = service;
            if (iLynxLogService != null && iLynxLogService.isLogOutputByPlatform()) {
                service.logByPlatform(i, str, str2);
            }
            logByDebugLoggingDelegate(i, str, str2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void logByte(int i, String str, byte[] bArr, int i2, long j, int i3, int i4) {
        log(i, str, new String(bArr), i2, j, i3, i4);
    }
}
