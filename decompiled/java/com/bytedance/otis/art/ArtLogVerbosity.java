package com.bytedance.otis.art;

/* JADX INFO: loaded from: classes4.dex */
public class ArtLogVerbosity {
    public static final /* synthetic */ int LIZ = 0;

    public static native void disableClassLinkerLog();

    public static native boolean disableDex2OatWhenOpenDexInternal(int i);

    public static native boolean disableDexVerifyInternal(int i);

    public static native String dumpLastLoadedClassInApk(String str);

    public static native void dumpLoadedClassInApkInternal(String str, String str2, boolean z, String str3, String[] strArr);

    public static native void enableClassLinkerLog();

    public static native void enableCollectorLog();

    public static native void enableCompilerLog();

    public static native void enableDex2OatWhenOpenDexInternal();

    public static native void enableDexoptLog();

    public static native void enableGCLog();

    public static native void enableHeapLog();

    public static native void enableImageLog();

    public static native void enableJDWPLog();

    public static native void enableJitLog();

    public static native void enableMonitorLog();

    public static native void enableProfilerLog();

    public static native void enableSignalsLog();

    public static native void enableSimulatorLog();

    public static native void enableStartupLog();

    public static native void enableThirdPartyJNILog();

    public static native void enableThreadsLog();

    public static native void enableVerifierLog();

    public static native void init(boolean z, int i, boolean z2);

    public static native boolean isClassLoaded(long j, String str);

    public static native void startRecordClassLoadInternal(String str);

    public static native void stopRecordClassLoadInternal();

    static {
        System.loadLibrary("artlog_monitor");
    }
}
