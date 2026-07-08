package com.bytedance.frameworks.baselib.network.connectionclass;

import X.C1494470ozd;
import X.C1C7U;
import X.C20555083l;
import X.C786410Ut5;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.common.utility.Logger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes24.dex */
public class DeviceBandwidthSampler {
    public static long LJFF = -1;
    public final C1494470ozd LIZ;
    public final AtomicInteger LIZIZ;
    public final SamplingHandler LIZJ;
    public final boolean LIZLLL;
    public long LJ;

    public final void LIZIZ() {
        try {
            if (!this.LIZLLL && this.LIZIZ.getAndIncrement() == 0) {
                Logger.debug();
                this.LIZJ.sendEmptyMessage(1);
                this.LJ = SystemClock.elapsedRealtime();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LIZJ() {
        try {
            if (!this.LIZLLL && this.LIZIZ.decrementAndGet() == 0) {
                Logger.debug();
                this.LIZJ.removeMessages(1);
                LIZ();
                LJFF = -1L;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LIZ() {
        try {
            long jA4 = C786410Ut5.a4();
            long j = LJFF;
            long j2 = jA4 - j;
            if (j >= 0) {
                synchronized (this) {
                    try {
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        this.LIZ.LIZ(j2, jElapsedRealtime - this.LJ);
                        this.LJ = jElapsedRealtime;
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            }
            LJFF = jA4;
        } catch (Throwable th) {
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    public class SamplingHandler extends BPEAHandler {
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C1C7U.LIZ("DeviceBandwidthSampler$SamplingHandler@1446.handleMessage");
            try {
                if (message.what == 1) {
                    DeviceBandwidthSampler.this.LIZ();
                    sendEmptyMessageDelayed(1, 1000L);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            C1C7U.LIZIZ("DeviceBandwidthSampler$SamplingHandler@1446.handleMessage");
        }

        public SamplingHandler(Looper looper) {
            super(looper);
        }
    }

    public DeviceBandwidthSampler(C1494470ozd c1494470ozd) {
        this.LIZ = c1494470ozd;
        try {
            this.LIZIZ = new AtomicInteger();
            HandlerThread handlerThreadLIZ = C20555083l.LIZ();
            handlerThreadLIZ.start();
            this.LIZJ = new SamplingHandler(C786410Ut5.W2(handlerThreadLIZ));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZLLL = true;
        }
    }
}
