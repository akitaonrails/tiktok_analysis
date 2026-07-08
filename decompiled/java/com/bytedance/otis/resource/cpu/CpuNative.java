package com.bytedance.otis.resource.cpu;

import com.bytedance.otis.resource.util.EnsureLoad;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class CpuNative {
    public static final CpuNative LIZ = new CpuNative();
    public static Map<Integer, Integer> LIZIZ;

    public static final native HashMap<String, String> dumpCpuPolicy();

    public static final native OtisCPUTime dumpOtisCpuTime(boolean z, boolean z2, boolean z3, int[] iArr, boolean z4, boolean z5);

    public static final native long getDeviceCpuTime();

    public static final native long getDeviceIdleTime();

    public static final native long getProcessCpuTime();

    public static final native long[] getThreadArrayCpuTime(int[] iArr);

    public static final native long getThreadCpuTime(int i);

    static {
        EnsureLoad.LIZ.init();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0057 A[Catch: all -> 0x005f, TryCatch #0 {all -> 0x005f, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000f, B:10:0x0020, B:12:0x0026, B:13:0x0051, B:16:0x005c, B:15:0x0057), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.Integer, java.lang.Integer> LIZ() {
        /*
            r5 = this;
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = com.bytedance.otis.resource.cpu.CpuNative.LIZIZ
            if (r0 != 0) goto L66
            monitor-enter(r5)
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = com.bytedance.otis.resource.cpu.CpuNative.LIZIZ     // Catch: java.lang.Throwable -> L5f
            if (r0 != 0) goto L65
            java.util.HashMap r1 = dumpCpuPolicy()     // Catch: java.lang.Throwable -> L5f
            if (r1 == 0) goto L57
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L5f
            int r0 = r1.size()     // Catch: java.lang.Throwable -> L5f
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L5f
            java.util.Set r0 = r1.entrySet()     // Catch: java.lang.Throwable -> L5f
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> L5f
        L20:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L5f
            if (r0 == 0) goto L51
            java.lang.Object r1 = r3.next()     // Catch: java.lang.Throwable -> L5f
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r0 = r1.getKey()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L5f
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L5f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L5f
            int r0 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L5f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L5f
            kotlin.Pair r0 = new kotlin.Pair     // Catch: java.lang.Throwable -> L5f
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L5f
            r4.add(r0)     // Catch: java.lang.Throwable -> L5f
            goto L20
        L51:
            java.util.Map r0 = X.C2097608Jq.LJIILLIIL(r4)     // Catch: java.lang.Throwable -> L5f
            if (r0 != 0) goto L5c
        L57:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L5f
            r0.<init>()     // Catch: java.lang.Throwable -> L5f
        L5c:
            com.bytedance.otis.resource.cpu.CpuNative.LIZIZ = r0     // Catch: java.lang.Throwable -> L5f
            goto L65
        L5f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L5f
            monitor-exit(r5)
            throw r0
        L65:
            monitor-exit(r5)
        L66:
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = com.bytedance.otis.resource.cpu.CpuNative.LIZIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.otis.resource.cpu.CpuNative.LIZ():java.util.Map");
    }
}
