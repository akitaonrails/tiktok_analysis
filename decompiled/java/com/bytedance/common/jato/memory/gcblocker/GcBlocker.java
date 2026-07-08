package com.bytedance.common.jato.memory.gcblocker;

import X.C0X3I;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.HashMap;

/* JADX INFO: loaded from: classes14.dex */
public final class GcBlocker extends C0X3I {
    public static long LIZIZ = 209715200;
    public final HashMap<String, Integer> LIZ = new HashMap<>();

    public static native int nativeCreateToken(boolean z);

    public static native void nativeReleaseToken(int i);

    public static native void nativeRequestBlockGc(long j);

    public static native void nativeSetHeapLimit(boolean z, int i);

    public static native void nativeSetIsSupportApex(boolean z);

    public static native void nativeSetMaxGcBlockTime(int i);

    public static native int nativeStartBlockGc(int i);

    public static native void nativeStopBlockGc(int i);

    public static boolean LJFF() {
        if (LIZIZ <= 0) {
            return true;
        }
        long j = Runtime.getRuntime().totalMemory();
        return (Build.VERSION.SDK_INT >= 29 && j >= 536870912) || j < LIZIZ;
    }

    @Override // X.C0X3I
    public final void LIZ(long j) {
        if (LJFF() && j > 0 && j <= Mp4ScreenVideoLoadTimeout.CONTROL) {
            nativeRequestBlockGc(j);
        }
    }

    @Override // X.C0X3I
    public final void LIZJ(int i) {
        nativeSetMaxGcBlockTime(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023 A[Catch: all -> 0x0032, PHI: r1
      0x0023: PHI (r1v2 java.lang.Integer) = (r1v1 java.lang.Integer), (r1v3 java.lang.Integer) binds: [B:7:0x0011, B:9:0x0021] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0032, blocks: (B:6:0x0009, B:8:0x0013, B:13:0x0030, B:10:0x0023, B:12:0x0029), top: B:20:0x0009 }] */
    @Override // X.C0X3I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = LJFF()
            if (r0 == 0) goto L38
            java.util.HashMap<java.lang.String, java.lang.Integer> r2 = r3.LIZ
            monitor-enter(r2)
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r3.LIZ     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r0.get(r4)     // Catch: java.lang.Throwable -> L32
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L32
            if (r1 != 0) goto L23
            r0 = 0
            int r0 = nativeCreateToken(r0)     // Catch: java.lang.Throwable -> L32
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L32
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r3.LIZ     // Catch: java.lang.Throwable -> L32
            r0.put(r4, r1)     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L30
        L23:
            int r0 = r1.intValue()     // Catch: java.lang.Throwable -> L32
            if (r0 < 0) goto L30
            int r0 = r1.intValue()     // Catch: java.lang.Throwable -> L32
            nativeStartBlockGc(r0)     // Catch: java.lang.Throwable -> L32
        L30:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L32
            return
        L32:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L32
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L32
            throw r0
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.jato.memory.gcblocker.GcBlocker.LIZLLL(java.lang.String):void");
    }

    @Override // X.C0X3I
    public final void LJ(String str) {
        synchronized (this.LIZ) {
            try {
                Integer numRemove = this.LIZ.remove(str);
                if (numRemove != null && numRemove.intValue() >= 0) {
                    nativeStopBlockGc(numRemove.intValue());
                    nativeReleaseToken(numRemove.intValue());
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.C0X3I
    public final void LIZIZ(int i, boolean z) {
        nativeSetHeapLimit(z, i);
    }

    public GcBlocker(int i, boolean z, int i2, boolean z2) {
        nativeSetIsSupportApex(z2);
        nativeSetMaxGcBlockTime(i);
        if (i2 > 0) {
            nativeSetHeapLimit(z, i2);
        }
    }
}
