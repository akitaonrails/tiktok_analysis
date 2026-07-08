package com.bytedance.crash.npth_repair.monitor;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes14.dex */
public class SignalMonitor {
    public static SignalMonitor LIZIZ;
    public int LIZ = 1110;

    private native int nDumpSignalMonitor(String str);

    private native int nStartSignalMonitorWithSigType(int[] iArr);

    private native void nStopSignalMonitor();

    public static SignalMonitor LIZIZ() {
        if (LIZIZ == null) {
            synchronized (SignalMonitor.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new SignalMonitor();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    public final synchronized int LIZ(String str) {
        int i = this.LIZ;
        if (i != 1111 && i != 1113) {
            return -1;
        }
        this.LIZ = 1114;
        return nDumpSignalMonitor(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0064 A[Catch: all -> 0x006f, PHI: r3
      0x0064: PHI (r3v2 int[]) = (r3v0 int[]), (r3v0 int[]), (r3v0 int[]), (r3v0 int[]), (r3v1 int[]) binds: [B:20:0x0031, B:22:0x0038, B:31:0x0061, B:25:0x0049, B:51:0x0064] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {all -> 0x006f, blocks: (B:21:0x0033, B:23:0x003a, B:24:0x0045, B:26:0x004b, B:27:0x0051, B:29:0x0057, B:31:0x0061, B:32:0x0064), top: B:49:0x0033, outer: #0, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006a A[Catch: all -> 0x007d, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:10:0x000e, B:13:0x0015, B:15:0x0023, B:37:0x0074, B:34:0x006a, B:36:0x0070, B:21:0x0033, B:23:0x003a, B:24:0x0045, B:26:0x004b, B:27:0x0051, B:29:0x0057, B:31:0x0061, B:32:0x0064), top: B:46:0x0001, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074 A[Catch: all -> 0x007d, PHI: r1
      0x0074: PHI (r1v5 int) = (r1v2 int), (r1v3 int), (r1v7 int) binds: [B:36:0x0070, B:33:0x0068, B:18:0x002e] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:10:0x000e, B:13:0x0015, B:15:0x0023, B:37:0x0074, B:34:0x006a, B:36:0x0070, B:21:0x0033, B:23:0x003a, B:24:0x0045, B:26:0x004b, B:27:0x0051, B:29:0x0057, B:31:0x0061, B:32:0x0064), top: B:46:0x0001, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0033 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized int LIZJ(X.C803440VfS r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            int r1 = r5.LIZ     // Catch: java.lang.Throwable -> L7d
            r0 = 1110(0x456, float:1.555E-42)
            if (r1 == r0) goto Le
            r0 = 1113(0x459, float:1.56E-42)
            if (r1 == r0) goto Le
            monitor-exit(r5)
            r0 = -2
            return r0
        Le:
            int r0 = com.bytedance.crash.npth_repair.NpthRepair.LIZJ     // Catch: java.lang.Throwable -> L7d
            r4 = 0
            if (r0 != 0) goto L7a
            if (r6 == 0) goto L30
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L7d
            java.lang.String[] r1 = r6.LIZ     // Catch: java.lang.Throwable -> L7d
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L7d
            boolean r0 = X.C803440VfS.LIZ(r0, r1)     // Catch: java.lang.Throwable -> L7d
            if (r0 == 0) goto L2e
            java.lang.String r1 = android.os.Build.BRAND     // Catch: java.lang.Throwable -> L7d
            java.lang.String[] r0 = r6.LIZIZ     // Catch: java.lang.Throwable -> L7d
            boolean r0 = X.C803440VfS.LIZ(r1, r0)     // Catch: java.lang.Throwable -> L7d
            if (r0 == 0) goto L2e
            goto L30
        L2e:
            r1 = -6
            goto L74
        L30:
            r3 = 0
            if (r6 == 0) goto L64
            java.lang.String r2 = "sigTypes"
            org.json.JSONObject r0 = r6.LIZJ     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L64
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: org.json.JSONException -> L60 java.lang.Throwable -> L6f
            org.json.JSONObject r0 = r6.LIZJ     // Catch: org.json.JSONException -> L60 java.lang.Throwable -> L6f
            java.lang.String r0 = r0.optString(r2)     // Catch: org.json.JSONException -> L60 java.lang.Throwable -> L6f
            r1.<init>(r0)     // Catch: org.json.JSONException -> L60 java.lang.Throwable -> L6f
            int r0 = r1.length()     // Catch: java.lang.Throwable -> L6f
            if (r0 <= 0) goto L64
            int r0 = r1.length()     // Catch: java.lang.Throwable -> L6f
            int[] r3 = new int[r0]     // Catch: java.lang.Throwable -> L6f
        L51:
            int r0 = r1.length()     // Catch: java.lang.Throwable -> L6f
            if (r4 >= r0) goto L64
            int r0 = r1.optInt(r4)     // Catch: java.lang.Throwable -> L6f
            r3[r4] = r0     // Catch: java.lang.Throwable -> L6f
            int r4 = r4 + 1
            goto L51
        L60:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L6f
        L64:
            int r1 = r5.nStartSignalMonitorWithSigType(r3)     // Catch: java.lang.Throwable -> L6f
            if (r1 != 0) goto L74
            r0 = 1111(0x457, float:1.557E-42)
            r5.LIZ = r0     // Catch: java.lang.Throwable -> L7d
            goto L78
        L6f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L7d
            r1 = -4
        L74:
            r0 = 1112(0x458, float:1.558E-42)
            r5.LIZ = r0     // Catch: java.lang.Throwable -> L7d
        L78:
            monitor-exit(r5)
            return r1
        L7a:
            monitor-exit(r5)
            r0 = -1
            return r0
        L7d:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.npth_repair.monitor.SignalMonitor.LIZJ(X.0VfS):int");
    }
}
