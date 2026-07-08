package com.bytedance.helios.network;

import X.C0WS5;
import X.C0WS7;
import X.C0WSB;
import X.C0WSC;
import X.C0WSU;
import X.C0WSV;
import X.C0WSW;
import X.C0WSX;
import X.C0WZW;
import X.C0WZY;
import X.C13LQ;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C823280WRi;
import X.C823880WTq;
import X.C825320WZe;
import X.C840750WyX;
import X.C840780Wya;
import X.C840850Wyh;
import X.C841070Wz3;
import X.C841130Wz9;
import X.C841140WzA;
import X.C841230WzJ;
import X.C841270WzN;
import X.C841350WzV;
import X.C841360WzW;
import X.C841410Wzb;
import X.C841540Wzo;
import X.InterfaceC823460WSa;
import X.InterfaceC841490Wzj;
import X.InterfaceC841510Wzl;
import X.InterfaceC841520Wzm;
import Y.ARunnableS2S1101000_13;
import android.os.SystemClock;
import com.bytedance.helios.network.api.config.AllowNetworkIdConfig;
import com.bytedance.helios.network.api.config.NetworkConfig;
import com.bytedance.helios.network.api.service.INetworkApiService;
import com.bytedance.helios.network.api.service.IOkHttpService;
import com.bytedance.helios.network.api.service.ITTNetService;
import com.bytedance.helios.statichook.config.ApiHookConfig;
import com.bytedance.pumbaa.utility.utils.CostTimeline;
import com.bytedance.pumbaa.utility.worker.PumbaaWorkerThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public class NetworkInvoker implements C0WSV {
    public static final C841540Wzo Companion = new Object() { // from class: X.0Wzo
    };
    public static final String TAG = "NetworkInvoker";
    public static final NetworkInvoker networkInvoker = new NetworkInvoker();
    public final InterfaceC841490Wzj runtime;
    public final InterfaceC841510Wzl transactionFactory;

    @Override // X.C0WSV
    public String name() {
        return "Network";
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0WzR] */
    public NetworkInvoker() {
        InterfaceC841510Wzl interfaceC841510Wzl = new InterfaceC841510Wzl() { // from class: X.0Wyw
            @Override // X.InterfaceC841510Wzl
            public final C841020Wyy LIZ(C840750WyX c840750WyX, InterfaceC823460WSa interfaceC823460WSa) {
                C840660WyO c840660WyO;
                String str;
                C0WZW c0wzw;
                INetworkApiService iNetworkApiService = null;
                if (interfaceC823460WSa instanceof C840660WyO) {
                    c840660WyO = (C840660WyO) interfaceC823460WSa;
                } else {
                    c840660WyO = null;
                }
                String str2 = interfaceC823460WSa.LIZ().LJJIII;
                int i = c840750WyX.LIZ;
                String str3 = c840750WyX.LIZIZ;
                Object obj = c840750WyX.LJIIIZ;
                if ((obj instanceof C0WZW) && (c0wzw = (C0WZW) obj) != null) {
                    str = c0wzw.LIZLLL;
                } else {
                    str = null;
                }
                C0V0Q c0v0q = new C0V0Q(str2, i, str3, str);
                if (c840660WyO != null) {
                    iNetworkApiService = c840660WyO.LIZIZ;
                }
                return new C841020Wyy(c0v0q, c840750WyX, new C841010Wyx(interfaceC823460WSa, c840660WyO, iNetworkApiService));
            }
        };
        final C840850Wyh c840850Wyh = new C840850Wyh(0);
        final ?? r2 = new InterfaceC841520Wzm() { // from class: X.0WzR
            public final ConcurrentHashMap<String, C841020Wyy> LIZ = new ConcurrentHashMap<>();

            @Override // X.InterfaceC841520Wzm
            public final C841020Wyy LIZ(C0V0Q c0v0q) {
                return this.LIZ.remove(c0v0q.LIZ);
            }

            @Override // X.InterfaceC841520Wzm
            public final void LIZIZ(C841020Wyy c841020Wyy) {
                this.LIZ.put(c841020Wyy.LIZ.LIZ, c841020Wyy);
            }
        };
        final C841070Wz3 c841070Wz3 = new C841070Wz3();
        final C841140WzA c841140WzA = new C841140WzA();
        this(interfaceC841510Wzl, new InterfaceC841490Wzj(c840850Wyh, r2, c841070Wz3, c841140WzA) { // from class: X.0Wz4
            public final InterfaceC841500Wzk LIZ;
            public final InterfaceC841520Wzm LIZIZ;
            public final C841070Wz3 LIZJ;
            public final C841140WzA LIZLLL;

            @Override // X.InterfaceC841490Wzj
            public final C0WSU LIZ(C841020Wyy c841020Wyy, CostTimeline costTimeline) {
                this.LIZIZ.LIZIZ(c841020Wyy);
                try {
                    C841060Wz2 c841060Wz2LIZ = this.LIZ.LIZ(c841020Wyy, costTimeline);
                    this.LIZJ.getClass();
                    C0276007m c0276007mLIZIZ = C841070Wz3.LIZIZ(c841020Wyy, c841060Wz2LIZ);
                    this.LIZLLL.getClass();
                    C0WSU c0wsuLIZ = C841140WzA.LIZ(c0276007mLIZIZ, c841060Wz2LIZ);
                    this.LIZIZ.LIZ(c841020Wyy.LIZ);
                    return c0wsuLIZ;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LIZIZ.LIZ(c841020Wyy.LIZ);
                    throw th;
                }
            }

            @Override // X.InterfaceC841490Wzj
            public final void LIZIZ(C841020Wyy c841020Wyy, CostTimeline costTimeline) {
                this.LIZIZ.LIZIZ(c841020Wyy);
                try {
                    this.LIZ.LIZIZ(c841020Wyy, costTimeline);
                    this.LIZJ.getClass();
                    C841070Wz3.LIZ(c841020Wyy);
                    this.LIZLLL.getClass();
                    this.LIZIZ.LIZ(c841020Wyy.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LIZIZ.LIZ(c841020Wyy.LIZ);
                    throw th;
                }
            }

            {
                this.LIZ = c840850Wyh;
                this.LIZIZ = r2;
                this.LIZJ = c841070Wz3;
                this.LIZLLL = c841140WzA;
            }
        });
    }

    public CostTimeline createCostTimeline() {
        return new CostTimeline(SystemClock.elapsedRealtimeNanos());
    }

    public boolean isPerformanceEnabled() {
        return C825320WZe.LIZLLL();
    }

    public NetworkInvoker(InterfaceC841490Wzj interfaceC841490Wzj) {
        this(new InterfaceC841510Wzl() { // from class: X.0Wyw
            @Override // X.InterfaceC841510Wzl
            public final C841020Wyy LIZ(C840750WyX c840750WyX, InterfaceC823460WSa interfaceC823460WSa) {
                C840660WyO c840660WyO;
                String str;
                C0WZW c0wzw;
                INetworkApiService iNetworkApiService = null;
                if (interfaceC823460WSa instanceof C840660WyO) {
                    c840660WyO = (C840660WyO) interfaceC823460WSa;
                } else {
                    c840660WyO = null;
                }
                String str2 = interfaceC823460WSa.LIZ().LJJIII;
                int i = c840750WyX.LIZ;
                String str3 = c840750WyX.LIZIZ;
                Object obj = c840750WyX.LJIIIZ;
                if ((obj instanceof C0WZW) && (c0wzw = (C0WZW) obj) != null) {
                    str = c0wzw.LIZLLL;
                } else {
                    str = null;
                }
                C0V0Q c0v0q = new C0V0Q(str2, i, str3, str);
                if (c840660WyO != null) {
                    iNetworkApiService = c840660WyO.LIZIZ;
                }
                return new C841020Wyy(c0v0q, c840750WyX, new C841010Wyx(interfaceC823460WSa, c840660WyO, iNetworkApiService));
            }
        }, interfaceC841490Wzj);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.InterfaceC823460WSa createNetworkEvent(X.C840750WyX r19) {
        /*
            Method dump skipped, instruction units count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.helios.network.NetworkInvoker.createNetworkEvent(X.0WyX):X.0WSa");
    }

    public NetworkInvoker(InterfaceC841510Wzl interfaceC841510Wzl, InterfaceC841490Wzj interfaceC841490Wzj) {
        this.transactionFactory = interfaceC841510Wzl;
        this.runtime = interfaceC841490Wzj;
    }

    private final C0WSU filterAllowNetworkId(int i, String str) {
        Boolean boolValueOf;
        List<AllowNetworkIdConfig> list;
        boolean z;
        NetworkConfig networkConfigNetworkConfigOrNull = NetworkComponent.INSTANCE.networkConfigOrNull();
        boolean z2 = true;
        if (networkConfigNetworkConfigOrNull != null && (list = networkConfigNetworkConfigOrNull.allowNetworkIdConfigs) != null) {
            if (!list.isEmpty()) {
                for (AllowNetworkIdConfig allowNetworkIdConfig : list) {
                    if (Intrinsics.LJFF(allowNetworkIdConfig.invokeType, "around") || Intrinsics.LJFF(allowNetworkIdConfig.invokeType, str)) {
                        if (allowNetworkIdConfig.apiIds.contains(Integer.valueOf(i))) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                boolValueOf = Boolean.valueOf(z);
            } else {
                z = false;
                boolValueOf = Boolean.valueOf(z);
            }
        } else {
            boolValueOf = null;
        }
        if ((i != 400000 && i != 400001) || NetworkComponent.INSTANCE.urlConnectionServiceOrNull() != null) {
            z2 = false;
        }
        if (!Intrinsics.LJFF(boolValueOf, Boolean.TRUE) && !z2) {
            return null;
        }
        return new C0WSU(false, null);
    }

    private final void stop(Pair<C0WSB, ? extends C0WSC> pair, C0WZW c0wzw) {
        if ((c0wzw == null || !c0wzw.LJI) && pair != null) {
            C0WSC second = pair.getSecond();
            if (second != null) {
                second.stop();
            }
            C0WSB first = pair.getFirst();
            if (first != null) {
                first.LJIILJJIL();
            }
        }
    }

    public void logCostTime(CostTimeline costTimeline, String str) {
        costTimeline.logCostTime(str, null, SystemClock.elapsedRealtimeNanos(), null);
    }

    public final void statisticsApiCost(int i, long j) {
        try {
            if (NetworkComponent.INSTANCE.isNetworkEnabled()) {
                C841410Wzb.LIZ(i, j);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C823280WRi.LIZLLL(th);
            CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList = C0WSW.LIZ;
            C0WSW.LIZ("Helios:Network-Invoke", null, 6, th);
        }
    }

    private final C0WSU addInterceptor(int i, Object obj, String str) {
        Object objAddInterceptor;
        Object objAddInterceptor2;
        if (i != 400100) {
            if (i != 400200) {
                return null;
            }
            ITTNetService iTTNetServiceTtNetServiceOrNull = NetworkComponent.INSTANCE.ttNetServiceOrNull();
            if (iTTNetServiceTtNetServiceOrNull != null) {
                objAddInterceptor2 = iTTNetServiceTtNetServiceOrNull.addInterceptor(obj, str);
            } else {
                objAddInterceptor2 = null;
            }
            CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList = C0WSW.LIZ;
            C0WSW.LIZ("Helios:Network-Invoke", new C841360WzW(i, objAddInterceptor2), 2, null);
            return new C0WSU(false, null);
        }
        IOkHttpService iOkHttpServiceOkHttpServiceOrNull = NetworkComponent.INSTANCE.okHttpServiceOrNull();
        if (iOkHttpServiceOkHttpServiceOrNull != null) {
            objAddInterceptor = iOkHttpServiceOkHttpServiceOrNull.addInterceptor(obj, str);
        } else {
            objAddInterceptor = null;
        }
        CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList2 = C0WSW.LIZ;
        C0WSW.LIZ("Helios:Network-Invoke", new C841350WzV(i, objAddInterceptor), 2, null);
        return new C0WSU(false, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final kotlin.Pair<X.C0WSB, X.C0WSC> obtainPerformanceNode(java.lang.String r6, X.C0WZW r7, boolean r8) {
        /*
            r5 = this;
            r4 = 0
            if (r7 == 0) goto L12
            boolean r1 = r7.LJI     // Catch: java.lang.Throwable -> L45
            r0 = 1
            if (r1 != r0) goto L12
            X.0WS7 r1 = r7.LJFF     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L44
            kotlin.Pair r0 = new kotlin.Pair     // Catch: java.lang.Throwable -> L45
            r0.<init>(r4, r1)     // Catch: java.lang.Throwable -> L45
            return r0
        L12:
            if (r8 == 0) goto L19
            java.lang.String r0 = "Network_custom"
            com.bytedance.pumbaa.base2.performance.PumbaaPerformanceTrackManager.LJIIIIZZ(r6, r0)     // Catch: java.lang.Throwable -> L45
        L19:
            X.0WSB r3 = com.bytedance.pumbaa.base2.performance.PumbaaPerformanceTrackManager.LIZIZ(r6)     // Catch: java.lang.Throwable -> L45
            if (r3 == 0) goto L44
            r3.LJIIIZ()     // Catch: java.lang.Throwable -> L45
            if (r8 == 0) goto L25
            goto L28
        L25:
            java.lang.String r2 = "_postInvoke_custom"
            goto L2a
        L28:
            java.lang.String r2 = "_preInvoke_custom"
        L2a:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L45
            java.lang.String r0 = "Network"
            r1.append(r0)     // Catch: java.lang.Throwable -> L45
            r1.append(r2)     // Catch: java.lang.Throwable -> L45
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L45
            X.0WS7 r1 = r3.LJFF(r0)     // Catch: java.lang.Throwable -> L45
            kotlin.Pair r0 = new kotlin.Pair     // Catch: java.lang.Throwable -> L45
            r0.<init>(r3, r1)     // Catch: java.lang.Throwable -> L45
            return r0
        L44:
            return r4
        L45:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.String r0 = "Network_obtainPerformanceNode_error"
            X.C0WS5.LIZIZ(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.helios.network.NetworkInvoker.obtainPerformanceNode(java.lang.String, X.0WZW, boolean):kotlin.Pair");
    }

    public void logPipelineTotal(CostTimeline costTimeline, String str, String str2) {
        costTimeline.logTotal(str, str2);
        costTimeline.printLog("Helios:Network-Cost");
    }

    public void reportPipelineCost(int i, String str, CostTimeline costTimeline) {
        C786410Ut5.LJJZZIII(PumbaaWorkerThread.getHandler(), new ARunnableS2S1101000_13(i, str, costTimeline, 3));
    }

    private final void reportPipelineTotalCost(int i, String str, String str2, CostTimeline costTimeline, InterfaceC823460WSa interfaceC823460WSa) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("id: ");
        sbLIZ.append(i);
        sbLIZ.append(" memberName:");
        sbLIZ.append(interfaceC823460WSa.LIZ().LIZ.LIZLLL);
        sbLIZ.append(" uuid:");
        sbLIZ.append(interfaceC823460WSa.LIZ().LJJIII);
        logPipelineTotal(costTimeline, str2, C2188811AlT.LIZIZ(sbLIZ));
        reportPipelineCost(i, str, costTimeline);
    }

    private final void notifyHostPreInvoke(int i, String str, String str2, Object obj, Object[] objArr, String str3, C0WZW c0wzw) {
        try {
            NetworkComponent.INSTANCE.onPreInvokeIntercepted(i, str, str2, obj, objArr, str3, c0wzw);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004a  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    @Override // X.C0WSV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C0WSU preInvoke(int r32, java.lang.String r33, java.lang.String r34, java.lang.Object r35, java.lang.Object[] r36, java.lang.String r37, X.C0WZW r38) {
        /*
            Method dump skipped, instruction units count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.helios.network.NetworkInvoker.preInvoke(int, java.lang.String, java.lang.String, java.lang.Object, java.lang.Object[], java.lang.String, X.0WZW):X.0WSU");
    }

    private final void notifyHostPostInvoke(int i, String str, String str2, Object obj, Object[] objArr, Object obj2, C0WZW c0wzw, boolean z) {
        try {
            NetworkComponent.INSTANCE.onPostInvokeIntercepted(i, str, str2, obj, objArr, obj2, c0wzw, z);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // X.C0WSV
    public void postInvoke(int i, String str, String str2, Object obj, Object[] objArr, Object obj2, C0WZW c0wzw, boolean z) {
        C0WSC second;
        CostTimeline costTimelineCreateCostTimeline;
        C840750WyX c840750WyXCreateOriginalInvokeContext$default;
        InterfaceC823460WSa interfaceC823460WSaCreateNetworkEvent;
        if (!isPerformanceEnabled()) {
            if (c0wzw != null) {
                try {
                    C0WS7 c0ws7 = c0wzw.LJFF;
                    if (c0ws7 != null) {
                        C0WS5.LIZ(c0ws7);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    notifyHostPostInvoke(i, str, str2, obj, objArr, obj2, c0wzw, z);
                    throw th;
                }
            }
            notifyHostPostInvoke(i, str, str2, obj, objArr, obj2, c0wzw, z);
            return;
        }
        Pair<C0WSB, C0WSC> pairObtainPerformanceNode = obtainPerformanceNode(String.valueOf(i), c0wzw, false);
        if (pairObtainPerformanceNode != null) {
            second = pairObtainPerformanceNode.getSecond();
        } else {
            second = null;
        }
        try {
            costTimelineCreateCostTimeline = createCostTimeline();
            CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList = C0WSW.LIZ;
            C0WSW.LIZ("Helios:Network-Invoke", new C841230WzJ(i, str, str2), 2, null);
        } catch (Throwable th2) {
            th = th2;
        }
        if (!NetworkComponent.INSTANCE.isNetworkEnabled()) {
            C0WSW.LIZ("Helios:Network-Invoke", new C841130Wz9(), 2, null);
            if (second != null) {
                second.setStatus("disabled");
            }
            notifyHostPostInvoke(i, str, str2, obj, objArr, obj2, c0wzw, z);
            stop(pairObtainPerformanceNode, c0wzw);
            return;
        }
        if (i != 400401 && i != 400501 && filterAllowNetworkId(i, "after") != null) {
            C0WSW.LIZ("Helios:Network-Invoke", new C841270WzN(i), 2, null);
            if (second != null) {
                second.setStatus("disabled");
            }
            notifyHostPostInvoke(i, str, str2, obj, objArr, obj2, c0wzw, z);
            stop(pairObtainPerformanceNode, c0wzw);
            return;
        }
        try {
            c840750WyXCreateOriginalInvokeContext$default = createOriginalInvokeContext$default(this, "after", i, str, str2, obj, objArr, c0wzw, null, obj2, z, second, 128, null);
            logCostTime(costTimelineCreateCostTimeline, "beforeNetworkEvent");
            interfaceC823460WSaCreateNetworkEvent = createNetworkEvent(c840750WyXCreateOriginalInvokeContext$default);
        } catch (Throwable th3) {
            th = th3;
        }
        if (interfaceC823460WSaCreateNetworkEvent == null) {
            notifyHostPostInvoke(i, str, str2, obj, objArr, obj2, c0wzw, z);
            stop(pairObtainPerformanceNode, c0wzw);
            return;
        }
        try {
            logCostTime(costTimelineCreateCostTimeline, "createNetworkEvent");
        } catch (Throwable th4) {
            th = th4;
        }
        try {
            if (i == 400401 || i == 400501) {
                if (filterAllowNetworkId(i, "before") == null) {
                    interfaceC823460WSaCreateNetworkEvent.LIZ().LIZ.LIZIZ = "before";
                    this.runtime.LIZ(this.transactionFactory.LIZ(interfaceC823460WSaCreateNetworkEvent.LIZ().LIZ, interfaceC823460WSaCreateNetworkEvent), costTimelineCreateCostTimeline);
                }
                if (filterAllowNetworkId(i, "after") == null) {
                    C840780Wya c840780WyaLIZIZ = ((C840780Wya) interfaceC823460WSaCreateNetworkEvent).LIZIZ(C840750WyX.LIZ(interfaceC823460WSaCreateNetworkEvent.LIZ().LIZ));
                    this.runtime.LIZIZ(this.transactionFactory.LIZ(c840780WyaLIZIZ.LIZ.LIZ, c840780WyaLIZIZ), costTimelineCreateCostTimeline);
                }
            } else {
                this.runtime.LIZIZ(this.transactionFactory.LIZ(c840750WyXCreateOriginalInvokeContext$default, interfaceC823460WSaCreateNetworkEvent), costTimelineCreateCostTimeline);
            }
            reportPipelineTotalCost(i, "guard", "guardCost", costTimelineCreateCostTimeline, interfaceC823460WSaCreateNetworkEvent);
        } catch (Throwable th5) {
            th = th5;
            try {
                TryCatchGuardChecker.doCheck(th);
                CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList2 = C0WSW.LIZ;
                C0WSW.LIZ("Helios:Network-Invoke", AFwS200S0000000_13.get$arr$(19), 6, th);
            } catch (Throwable th6) {
                TryCatchGuardChecker.doCheck(th6);
                notifyHostPostInvoke(i, str, str2, obj, objArr, obj2, c0wzw, z);
                stop(pairObtainPerformanceNode, c0wzw);
                throw th6;
            }
        }
        notifyHostPostInvoke(i, str, str2, obj, objArr, obj2, c0wzw, z);
        stop(pairObtainPerformanceNode, c0wzw);
    }

    private final C840750WyX createOriginalInvokeContext(String str, int i, String str2, String str3, Object obj, Object[] objArr, C0WZW c0wzw, String str4, Object obj2, boolean z, C0WSC c0wsc) {
        String str5;
        Set linkedHashSet;
        String[] strArr;
        String str6;
        String str7 = str3;
        String str8 = str4;
        String str9 = str2;
        C823880WTq c823880WTq = ApiHookConfig.LIZIZ.get(Integer.valueOf(i));
        if (c823880WTq == null) {
            c823880WTq = C0WZY.LIZ.get(Integer.valueOf(i));
        }
        String str10 = "";
        if (str9 == null) {
            str9 = "";
        }
        if (str7 == null) {
            str7 = "";
        }
        if (str8 == null) {
            str8 = "";
        }
        if (c823880WTq == null || (str5 = c823880WTq.LIZJ) == null) {
            str5 = "";
        }
        if (c823880WTq != null && (str6 = c823880WTq.LIZLLL) != null) {
            str10 = str6;
        }
        if (c823880WTq != null && (strArr = c823880WTq.LJ) != null) {
            linkedHashSet = C13LQ.LJLIIIL(strArr);
        } else {
            linkedHashSet = new LinkedHashSet();
        }
        return new C840750WyX(i, str, str9, str7, obj, objArr, str8, obj2, z, c0wzw, str5, str10, linkedHashSet, c0wsc);
    }

    public static /* synthetic */ C840750WyX createOriginalInvokeContext$default(NetworkInvoker networkInvoker2, String str, int i, String str2, String str3, Object obj, Object[] objArr, C0WZW c0wzw, String str4, Object obj2, boolean z, C0WSC c0wsc, int i2, Object obj3) {
        boolean z2 = z;
        Object obj4 = obj2;
        String str5 = str4;
        if (obj3 == null) {
            C0WSC c0wsc2 = null;
            if ((i2 & 128) != 0) {
                str5 = null;
            }
            if ((i2 & 256) != 0) {
                obj4 = null;
            }
            if ((i2 & 512) != 0) {
                z2 = true;
            }
            if ((i2 & 1024) == 0) {
                c0wsc2 = c0wsc;
            }
            return networkInvoker2.createOriginalInvokeContext(str, i, str2, str3, obj, objArr, c0wzw, str5, obj4, z2, c0wsc2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createOriginalInvokeContext");
    }
}
