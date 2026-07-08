package com.ss.android.ugc.aweme.creative.taskscheduler.scheduler;

import X.AbstractRunnableC21377818lM;
import X.C01GW;
import X.C0TJZ;
import X.C20174513wl;
import X.C21378118lP;
import X.C2188811AlT;
import X.C452501pT;
import X.C786410Ut5;
import X.C823050WQl;
import X.EnumC1779780wPo;
import X.InterfaceC20174613wm;
import X.InterfaceC21378318lR;
import Y.ARunnableS101S0200000_32;
import Y.ARunnableS105S0000000_32;
import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.creative.taskscheduler.ResourceUsageThresholdConfig;
import com.ss.android.ugc.aweme.creative.taskscheduler.resource.ResourceType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class g {
    public static final g LIZ = new g();
    public static final ExecutorService LIZIZ = C823050WQl.LIZLLL();
    public static final C01GW LIZJ;
    public static final BPEAHandler LIZLLL;
    public static final ArrayList<AbstractRunnableC21377818lM> LJ;
    public static int LJFF;
    public static final ArrayList<InterfaceC21378318lR> LJI;
    public static ResourceUsageThresholdConfig LJII;
    public static boolean LJIIIIZZ;
    public static InterfaceC20174613wm LJIIIZ;
    public static volatile long LJIIJ;
    public static final ARunnableS105S0000000_32 LJIIJJI;
    public static final ARunnableS105S0000000_32 LJIIL;
    public static final ARunnableS105S0000000_32 LJIILIIL;

    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(46));
        LIZJ = c01gwLIZIZ;
        LIZLLL = new BPEAHandler(C786410Ut5.W2((HandlerThread) c01gwLIZIZ.getValue()));
        LJ = new ArrayList<>();
        LJFF = Math.max(2, Runtime.getRuntime().availableProcessors() / 2);
        LJI = new ArrayList<>();
        LJII = new ResourceUsageThresholdConfig(0.7f, 0.9f, -1, 30000L, 0L);
        LJIIJJI = new ARunnableS105S0000000_32(1);
        LJIIL = new ARunnableS105S0000000_32(2);
        LJIILIIL = new ARunnableS105S0000000_32(3);
    }

    public final synchronized void LIZ(C20174513wl c20174513wl) {
        LJIIIZ = c20174513wl;
    }

    public final synchronized void LIZIZ(C21378118lP c21378118lP) {
        LJI.add(c21378118lP);
    }

    public final synchronized void LIZLLL(ResourceType resourceType) {
        Iterator<InterfaceC21378318lR> it2 = LJI.iterator();
        while (it2.hasNext()) {
            it2.next().LJ();
        }
    }

    public final synchronized void LJ(AbstractRunnableC21377818lM abstractRunnableC21377818lM) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("on task end: ");
        sbLIZ.append(abstractRunnableC21377818lM);
        C0TJZ.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        LJ.remove(abstractRunnableC21377818lM);
        InterfaceC20174613wm interfaceC20174613wm = LJIIIZ;
        if (interfaceC20174613wm != null) {
            interfaceC20174613wm.LIZ(System.currentTimeMillis() - abstractRunnableC21377818lM.LLILLJJLI, abstractRunnableC21377818lM.LLILLL.LIZ);
        }
        Iterator<InterfaceC21378318lR> it2 = LJI.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(abstractRunnableC21377818lM);
        }
        long j = LJIIJ;
        if (j <= 0) {
            Iterator<InterfaceC21378318lR> it3 = LJI.iterator();
            while (it3.hasNext()) {
                it3.next().LIZJ();
            }
        } else {
            C786410Ut5.LJLIIL(j, LIZLLL, new ARunnableS105S0000000_32(4));
        }
    }

    public final synchronized void LJFF(C21378118lP c21378118lP) {
        LJI.remove(c21378118lP);
    }

    public final synchronized void LIZJ(HashMap map, List list, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            AbstractRunnableC21377818lM abstractRunnableC21377818lM = (AbstractRunnableC21377818lM) it2.next();
            if (!z && LJ.size() >= LJFF) {
                break;
            }
            if (abstractRunnableC21377818lM.LL == EnumC1779780wPo.PENDING && !LJ.contains(abstractRunnableC21377818lM)) {
                if (!z && map != null) {
                    List<? extends ResourceType> list2 = abstractRunnableC21377818lM.LLILLL.LIZJ;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator<? extends ResourceType> it3 = list2.iterator();
                        while (it3.hasNext()) {
                            if (Intrinsics.LJFF(map.get(it3.next()), Boolean.TRUE)) {
                                break;
                            }
                        }
                    }
                }
                LIZIZ.submit(new ARunnableS101S0200000_32(this, abstractRunnableC21377818lM, 16));
                LJ.add(abstractRunnableC21377818lM);
                arrayList.add(abstractRunnableC21377818lM);
            }
        }
        Iterator<InterfaceC21378318lR> it4 = LJI.iterator();
        while (it4.hasNext()) {
            it4.next().LIZLLL(arrayList);
        }
    }
}
