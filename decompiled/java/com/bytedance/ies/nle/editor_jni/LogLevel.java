package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes9.dex */
public enum LogLevel {
    LEVEL_VERBOSE(0),
    LEVEL_DEBUG(1),
    LEVEL_INFO(2),
    LEVEL_WARNING(3),
    LEVEL_ERROR(4),
    LEVEL_ASSERT(5),
    LEVEL_OFF(6);

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static LogLevel swigToEnum(int i) {
        LogLevel[] logLevelArr = (LogLevel[]) LogLevel.class.getEnumConstants();
        if (i < logLevelArr.length && i >= 0) {
            LogLevel logLevel = logLevelArr[i];
            if (logLevel.swigValue == i) {
                return logLevel;
            }
        }
        for (LogLevel logLevel2 : logLevelArr) {
            if (logLevel2.swigValue == i) {
                return logLevel2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(LogLevel.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static LogLevel valueOf(String str) {
        return (LogLevel) C08FF.LIZ(LogLevel.class, str);
    }

    LogLevel() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    LogLevel(LogLevel logLevel) {
        int i = logLevel.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    LogLevel(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
