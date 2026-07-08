package com.ss.android.ugc.aweme.legoImp.task;

import X.C01GW;
import X.C0CCZ;
import X.C0SZO;
import X.C0SZP;
import X.C0VU1;
import X.C0VZ0;
import X.C11HC;
import X.C1505640pHe;
import X.C1557550qdN;
import X.C1562460qlI;
import X.C1562480qlK;
import X.C1562540qlQ;
import X.C2537509wz;
import X.C2537709x1;
import X.C2537809x2;
import X.C2538309x7;
import X.C2538409x8;
import X.C2538509x9;
import X.C2538609xA;
import X.C2538709xB;
import X.C2538809xC;
import X.C297740Blk;
import X.C302900Bu4;
import X.C452501pT;
import X.C725080ScM;
import X.C725450Scx;
import X.C823050WQl;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC1554870qZ3;
import X.InterfaceC1557560qdO;
import X.InterfaceC494301wD;
import X.InterfaceC723410SZf;
import X.InterfaceC723720SaA;
import X.InterfaceC723950SaX;
import X.InterfaceC724700Sbk;
import X.InterfaceC725460Scy;
import X.InterfaceC738110SxN;
import X.InterfaceC799590VYf;
import android.content.Context;
import androidx.lifecycle.SharedVMInjector;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes25.dex */
public final class AssemInitTask implements C0CCZ, InterfaceC799590VYf {
    public static final AssemInitTask LL = new AssemInitTask();
    public static final AtomicBoolean LLILLJJLI = new AtomicBoolean(false);
    public static final C01GW LLILLL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "AssemInitTask";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
    }

    @Override // X.InterfaceC799590VYf
    public final int priority() {
        return 1;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 16777215;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    static {
        new CopyOnWriteArrayList();
        LLILLL = C452501pT.LIZIZ(new C1505640pHe());
    }

    @Override // X.InterfaceC800080Va2
    public final boolean meetTrigger() {
        return !LLILLJJLI.get();
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
        AtomicBoolean atomicBoolean = LLILLJJLI;
        if (atomicBoolean.get()) {
            return;
        }
        C1562480qlK c1562480qlK = new C1562480qlK();
        C1562460qlI c1562460qlI = c1562480qlK.LIZ;
        if (c1562460qlI == null) {
            synchronized (c1562480qlK) {
                c1562460qlI = c1562480qlK.LIZ;
                if (c1562460qlI == null) {
                    c1562460qlI = new C1562460qlI();
                    c1562480qlK.LIZ = c1562460qlI;
                }
            }
        }
        C725080ScM.LIZ = false;
        C1557550qdN.LJ = false;
        C1557550qdN.LJFF = C2538309x7.LIZ;
        C725080ScM.LIZLLL = C302900Bu4.LIZ;
        C725080ScM.LJIJ = c1562460qlI.LJ();
        C725080ScM.LJFF = false;
        C725080ScM.LJ = false;
        C725450Scx.LIZJ = true;
        Executor executorLJIIIIZZ = C1562460qlI.LJIIIIZZ();
        if (executorLJIIIIZZ != null) {
            C725080ScM.LJIL = executorLJIIIIZZ;
        }
        ExecutorService executorServiceLIZLLL = C823050WQl.LIZLLL();
        if (executorServiceLIZLLL != null) {
            C725080ScM.LJJ = executorServiceLIZLLL;
        }
        C725080ScM.LJIILIIL = new InterfaceC723950SaX() { // from class: X.0qlO
            @Override // X.InterfaceC723950SaX
            public final void LIZ(final C08C3 c08c3) {
                C0CP3 c0cp3 = new C0CP3() { // from class: X.0qlj
                    @Override // X.C0CP3
                    public final void LIZ() {
                        c08c3.invoke();
                    }
                };
                if (C0CP9.LIZ == C0CP8.COLD_BOOT_BEGIN) {
                    C0CP9.LIZIZ.add(c0cp3);
                } else {
                    c08c3.invoke();
                }
            }
        };
        InterfaceC738110SxN interfaceC738110SxNLIZLLL = C1562460qlI.LIZLLL();
        if (interfaceC738110SxNLIZLLL != null) {
            C725080ScM.LJJIJ = interfaceC738110SxNLIZLLL;
        }
        C11HC c11hcLJIILJJIL = C1562460qlI.LJIILJJIL();
        if (c11hcLJIILJJIL != null) {
            C725080ScM.LJJIJIIJI = c11hcLJIILJJIL;
        }
        C725080ScM.LJIIL = false;
        C725450Scx.LIZ = new InterfaceC725460Scy() { // from class: X.0Sd4
            @Override // X.InterfaceC725460Scy
            public final void report(String str, Map<String, String> map) {
                if (!map.containsKey("event_tag")) {
                    map.put("event_tag", str);
                }
                C20684815ws.LJIILLIIL("infra_product_arch_lib_track", map);
            }
        };
        Executor executorLJIJ = C1562460qlI.LJIJ();
        if (executorLJIJ != null) {
            C725450Scx.LIZIZ = executorLJIJ;
        }
        if (!c1562460qlI.LIZJ) {
            c1562480qlK.LIZ().LIZ();
        }
        C1562460qlI.LJIL();
        C1562460qlI.LJIJJLI();
        C725080ScM.LJIIIZ = new InterfaceC723410SZf() { // from class: X.0ScR
            @Override // X.InterfaceC723410SZf
            public final void LIZ() {
                C2187451AjH.LJJI(1000L);
            }
        };
        C725080ScM.LJIIIIZZ = false;
        InterfaceC724700Sbk interfaceC724700SbkLJIIZILJ = C1562460qlI.LJIIZILJ();
        if (interfaceC724700SbkLJIIZILJ != null) {
            C725080ScM.LIZJ = interfaceC724700SbkLJIIZILJ;
        }
        C0SZO.LIZ = new C0SZP() { // from class: X.0qlh
            @Override // X.C0SZP
            public final void log(String str, String str2) {
                C2344809Gs.LIZLLL(4, str, str2);
            }
        };
        C0SZO.LIZIZ = C0SZO.LIZIZ;
        C0SZO.LIZJ = C1562460qlI.LJIILIIL();
        C725080ScM.LIZIZ = new InterfaceC723720SaA() { // from class: X.0qlg
            @Override // X.InterfaceC723720SaA
            public final void LIZIZ(String str, Exception exc) throws Exception {
                C2344809Gs.LIZIZ(str, exc);
            }

            @Override // X.InterfaceC723720SaA
            public final void log(String str, String str2) {
                C2344809Gs.LIZLLL(4, str, str2);
            }
        };
        InterfaceC1557560qdO interfaceC1557560qdOLJIJJ = C1562460qlI.LJIJJ();
        if (interfaceC1557560qdOLJIJJ != null) {
            C1557550qdN.LIZLLL = interfaceC1557560qdOLJIJJ;
        }
        C1557550qdN.LIZ = C1562460qlI.LJFF();
        C1557550qdN.LJI = C1562460qlI.LIZJ();
        InterfaceC1554870qZ3 interfaceC1554870qZ3LJIJI = C1562460qlI.LJIJI();
        if (interfaceC1554870qZ3LJIJI != null) {
            C1557550qdN.LIZJ = interfaceC1554870qZ3LJIJI;
        }
        SharedVMInjector.INSTANCE.setOptimiseVMLifecycleCounter(C2538809xC.LIZ);
        C725080ScM.LJIILJJIL = C1562460qlI.LJIILIIL();
        C725080ScM.LJIILL = C1562460qlI.LJIIIZ();
        C725080ScM.LJIILLIIL = C1562460qlI.LJIIJJI();
        C725080ScM.LJIIZILJ = C1562460qlI.LJIILLIIL();
        C725080ScM.LJJIFFI = C1562460qlI.LJIIJ();
        C725080ScM.LJJI = C2538409x8.LIZ;
        C725080ScM.LJIJI = C2538509x9.LIZ;
        C725080ScM.LJJIIJZLJL = C2537709x1.LIZ;
        C725080ScM.LJJIIZ = C2537809x2.LIZ;
        List<Class<? extends InterfaceC494301wD>> listLJI = C1562460qlI.LJI();
        if (listLJI != null) {
            ((ArrayList) C1562540qlQ.LIZ.getValue()).addAll(listLJI);
        }
        List<Class<? extends InterfaceC494301wD>> listLJIILL = C1562460qlI.LJIILL();
        if (listLJIILL != null) {
            ((ArrayList) C1562540qlQ.LIZIZ.getValue()).addAll(listLJIILL);
        }
        if (C297740Blk.LIZ()) {
            C725080ScM.LJJII = c1562460qlI.LIZIZ();
            C725080ScM.LJJIII = true;
        }
        C725080ScM.LJJIIJ = C2537509wz.LIZ;
        C1562540qlQ.LIZJ = C297740Blk.LIZ();
        C1562540qlQ.LIZLLL = C2538709xB.LIZ;
        C725080ScM.LJIJJ = C2538609xA.LIZ;
        atomicBoolean.set(true);
    }
}
