package com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.trace;

import X.C01GW;
import X.C1161920gLG;
import X.C1286730jaZ;
import X.C1286740jaa;
import X.C1469770oLn;
import X.C1C7U;
import X.C2262631DhF;
import X.C452501pT;
import X.C823050WQl;
import android.os.Looper;
import android.os.Message;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.trace.BasePerfData;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.trace.BasePerfRecorder;
import com.bytedance.android.livesdk.livesetting.other.TtliveGamePartnershipPerformanceSample;
import com.bytedance.android.livesdk.livesetting.performance.LiveHostGameCpuTotalPssOpt;
import com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: loaded from: classes36.dex */
public final class BasePerfRecorder {
    public static final C01GW<Integer> LJIIJJI = C452501pT.LIZIZ(new C1286740jaa());
    public static final C01GW<Integer> LJIIL = C452501pT.LIZIZ(new C1286730jaZ());
    public final String LIZ;
    public final long LIZIZ;
    public final IHostPerformanceMonitor LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public final BasePerfRecorder$timerHandler$1 LJFF;
    public final C01GW LJI;
    public int LJII;
    public double LJIIIIZZ;
    public double LJIIIZ;
    public double LJIIJ;

    public final BasePerfData LIZ() {
        return (BasePerfData) this.LJI.getValue();
    }

    public final double LIZIZ() {
        Double d = this.LIZJ.getCpuRate().get("cpu_speed");
        if (d != null) {
            return d.doubleValue();
        }
        return 0.0d;
    }

    public final double LIZJ() {
        double dLIZ;
        float f;
        if (LiveHostGameCpuTotalPssOpt.enable()) {
            Long l = this.LIZJ.getMemory().get("mem_pss_total");
            if (l == null) {
                return 0.0d;
            }
            dLIZ = l.longValue();
            f = 1048576.0f;
        } else {
            dLIZ = C1469770oLn.LIZ();
            f = 1024.0f;
        }
        return dLIZ / ((double) f);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.trace.BasePerfRecorder$timerHandler$1] */
    public BasePerfRecorder(String str) {
        this.LIZ = str;
        C823050WQl.LIZIZ().submit(new Runnable() { // from class: X.1DhB
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("BasePerfRecorder@d347.<init>$1");
                try {
                    BasePerfRecorder basePerfRecorder = this.LL;
                    BasePerfData basePerfDataLIZ = basePerfRecorder.LIZ();
                    IHostPerformanceMonitor iHostPerformanceMonitor = basePerfRecorder.LIZJ;
                    basePerfDataLIZ.baselineGpuUsage = iHostPerformanceMonitor != null ? iHostPerformanceMonitor.Sb2() : 0.0d;
                    basePerfRecorder.LIZ().baselineMemoryUsage = basePerfRecorder.LIZJ();
                    basePerfRecorder.LIZ().baselineCpuRate = basePerfRecorder.LIZIZ();
                    BasePerfRecorder basePerfRecorder2 = this.LL;
                    basePerfRecorder2.LJFF.sendEmptyMessageDelayed(100, basePerfRecorder2.LIZIZ);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("BasePerfRecorder@d347.<init>$1");
            }
        });
        this.LIZIZ = ((long) TtliveGamePartnershipPerformanceSample.INSTANCE.interval()) * 1000;
        this.LIZJ = (IHostPerformanceMonitor) C1161920gLG.LIZJ(IHostPerformanceMonitor.class);
        final Looper mainLooper = Looper.getMainLooper();
        this.LJFF = new BPEAHandler(mainLooper) { // from class: com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.trace.BasePerfRecorder$timerHandler$1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                C1C7U.LIZ("BasePerfRecorder@d347.timerHandler$1");
                final BasePerfRecorder basePerfRecorder = this.LL;
                if (basePerfRecorder.LIZLLL) {
                    C1C7U.LIZIZ("BasePerfRecorder@d347.timerHandler$1");
                    return;
                }
                if (!basePerfRecorder.LJ) {
                    C823050WQl.LIZIZ().submit(new Runnable() { // from class: X.1DhD
                        public final void LIZ() {
                            BasePerfRecorder basePerfRecorder2 = basePerfRecorder;
                            basePerfRecorder2.LJII++;
                            double dLIZIZ = basePerfRecorder2.LIZIZ();
                            double dLIZJ = basePerfRecorder2.LIZJ();
                            IHostPerformanceMonitor iHostPerformanceMonitor = basePerfRecorder2.LIZJ;
                            double dSb2 = iHostPerformanceMonitor != null ? iHostPerformanceMonitor.Sb2() : 0.0d;
                            basePerfRecorder2.LJIIIIZZ += dLIZIZ;
                            basePerfRecorder2.LJIIIZ += dLIZJ;
                            basePerfRecorder2.LJIIJ += dSb2;
                            if (dLIZIZ > basePerfRecorder2.LIZ().peakCpuRate) {
                                basePerfRecorder2.LIZ().peakCpuRate = dLIZIZ;
                            }
                            if (dLIZJ > basePerfRecorder2.LIZ().peakMemoryUsage) {
                                basePerfRecorder2.LIZ().peakMemoryUsage = dLIZJ;
                            }
                            if (dSb2 > basePerfRecorder2.LIZ().peakGpuUsage) {
                                basePerfRecorder2.LIZ().peakGpuUsage = dSb2;
                            }
                            BasePerfRecorder basePerfRecorder3 = basePerfRecorder;
                            basePerfRecorder3.LIZ().averageCpuRate = basePerfRecorder3.LJIIIIZZ / ((double) basePerfRecorder3.LJII);
                            basePerfRecorder3.LIZ().averageMemoryUsage = basePerfRecorder3.LJIIIZ / ((double) basePerfRecorder3.LJII);
                            basePerfRecorder3.LIZ().averageGpuUsage = basePerfRecorder3.LJIIJ / ((double) basePerfRecorder3.LJII);
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("BasePerfRecorder@d347.onTimeSplitArrived$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("BasePerfRecorder@d347.onTimeSplitArrived$1");
                        }
                    });
                }
                sendEmptyMessageDelayed(100, this.LL.LIZIZ);
                C1C7U.LIZIZ("BasePerfRecorder@d347.timerHandler$1");
            }
        };
        this.LJI = C452501pT.LIZIZ(new C2262631DhF(this));
    }
}
