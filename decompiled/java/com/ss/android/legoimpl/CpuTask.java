package com.ss.android.legoimpl;

import X.C0BEC;
import X.C0BHV;
import X.C0C6L;
import X.C0CCZ;
import X.C0VX0;
import X.C0VX2;
import X.C0VZ0;
import X.C0XA6;
import X.C12822050a;
import X.C1BWL;
import X.C2162308dZ;
import X.C2407009bw;
import X.C786410Ut5;
import X.C799180VWq;
import X.C799250VWx;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799230VWv;
import Y.ARunnableS88S0000000_9;
import android.app.Application;
import android.content.Context;
import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.experiment.ColdBootTasksDegradeExperiment;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class CpuTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "CpuTask";
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    public static void LIZ() {
        if (C2162308dZ.LJI(C1BWL.LIZ())) {
            Application applicationLIZ = C1BWL.LIZ();
            if (new SecureRandom().nextDouble() <= ((Number) C0C6L.LIZ.getValue()).doubleValue()) {
                if (C0XA6.LIZ.compareAndSet(false, true)) {
                    C0VX0.LIZIZ = new C12822050a(applicationLIZ);
                }
                C799180VWq c799180VWq = C799180VWq.LIZ;
                InterfaceC799230VWv interfaceC799230VWv = new InterfaceC799230VWv() { // from class: X.0VWy
                    @Override // X.InterfaceC799230VWv
                    public final Thread LIZ(List<? extends Thread> list) {
                        return (Thread) ListProtector.get(list, AbstractC19994813Le.Default.nextInt(((ArrayList) list).size()));
                    }
                };
                c799180VWq.getClass();
                C799180VWq.LIZJ = interfaceC799230VWv;
                new C0VX2(0);
                long jLongValue = ((Number) C0BHV.LIZ.getValue()).longValue();
                C799250VWx c799250VWx = new C799250VWx(jLongValue, 100);
                if (C799180VWq.LIZJ == null || !C799180VWq.LIZIZ.compareAndSet(false, true) || 1000 > jLongValue || jLongValue >= 5001) {
                    return;
                }
                C799180VWq.LJIIIIZZ = c799250VWx;
                System.currentTimeMillis();
                HandlerThread handlerThread = new HandlerThread("TTBackground");
                handlerThread.start();
                C799180VWq.LJI = new BPEAHandler(C786410Ut5.W2(handlerThread));
                C799180VWq.LJII = handlerThread;
                BPEAHandler bPEAHandler = C799180VWq.LJI;
                if (bPEAHandler != null) {
                    C786410Ut5.LJJZZIII(bPEAHandler, new ARunnableS88S0000000_9(15));
                } else {
                    C799180VWq.LIZIZ();
                }
                BPEAHandler bPEAHandler2 = C799180VWq.LJI;
                if (bPEAHandler2 != null) {
                    C786410Ut5.LJLIIL(C799180VWq.LJIIIIZZ.LIZIZ, bPEAHandler2, new ARunnableS88S0000000_9(16));
                }
            }
        }
    }

    @Override // X.InterfaceC800080Va2
    public final boolean meetTrigger() {
        return C0BEC.LJFF(C1BWL.LIZ());
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return ColdBootTasksDegradeExperiment.LIZ().cpuTask ? EnumC799870VZh.BOOT_FINISH : EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C2407009bw.LIZ();
        LIZ();
    }
}
