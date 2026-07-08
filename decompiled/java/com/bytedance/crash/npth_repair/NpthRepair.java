package com.bytedance.crash.npth_repair;

/* JADX INFO: loaded from: classes14.dex */
public class NpthRepair {
    public static boolean LIZ = false;
    public static boolean LIZIZ = false;
    public static int LIZJ = -1;

    public static native boolean nGetDebuggable();

    public static native int nInit(int i, boolean z);

    public static native void nSetDebuggable(boolean z);

    /* JADX WARN: Removed duplicated region for block: B:20:0x0030 A[Catch: all -> 0x003e, TRY_ENTER, TryCatch #2 {, blocks: (B:4:0x0003, B:6:0x0007, B:10:0x000c, B:15:0x001e, B:22:0x003a, B:20:0x0030, B:21:0x0034, B:14:0x001b, B:12:0x0012, B:17:0x0022), top: B:32:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0022 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized int LIZ(android.content.Context r3, boolean r4) {
        /*
            java.lang.Class<com.bytedance.crash.npth_repair.NpthRepair> r2 = com.bytedance.crash.npth_repair.NpthRepair.class
            monitor-enter(r2)
            boolean r0 = com.bytedance.crash.npth_repair.NpthRepair.LIZIZ     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto Lb
            int r0 = com.bytedance.crash.npth_repair.NpthRepair.LIZJ     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r2)
            return r0
        Lb:
            r1 = 1
            com.bytedance.crash.npth_repair.NpthRepair.LIZIZ = r1     // Catch: java.lang.Throwable -> L3e
            boolean r0 = com.bytedance.crash.npth_repair.NpthRepair.LIZ     // Catch: java.lang.Throwable -> L3e
            if (r0 != 0) goto L1e
            java.lang.String r0 = "npth_repair"
            com.bytedance.librarian.Librarian.LJI(r3, r0)     // Catch: java.lang.Throwable -> L1a
            com.bytedance.crash.npth_repair.NpthRepair.LIZ = r1     // Catch: java.lang.Throwable -> L1a
            goto L1e
        L1a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L3e
        L1e:
            boolean r0 = com.bytedance.crash.npth_repair.NpthRepair.LIZ     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L30
            nSetDebuggable(r4)     // Catch: java.lang.Throwable -> L2e
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L2e
            int r0 = nInit(r0, r4)     // Catch: java.lang.Throwable -> L2e
            com.bytedance.crash.npth_repair.NpthRepair.LIZJ = r0     // Catch: java.lang.Throwable -> L2e
            goto L3a
        L2e:
            r0 = move-exception
            goto L34
        L30:
            r0 = -5
            com.bytedance.crash.npth_repair.NpthRepair.LIZJ = r0     // Catch: java.lang.Throwable -> L3e
            goto L3a
        L34:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L3e
            r0 = -3
            com.bytedance.crash.npth_repair.NpthRepair.LIZJ = r0     // Catch: java.lang.Throwable -> L3e
        L3a:
            int r0 = com.bytedance.crash.npth_repair.NpthRepair.LIZJ     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r2)
            return r0
        L3e:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.npth_repair.NpthRepair.LIZ(android.content.Context, boolean):int");
    }
}
