package com.ss.android.ugc.aweme.ecommercebase.monitor;

import X.C01GW;
import X.C09JN;
import X.C09Y5;
import X.C15O7;
import X.C1739650vN5;
import X.C1748800vbq;
import X.C1749860vdY;
import X.C1749880vda;
import X.C19489211Ms;
import X.C452501pT;
import X.C7879035x;
import X.InterfaceC1748820vbs;
import X.RunnableC823120WQs;
import Y.ACallableS410S0100000_2;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.ecommercebase.monitor.PageMonitor;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class PageMonitor {
    public static C09JN<? super Throwable> LJII;
    public static C1749860vdY LJIIJ;
    public static final PageMonitor LIZ = new PageMonitor();
    public static final HashMap<InterfaceC1748820vbs, Lifecycle.Event> LIZIZ = new HashMap<>();
    public static final HashMap<LifecycleOwner, InterfaceC1748820vbs> LIZJ = new HashMap<>();
    public static final HashMap<InterfaceC1748820vbs, C1749880vda> LIZLLL = new HashMap<>();
    public static final WeakHashMap<String, Pair<Map<String, String>, Map<String, String>>> LJ = new WeakHashMap<>();
    public static final LinkedList<InterfaceC1748820vbs> LJFF = new LinkedList<>();
    public static final C09Y5 LJI = C09Y5.LL;
    public static final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(187));
    public static final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(188));
    public static final PageMonitor$observer$1 LJIIJJI = PageMonitor$observer$1.LL;

    public final C1749880vda LIZIZ() {
        InterfaceC1748820vbs next;
        C1749880vda c1749880vda;
        synchronized (this) {
            try {
                Iterator<InterfaceC1748820vbs> it2 = LJFF.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (Intrinsics.LJFF(next.getPageName(), "product_detail")) {
                        break;
                    }
                }
                InterfaceC1748820vbs interfaceC1748820vbs = next;
                c1749880vda = interfaceC1748820vbs != null ? LIZLLL.get(interfaceC1748820vbs) : null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c1749880vda;
    }

    public final void LIZJ(LifecycleOwner lifecycleOwner) {
        synchronized (this) {
            try {
                HashMap<LifecycleOwner, InterfaceC1748820vbs> map = LIZJ;
                InterfaceC1748820vbs interfaceC1748820vbsRemove = map.remove(lifecycleOwner);
                if (interfaceC1748820vbsRemove != null) {
                    LIZLLL.remove(interfaceC1748820vbsRemove);
                }
                if (map.isEmpty()) {
                    LIZ.getClass();
                    try {
                        if (!C7879035x.LIZJ()) {
                            C19489211Ms.LIZ = LJII;
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C15O7.LIZJ(new ACallableS410S0100000_2(th, 6));
                    }
                    LIZ.getClass();
                    Npth.removeAttachUserData(LJIIJ, CrashType.JAVA);
                    Npth.removeTag("is_ecom");
                    LJIIJ = null;
                    C1739650vN5.LIZ.LIZ();
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    public final void LIZ(LifecycleOwner lifecycleOwner, InterfaceC1748820vbs interfaceC1748820vbs) {
        synchronized (this) {
            try {
                HashMap<LifecycleOwner, InterfaceC1748820vbs> map = LIZJ;
                if (map.get(lifecycleOwner) == null && !Intrinsics.LJFF(interfaceC1748820vbs.getPageName(), "debug_panel")) {
                    lifecycleOwner.getLifecycle().addObserver(LJIIJJI);
                    map.put(lifecycleOwner, interfaceC1748820vbs);
                    if (map.size() == 1) {
                        LIZ.getClass();
                        try {
                            if (!C7879035x.LIZJ()) {
                                C09JN<? super Throwable> c09jn = C19489211Ms.LIZ;
                                C09Y5 c09y5 = LJI;
                                if (!Intrinsics.LJFF(c09jn, c09y5)) {
                                    LJII = C19489211Ms.LIZ;
                                    C19489211Ms.LIZ = c09y5;
                                }
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C15O7.LIZJ(new ACallableS410S0100000_2(th, 5));
                        }
                        LIZ.getClass();
                        LJIIJ = C1749860vdY.LIZ;
                        RunnableC823120WQs.LIZIZ(new Runnable() { // from class: X.0vdZ
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("PageMonitor@3af1.setupNpth$2");
                                try {
                                    Npth.addAttachUserData(PageMonitor.LJIIJ, CrashType.JAVA);
                                    Npth.addTag("is_ecom", "1");
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("PageMonitor@3af1.setupNpth$2");
                            }
                        });
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    public static boolean LJ(String str, Map map, Map map2) {
        HashMap<String, String> map3;
        for (InterfaceC1748820vbs interfaceC1748820vbs : LJFF) {
            if (Intrinsics.LJFF(interfaceC1748820vbs.getPageName(), str)) {
                LaneParams laneParamsLIZ = C1748800vbq.LIZ(interfaceC1748820vbs);
                for (Map.Entry entry : map2.entrySet()) {
                    if (!Intrinsics.LJFF(laneParamsLIZ.get(entry.getKey()), entry.getValue())) {
                        break;
                    }
                }
                C1749880vda c1749880vda = LIZLLL.get(interfaceC1748820vbs);
                if (c1749880vda != null && (map3 = c1749880vda.LIZJ) != null) {
                    map3.putAll(map);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    public final void LIZLLL(List<String> list, Map<String, String> map, Map<String, String> map2) {
        synchronized (this) {
            try {
                for (String str : list) {
                    LIZ.getClass();
                    if (!LJ(str, map, map2)) {
                        LJ.put(str, new Pair<>(map, map2));
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
