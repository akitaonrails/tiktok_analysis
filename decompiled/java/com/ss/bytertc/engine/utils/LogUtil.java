package com.ss.bytertc.engine.utils;

import X.C08FF;
import X.C2188811AlT;
import X.C786410Ut5;
import android.content.Context;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes21.dex */
public class LogUtil {
    public static AtomicReference<ILoggerSink> sLoggerSink = new AtomicReference<>();
    public static String sDeviceID = null;
    public static LogLevel sLogLevel = LogLevel.LOG_LEVEL_INFO;
    public static String sLogDir = null;

    public interface ILoggerSink {
        void onLoggerMessage(LogLevel logLevel, String str, Throwable th);
    }

    public static void setDebug(boolean z) {
    }

    public static ILoggerSink getLoggerSink() {
        return sLoggerSink.get();
    }

    public static String getDeviceID() {
        return sDeviceID;
    }

    public static LogLevel getLogLevel() {
        return sLogLevel;
    }

    public enum LogLevel {
        LOG_LEVEL_TRACE,
        LOG_LEVEL_DEBUG,
        LOG_LEVEL_INFO,
        LOG_LEVEL_WARNING,
        LOG_LEVEL_ERROR;

        public static LogLevel valueOf(String str) {
            return (LogLevel) C08FF.LIZ(LogLevel.class, str);
        }
    }

    public static String getLogDir(Context context) {
        String str = sLogDir;
        if (str != null) {
            return str;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C786410Ut5.y2(context, null));
        String str2 = File.separator;
        sbLIZ.append(str2);
        sbLIZ.append("RTCEngine");
        sbLIZ.append(str2);
        sbLIZ.append("Log");
        sbLIZ.append(str2);
        sbLIZ.append("logs");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        sLogDir = strLIZIZ;
        return strLIZIZ;
    }

    public static void setDeviceID(String str) {
        sDeviceID = str;
    }

    public static void setLogDir(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(File.separator);
        sbLIZ.append("logs");
        sLogDir = C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void setLogLevel(LogLevel logLevel) {
        sLogLevel = logLevel;
    }

    public static void setLoggerSink(ILoggerSink iLoggerSink) {
        if (iLoggerSink != null) {
            sLoggerSink.set(iLoggerSink);
            return;
        }
        AtomicReference<ILoggerSink> atomicReference = sLoggerSink;
        ILoggerSink loggerSink = getLoggerSink();
        while (!atomicReference.compareAndSet(loggerSink, null) && atomicReference.get() == loggerSink) {
        }
    }

    public static void d(String str, String str2) {
        LogLevel logLevel = LogLevel.LOG_LEVEL_DEBUG;
        if (logLevel.compareTo(sLogLevel) >= 0) {
            notifyLoggerSinks(logLevel, C786410Ut5.j4("[%s:%s]:%s", new Object[]{"ByteRTC", str, C786410Ut5.j4("[msg:%s]", new Object[]{str2})}), null);
        }
    }

    public static void e(String str, String str2) {
        LogLevel logLevel = LogLevel.LOG_LEVEL_ERROR;
        if (logLevel.compareTo(sLogLevel) >= 0) {
            notifyLoggerSinks(logLevel, C786410Ut5.j4("[%s:%s]:%s", new Object[]{"ByteRTC", str, C786410Ut5.j4("[msg:%s]", new Object[]{str2})}), null);
        }
    }

    public static void i(String str, String str2) {
        LogLevel logLevel = LogLevel.LOG_LEVEL_INFO;
        if (logLevel.compareTo(sLogLevel) >= 0) {
            notifyLoggerSinks(logLevel, C786410Ut5.j4("[%s:%s]:%s", new Object[]{"ByteRTC", str, C786410Ut5.j4("[msg:%s]", new Object[]{str2})}), null);
        }
    }

    public static void w(String str, String str2) {
        LogLevel logLevel = LogLevel.LOG_LEVEL_WARNING;
        if (logLevel.compareTo(sLogLevel) >= 0) {
            notifyLoggerSinks(logLevel, C786410Ut5.j4("[%s:%s]:%s", new Object[]{"ByteRTC", str, C786410Ut5.j4("[msg:%s]", new Object[]{str2})}), null);
        }
    }

    public static void e(String str, String str2, Throwable th) {
        LogLevel logLevel = LogLevel.LOG_LEVEL_ERROR;
        if (logLevel.compareTo(sLogLevel) >= 0) {
            notifyLoggerSinks(logLevel, C786410Ut5.j4("[%s:%s]:%s", new Object[]{"ByteRTC", str, C786410Ut5.j4("[msg:%s]", new Object[]{str2})}), th);
        }
    }

    public static void notifyLoggerSinks(LogLevel logLevel, String str, Throwable th) {
        ILoggerSink loggerSink;
        if (sLoggerSink != null && (loggerSink = getLoggerSink()) != null) {
            loggerSink.onLoggerMessage(logLevel, str, th);
        }
    }

    public static void w(String str, String str2, Throwable th) {
        LogLevel logLevel = LogLevel.LOG_LEVEL_WARNING;
        if (logLevel.compareTo(sLogLevel) >= 0) {
            notifyLoggerSinks(logLevel, C786410Ut5.j4("[%s:%s]:%s", new Object[]{"ByteRTC", str, C786410Ut5.j4("[msg:%s]", new Object[]{str2})}), th);
        }
    }
}
