package com.ss.android.ugc.aweme.ecommercebase.monitor;

import X.C1018703yb;
import X.C13LP;
import X.C1749880vda;
import X.C1AF0;
import X.C2188811AlT;
import X.C2193308iZ;
import X.C786410Ut5;
import X.C7879035x;
import X.C993603uY;
import X.InterfaceC1739450vMl;
import X.InterfaceC1748820vbs;
import android.app.Activity;
import android.os.Looper;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.debug.IEcomDebugService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class PageMonitor$observer$1 implements LifecycleEventObserver {
    public static final PageMonitor$observer$1 LL = new PageMonitor$observer$1();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        C1749880vda c1749880vda;
        HashMap<String, String> map;
        C1749880vda c1749880vda2;
        synchronized (PageMonitor.LIZ) {
            try {
                InterfaceC1748820vbs interfaceC1748820vbs = PageMonitor.LIZJ.get(lifecycleOwner);
                if (interfaceC1748820vbs == 0) {
                    return;
                }
                String pageName = interfaceC1748820vbs.getPageName();
                HashMap<InterfaceC1748820vbs, Lifecycle.Event> map2 = PageMonitor.LIZIZ;
                map2.put(interfaceC1748820vbs, event);
                int i = C2193308iZ.LIZ[event.ordinal()];
                Object pageName2 = null;
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3 && !Intrinsics.LJFF(pageName, "debug_panel")) {
                            LinkedList<InterfaceC1748820vbs> linkedList = PageMonitor.LJFF;
                            linkedList.remove(interfaceC1748820vbs);
                            map2.remove(interfaceC1748820vbs);
                            Iterator<InterfaceC1748820vbs> it2 = linkedList.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                InterfaceC1748820vbs next = it2.next();
                                if (Intrinsics.LJFF(next.getPageName(), pageName)) {
                                    pageName2 = next;
                                    break;
                                }
                            }
                            if (((InterfaceC1748820vbs) pageName2) == null) {
                                PageMonitor.LJ.remove(pageName);
                            }
                            PageMonitor.LIZ.LIZJ(lifecycleOwner);
                            PageMonitor.LIZJ.isEmpty();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(pageName);
                            sbLIZ.append(" on ON_DESTROY, nodeList size = ");
                            sbLIZ.append(PageMonitor.LJFF.size());
                            C2188811AlT.LIZIZ(sbLIZ);
                        }
                    } else if ((interfaceC1748820vbs instanceof InterfaceC1739450vMl) && (c1749880vda2 = PageMonitor.LIZLLL.get(interfaceC1748820vbs)) != null) {
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        long j = c1749880vda2.LIZIZ;
                        long j2 = jElapsedRealtime - j;
                        if (j > 0 && j2 > 1000) {
                            HashMap map3 = new HashMap();
                            map3.put("page_name", c1749880vda2.LIZ);
                            for (Map.Entry<String, String> entry : c1749880vda2.LIZJ.entrySet()) {
                                if (!Intrinsics.LJFF(entry.getKey(), "response") && !Intrinsics.LJFF(entry.getKey(), "requestParams")) {
                                    map3.put(entry.getKey(), entry.getValue());
                                }
                            }
                            map3.put("stay_time", String.valueOf(j2));
                            if (((InterfaceC1739450vMl) interfaceC1748820vbs).Pp(map3)) {
                                for (Map.Entry entry2 : map3.entrySet()) {
                                }
                                map3.put("is_blank", "1");
                                String str = (String) C993603uY.LIZIZ(interfaceC1748820vbs, "schema");
                                if (str != null) {
                                    map3.put("schema", str);
                                }
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("EcomPageMonitor: ");
                                sbLIZ2.append(c1749880vda2.LIZ);
                                sbLIZ2.append(" is blank");
                                C1AF0.LIZLLL(C2188811AlT.LIZIZ(sbLIZ2), map3);
                            } else {
                                map3.put("is_blank", CardStruct.IStatusCode.DEFAULT);
                            }
                            map3.remove("schema");
                            C1018703yb.LIZIZ("blank_monitor", map3);
                        }
                    }
                } else if (!Intrinsics.LJFF(pageName, "debug_panel")) {
                    LinkedList<InterfaceC1748820vbs> linkedList2 = PageMonitor.LJFF;
                    InterfaceC1748820vbs interfaceC1748820vbs2 = (InterfaceC1748820vbs) C13LP.LJJJLL(linkedList2);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (((Boolean) PageMonitor.LJIIIZ.getValue()).booleanValue() && (c1749880vda = PageMonitor.LIZLLL.get(interfaceC1748820vbs)) != null && (map = c1749880vda.LIZJ) != null) {
                        linkedHashMap.putAll(map);
                    }
                    if (interfaceC1748820vbs2 != 0) {
                        pageName2 = interfaceC1748820vbs2.getPageName();
                    }
                    if (Intrinsics.LJFF(pageName2, interfaceC1748820vbs.getPageName())) {
                        if (Intrinsics.LJFF(interfaceC1748820vbs2, interfaceC1748820vbs)) {
                            PageMonitor.LIZLLL.remove(interfaceC1748820vbs2);
                            linkedList2.remove(interfaceC1748820vbs2);
                        } else if ((interfaceC1748820vbs instanceof Fragment) && Intrinsics.LJFF(((Fragment) interfaceC1748820vbs).getActivity(), interfaceC1748820vbs2)) {
                            PageMonitor.LIZLLL.remove(interfaceC1748820vbs2);
                            linkedList2.remove(interfaceC1748820vbs2);
                        } else if ((interfaceC1748820vbs instanceof Activity) && (interfaceC1748820vbs2 instanceof Fragment) && ((Fragment) interfaceC1748820vbs2).getActivity() == interfaceC1748820vbs) {
                            return;
                        }
                    }
                    if (linkedList2.contains(interfaceC1748820vbs)) {
                        PageMonitor.LIZLLL.remove(interfaceC1748820vbs);
                        linkedList2.remove(interfaceC1748820vbs);
                    }
                    HashMap<InterfaceC1748820vbs, C1749880vda> map4 = PageMonitor.LIZLLL;
                    if (map4.get(interfaceC1748820vbs) == null) {
                        C1749880vda c1749880vda3 = new C1749880vda(interfaceC1748820vbs.getPageName());
                        c1749880vda3.LIZJ.putAll(linkedHashMap);
                        map4.put(interfaceC1748820vbs, c1749880vda3);
                    }
                    C1749880vda c1749880vda4 = map4.get(interfaceC1748820vbs);
                    if (c1749880vda4 != null) {
                        c1749880vda4.LIZIZ = SystemClock.elapsedRealtime();
                    }
                    if (C7879035x.LIZLLL() || C7879035x.LJ()) {
                        ((IEcomDebugService) PageMonitor.LJIIIIZZ.getValue()).LIZIZ();
                        Looper looperMyLooper = Looper.myLooper();
                        if (looperMyLooper != null) {
                            C786410Ut5.LJLIIL(1500L, new BPEAHandler(looperMyLooper), new Runnable() { // from class: X.08ia
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C1C7U.LIZ("PageMonitor@3af1.observer$1$1$2$1");
                                    C1C7U.LIZIZ("PageMonitor@3af1.observer$1$1$2$1");
                                }
                            });
                        }
                    }
                    linkedList2.addFirst(interfaceC1748820vbs);
                    Pair<Map<String, String>, Map<String, String>> pair = PageMonitor.LJ.get(pageName);
                    if (pair != null) {
                        PageMonitor.LJ(pageName, pair.getFirst(), pair.getSecond());
                    }
                    linkedList2.size();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
