package com.ss.android.ugc.awemepushlib.interaction;

import X.C0CCZ;
import X.C0CD2;
import X.C0VU1;
import X.C0VZ0;
import X.C1492110ovp;
import X.C1791706zz;
import X.C304790Bx7;
import X.C786410Ut5;
import X.C810890VrT;
import X.C823050WQl;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799780VYy;
import Y.AObjectS62S0000000_9;
import Y.ARunnableS109S0100000_9;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes10.dex */
public final class PushSheduler {
    public static final ExecutorService LIZ;
    public static final Deque<Runnable> LIZIZ = new LinkedList();
    public static volatile boolean LIZJ = false;
    public static volatile int LIZLLL = 0;

    public static class InitPushFullyTask implements C0CCZ, InterfaceC799780VYy {
        @Override // X.InterfaceC799780VYy
        public final long LIZ() {
            return 1000L;
        }

        @Override // X.InterfaceC799780VYy
        public final /* synthetic */ void LJ(Long l) {
        }

        @Override // X.InterfaceC799780VYy
        public final void LJFF() {
        }

        @Override // X.InterfaceC800080Va2
        public final /* synthetic */ List finalizedBy() {
            return null;
        }

        @Override // X.InterfaceC800080Va2
        public final String key() {
            return "InitPushFullyTask";
        }

        @Override // X.InterfaceC800080Va2
        public final /* synthetic */ boolean meetTrigger() {
            return true;
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

        @Override // X.C0CCZ
        public final EnumC799870VZh type() {
            return ((Boolean) C0CD2.LJJLL.getValue()).booleanValue() ? EnumC799870VZh.BACKGROUND : EnumC799870VZh.IDLE;
        }

        @Override // X.InterfaceC799780VYy
        public final C0VU1 threadType() {
            return C0VU1.CPU;
        }

        @Override // X.InterfaceC308150C6b
        public final void run(Context context) {
            C810890VrT c810890VrT = C810890VrT.LIZIZ;
            c810890VrT.LJFF("initPushFully_in_InitPushFullyTask");
            c810890VrT.LJIIL("initPushFully_in_InitPushFullyTask");
            PushSheduler.LIZIZ();
            c810890VrT.LJI("initPushFully_in_InitPushFullyTask");
            c810890VrT.LJIIJJI("initPushFully_in_InitPushFullyTask");
        }
    }

    static {
        LIZ = C786410Ut5.d4(1);
        if (((Boolean) C1791706zz.LIZIZ.getValue()).booleanValue()) {
            LIZ = C823050WQl.LJFF();
        }
    }

    public static synchronized void LIZIZ() {
        if (LIZJ) {
            return;
        }
        try {
            if (LIZLLL != 0) {
                while (true) {
                    Deque<Runnable> deque = LIZIZ;
                    if (((LinkedList) deque).size() <= 0) {
                        break;
                    }
                    Runnable runnable = (Runnable) ((LinkedList) deque).pop();
                    if (runnable != null) {
                        runnable.run();
                    }
                }
                LIZJ = true;
                C810890VrT.LIZIZ.LJIILLIIL("init_push_fully");
            }
        } catch (NoSuchElementException e) {
            TryCatchGuardChecker.doCheck(e);
            C810890VrT c810890VrT = C810890VrT.LIZIZ;
            c810890VrT.LIZIZ("exception_initPushFully", e);
            c810890VrT.LJIILLIIL("init_push_fully");
        }
    }

    public static void LIZ(int i) {
        boolean z;
        LIZLLL = i;
        if (i != 2 && i != 3) {
            if (i == 4) {
                C810890VrT c810890VrT = C810890VrT.LIZIZ;
                c810890VrT.LJFF("initPushFully_immediately_in_initPushByFlag");
                c810890VrT.LJIIL("initPushFully_immediately_in_initPushByFlag");
                LIZIZ();
                c810890VrT.LJI("initPushFully_immediately_in_initPushByFlag");
                c810890VrT.LJIIJJI("initPushFully_immediately_in_initPushByFlag");
            }
        } else {
            AObjectS62S0000000_9 aObjectS62S0000000_9 = new AObjectS62S0000000_9(5);
            AObjectS62S0000000_9 aObjectS62S0000000_92 = new AObjectS62S0000000_9(6);
            C304790Bx7.LIZ.getClass();
            int iLIZ = C304790Bx7.LIZ();
            int i2 = C304790Bx7.LJFF;
            if ((iLIZ & i2) == i2) {
                z = true;
            } else {
                z = false;
            }
            C1492110ovp.LIZJ("InitPushFully_IDEL", aObjectS62S0000000_9, aObjectS62S0000000_92, z);
        }
        C810890VrT.LIZIZ.LJIILLIIL("init_push_by_flag");
    }

    public static void LIZJ(Runnable runnable) {
        LIZ.execute(new ARunnableS109S0100000_9(runnable, 118));
    }
}
