package com.facebook.network.connectionclass;

import X.C0VSP;
import X.C1B9C;
import X.C1BUD;
import X.C1BUE;
import X.C1BUF;
import X.C1C7U;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.StrictMode;
import android.os.SystemClock;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes14.dex */
public final class DeviceBandwidthSampler {
    public final C1B9C LIZ;
    public final AtomicInteger LIZIZ = new AtomicInteger();
    public final Handler LIZJ;
    public long LIZLLL;

    /* JADX INFO: loaded from: classes35.dex */
    public class SamplingHandler extends BPEAHandler {
        public final void LJ() {
            long j;
            C0VSP c0vsp;
            C1BUF c1buf;
            byte[] bArr;
            C1BUD c1bud;
            C1BUE c1bueLIZ = C1BUE.LIZ();
            int iMyUid = Process.myUid();
            c1bueLIZ.getClass();
            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                try {
                    c0vsp = new C0VSP("/proc/net/xt_qtaguid/stats");
                    c1buf = C1BUE.LIZJ;
                    c1buf.LIZIZ = c0vsp;
                    c1buf.LIZLLL = 0;
                    c1buf.LIZJ = 0;
                    bArr = C1BUE.LIZ.get();
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                try {
                    c1buf.LIZIZ();
                    long jLIZIZ = 0;
                    while (true) {
                        int iLIZ = C1BUE.LIZJ.LIZ(bArr);
                        if (iLIZ != -1) {
                            try {
                                try {
                                    c1bud = C1BUE.LIZLLL;
                                    c1bud.LIZ = bArr;
                                    c1bud.LIZIZ = 0;
                                    c1bud.LIZJ = iLIZ;
                                    c1bud.LJ = false;
                                    c1bud.LIZLLL();
                                    c1bud.LIZLLL = ' ';
                                    c1bud.LJ = true;
                                    c1bud.LIZLLL();
                                } catch (NumberFormatException e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                }
                            } catch (NoSuchElementException e3) {
                                TryCatchGuardChecker.doCheck(e3);
                            }
                            if (!c1bud.LJ) {
                                throw new IllegalStateException("Must call useDelimiter first");
                            }
                            c1bud.LIZ();
                            if (c1bud.LIZJ()) {
                                continue;
                            } else {
                                c1bud.LIZLLL();
                                if (!c1bud.LJ) {
                                    throw new IllegalStateException("Must call useDelimiter first");
                                }
                                c1bud.LIZ();
                                if (c1bud.LIZIZ() == iMyUid) {
                                    c1bud.LIZLLL();
                                    if (!c1bud.LJ) {
                                        throw new IllegalStateException("Must call useDelimiter first");
                                    }
                                    c1bud.LIZ();
                                    jLIZIZ += (long) c1bud.LIZIZ();
                                } else {
                                    continue;
                                }
                            }
                        } else {
                            c0vsp.close();
                            long j2 = C1BUE.LIZIZ;
                            if (j2 == -1) {
                                C1BUE.LIZIZ = jLIZIZ;
                            } else {
                                j = jLIZIZ - j2;
                                C1BUE.LIZIZ = jLIZIZ;
                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            }
                        }
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    j = -1;
                    synchronized (this) {
                        try {
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            if (j != -1) {
                                DeviceBandwidthSampler deviceBandwidthSampler = DeviceBandwidthSampler.this;
                                deviceBandwidthSampler.LIZ.LIZ(j, jElapsedRealtime - deviceBandwidthSampler.LIZLLL);
                            }
                            DeviceBandwidthSampler.this.LIZLLL = jElapsedRealtime;
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                } catch (Throwable th) {
                    c0vsp.close();
                    throw th;
                }
            } catch (Throwable th2) {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                throw th2;
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C1C7U.LIZ("DeviceBandwidthSampler$SamplingHandler@8fa5.handleMessage");
            int i = message.what;
            if (i != 1) {
                if (i == 2) {
                    LJ();
                    removeMessages(1);
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Unknown what=");
                    sbLIZ.append(message.what);
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                }
            } else {
                LJ();
                sendEmptyMessageDelayed(1, 1000L);
            }
            C1C7U.LIZIZ("DeviceBandwidthSampler$SamplingHandler@8fa5.handleMessage");
        }

        public SamplingHandler(Looper looper) {
            super(looper);
        }
    }

    public DeviceBandwidthSampler(C1B9C c1b9c) {
        this.LIZ = c1b9c;
        HandlerThread handlerThread = new HandlerThread("ParseThread");
        handlerThread.start();
        this.LIZJ = new SamplingHandler(C786410Ut5.W2(handlerThread));
    }
}
