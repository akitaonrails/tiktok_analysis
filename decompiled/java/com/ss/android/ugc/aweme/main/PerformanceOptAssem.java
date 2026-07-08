package com.ss.android.ugc.aweme.main;

import X.AnonymousClass0716;
import X.C01GW;
import X.C052X;
import X.C08TN;
import X.C09JN;
import X.C0CAX;
import X.C0CBE;
import X.C0CCZ;
import X.C0CFN;
import X.C0CFX;
import X.C0CFY;
import X.C0CM3;
import X.C0CM5;
import X.C0CMA;
import X.C0CME;
import X.C0CMG;
import X.C0CMJ;
import X.C0COE;
import X.C0COF;
import X.C0N5P;
import X.C0NBO;
import X.C0S78;
import X.C0T98;
import X.C0VU1;
import X.C0VWW;
import X.C0VZ0;
import X.C0X35;
import X.C104100aN;
import X.C1150504el;
import X.C11JF;
import X.C1217404pY;
import X.C1220104pz;
import X.C1220604q4;
import X.C1239204t4;
import X.C1492110ovp;
import X.C15438062q;
import X.C1601810rml;
import X.C1601860rmq;
import X.C17965071v;
import X.C1866350yfR;
import X.C1867590yhR;
import X.C1867600yhS;
import X.C1867710yhd;
import X.C1906580ziK;
import X.C1942507jD;
import X.C19EG;
import X.C1BCA;
import X.C1E77;
import X.C1EDN;
import X.C202111146j;
import X.C20622086a;
import X.C20639086r;
import X.C2113808Pw;
import X.C21143617og;
import X.C21145417oy;
import X.C21145617p0;
import X.C21145717p1;
import X.C21145917p3;
import X.C21146417p8;
import X.C21146717pB;
import X.C2184081Adq;
import X.C2184111Adt;
import X.C2184351AeH;
import X.C2184371AeJ;
import X.C2184391AeL;
import X.C2184411AeN;
import X.C2184461AeS;
import X.C2184791Aez;
import X.C2184911AfB;
import X.C2185121AfW;
import X.C2185281Afm;
import X.C2187451AjH;
import X.C2200821BBo;
import X.C2201101BCq;
import X.C2548809yo;
import X.C304790Bx7;
import X.C310300CEi;
import X.C312230CLt;
import X.C312240CLu;
import X.C452501pT;
import X.C584360Mvy;
import X.C687700QyG;
import X.C724240Sb0;
import X.C740760T3y;
import X.C786410Ut5;
import X.C799900VZk;
import X.C810560Vqw;
import X.EnumC2184731Aet;
import X.EnumC312610CNf;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.ExecutorC2043307zT;
import X.InterfaceC1554640qYg;
import X.InterfaceC21138617ns;
import X.InterfaceC21143917oj;
import X.InterfaceC2184631Aej;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import X.InterfaceC799780VYy;
import Y.ARunnableS103S0100000_3;
import Y.ARunnableS104S0100000_4;
import Y.ARunnableS106S0000000_33;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes34.dex */
public final class PerformanceOptAssem extends BaseMainContainerAssem implements IPerformanceAbility, InterfaceC1554640qYg, InterfaceC737790Swr {
    public C11JF LLILZ;
    public C0CBE LLILZIL;
    public final PerformanceOptAssem LL = this;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C0COF());
    public final C01GW LLILLL = C452501pT.LIZIZ(new C2184461AeS());
    public final String LLILZLL = "FeedRecommendFragment";
    public final C01GW LLIZ = C452501pT.LIZIZ(new C2184351AeH());
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(149));
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(150));
    public final C01GW LLJI = C452501pT.LIZIZ(new C0COE());
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new C2184111Adt(this));

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        String strJ4 = C786410Ut5.j4("main_act_assem_lifecycle_%s_%s", new Object[]{"PerformanceOptAssem", "onCreate"});
        C1150504el.LIZ().LIZLLL(strJ4, false);
        super.onCreate();
        C0X35.LIZ("assem_performance_opt_oncreate_duration", false);
        if (((Boolean) C1EDN.LIZLLL.getValue()).booleanValue()) {
            C104100aN.LIZ().LJJIJL(new ARunnableS103S0100000_3(this, 43));
        } else {
            m255do();
        }
        if (C052X.LIZIZ()) {
            C0X35.LJIIIIZZ(C786410Ut5.v2(), new Runnable() { // from class: X.0CFf
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PerformanceOptAssem@fe29.onCreate$2");
                    try {
                        C312230CLt.LIZ(C0CME.FIRST_UI_FRAME);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PerformanceOptAssem@fe29.onCreate$2");
                }
            });
        }
        C312240CLu.LIZ(new C0CM3(C0CMJ.NORMAL_PRIORITY.getType(), C0CME.START_UP_END, "", new AwS547S0100000_3(this, 35), true));
        if (((Boolean) C2185281Afm.LIZIZ.getValue()).booleanValue()) {
            C0CM3 c0cm3 = new C0CM3();
            c0cm3.LIZIZ = true;
            c0cm3.LIZJ = C0CMJ.HIGH_PRIORITY.getType();
            c0cm3.LJI = new AwS577S0100000_33(this, 2848);
            C312240CLu.LIZ(c0cm3);
        }
        C0CM3 c0cm32 = new C0CM3();
        c0cm32.LIZIZ = true;
        c0cm32.LIZJ = C0CMJ.HIGH_PRIORITY.getType();
        c0cm32.LJI = new AwS572S0100000_28(this, 299);
        C312240CLu.LIZ(c0cm32);
        C104100aN.LIZ().LJJIJL(new ARunnableS104S0100000_4(this, 30));
        C1BCA.LJIJJLI(EnumC312610CNf.SATRTUP, (C0CMG) this.LLJI.getValue());
        C0S78.LJFF(true, AFwS224S0000000_33.get$arr$(396));
        C0X35.LJIIJJI("assem_performance_opt_oncreate_duration", false);
        C1150504el.LIZ().LJI(strJ4, false);
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1222730094) {
            return null;
        }
        return this;
    }

    public final void bo() {
        if (((AtomicBoolean) this.LLILLL.getValue()).compareAndSet(false, true)) {
            C0CFY c0cfy = new C0CFY(this);
            C0CFX c0cfx = new C0CFX(this);
            C304790Bx7.LIZ.getClass();
            int iLIZ = C304790Bx7.LIZ();
            int i = C304790Bx7.LIZIZ;
            C1492110ovp.LIZJ("calllazy_idle", c0cfy, c0cfx, (iLIZ & i) == i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [X.0CBE, X.1Aej] */
    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final void m255do() {
        Integer numLIZJ;
        Integer numLIZJ2;
        List<InterfaceC21138617ns> listUnmodifiableList;
        C810560Vqw.LIZLLL(new Runnable() { // from class: X.0CFV
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PerformanceOptAssem@fe29.ensureLazyDoItFinallyCalled$1");
                try {
                    this.LL.bo();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PerformanceOptAssem@fe29.ensureLazyDoItFinallyCalled$1");
            }
        }, 10000);
        final C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            if (((Boolean) C2184411AeN.LIZLLL.getValue()).booleanValue() && C2184411AeN.LJI.compareAndSet(false, true)) {
                C21146717pB.LIZLLL(c19egLIZ, "common_feed_item_feed");
            }
            if (((Boolean) C2184411AeN.LIZJ.getValue()).booleanValue() && C2184411AeN.LJIIIIZZ.compareAndSet(false, true)) {
                C21146717pB.LIZJ.getClass();
                if (C21145417oy.LIZ(c19egLIZ) == null) {
                    throw new IllegalArgumentException("context must be an Activity, or a ContextWrapper which holds an Activity, or an ActivityProvider which holds an Activity.");
                }
                if (C21146717pB.LIZ.get() && (numLIZJ2 = C740760T3y.LIZJ("common_feed_item_feed")) != null) {
                    final int iIntValue = numLIZJ2.intValue();
                    InterfaceC21143917oj interfaceC21143917ojLIZLLL = C21145717p1.LJ.LIZLLL(c19egLIZ);
                    ReentrantReadWriteLock.ReadLock lock = C21145717p1.LIZIZ.readLock();
                    lock.lock();
                    try {
                        List<C21143617og> listLIZ = C21145717p1.LIZJ.LIZ(iIntValue);
                        synchronized (listLIZ) {
                            try {
                                Function1<C21143617og, Boolean> function1 = new Function1<C21143617og, Boolean>() { // from class: X.17oW
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Boolean invoke(C21143617og c21143617og) {
                                        return Boolean.valueOf(!c21143617og.LJII);
                                    }
                                };
                                ArrayList arrayList = new ArrayList();
                                for (C21143617og c21143617og : listLIZ) {
                                    if (((Boolean) function1.invoke(c21143617og)).booleanValue()) {
                                        arrayList.add(c21143617og);
                                    }
                                }
                                listUnmodifiableList = null;
                                if (!(!arrayList.isEmpty())) {
                                    arrayList = null;
                                }
                                if (arrayList != null) {
                                    C21145717p1.LIZJ.getClass();
                                    C21145917p3.LIZIZ(listLIZ, arrayList, c19egLIZ, interfaceC21143917ojLIZLLL);
                                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                                    Iterator it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                        arrayList2.add(((C21143617og) it2.next()).LJ);
                                    }
                                    listUnmodifiableList = Collections.unmodifiableList(arrayList2);
                                }
                            } finally {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        }
                        lock.unlock();
                        if (listUnmodifiableList != null) {
                            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listUnmodifiableList, 10));
                            for (final InterfaceC21138617ns interfaceC21138617ns : listUnmodifiableList) {
                                C0T98 c0t98 = new C0T98(c19egLIZ, interfaceC21138617ns, iIntValue) { // from class: X.17pE
                                    public Context LLILLJJLI;
                                    public InterfaceC21138617ns LLILLL;
                                    public Integer LLILZ;
                                    public String LLILZIL = "common_feed_item_feed";

                                    @Override // X.C0T98
                                    public final void LIZ() {
                                        this.LLILLJJLI = null;
                                        this.LLILLL = null;
                                        this.LLILZ = null;
                                        this.LLILZIL = null;
                                    }

                                    @Override // X.C0T98
                                    public final void LIZIZ() {
                                        InterfaceC21138617ns interfaceC21138617ns2;
                                        Integer num;
                                        Object c098200Yq;
                                        Context context = this.LLILLJJLI;
                                        if (context == null || (interfaceC21138617ns2 = this.LLILLL) == null || (num = this.LLILZ) == null) {
                                            return;
                                        }
                                        int iIntValue2 = num.intValue();
                                        String str = this.LLILZIL;
                                        if (str != null) {
                                            System.currentTimeMillis();
                                            try {
                                                InterfaceC21146617pA interfaceC21146617pA = C21145617p0.LIZ.LIZLLL;
                                                if (interfaceC21146617pA != null) {
                                                    interfaceC21146617pA.LJII();
                                                }
                                                interfaceC21138617ns2.LIZIZ(context);
                                                c098200Yq = Unit.LIZ;
                                                C189200o6.m2constructorimpl(c098200Yq);
                                            } catch (Throwable th) {
                                                TryCatchGuardChecker.doCheck(th);
                                                c098200Yq = new C098200Yq(th);
                                                C189200o6.m2constructorimpl(c098200Yq);
                                            }
                                            if (C189200o6.m8isSuccessimpl(c098200Yq)) {
                                                System.currentTimeMillis();
                                                InterfaceC21146617pA interfaceC21146617pA2 = C21145617p0.LIZ.LIZLLL;
                                                if (interfaceC21146617pA2 != null) {
                                                    interfaceC21146617pA2.LIZJ();
                                                }
                                            }
                                            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                                            if (thM5exceptionOrNullimpl != null) {
                                                C21145717p1.LJI(iIntValue2, interfaceC21138617ns2);
                                                InterfaceC21146617pA interfaceC21146617pA3 = C21145617p0.LIZ.LIZLLL;
                                                if (interfaceC21146617pA3 != null) {
                                                    interfaceC21146617pA3.LJIILLIIL(str, thM5exceptionOrNullimpl);
                                                }
                                            }
                                        }
                                    }

                                    {
                                        this.LLILLJJLI = c19egLIZ;
                                        this.LLILLL = interfaceC21138617ns;
                                        this.LLILZ = Integer.valueOf(iIntValue);
                                    }
                                };
                                interfaceC21138617ns.LIZLLL(c0t98);
                                arrayList3.add(c0t98);
                            }
                            Iterator it3 = arrayList3.iterator();
                            while (it3.hasNext()) {
                                C21145617p0.LIZ.LIZJ.execute((Runnable) it3.next());
                            }
                        }
                    } catch (Throwable th) {
                        lock.unlock();
                        throw th;
                    }
                }
            }
            if (((Boolean) C2184411AeN.LJ.getValue()).booleanValue() && C2184411AeN.LJII.compareAndSet(false, true) && C21146717pB.LIZ.get() && (numLIZJ = C740760T3y.LIZJ("common_feed_item_feed")) != null) {
                C21146417p8.LIZ(numLIZJ.intValue(), "common_feed_item_feed");
            }
        }
        if (((Boolean) C1E77.LIZLLL.getValue()).booleanValue()) {
            C0S78.LJFF(true, new C0CAX());
        }
        if (((Boolean) C1866350yfR.LIZLLL.getValue()).booleanValue()) {
            C0S78.LJFF(true, AFwS219S0000000_30.get$arr$(82));
        }
        if (C1220604q4.LIZ()) {
            this.LLILZ = (C11JF) C1906580ziK.LIZJ().LJI().LJJLJLI(new C09JN() { // from class: X.00nq
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("PerformanceOptAssem@fe29.report0VVSomeTime$1");
                    C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new Runnable() { // from class: X.0CBB
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("PerformanceOptAssem@fe29.report0VVSomeTime$1$1");
                            try {
                                if (C1906580ziK.LJI()) {
                                    C786410Ut5.LJLIIL(((Number) C1245604u6.LIZJ.getValue()).intValue(), C799570VYd.LIZIZ(), new Runnable() { // from class: X.0CBC
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            boolean zLIZ2;
                                            C1C7U.LIZ("PerformanceOptAssem@fe29.report0VVSomeTime$1$1$1");
                                            try {
                                                if (C798410VTr.LIZ()) {
                                                    int code = C0CBG.CURRENT.getCode();
                                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                                    linkedHashMap.put("report_end_type", 2);
                                                    C798410VTr.LJI(code, linkedHashMap);
                                                }
                                            } finally {
                                                if (!zLIZ2) {
                                                }
                                            }
                                            C1C7U.LIZIZ("PerformanceOptAssem@fe29.report0VVSomeTime$1$1$1");
                                        }
                                    });
                                }
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("PerformanceOptAssem@fe29.report0VVSomeTime$1$1");
                        }
                    });
                    C1C7U.LIZIZ("PerformanceOptAssem@fe29.report0VVSomeTime$1");
                }
            });
            ?? r0 = new InterfaceC2184631Aej() { // from class: X.0CBE
                @Override // X.InterfaceC2184631Aej
                public final void onFragmentChange(String str, String str2, boolean z) {
                    if (a0.LJJIIZI(str, this.LIZ.LLILZLL, false) && str2.length() > 0 && !a0.LJJIIZI(str2, this.LIZ.LLILZLL, false)) {
                        C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new Runnable() { // from class: X.0CBD
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("PerformanceOptAssem@fe29.report0VVSomeTime$2$1");
                                try {
                                    if (C798410VTr.LIZ()) {
                                        int code = C0CBG.CURRENT.getCode();
                                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                                        linkedHashMap.put("report_end_type", 1);
                                        C798410VTr.LJI(code, linkedHashMap);
                                    }
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("PerformanceOptAssem@fe29.report0VVSomeTime$2$1");
                            }
                        });
                    }
                }
            };
            this.LLILZIL = r0;
            C2187451AjH.LJIIZILJ(r0);
            C0S78.LIZJ(new C0CM5(this), true);
        }
        if (((Boolean) C1867710yhd.LIZJ.getValue()).booleanValue()) {
            C0CM3 c0cm3 = new C0CM3();
            c0cm3.LIZIZ = true;
            c0cm3.LIZJ = C0CMJ.HIGH_PRIORITY.getType();
            c0cm3.LJI = AFwS200S0000000_13.get$arr$(154);
            C312240CLu.LIZ(c0cm3);
        }
        C0VWW.LJI("latency_app_start_olduser");
        C0VWW.LJI("latency_first_feed_show_olduser");
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final void onAssemLoaded() {
        super.onAssemLoaded();
        C0CFN.LJ = C786410Ut5.v2();
        C08TN.LIZ().LJ("main_act_decor_view_opt", false);
        C08TN.LIZ().LJI("main_act_decor_view_opt");
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        ((LinkedHashMap) C1239204t4.LIZ).clear();
        ExecutorC2043307zT executorC2043307zT = C2113808Pw.LIZIZ;
        if (executorC2043307zT.LL.hasMessages(2022)) {
            executorC2043307zT.LL.removeMessages(2022);
        }
        if (((Boolean) C17965071v.LIZ.getValue()).booleanValue()) {
            C20639086r.LJII = false;
        }
        if (C1220604q4.LIZ()) {
            C11JF c11jf = this.LLILZ;
            if (c11jf != null) {
                c11jf.dispose();
            }
            this.LLILZ = null;
        }
        if (C1220604q4.LIZ()) {
            ((CopyOnWriteArrayList) C2187451AjH.LJIIL).remove(this.LLILZIL);
            this.LLILZIL = null;
        }
        ((ArrayList) C584360Mvy.LIZ).clear();
        ((LinkedHashMap) C584360Mvy.LIZIZ).clear();
        if (C2548809yo.LIZ) {
            C310300CEi.LIZ.getClass();
            C799900VZk.LIZ.getClass();
            C799900VZk.LJI("5vv-live");
        }
        AFwS224S0000000_33 aFwS224S0000000_33 = AFwS224S0000000_33.get$arr$(670);
        if (((Boolean) C1867710yhd.LIZJ.getValue()).booleanValue()) {
            aFwS224S0000000_33.invoke();
        }
        if (((Boolean) C1601860rmq.LJII.getValue()).booleanValue()) {
            C1601810rml.LIZLLL = null;
            C1601810rml.LJ = null;
        }
        if (((Boolean) C2185121AfW.LIZLLL.getValue()).booleanValue()) {
            C2184371AeJ c2184371AeJ = C2184371AeJ.LIZ;
            Iterator it2 = ((CopyOnWriteArrayList) C2184371AeJ.LIZLLL).iterator();
            while (it2.hasNext()) {
                C2184371AeJ.LIZ.LIZ((String) it2.next());
            }
            C1942507jD.LIZ.clear();
            if (!C2184371AeJ.LJFF.isEmpty()) {
                C202111146j.LIZIZ((C2184391AeL) C2184371AeJ.LJI.getValue());
            }
        }
        C1BCA.LJJIJIIJI(EnumC312610CNf.SATRTUP, (C0CMG) this.LLJI.getValue());
        C2184081Adq c2184081Adq = (C2184081Adq) this.LLJIJIL.getValue();
        C2200821BBo.LIZ.getClass();
        if (!C2200821BBo.LIZ()) {
            C2201101BCq.LJIIIZ(EnumC2184731Aet.Scroll, c2184081Adq);
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null) {
            return;
        }
        C312230CLt.LJI = true;
        ((Set) C312230CLt.LJIIJ.getValue()).clear();
        C312230CLt.LIZJ().clear();
        ((Set) C312230CLt.LJIIJJI.getValue()).clear();
        ((Set) C312230CLt.LJIILIIL.getValue()).clear();
        if (((Boolean) C1217404pY.LIZIZ.getValue()).booleanValue()) {
            for (C0CME c0cme : C0CME.getEntries()) {
                ((CopyOnWriteArrayList) c0cme.getCache$launcher_lazy_util_release().LJFF.getValue()).clear();
                ((CopyOnWriteArrayList) c0cme.getCache$launcher_lazy_util_release().LIZLLL.getValue()).clear();
                ((CopyOnWriteArrayList) c0cme.getCache$launcher_lazy_util_release().LJ.getValue()).clear();
            }
        }
        C0CMA.LIZ(c19egLIZ, C0CME.FIRST_UI_FRAME);
        C0CMA.LIZ(c19egLIZ, C0CME.FIRST_VIDEO_SHOW);
        C0CMA.LIZ(c19egLIZ, C0CME.START_UP_END);
        if (C1220104pz.LIZ() || ((Boolean) C2184791Aez.LIZLLL.getValue()).booleanValue()) {
            C2184911AfB.LIZ.getClass();
            C0NBO.LIZ(new ARunnableS106S0000000_33(7));
        }
        if (((Boolean) C1867590yhR.LIZLLL.getValue()).booleanValue()) {
            C0N5P c0n5p = C0N5P.LIZ;
            ((CopyOnWriteArrayList) C0N5P.LJIIIZ.getValue()).remove(this.LLIZLLLIL.getValue());
        }
        if (((Boolean) C1867600yhS.LIZLLL.getValue()).booleanValue()) {
            C0N5P c0n5p2 = C0N5P.LIZ;
            ((CopyOnWriteArrayList) C0N5P.LJIIIZ.getValue()).remove(this.LLJ.getValue());
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        if (AnonymousClass0716.LIZLLL() != -1) {
            C20622086a.LIZ().LIZIZ();
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public final class IdleTask implements C0CCZ, InterfaceC799780VYy {
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
            return "LazyDoItTask";
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

        @Override // X.InterfaceC799780VYy
        public final C0VU1 threadType() {
            return C0VU1.CPU;
        }

        @Override // X.C0CCZ
        public final EnumC799870VZh type() {
            return EnumC799870VZh.IDLE;
        }

        public IdleTask() {
        }

        @Override // X.InterfaceC308150C6b
        public final void run(Context context) {
            Iterator it2 = ((CopyOnWriteArrayList) PerformanceOptAssem.this.LLILLJJLI.getValue()).iterator();
            while (it2.hasNext()) {
                ((Function0) it2.next()).invoke();
            }
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{MainActivityScope.class}).unbindAbility(this.LL, IPerformanceAbility.class);
    }

    @Override // com.ss.android.ugc.aweme.main.IPerformanceAbility
    public final void dt2(Function0<Unit> function0) {
        ((CopyOnWriteArrayList) this.LLILLJJLI.getValue()).add(function0);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{MainActivityScope.class}).bindAbility(this.LL, IPerformanceAbility.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b6  */
    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onWindowFocusChanged(boolean r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.PerformanceOptAssem.onWindowFocusChanged(boolean, boolean):void");
    }
}
