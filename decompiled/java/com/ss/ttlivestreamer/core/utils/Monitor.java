package com.ss.ttlivestreamer.core.utils;

import X.C0VSJ;
import X.C2188811AlT;
import X.C786410Ut5;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.engine.MediaEngineFactory;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public class Monitor {
    public static TEBundle sMonitorDataBase = new TEBundle();
    public static boolean sInitLogDone = false;
    public static boolean sEnableCPULoadWithTop = false;

    public static native void nativeDisableLogFile(boolean z);

    public static native double nativeGetAppPrecentageOnCPU();

    public static native long nativeGetAppRSSKB();

    public static native long nativeGetAppVSSKB();

    public static native double nativeGetCPUPrecentage();

    public static native double nativeGetSystemPrecentageOnCPU();

    public static native int nativeGetThreadCount();

    public static native double nativeGetUserPrecentageOnCPU();

    public static native boolean nativeInitLogFile(String str, int i);

    public static native boolean nativeIsDisableLogFile();

    public static native void nativeWriteLog(String str, int i, String str2);

    public static TEBundle staticsCPUInfoOnTop(long j) {
        return null;
    }

    public Monitor() {
        MediaEngineFactory.getVersion();
    }

    public static double getAppPrecentageOnCPU() {
        return nativeGetAppPrecentageOnCPU() * 100.0d;
    }

    public static long getAppRSSKB() {
        return nativeGetAppRSSKB();
    }

    public static long getAppVSSKB() {
        return nativeGetAppVSSKB();
    }

    public static double getCPUPrecentage() {
        return nativeGetCPUPrecentage() * 100.0d;
    }

    public static double getSystemPrecentageOnCPU() {
        return nativeGetSystemPrecentageOnCPU() * 100.0d;
    }

    public static int getThreadCount() {
        return nativeGetThreadCount();
    }

    public static double getUserPrecentageOnCPU() {
        return nativeGetUserPrecentageOnCPU() * 100.0d;
    }

    public static boolean isDisableLogFile() {
        return nativeIsDisableLogFile();
    }

    public static void disableLogFile(boolean z) {
        nativeDisableLogFile(z);
    }

    public static void enableCPULoadStaticsWithTop(boolean z) {
        sEnableCPULoadWithTop = z;
    }

    public static void initLogFile(Context context, int i) {
        if (context == null) {
            return;
        }
        if (sInitLogDone) {
            nativeInitLogFile("", i);
            return;
        }
        String str = null;
        File fileY2 = C786410Ut5.y2(context, null);
        if (fileY2 == null) {
            return;
        }
        if (!fileY2.exists()) {
            try {
                fileY2.createNewFile();
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (fileY2.exists()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(fileY2.getAbsolutePath());
            sbLIZ.append("/ttlivestreamer.bin");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C0VSJ c0vsj = new C0VSJ(strLIZIZ);
            if (c0vsj.exists()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(fileY2.getAbsolutePath());
                sbLIZ2.append("/ttlivestreamer.old.bin");
                try {
                    c0vsj.renameTo(new C0VSJ(C2188811AlT.LIZIZ(sbLIZ2)));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                c0vsj = new C0VSJ(strLIZIZ);
            }
            if (!c0vsj.exists()) {
                try {
                    c0vsj.createNewFile();
                    str = strLIZIZ;
                } catch (IOException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            } else {
                str = strLIZIZ;
            }
        }
        if (!TextUtils.isEmpty(str)) {
            sInitLogDone = nativeInitLogFile(str, i);
        }
    }

    public static void writeLog(String str, int i, String str2) {
        nativeWriteLog(str, i, str2);
    }
}
