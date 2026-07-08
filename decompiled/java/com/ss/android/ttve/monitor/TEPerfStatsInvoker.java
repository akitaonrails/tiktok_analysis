package com.ss.android.ttve.monitor;

import com.ss.android.ttve.nativePort.TENativeLibsLoader;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class TEPerfStatsInvoker {
    public static native Map<String, String> nativeGetMap();

    public static native Map<String, String> nativeGetMapByType(int i);

    public static native void nativeInit();

    public static native void nativePerfDouble(int i, String str, double d);

    public static native void nativePerfDouble(String str, double d);

    public static native void nativePerfLong(int i, String str, long j);

    public static native void nativePerfLong(String str, long j);

    public static native void nativePerfRational(String str, float f, float f2);

    public static native void nativePerfString(int i, String str, String str2);

    public static native void nativePerfString(String str, String str2);

    public static native void nativeReset();

    public static native void nativeReset(int i);

    static {
        TENativeLibsLoader.loadBase();
    }
}
