package com.bytedance.common.jato.adrenalin;

import X.C07TK;
import X.C0N04;
import X.C1C7U;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1702300uOq;
import android.app.Application;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes27.dex */
public final class Adrenalin {
    public final Application LIZ;
    public final long LIZIZ;
    public boolean LIZLLL;
    public HandlerThread LJ;
    public Handler LJFF;
    public C0N04 LIZJ = C0N04.STOPPED;
    public C07TK LJI = new C07TK() { // from class: X.0uOs
        @Override // X.C07TK
        public final void LIZ() {
        }

        @Override // X.C07TK
        public final void LIZIZ() {
        }
    };

    public final synchronized void LIZ() {
        if (JatoXL.isInited()) {
            if (this.LIZLLL) {
                this.LJI.LIZ();
                return;
            }
            if (JatoXL.getConfig().isDebug()) {
                this.LJI = new C07TK() { // from class: X.0uOr
                    @Override // X.C07TK
                    public final void LIZ() {
                    }

                    @Override // X.C07TK
                    public final void LIZIZ() {
                    }
                };
            }
            C07TK c07tk = this.LJI;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("init with isDebug = ");
            sbLIZ.append(JatoXL.getConfig().isDebug());
            C2188811AlT.LIZIZ(sbLIZ);
            c07tk.LIZ();
            this.LIZLLL = false;
            HandlerThread handlerThread = new HandlerThread("adrenalin");
            this.LJ = handlerThread;
            handlerThread.start();
            this.LJFF = new BPEAHandler(C786410Ut5.W2(this.LJ)) { // from class: com.bytedance.common.jato.adrenalin.Adrenalin.3
                @Override // android.os.Handler
                public final void handleMessage(Message message) {
                    C1C7U.LIZ("Adrenalin@de42.init$2");
                    C07TK c07tk2 = Adrenalin.this.LJI;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("handlemsg -> ");
                    sbLIZ2.append(message);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    c07tk2.LIZ();
                    int i = message.what;
                    if (i == EnumC1702300uOq.START.LL) {
                        Adrenalin adrenalin = Adrenalin.this;
                        C07TK c07tk3 = adrenalin.LJI;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("real start with status = ");
                        sbLIZ3.append(adrenalin.LIZJ.name());
                        C2188811AlT.LIZIZ(sbLIZ3);
                        c07tk3.LIZ();
                        adrenalin.LJFF.removeMessages(EnumC1702300uOq.FORCE_STOP.LL);
                        adrenalin.LJFF.removeMessages(EnumC1702300uOq.STOP.LL);
                        if (adrenalin.LIZJ == C0N04.STOPPED) {
                            try {
                                SystemClock.elapsedRealtime();
                                JatoXL.tryCpuBoost(adrenalin.LIZIZ);
                                JatoXL.tryGpuBoost(adrenalin.LIZIZ);
                                JatoXL.startBlockGc(Adrenalin.class.getCanonicalName());
                                JatoXL.boostRenderThread(adrenalin.LIZ, -20);
                                adrenalin.LIZJ = C0N04.RUNNNING;
                                adrenalin.LJI.LIZ();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                adrenalin.LJI.LIZIZ();
                            }
                        }
                    } else if (i == EnumC1702300uOq.STOP.LL || i == EnumC1702300uOq.FORCE_STOP.LL) {
                        Adrenalin adrenalin2 = Adrenalin.this;
                        C07TK c07tk4 = adrenalin2.LJI;
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("real stop with status = ");
                        sbLIZ4.append(adrenalin2.LIZJ.name());
                        C2188811AlT.LIZIZ(sbLIZ4);
                        c07tk4.LIZ();
                        if (adrenalin2.LIZJ == C0N04.RUNNNING) {
                            try {
                                JatoXL.releaseBoost();
                                JatoXL.stopBlockGc(Adrenalin.class.getCanonicalName());
                                JatoXL.boostRenderThread(adrenalin2.LIZ, 19);
                                adrenalin2.LJI.LIZ();
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                adrenalin2.LJI.LIZIZ();
                            }
                        }
                    }
                    C1C7U.LIZIZ("Adrenalin@de42.init$2");
                }
            };
            this.LIZLLL = true;
            this.LJI.LIZ();
        }
    }

    public Adrenalin(Application application, long j) {
        this.LIZ = application;
        this.LIZIZ = j;
    }
}
