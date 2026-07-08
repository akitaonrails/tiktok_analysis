package com.bytedance.monitor.collector;

import com.bytedance.apm6.perf.base.model.ThreadStatInfo;
import java.nio.ByteBuffer;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes14.dex */
public class MonitorJni {
    public static final String[] LIZ = {"java", "javax", "sun", "android", "kotlin", "org", "com.android", "dalvik", "libcore", "de", e3.c, "com.facebook", "com.google", "io", "okio", "butterknife", "com.meituan", "com.bytedance.apm.agent.instrumentation.", "okhttp3.internal", "com.bytedance.hotfix.PatchProxy", "com.bytedance.monitor.collector.MonitorJni"};

    public static native void clearAllocateInfo();

    public static native void disableBinderHook();

    public static native void disableSocketHook();

    public static native void doCloseLockStackTrace();

    public static native void doCollect();

    public static native void doDestroy();

    public static native void doDisableAtrace();

    public static native void doDisableIO();

    public static native String doDumpAtrace();

    public static native String doDumpAtraceRange(long j, long j2);

    public static native void doDumpAtraceRangeToALog(long j, long j2);

    public static native void doEnableAtrace(int i, long j);

    public static native void doEnableIO();

    public static native void doEnableLock();

    public static native long doGetAppCpuTime();

    public static native long doGetCpuTime(int i);

    public static native String doGetSchedInfo(int i);

    public static native void doInit();

    public static native void doOpenLockStackTrace(long j);

    public static native void doSetDebugMode(boolean z);

    public static native void doSetRecordSwitch(boolean z);

    public static native void doStart();

    public static native void doStop();

    public static native void dumpProcInfoTimeRangeToALog(long j, long j2);

    public static native void enableBinderHook();

    public static native void enableSocketHook(int i);

    public static native long fetchTrafficStats(boolean z);

    public static native ByteBuffer getAllocReportInfo();

    public static native long getBlockGCCount();

    public static native long getBlockGCTime();

    public static native long getBytesAllocatedEver();

    public static native long getGCCount();

    public static native long getGCTime();

    public static native long getMajorFaults();

    public static native long getMinorFaults();

    public static native long getObjectsAllocatedEver();

    public static native int getProcCGroup(int i);

    public static native String getProcInfoTimeRange(long j, long j2);

    public static native String getProcInfos();

    public static native ThreadStatInfo getThreadStatInfo(int i, int i2);

    public static native long getTotalCPUTimeByTimeInStat(int i);

    public static native boolean initJavaAllocMonitor();

    public static native boolean initJavaMem();

    public static native void keepProcHyperOpen(boolean z);

    public static native boolean readProcFile(String str, int[] iArr, Object[] objArr, long[] jArr, float[] fArr);

    public static native void registerJavaAllocMonitor(long j);

    public static native void releaseByteBuffer(long j);

    public static native void setAlogInstance(long j);

    public static native void setBufferSize(int i);

    public static native boolean setEnableAllocatedMonitor(boolean z, int i, int i2, int i3, long j, ClassLoader classLoader);

    public static native void setLargeObjectThreshold(int i);

    public static native void startHyperMonitor();

    public static native boolean startOrStopAllocatedMonitor(boolean z, String str);

    public static native void stopHyperMonitor();

    public static native void unregisterJavaAllocMonitor(long j);

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        r6 = r6 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getStack() {
        /*
            java.lang.Thread r0 = X.C786410Ut5.u3()
            java.lang.StackTraceElement[] r8 = com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy.getStackTrace(r0)
            int r7 = r8.length
            r6 = 0
        La:
            if (r6 >= r7) goto L2b
            r5 = r8[r6]
            java.lang.String[] r4 = com.bytedance.monitor.collector.MonitorJni.LIZ
            int r3 = r4.length
            r2 = 0
        L12:
            if (r2 >= r3) goto L26
            r1 = r4[r2]
            java.lang.String r0 = r5.getClassName()
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L23
            int r6 = r6 + 1
            goto La
        L23:
            int r2 = r2 + 1
            goto L12
        L26:
            java.lang.String r0 = r5.getClassName()
            return r0
        L2b:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.monitor.collector.MonitorJni.getStack():java.lang.String");
    }
}
