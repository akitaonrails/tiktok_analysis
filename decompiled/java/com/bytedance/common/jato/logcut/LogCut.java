package com.bytedance.common.jato.logcut;

import X.C07TK;
import X.C2188811AlT;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class LogCut {
    public static int LOGCUT_ALL_LOG = 20002;
    public static int LOGCUT_JNI_LOG = 20001;
    public static int LOGCUT_NATIVE_LOG = 20000;
    public static String TAG = "LogCut";
    public static volatile boolean sIsLoadError = false;
    public static volatile boolean sIsLoaded = false;
    public static C07TK sMonitor = null;
    public static int sType = 20002;

    public static native int initLogCutInternal(int i, int i2);

    public static native void logCutStartInternal();

    public static native void logCutStopInternal();

    public static boolean checkEnable() {
        return sIsLoaded && !sIsLoadError;
    }

    public static void logCutStart() {
        if (checkEnable()) {
            logCutStartInternal();
        }
    }

    public static void logCutStop() {
        if (checkEnable()) {
            logCutStopInternal();
        }
    }

    public static void initLogCut(int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 > 32) {
            return;
        }
        if (sType != i) {
            sIsLoaded = false;
            sIsLoadError = false;
        }
        if (!sIsLoaded && !sIsLoadError) {
            try {
                int iInitLogCutInternal = initLogCutInternal(i, i2);
                if (iInitLogCutInternal != 0) {
                    C07TK c07tk = sMonitor;
                    if (c07tk != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("logcut init failed:");
                        sbLIZ.append(iInitLogCutInternal);
                        C2188811AlT.LIZIZ(sbLIZ);
                        c07tk.LIZ();
                    }
                    sIsLoadError = true;
                }
                sIsLoaded = true;
                sType = i;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static void setMonitor(C07TK c07tk) {
        sMonitor = c07tk;
    }
}
