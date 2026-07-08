package com.ss.pusher.core.utils;

import X.C1279100jOG;
import X.C2188811AlT;
import X.InterfaceC1279060jOC;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.ss.pusher.core.engine.MediaEngineFactory;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes21.dex */
public class AVLog {
    public static Map<String, Integer> logIOMap;
    public static final int[] logIOMapKeysCount = new int[75];
    public static final long[] logIOMapKeysInterval = new long[75];
    public static boolean mDisableLogFile;
    public static InterfaceC1279060jOC mLogConsoleFilter;
    public static InterfaceC1279060jOC mLogIODeviceFilter;
    public static InterfaceC1279060jOC mLogKibanaDeviceFilter;
    public static int mLogLevel;
    public static final Map<String, C1279100jOG> sRedundancyCheckerMap;

    public static void initLogFile(Context context, int i) {
    }

    public static native void nativePrintln(int i, String str, String str2);

    public static native void nativeSetPrintLevel(int i);

    static {
        MediaEngineFactory.LIZJ();
        mDisableLogFile = false;
        mLogLevel = 6;
        sRedundancyCheckerMap = new ConcurrentHashMap();
    }

    public static boolean isLogKibanaDeviceSet() {
        return mLogKibanaDeviceFilter != null;
    }

    public static boolean isLogKibanaDeviceSetFromExternal() {
        InterfaceC1279060jOC interfaceC1279060jOC = mLogKibanaDeviceFilter;
        return interfaceC1279060jOC != null && interfaceC1279060jOC.getType() == 0;
    }

    public static int getLevel() {
        return mLogLevel;
    }

    public static InterfaceC1279060jOC getLogKibanaDevice() {
        return mLogKibanaDeviceFilter;
    }

    public static void disableLogFile(boolean z) {
        InterfaceC1279060jOC interfaceC1279060jOC = mLogKibanaDeviceFilter;
        if (interfaceC1279060jOC != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AVLog:disableLogIODevice : ");
            sbLIZ.append(z);
            interfaceC1279060jOC.LIZ(5, "AVLog", C2188811AlT.LIZIZ(sbLIZ), null);
        }
        Monitor.nativeDisableLogFile(z);
        mDisableLogFile = z;
    }

    public static void setLevel(int i) {
        mLogLevel = i;
        nativeSetPrintLevel(i);
    }

    public static InterfaceC1279060jOC setupLogKibanaDevice(InterfaceC1279060jOC interfaceC1279060jOC) {
        InterfaceC1279060jOC interfaceC1279060jOC2 = mLogKibanaDeviceFilter;
        mLogKibanaDeviceFilter = interfaceC1279060jOC;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setupLogKibanaDevice: ");
        sbLIZ.append(interfaceC1279060jOC);
        iod("AVLog", C2188811AlT.LIZIZ(sbLIZ));
        return interfaceC1279060jOC2;
    }

    public static int checkRedundancy(String str, int i) {
        if (!TextUtils.isEmpty(str) && i > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Map<String, C1279100jOG> map = sRedundancyCheckerMap;
            if (!map.containsKey(str)) {
                map.put(str, new C1279100jOG());
            }
            C1279100jOG c1279100jOG = map.get(str);
            if (c1279100jOG != null) {
                int i2 = c1279100jOG.LIZIZ + 1;
                c1279100jOG.LIZIZ = i2;
                if (jCurrentTimeMillis - c1279100jOG.LIZ >= i) {
                    c1279100jOG.LIZIZ = 0;
                    c1279100jOG.LIZ = jCurrentTimeMillis;
                    return i2;
                }
            }
        }
        return -1;
    }

    public static void d(String str, String str2) {
        if (mLogLevel <= 3) {
            nativePrintln(3, str, str2);
        }
    }

    public static void e(String str, String str2) {
        if (mLogLevel <= 6) {
            nativePrintln(6, str, str2);
        }
    }

    public static void i(String str, String str2) {
        if (mLogLevel <= 4) {
            nativePrintln(4, str, str2);
        }
    }

    public static void iod(String str, String str2) {
        logToIODevice(3, str, str2, null);
    }

    public static void ioe(String str, String str2) {
        logToIODevice(6, str, str2, null);
    }

    public static void ioi(String str, String str2) {
        logToIODevice(4, str, str2, null);
    }

    public static void iow(String str, String str2) {
        logToIODevice(5, str, str2, null);
    }

    public static void v(String str, String str2) {
        if (mLogLevel <= 2) {
            nativePrintln(2, str, str2);
        }
    }

    public static void w(String str, String str2) {
        if (mLogLevel <= 5) {
            nativePrintln(5, str, str2);
        }
    }

    public static void ioe(String str, String str2, Throwable th) {
        logToIODevice(6, str, str2, th);
    }

    public static void logKibana(int i, String str, String str2, Throwable th) {
        InterfaceC1279060jOC interfaceC1279060jOC = mLogKibanaDeviceFilter;
        if (interfaceC1279060jOC != null) {
            interfaceC1279060jOC.LIZ(i, str, str2, th);
        }
        logToIODevice(i, str, str2, th);
    }

    public static void logToConsole(int i, String str, String str2, Throwable th) {
        if (i < mLogLevel) {
            return;
        }
        InterfaceC1279060jOC interfaceC1279060jOC = mLogConsoleFilter;
        if (interfaceC1279060jOC != null) {
            interfaceC1279060jOC.LIZ(i, str, str2, th);
        } else {
            if (i != 7) {
                return;
            }
            Log.wtf(str, str2, th);
        }
    }

    public static void logToIODevice(int i, String str, String str2, Throwable th) {
        String stackTraceString;
        if (!mDisableLogFile) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            if (th != null) {
                stackTraceString = Log.getStackTraceString(th);
            } else {
                stackTraceString = "";
            }
            sbLIZ.append(stackTraceString);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        if (i < mLogLevel) {
            return;
        }
        InterfaceC1279060jOC interfaceC1279060jOC = mLogIODeviceFilter;
        if (interfaceC1279060jOC != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(e3.e);
            sbLIZ2.append(i);
            sbLIZ2.append("] ");
            sbLIZ2.append(str2);
            interfaceC1279060jOC.LIZ(5, str, C2188811AlT.LIZIZ(sbLIZ2), th);
            return;
        }
        logToConsole(i, str, str2, th);
    }

    public static void logToConsoleEvent(int i, String str, String str2, String str3, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append(" ");
        sbLIZ.append(str3);
        logToConsole(i, str, C2188811AlT.LIZIZ(sbLIZ), th);
    }

    public static void logToIODeviceEvent(int i, String str, String str2, String str3, Throwable th) {
        String stackTraceString;
        if (!mDisableLogFile) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str3);
            if (th != null) {
                stackTraceString = Log.getStackTraceString(th);
            } else {
                stackTraceString = "";
            }
            sbLIZ.append(stackTraceString);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        if (i < mLogLevel) {
            return;
        }
        InterfaceC1279060jOC interfaceC1279060jOC = mLogIODeviceFilter;
        if (interfaceC1279060jOC != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(e3.e);
            sbLIZ2.append(i);
            sbLIZ2.append("] ");
            sbLIZ2.append(str2);
            sbLIZ2.append(" ");
            sbLIZ2.append(str3);
            interfaceC1279060jOC.LIZ(5, str, C2188811AlT.LIZIZ(sbLIZ2), th);
            return;
        }
        logToConsole(i, str, str3, th);
    }

    public static void logKibanaEvent(int i, String str, String str2, boolean z, String str3, Throwable th) {
        InterfaceC1279060jOC interfaceC1279060jOC = mLogKibanaDeviceFilter;
        if (interfaceC1279060jOC != null) {
            interfaceC1279060jOC.LIZIZ(i, str, str2, str3, th);
        }
        if (z) {
            logToIODeviceEvent(i, str, str2, str3, th);
        }
    }

    public static void logKibanaEventJson(int i, String str, String str2, boolean z, String str3, Throwable th) {
        InterfaceC1279060jOC interfaceC1279060jOC = mLogKibanaDeviceFilter;
        if (interfaceC1279060jOC != null) {
            interfaceC1279060jOC.LIZJ(i, str, str2, str3, th);
        }
        if (z) {
            logToIODeviceEvent(i, str, str2, str3, th);
        }
    }

    public static int logToIODevice2(int i, String str, String str2, Throwable th, int i2, int i3) {
        if (i2 < 75 && i2 >= 0) {
            int[] iArr = logIOMapKeysCount;
            iArr[i2] = iArr[i2] + 1;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long[] jArr = logIOMapKeysInterval;
            if (jCurrentTimeMillis - jArr[i2] > i3) {
                jArr[i2] = jCurrentTimeMillis;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[repeat ");
                sbLIZ.append(iArr[i2]);
                sbLIZ.append(" times] ");
                sbLIZ.append(str2);
                logToIODevice(i, str, C2188811AlT.LIZIZ(sbLIZ), th);
                iArr[i2] = 0;
            }
            return iArr[i2];
        }
        return -1;
    }

    public static int logToIODevice2(int i, String str, String str2, Throwable th, String str3, int i2) {
        if (i < mLogLevel) {
            return -1;
        }
        int iCheckRedundancy = checkRedundancy(str3, i2);
        if (iCheckRedundancy > 0) {
            if (iCheckRedundancy > 1) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[repeat ");
                sbLIZ.append(iCheckRedundancy);
                sbLIZ.append(" times] ");
                sbLIZ.append(str2);
                str2 = C2188811AlT.LIZIZ(sbLIZ);
            }
            logToIODevice(i, str, str2, th);
        }
        return iCheckRedundancy;
    }
}
