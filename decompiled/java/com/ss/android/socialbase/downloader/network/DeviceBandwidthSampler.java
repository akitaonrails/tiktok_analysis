package com.ss.android.socialbase.downloader.network;

import X.C1490830otl;
import X.C1700030uLB;
import X.C1B8M;
import X.C1B8Z;
import X.C1C7U;
import X.C2188811AlT;
import X.C786410Ut5;
import android.net.TrafficStats;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes35.dex */
public final class DeviceBandwidthSampler {
    public static final String LJ = DeviceBandwidthSampler.class.getSimpleName();
    public static volatile int LJFF = 0;
    public static long LJI = -1;
    public static volatile DeviceBandwidthSampler LJII = null;
    public final C1B8M LIZ = C1B8Z.LIZ;
    public final AtomicInteger LIZIZ = new AtomicInteger();
    public final SamplingHandler LIZJ = new SamplingHandler(C1700030uLB.LIZ);
    public long LIZLLL;

    public static DeviceBandwidthSampler LIZIZ() {
        if (LJII == null) {
            synchronized (DeviceBandwidthSampler.class) {
                try {
                    if (LJII == null) {
                        LJII = new DeviceBandwidthSampler();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJII;
    }

    public static boolean LIZJ() {
        return LJFF == 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a A[Catch: Exception -> 0x0037, PHI: r0
      0x001a: PHI (r0v2 android.net.ConnectivityManager) = (r0v1 android.net.ConnectivityManager), (r0v8 android.net.ConnectivityManager) binds: [B:5:0x0008, B:7:0x0014] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {Exception -> 0x0037, blocks: (B:4:0x0006, B:6:0x000a, B:11:0x001a, B:13:0x0020, B:15:0x0026), top: B:20:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF() {
        /*
            android.content.Context r1 = X.C2199681B7e.LJFF()
            if (r1 == 0) goto L16
            android.net.ConnectivityManager r0 = X.C2199671B7d.LIZJ     // Catch: java.lang.Exception -> L37
            if (r0 != 0) goto L1a
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = X.C786410Ut5.H2(r1, r0)     // Catch: java.lang.Exception -> L37
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.Exception -> L37
            X.C2199671B7d.LIZJ = r0     // Catch: java.lang.Exception -> L37
            if (r0 != 0) goto L1a
        L16:
            r1 = 0
        L17:
            com.ss.android.socialbase.downloader.network.DeviceBandwidthSampler.LJFF = r1
            return
        L1a:
            android.net.NetworkInfo r3 = X.C786410Ut5.LJIJ(r0)     // Catch: java.lang.Exception -> L37
            if (r3 == 0) goto L16
            boolean r0 = r3.isAvailable()     // Catch: java.lang.Exception -> L37
            if (r0 == 0) goto L16
            X.0WZX r2 = new X.0WZX     // Catch: java.lang.Exception -> L37
            java.lang.String r1 = "dzBzEhEpEcvSUUUuTBbKdVdkPAc7AINPwUsIcwZX0WGmMfisoe/W6lMBTCNPX26POXk+I/9SgHI="
            r0 = 0
            r2.<init>(r1, r0)     // Catch: java.lang.Exception -> L37
            int r0 = X.C2204961BRm.LJLLILLLL(r3, r2)     // Catch: java.lang.Exception -> L37
            r1 = 1
            if (r1 == r0) goto L17
            r1 = 2
            goto L17
        L37:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.network.DeviceBandwidthSampler.LJFF():void");
    }

    public final void LIZ() {
        try {
            LJFF();
            long jA4 = LJFF == 1 ? C786410Ut5.a4() - TrafficStats.getMobileRxBytes() : TrafficStats.getMobileRxBytes();
            long j = LJI;
            long j2 = jA4 - j;
            if (j >= 0) {
                synchronized (this) {
                    try {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        this.LIZ.LIZ.addBandwidth(j2, jUptimeMillis - this.LIZLLL);
                        this.LIZLLL = jUptimeMillis;
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            }
            LJI = jA4;
        } catch (Exception th) {
        }
    }

    public final void LIZLLL() {
        try {
            if (C1490830otl.LIZ()) {
                String str = LJ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("SamplingCounter = ");
                sbLIZ.append(this.LIZIZ);
                C1490830otl.LIZIZ(str, "startSampling", C2188811AlT.LIZIZ(sbLIZ));
            }
            if (this.LIZIZ.getAndIncrement() == 0) {
                this.LIZJ.sendEmptyMessage(1);
                this.LIZLLL = SystemClock.uptimeMillis();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LJ() {
        try {
            if (C1490830otl.LIZ()) {
                String str = LJ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("SamplingCounter = ");
                sbLIZ.append(this.LIZIZ);
                C1490830otl.LIZIZ(str, "stopSampling", C2188811AlT.LIZIZ(sbLIZ));
            }
            if (this.LIZIZ.decrementAndGet() == 0) {
                this.LIZJ.removeMessages(1);
                LIZ();
                LJI = -1L;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    public class SamplingHandler extends BPEAHandler {
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C1C7U.LIZ("DeviceBandwidthSampler$SamplingHandler@4385.handleMessage");
            if (message.what == 1) {
                DeviceBandwidthSampler.this.LIZ();
                sendEmptyMessageDelayed(1, 1000L);
            }
            C1C7U.LIZIZ("DeviceBandwidthSampler$SamplingHandler@4385.handleMessage");
        }

        public SamplingHandler(Looper looper) {
            super(looper);
        }
    }
}
