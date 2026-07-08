package com.ss.android.ugc.aweme.legoImp.task;

import X.C01GW;
import X.C09JN;
import X.C0B6C;
import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C0VZQ;
import X.C0VZR;
import X.C0VZS;
import X.C13LE;
import X.C1563860qnY;
import X.C1610310s0T;
import X.C1878330yyl;
import X.C1906580ziK;
import X.C2206191BWf;
import X.C2206201BWg;
import X.C2217381BqS;
import X.C2238821Cjw;
import X.C277730AuZ;
import X.C297740Blk;
import X.C452501pT;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC1583760rJe;
import X.InterfaceC2217461Bqa;
import X.InterfaceC799590VYf;
import Y.ARunnableS28S1200000_24;
import Y.ARunnableS29S1100000_24;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.crash.monitor.k;
import com.bytedance.router.AbsOpenResultCallback;
import com.bytedance.router.RouteManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import kotlin.Unit;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class ArsenalPreloadInitTask implements C0CCZ, InterfaceC799590VYf {
    public static final ArsenalPreloadInitTask LLILLJJLI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public static final C01GW LLILZ;
    public volatile C1878330yyl LL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ArsenalPreloadInitTask.class, "preloadService", "getPreloadService()Lknit/Option;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILLJJLI = new ArsenalPreloadInitTask();
        LLILZ = C452501pT.LIZIZ(new C0VZS());
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "ArsenalPreloadInitTask";
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
    public final int priority() {
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
        return EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        if (C297740Blk.LIZ() || ((Boolean) C277730AuZ.LIZ.getValue()).booleanValue() || ((Boolean) C0B6C.LIZ.getValue()).booleanValue()) {
            RouteManager.getInstance().addGlobalResultCallback(new AbsOpenResultCallback() { // from class: X.1BWe
                @Override // com.bytedance.router.AbsOpenResultCallback, com.bytedance.router.OpenResultCallback
                public final void onOpen(Intent intent) {
                    ComponentName component;
                    String strLJJIJIIJIL;
                    C1951107kb.LIZIZ(this, intent);
                    if (intent != null && (component = intent.getComponent()) != null && (strLJJIJIIJIL = C2204961BRm.LJJIJIIJIL(component, new C0WZX("YDZ1SA0xEdrOUFsuRBbKSh+/6s8=", null))) != null) {
                        ((C2206201BWg) C2238821Cjw.LIZLLL.getValue()).LIZ(new ARunnableS28S1200000_24(null, strLJJIJIIJIL, null, 5));
                    }
                }
            });
            C1906580ziK.LIZJ().LJIIIZ().LJLLLLLL(new C09JN() { // from class: X.15mo
                @Override // X.C09JN
                public final void accept(Object obj) {
                    Activity activityLIZ;
                    C1C7U.LIZ("ArsenalPreloadInitTask@82cb.initCallback$2");
                    Activity activityLIZIZ = ((C813430VvZ) obj).LIZ.LIZIZ();
                    if (activityLIZIZ != null && (activityLIZ = C085T.LIZ(activityLIZIZ)) != null) {
                        ((C2206201BWg) C2238821Cjw.LIZLLL.getValue()).LIZ(new ARunnableS29S1100000_24(activityLIZ, activityLIZ.getClass().getName(), 3));
                    }
                    C1C7U.LIZIZ("ArsenalPreloadInitTask@82cb.initCallback$2");
                }
            });
            C1906580ziK.LIZJ().LJII().LJLLLLLL(new C09JN() { // from class: X.0Rn6
                @Override // X.C09JN
                public final void accept(Object obj) {
                    Activity activityLIZ;
                    List<C1576580r84<?>> listLIZ;
                    C1C7U.LIZ("ArsenalPreloadInitTask@82cb.initCallback$3");
                    Activity activityLIZIZ = ((AbstractC1387200mCc) obj).LIZIZ();
                    if (activityLIZIZ != null && (activityLIZ = C085T.LIZ(activityLIZIZ)) != null && (listLIZ = C1565080qpW.LIZ(activityLIZ.getClass().getName())) != null) {
                        Iterator<C1576580r84<?>> it2 = listLIZ.iterator();
                        while (it2.hasNext()) {
                            C2238831Cjx.LIZJ(it2.next(), null);
                        }
                    }
                    C1C7U.LIZIZ("ArsenalPreloadInitTask@82cb.initCallback$3");
                }
            });
            C2206191BWf.LIZ = (C0VZR) LLILZ.getValue();
            C2206191BWf.LIZJ = false;
            ((C2206201BWg) C2238821Cjw.LIZLLL.getValue()).LIZ(new ARunnableS28S1200000_24(new Intent(), "com.ss.android.ugc.aweme.main.MainActivity", new AwS578S0100000_34(context, 40), 5));
            C1563860qnY.LIZIZ = false;
            C1563860qnY.LIZ = new InterfaceC1583760rJe() { // from class: X.0Vgh
                @Override // X.InterfaceC1583760rJe
                public final void LIZJ(Exception exc) {
                    try {
                        C2344809Gs.LJI(exc);
                        PrintStream printStream = System.err;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("parent is null");
                        sbLIZ.append(": ");
                        sbLIZ.append(Log.getStackTraceString(exc));
                        printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                        k.LIZJ().LJFF(4);
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                }

                @Override // X.InterfaceC1583760rJe
                public final void log(String str) {
                    C2344809Gs.LIZLLL(4, "hox-init", str);
                    PrintStream printStream = System.err;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("hox-init");
                    sbLIZ.append(": ");
                    sbLIZ.append(str);
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                }
            };
        }
        if (!C297740Blk.LIZ()) {
            C1878330yyl c1878330yyl = this.LL;
            if (c1878330yyl == null) {
                synchronized (this) {
                    c1878330yyl = this.LL;
                    if (c1878330yyl == null) {
                        c1878330yyl = new C1878330yyl(new C0VZQ() { // from class: X.0VZO
                            public static final ExecutorService LIZ;

                            static {
                                C2123408To c2123408To = new C2123408To(C0WQX.FIXED);
                                c2123408To.LIZIZ = "homepage-main-preload-serial-t";
                                c2123408To.LIZJ = 3;
                                c2123408To.LJI = new ThreadFactory() { // from class: X.0Uv6
                                    @Override // java.util.concurrent.ThreadFactory
                                    public final Thread newThread(final Runnable runnable) {
                                        BPEAThread bPEAThread = new BPEAThread(new Runnable() { // from class: X.0Uv5
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                C1C7U.LIZ("MainContainerPreloadServiceImpl$Companion@96a0.getBuilder$1$1");
                                                try {
                                                    try {
                                                        C0X35.LJ();
                                                    } finally {
                                                    }
                                                    Runnable runnable2 = runnable;
                                                    if (runnable2 != null) {
                                                        runnable2.run();
                                                    }
                                                } catch (Throwable th) {
                                                    TryCatchGuardChecker.doCheck(th);
                                                    if (!C2179971ATj.LIZ(th)) {
                                                    }
                                                }
                                                C1C7U.LIZIZ("MainContainerPreloadServiceImpl$Companion@96a0.getBuilder$1$1");
                                            }
                                        });
                                        ThreadMethodProxy.setName(bPEAThread, "homepage-main-preload-assem-t");
                                        return bPEAThread;
                                    }
                                };
                                LIZ = C823050WQl.LIZ(new C2123508Tp(c2123408To));
                            }

                            @Override // X.C0VZQ
                            public final void LIZ() {
                                final ExecutorService executorService = LIZ;
                                executorService.execute(new Runnable() { // from class: X.0qmO
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean zLIZ;
                                        C1C7U.LIZ("MainContainerPreloadServiceImpl@3ae3.commitPreloadAssemTask$1");
                                        try {
                                            C1563730qnL c1563730qnL = C1563730qnL.LLJ;
                                            if (c1563730qnL == null) {
                                                c1563730qnL = new C1563730qnL();
                                            }
                                            C1563730qnL.LLJ = c1563730qnL;
                                            c1563730qnL.LJIIIZ();
                                            executorService.execute(new Runnable() { // from class: X.0qmP
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    boolean zLIZ2;
                                                    C1C7U.LIZ("MainContainerPreloadServiceImpl@3ae3.commitPreloadAssemTask$1$1");
                                                    try {
                                                        C1563170qmR c1563170qmR = C1563170qmR.LLJ;
                                                        if (c1563170qmR == null) {
                                                            c1563170qmR = new C1563170qmR();
                                                        }
                                                        C1563170qmR.LLJ = c1563170qmR;
                                                        c1563170qmR.LJIIIZ();
                                                    } finally {
                                                        if (!zLIZ2) {
                                                        }
                                                    }
                                                    C1C7U.LIZIZ("MainContainerPreloadServiceImpl@3ae3.commitPreloadAssemTask$1$1");
                                                }
                                            });
                                            executorService.execute(new Runnable() { // from class: X.0qmQ
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    boolean zLIZ2;
                                                    C1C7U.LIZ("MainContainerPreloadServiceImpl@3ae3.commitPreloadAssemTask$1$2");
                                                    try {
                                                        C1563210qmV c1563210qmV = C1563210qmV.LLJ;
                                                        if (c1563210qmV == null) {
                                                            c1563210qmV = new C1563210qmV();
                                                        }
                                                        C1563210qmV.LLJ = c1563210qmV;
                                                        c1563210qmV.LJIIIZ();
                                                        C1563200qmU c1563200qmU = C1563200qmU.LLJ;
                                                        if (c1563200qmU == null) {
                                                            c1563200qmU = new C1563200qmU();
                                                        }
                                                        C1563200qmU.LLJ = c1563200qmU;
                                                        c1563200qmU.LJIIIZ();
                                                    } finally {
                                                        if (!zLIZ2) {
                                                        }
                                                    }
                                                    C1C7U.LIZIZ("MainContainerPreloadServiceImpl@3ae3.commitPreloadAssemTask$1$2");
                                                }
                                            });
                                            executorService.execute(new Runnable() { // from class: X.0qmN
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    boolean zLIZ2;
                                                    C1C7U.LIZ("MainContainerPreloadServiceImpl@3ae3.commitPreloadAssemTask$1$3");
                                                    try {
                                                        C1563110qmL c1563110qmL = C1563110qmL.LLJ;
                                                        if (c1563110qmL == null) {
                                                            c1563110qmL = new C1563110qmL();
                                                        }
                                                        C1563110qmL.LLJ = c1563110qmL;
                                                        c1563110qmL.LJIIIZ();
                                                    } finally {
                                                        if (!zLIZ2) {
                                                        }
                                                    }
                                                    C1C7U.LIZIZ("MainContainerPreloadServiceImpl@3ae3.commitPreloadAssemTask$1$3");
                                                }
                                            });
                                        } finally {
                                            if (!zLIZ) {
                                            }
                                        }
                                        C1C7U.LIZIZ("MainContainerPreloadServiceImpl@3ae3.commitPreloadAssemTask$1");
                                    }
                                });
                            }
                        });
                        this.LL = c1878330yyl;
                    }
                }
            }
            Object obj = c1878330yyl.LL;
            if (Intrinsics.LJFF(obj, C1610310s0T.LIZ)) {
                obj = null;
            }
            C0VZQ c0vzq = (C0VZQ) obj;
            if (c0vzq != null) {
                c0vzq.LIZ();
            }
        }
    }
}
