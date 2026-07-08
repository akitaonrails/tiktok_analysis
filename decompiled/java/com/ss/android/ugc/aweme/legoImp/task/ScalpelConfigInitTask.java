package com.ss.android.ugc.aweme.legoImp.task;

import X.AbstractC19994813Le;
import X.C01GW;
import X.C07KM;
import X.C0CCZ;
import X.C0VU1;
import X.C0VWW;
import X.C0VZ0;
import X.C0W9L;
import X.C0XA5;
import X.C0XA7;
import X.C0XAE;
import X.C0XAO;
import X.C0XAQ;
import X.C0XAT;
import X.C1950407kU;
import X.C1DG0;
import X.C1DG1;
import X.C2225551C8r;
import X.C2405009bc;
import X.C582710MtJ;
import X.C584560MwI;
import X.C588060N4q;
import X.C588070N4r;
import X.C786410Ut5;
import X.C799570VYd;
import X.C801610VcV;
import X.C823050WQl;
import X.C844470XAv;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import Y.ARunnableS82S0200000_13;
import android.content.Context;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public final class ScalpelConfigInitTask implements C0CCZ, InterfaceC799590VYf {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "ScalpelConfigInitTask";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int priority() {
        return 1;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C07KM.LIZ = new C0W9L();
        C844470XAv.LIZ.getClass();
        C844470XAv.LJ();
        C07KM.LIZIZ = new C1950407kU();
        C07KM.LIZJ = C2405009bc.LIZ();
        C07KM.LIZLLL = new C801610VcV();
        C07KM.LJ = new C588060N4q();
        C07KM.LJI = new C584560MwI();
        C07KM.LJFF = new C588070N4r();
        C2225551C8r.LIZIZ = new C0XAT();
        C2225551C8r.LIZJ = new C0XAO();
        C2225551C8r.LIZLLL = new C0XA5();
        if (C1DG0.LIZIZ()) {
            C0XAQ c0xaq = new C0XAQ(0);
            c0xaq.LIZ = ((Number) C1DG0.LJ.getValue()).longValue();
            c0xaq.LIZIZ = ((Number) C1DG0.LJFF.getValue()).longValue();
            C01GW c01gw = C1DG0.LJI;
            c0xaq.LIZJ = ((Number) c01gw.getValue()).longValue();
            C0XAE c0xae = new C0XAE(c0xaq.LIZ, c0xaq.LIZIZ, c0xaq.LIZJ, ((Number) C1DG0.LJII.getValue()).intValue());
            C823050WQl.LJ().schedule(new ARunnableS82S0200000_13(c0xae, context, 30), AbstractC19994813Le.Default.nextLong(0L, ((Number) c01gw.getValue()).longValue()), TimeUnit.MILLISECONDS);
        }
        if (((Boolean) C1DG1.LIZJ.getValue()).booleanValue() && !C582710MtJ.LIZ) {
            C582710MtJ.LIZ = true;
            C0XAQ c0xaq2 = new C0XAQ(0);
            c0xaq2.LIZ = ((Number) C1DG1.LJ.getValue()).longValue();
            c0xaq2.LIZIZ = ((Number) C1DG1.LJFF.getValue()).longValue();
            c0xaq2.LIZJ = ((Number) C1DG1.LJI.getValue()).longValue();
            C0XAE c0xae2 = new C0XAE(c0xaq2.LIZ, c0xaq2.LIZIZ, c0xaq2.LIZJ, ((Number) C1DG1.LJII.getValue()).intValue());
            C0VWW.LJI("diagnosis_main_thread_trace_first_feed");
            C0XA7.LIZ.getClass();
            C0XA7.LIZIZ(context, "diagnosis_main_thread_trace_first_feed", c0xae2);
            C786410Ut5.LJLIIL(10000L, C799570VYd.LIZIZ(), new Runnable() { // from class: X.0MrC
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ColdBootTraceMonitor@cbf9.start$1");
                    try {
                        if (C582710MtJ.LIZ && C582710MtJ.LIZ) {
                            C582710MtJ.LIZ = false;
                            C0XA7.LIZ.getClass();
                            C0XA7.LIZ("diagnosis_main_thread_trace_first_feed");
                            C0VWW.LIZIZ("diagnosis_main_thread_trace_first_feed");
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ColdBootTraceMonitor@cbf9.start$1");
                }
            });
        }
    }
}
