package com.ss.ttlivestreamer.core.utils;

import X.C1266860j4W;
import X.C1267520j5a;
import X.C1269890j9P;
import X.C1269900j9Q;
import X.C1274040jG6;
import X.C1274070jG9;
import X.C1274080jGA;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1267010j4l;
import X.InterfaceC1269880j9O;
import android.content.Context;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import com.ss.ttlivestreamer.core.engine.MediaEngineFactory;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes21.dex */
public class AVLog {
    public static boolean mDisableKibanaLogs;
    public static boolean mDisableLogFile;
    public static boolean mDisableLogIODevice;
    public static InterfaceC1269880j9O mLiveStreamLogFilter;
    public static InterfaceC1267010j4l mLocalTestALogMonitor;
    public static InterfaceC1269880j9O mLogConsoleFilter;
    public static InterfaceC1269880j9O mLogIODeviceFilter;
    public static InterfaceC1269880j9O mLogKibanaDeviceFilter;
    public static int mLogLevel;
    public static Map<String, C1269890j9P> sRedundancyCheckerMap;
    public static InterfaceC1269880j9O traceLogFilter;

    public static boolean isDisableLogFile() {
        boolean zNativeIsDisableLogFile = Monitor.nativeIsDisableLogFile();
        mDisableLogFile = zNativeIsDisableLogFile;
        return zNativeIsDisableLogFile;
    }

    public static native void nativePrintln(int i, String str, String str2);

    public static native void nativeRefreshLogConfig(int i, int i2);

    public static native void nativeSetBefEffectLogLevel(int i);

    public static native void nativeSetPrintLevel(int i);

    public static void refreshAllNativeLogConfig() {
        refreshNativeLogConfig(0);
        refreshNativeLogConfig(1);
        refreshNativeLogConfig(2);
        refreshNativeLogConfig(3);
    }

    public static boolean enableLogToIODevice2() {
        return C1274040jG6.LIZ;
    }

    public static boolean isLogConsoleEnabled() {
        return mLogConsoleFilter != null && C1267520j5a.LIZ();
    }

    public static boolean isLogConsoleSet() {
        return mLogConsoleFilter != null;
    }

    public static boolean isLogIODeviceEnabled() {
        return (mDisableLogIODevice || mLogIODeviceFilter == null) ? false : true;
    }

    public static boolean isLogIODeviceSet() {
        return mLogIODeviceFilter != null;
    }

    public static boolean isLogKibanaDeviceSet() {
        return mLogKibanaDeviceFilter != null;
    }

    public static boolean isLogKibanaEnabled() {
        return (mDisableKibanaLogs || mLogKibanaDeviceFilter == null) ? false : true;
    }

    static {
        MediaEngineFactory.loadLibrary();
        mDisableLogFile = false;
        mDisableLogIODevice = false;
        mLogLevel = C1267520j5a.LIZ() ? 3 : 5;
        sRedundancyCheckerMap = new ConcurrentHashMap();
    }

    public static String getLogDeRedundancyString() {
        try {
            StackTraceElement stackTraceElement = ThreadMethodProxy.getStackTrace(C786410Ut5.u3())[3];
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(stackTraceElement.getFileName());
            sbLIZ.append(":");
            sbLIZ.append(stackTraceElement.getLineNumber());
            return C2188811AlT.LIZIZ(sbLIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static InterfaceC1269880j9O getConsoleFilter() {
        return mLogConsoleFilter;
    }

    public static int getLevel() {
        return mLogLevel;
    }

    public static InterfaceC1269880j9O getLogIODevice() {
        return mLogIODeviceFilter;
    }

    public static InterfaceC1269880j9O getLogKibanaDevice() {
        return mLogKibanaDeviceFilter;
    }

    public static InterfaceC1269880j9O getTraceLogFilter() {
        return traceLogFilter;
    }

    public static InterfaceC1267010j4l getmLocalTestALogMonitor() {
        return mLocalTestALogMonitor;
    }

    public static void debugTrace(Object... objArr) {
        String strLIZIZ;
        String str;
        String str2;
        if (C1267520j5a.LIZ()) {
            try {
                StackTraceElement stackTraceElement = ThreadMethodProxy.getStackTrace(C786410Ut5.u3())[3];
                String className = stackTraceElement.getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                int lineNumber = stackTraceElement.getLineNumber();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strSubstring);
                sbLIZ.append(e3.d);
                sbLIZ.append(ThreadMethodProxy.getStackTrace(C786410Ut5.u3())[3].getMethodName());
                sbLIZ.append(":");
                sbLIZ.append(lineNumber);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                strLIZIZ = "";
            }
            if (objArr != null) {
                for (int i = 0; i < objArr.length; i++) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(strLIZIZ);
                    if (i == 0) {
                        str = " (";
                    } else {
                        str = ", ";
                    }
                    sbLIZ2.append(str);
                    sbLIZ2.append(objArr[i]);
                    if (i != objArr.length - 1) {
                        str2 = "";
                    } else {
                        str2 = ")";
                    }
                    sbLIZ2.append(str2);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                }
            }
        }
    }

    public static void disableKibanaLogs(boolean z) {
        if (C1267520j5a.LIZ()) {
            Monitor.nativeWriteLog("AVLog", 3, "Can not disableKibanaLogs in debug mode.");
            return;
        }
        InterfaceC1269880j9O interfaceC1269880j9O = mLogKibanaDeviceFilter;
        if (interfaceC1269880j9O != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AVLog:disableKibanaLogs : ");
            sbLIZ.append(z);
            interfaceC1269880j9O.LIZ(5, "AVLog", C2188811AlT.LIZIZ(sbLIZ), null);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("AVLog:disableKibanaLogs,disable:");
        sbLIZ2.append(z);
        Exception exc = new Exception(C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Cause: ");
        sbLIZ3.append(exc.getMessage());
        sbLIZ3.append("\n");
        sbLIZ3.append(Log.getStackTraceString(exc));
        Monitor.nativeWriteLog("AVLog", 3, C2188811AlT.LIZIZ(sbLIZ3));
        mDisableKibanaLogs = z;
        refreshNativeLogConfig(2);
    }

    public static void disableLogFile(boolean z) {
        if (C1267520j5a.LIZ()) {
            Monitor.nativeWriteLog("AVLog", 3, "Can not disable LogFile in debug mode.");
            return;
        }
        InterfaceC1269880j9O interfaceC1269880j9O = mLogKibanaDeviceFilter;
        if (interfaceC1269880j9O != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AVLog:disableLogIODevice : ");
            sbLIZ.append(z);
            interfaceC1269880j9O.LIZ(5, "AVLog", C2188811AlT.LIZIZ(sbLIZ), null);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("AVLog:disableLogFile,disable:");
        sbLIZ2.append(z);
        Exception exc = new Exception(C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Cause: ");
        sbLIZ3.append(exc.getMessage());
        sbLIZ3.append("\n");
        sbLIZ3.append(Log.getStackTraceString(exc));
        Monitor.nativeWriteLog("AVLog", 3, C2188811AlT.LIZIZ(sbLIZ3));
        Monitor.disableLogFile(z);
        mDisableLogFile = z;
    }

    public static void disableLogIODevice(boolean z) {
        if (C1267520j5a.LIZ()) {
            Monitor.nativeWriteLog("AVLog", 3, "Can not disableLogIODevice in debug mode.");
            return;
        }
        InterfaceC1269880j9O interfaceC1269880j9O = mLogKibanaDeviceFilter;
        if (interfaceC1269880j9O != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AVLog:disableLogIODevice : ");
            sbLIZ.append(z);
            interfaceC1269880j9O.LIZ(5, "AVLog", C2188811AlT.LIZIZ(sbLIZ), null);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("AVLog:disableLogIODevice,disable:");
        sbLIZ2.append(z);
        Exception exc = new Exception(C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Cause: ");
        sbLIZ3.append(exc.getMessage());
        sbLIZ3.append("\n");
        sbLIZ3.append(Log.getStackTraceString(exc));
        Monitor.nativeWriteLog("AVLog", 3, C2188811AlT.LIZIZ(sbLIZ3));
        mDisableLogIODevice = z;
        refreshNativeLogConfig(0);
    }

    public static boolean isLogConsoleEnabled(int i) {
        if (isLogConsoleEnabled() && i >= mLogLevel) {
            return true;
        }
        return false;
    }

    public static boolean isLogIODeviceEnabled(int i) {
        if (isLogIODeviceEnabled() && i >= mLogLevel) {
            return true;
        }
        return false;
    }

    public static void refreshNativeLogConfig(int i) {
        int i2 = 8;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        i2 = 0;
                    } else if (enableLogToIODevice2()) {
                        i2 = mLogLevel;
                    }
                } else if (isLogKibanaEnabled()) {
                    i2 = 2;
                }
            } else if (isLogConsoleEnabled()) {
                i2 = mLogLevel;
            }
        } else if (isLogIODeviceEnabled()) {
            i2 = mLogLevel;
        }
        nativeRefreshLogConfig(i, i2);
    }

    public static void setBefEffectLogLevel(int i) {
        nativeSetBefEffectLogLevel(i);
    }

    public static void setLevel(int i) {
        mLogLevel = i;
        nativeSetPrintLevel(i);
        refreshAllNativeLogConfig();
    }

    public static void setmLocalTestALogMonitor(InterfaceC1267010j4l interfaceC1267010j4l) {
        mLocalTestALogMonitor = interfaceC1267010j4l;
    }

    public static InterfaceC1269880j9O setupConsole(InterfaceC1269880j9O interfaceC1269880j9O) {
        InterfaceC1269880j9O interfaceC1269880j9O2 = mLogConsoleFilter;
        mLogConsoleFilter = interfaceC1269880j9O;
        refreshNativeLogConfig(1);
        return interfaceC1269880j9O2;
    }

    public static void setupLiveStreamLogFilter(InterfaceC1269880j9O interfaceC1269880j9O) {
        mLiveStreamLogFilter = interfaceC1269880j9O;
    }

    public static InterfaceC1269880j9O setupLogIODevice(InterfaceC1269880j9O interfaceC1269880j9O) {
        InterfaceC1269880j9O interfaceC1269880j9O2 = mLogIODeviceFilter;
        mLogIODeviceFilter = interfaceC1269880j9O;
        refreshNativeLogConfig(0);
        return interfaceC1269880j9O2;
    }

    public static InterfaceC1269880j9O setupLogKibanaDevice(InterfaceC1269880j9O interfaceC1269880j9O) {
        InterfaceC1269880j9O interfaceC1269880j9O2 = mLogKibanaDeviceFilter;
        mLogKibanaDeviceFilter = interfaceC1269880j9O;
        refreshNativeLogConfig(2);
        return interfaceC1269880j9O2;
    }

    public static void setupTraceLogFilter(InterfaceC1269880j9O interfaceC1269880j9O) {
        traceLogFilter = interfaceC1269880j9O;
    }

    public static int checkRedundancy(String str, int i) {
        if (!TextUtils.isEmpty(str) && i > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (!sRedundancyCheckerMap.containsKey(str)) {
                sRedundancyCheckerMap.put(str, new C1269890j9P());
            }
            C1269890j9P c1269890j9P = sRedundancyCheckerMap.get(str);
            if (c1269890j9P != null) {
                int i2 = c1269890j9P.LIZIZ + 1;
                c1269890j9P.LIZIZ = i2;
                if (jCurrentTimeMillis - c1269890j9P.LIZ >= i) {
                    c1269890j9P.LIZIZ = 0;
                    c1269890j9P.LIZ = jCurrentTimeMillis;
                    return i2;
                }
            }
        }
        return -1;
    }

    public static void d(String str, String str2) {
        if (C1267520j5a.LIZ()) {
            nativePrintln(3, str, str2);
        }
    }

    public static void e(String str, String str2) {
        if (C1267520j5a.LIZ()) {
            nativePrintln(6, str, str2);
        }
    }

    public static void i(String str, String str2) {
        if (C1267520j5a.LIZ()) {
            nativePrintln(4, str, str2);
        }
    }

    public static void initLogFile(Context context, int i) {
        Monitor.initLogFile(context, i);
    }

    public static void iod(String str, String str2) {
        logToIODeviceInternal(3, str, str2, null);
    }

    public static void ioe(String str, String str2) {
        logToIODeviceInternal(6, str, str2, null);
    }

    public static void ioi(String str, String str2) {
        logToIODeviceInternal(4, str, str2, null);
    }

    public static void iov(String str, String str2) {
        logToIODeviceInternal(2, str, str2, null);
    }

    public static void iow(String str, String str2) {
        logToIODeviceInternal(5, str, str2, null);
    }

    public static void logApiCall(String str, JSONObject jSONObject) {
        InterfaceC1269880j9O interfaceC1269880j9O = mLogKibanaDeviceFilter;
        if (interfaceC1269880j9O != null) {
            interfaceC1269880j9O.LIZLLL(str, jSONObject);
        }
        InterfaceC1267010j4l interfaceC1267010j4l = mLocalTestALogMonitor;
        if (interfaceC1267010j4l != null) {
            C1266860j4W c1266860j4W = (C1266860j4W) interfaceC1267010j4l;
            c1266860j4W.getClass();
            try {
                jSONObject.put("logType", str);
                c1266860j4W.LIZ.LLJLILLLLZIIL(jSONObject);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static void v(String str, String str2) {
        if (C1267520j5a.LIZ()) {
            nativePrintln(2, str, str2);
        }
    }

    public static void w(String str, String str2) {
        if (C1267520j5a.LIZ()) {
            nativePrintln(5, str, str2);
        }
    }

    public static void ioe(String str, String str2, Throwable th) {
        logToIODeviceInternal(6, str, str2, th);
    }

    public static void logApiCall(String str, String str2, JSONObject jSONObject) {
        InterfaceC1269880j9O interfaceC1269880j9O = mLiveStreamLogFilter;
        if (interfaceC1269880j9O != null) {
            interfaceC1269880j9O.LIZJ(str, str2, jSONObject);
        }
    }

    public static void logKibana(int i, String str, String str2, Throwable th) {
        InterfaceC1269880j9O interfaceC1269880j9O = mLogKibanaDeviceFilter;
        if (interfaceC1269880j9O != null && !mDisableKibanaLogs) {
            interfaceC1269880j9O.LIZ(i, str, str2, th);
        }
        logToIODeviceInternal(i, str, str2, th);
    }

    public static void logToConsole(int i, String str, String str2, Throwable th) {
        if (i < mLogLevel) {
            return;
        }
        InterfaceC1269880j9O interfaceC1269880j9O = mLogConsoleFilter;
        if (interfaceC1269880j9O != null) {
            interfaceC1269880j9O.LIZ(i, str, str2, th);
        } else {
            if (!C1267520j5a.LIZ() || i != 7) {
                return;
            }
            Log.wtf(str, str2, th);
        }
    }

    public static void logToIODevice(int i, String str, String str2, Throwable th) {
        logToIODeviceInternal(i, str, str2, th);
    }

    public static void logToIODeviceInternal(int i, String str, String str2, Throwable th) {
        String stackTraceString;
        InterfaceC1267010j4l interfaceC1267010j4l = mLocalTestALogMonitor;
        if (interfaceC1267010j4l != null) {
            C1266860j4W c1266860j4W = (C1266860j4W) interfaceC1267010j4l;
            c1266860j4W.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("logType", str);
                jSONObject.put("logMessage", str2);
                c1266860j4W.LIZ.LLJLILLLLZIIL(jSONObject);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (!mDisableLogFile) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            if (th != null) {
                stackTraceString = Log.getStackTraceString(th);
            } else {
                stackTraceString = "";
            }
            sbLIZ.append(stackTraceString);
            Monitor.nativeWriteLog(str, i, C2188811AlT.LIZIZ(sbLIZ));
        }
        if (i >= mLogLevel && !mDisableLogIODevice) {
            InterfaceC1269880j9O interfaceC1269880j9O = mLogIODeviceFilter;
            if (interfaceC1269880j9O != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(e3.e);
                sbLIZ2.append(i);
                sbLIZ2.append("] ");
                sbLIZ2.append(str2);
                interfaceC1269880j9O.LIZ(5, str, C2188811AlT.LIZIZ(sbLIZ2), th);
                return;
            }
            logToConsole(i, str, str2, th);
        }
    }

    public static void logToConsoleEvent(int i, String str, String str2, String str3, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append(" ");
        sbLIZ.append(str3);
        logToConsole(i, str, C2188811AlT.LIZIZ(sbLIZ), th);
    }

    public static void logToIODeviceEvent(int i, String str, String str2, String str3, Throwable th) {
        if (isLogIODeviceEnabled(i)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append(" ");
            sbLIZ.append(str3);
            logToIODeviceInternal(i, str, C2188811AlT.LIZIZ(sbLIZ), th);
        }
    }

    public static void logKibanaEvent(int i, String str, String str2, boolean z, String str3, Throwable th) {
        InterfaceC1269880j9O interfaceC1269880j9O = mLogKibanaDeviceFilter;
        if (interfaceC1269880j9O != null) {
            interfaceC1269880j9O.LIZIZ(i, str, str2, str3, th);
        }
        if (z) {
            logToIODeviceEvent(i, str, str2, str3, th);
        }
    }

    public static int logToIODevice2(int i, String str, String str2, Throwable th, int i2, int i3) {
        if (i2 < 67 && i2 >= 0) {
            int[] iArr = C1269900j9Q.LIZ;
            iArr[i2] = iArr[i2] + 1;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long[] jArr = C1269900j9Q.LIZIZ;
            if (jCurrentTimeMillis - jArr[i2] > i3) {
                jArr[i2] = jCurrentTimeMillis;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[repeat ");
                sbLIZ.append(iArr[i2]);
                sbLIZ.append(" times] ");
                sbLIZ.append(str2);
                logToIODeviceInternal(i, str, C2188811AlT.LIZIZ(sbLIZ), th);
                iArr[i2] = 0;
            }
            return iArr[i2];
        }
        AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("over count!!!", th);
        C1274070jG9 c1274070jG9 = C1274080jGA.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("AVLog2.logToIODevice2(");
        sbLIZ2.append(i2);
        sbLIZ2.append(")");
        c1274070jG9.LIZ(C2188811AlT.LIZIZ(sbLIZ2), androidRuntimeException);
        if (!C1274040jG6.LIZ()) {
            return -1;
        }
        throw androidRuntimeException;
    }

    public static int logToIODeviceCheckRedundancy(int i, String str, String str2, Throwable th, String str3, int i2) {
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
            logToIODeviceInternal(i, str, str2, th);
        }
        return iCheckRedundancy;
    }
}
