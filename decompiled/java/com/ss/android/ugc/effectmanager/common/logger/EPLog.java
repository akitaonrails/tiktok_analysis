package com.ss.android.ugc.effectmanager.common.logger;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes31.dex */
public final class EPLog {
    public static final EPLog INSTANCE = new EPLog();
    public static ILogger sLogger = DefaultLogger.INSTANCE;
    public static boolean sEnableLog = true;
    public static String sdkTag = "EffectPlatform";

    public final boolean getSEnableLog() {
        return sEnableLog;
    }

    public static final void addSDKTagString(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(sdkTag);
        sbLIZ.append('-');
        sbLIZ.append(str);
        sdkTag = C2188811AlT.LIZIZ(sbLIZ);
    }

    private final String getSDKTag(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(sdkTag);
        sbLIZ.append('#');
        sbLIZ.append(str);
        sbLIZ.append("]:");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void setEnableLog(boolean z) {
        sEnableLog = z;
    }

    public static final void setLogger(ILogger iLogger) {
        sLogger = iLogger;
    }

    public final void setSEnableLog(boolean z) {
        sEnableLog = z;
    }

    public static final void d(String str, String str2) {
        ILogger iLogger = sLogger;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(INSTANCE.getSDKTag(str));
        sbLIZ.append("  ");
        sbLIZ.append(str2);
        iLogger.d(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void e(String str, String str2) {
        ILogger iLogger = sLogger;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(INSTANCE.getSDKTag(str));
        sbLIZ.append("  ");
        sbLIZ.append(str2);
        iLogger.e(C2188811AlT.LIZIZ(sbLIZ), null);
    }

    public static final void i(String str, String str2) {
        ILogger iLogger = sLogger;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(INSTANCE.getSDKTag(str));
        sbLIZ.append("  ");
        sbLIZ.append(str2);
        iLogger.i(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void w(String str, String str2) {
        ILogger iLogger = sLogger;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(INSTANCE.getSDKTag(str));
        sbLIZ.append("  ");
        sbLIZ.append(str2);
        iLogger.w(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void e(String str, String str2, Throwable th) {
        ILogger iLogger = sLogger;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(INSTANCE.getSDKTag(str));
        sbLIZ.append("  ");
        sbLIZ.append(str2);
        iLogger.e(C2188811AlT.LIZIZ(sbLIZ), th);
    }
}
