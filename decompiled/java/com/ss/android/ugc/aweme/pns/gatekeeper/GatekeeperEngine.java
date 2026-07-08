package com.ss.android.ugc.aweme.pns.gatekeeper;

import X.C00V0;
import X.C054G;
import X.C09A1;
import X.C0C64;
import X.C0CN5;
import X.C0NQY;
import X.C0NR1;
import X.C0NR2;
import X.C0NR6;
import X.C0PEM;
import X.C100C;
import X.C100H;
import X.C1174004iY;
import X.C13BV;
import X.C13DA;
import X.C13LP;
import X.C1697810uHb;
import X.C1916630zyX;
import X.C1DEV;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2191201ApK;
import X.C2296808zG;
import X.C23118094a;
import X.C23250099c;
import X.C276250AsB;
import X.C290540Ba8;
import X.C593780NQq;
import X.C593790NQr;
import X.C593810NQt;
import X.C593830NQv;
import X.C593870NQz;
import X.InterfaceC1519030pdF;
import X.InterfaceC593820NQu;
import X.InterfaceC593840NQw;
import X.InterfaceC593850NQx;
import Y.ARunnableS109S0100000_9;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.IGatekeeperExService;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.IGatekeeperService;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.networkservice.DecisionMakerNetworkApi;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.tools.PNSGKToolItem;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS112S1000000_28;
import kotlin.jvm.internal.AwS158S1100000_9;
import kotlin.text.u;

/* JADX INFO: loaded from: classes10.dex */
public final class GatekeeperEngine implements IGatekeeperService {
    public int LIZIZ;
    public boolean LJIILLIIL;
    public final C00V0 LIZ = new C00V0();
    public final Set<String> LIZJ = new LinkedHashSet();
    public final ArrayList<C0NR2> LIZLLL = new ArrayList<>();
    public final Set<String> LJ = new LinkedHashSet();
    public final Set<String> LJFF = new LinkedHashSet();
    public List<String> LJI = new ArrayList();
    public final Map<String, C0NR1> LJII = new LinkedHashMap();
    public final Map<String, Set<WeakReference<InterfaceC593850NQx>>> LJIIIIZZ = new LinkedHashMap();
    public final C054G LJIIIZ = C2296808zG.LIZ(C09A1.LIZLLL(C23118094a.LIZ(), C0PEM.LIZJ));
    public final C1DEV LJIIJ = C2191201ApK.LIZ();
    public final C0NQY LJIIJJI = new C0NQY();
    public final AtomicBoolean LJIIL = new AtomicBoolean(true);
    public final ConcurrentHashMap<String, InterfaceC593820NQu> LJIILIIL = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, InterfaceC593840NQw> LJIILJJIL = new ConcurrentHashMap<>();
    public final Object LJIILL = new Object();
    public final List<String> LJIIZILJ = new ArrayList();

    @Override // com.ss.android.ugc.aweme.pns.gatekeeper.api.IGatekeeperService
    public final void LJFF() {
        this.LJIILJJIL.put("video_count", new InterfaceC593840NQw() { // from class: X.0NR4
            @Override // X.InterfaceC593840NQw
            public final void LIZ(Object obj) {
                C0NR6 c0nr6;
                if ((obj instanceof C0NR6) && (c0nr6 = (C0NR6) obj) != null) {
                    CopyOnWriteArrayList<C0NR6> copyOnWriteArrayList = C0NR5.LIZ;
                    C0NR5.LIZ.remove(c0nr6);
                    c0nr6.LIZIZ = null;
                }
            }

            @Override // X.InterfaceC593840NQw
            public final C0NR6 LIZIZ(Map map, AwS158S1100000_9 awS158S1100000_9) {
                int iIntValue;
                Function0<Unit> function0;
                Number number;
                Object obj = map.get("at");
                if ((obj instanceof Number) && (number = (Number) obj) != null) {
                    iIntValue = number.intValue();
                } else {
                    iIntValue = Integer.MAX_VALUE;
                }
                C0NR6 c0nr6 = new C0NR6(iIntValue, awS158S1100000_9);
                CopyOnWriteArrayList<C0NR6> copyOnWriteArrayList = C0NR5.LIZ;
                copyOnWriteArrayList.addIfAbsent(c0nr6);
                if (C0NR5.LIZIZ.get() >= iIntValue && (function0 = c0nr6.LIZIZ) != null) {
                    c0nr6.LIZIZ = null;
                    copyOnWriteArrayList.remove(c0nr6);
                    function0.invoke();
                }
                return c0nr6;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.pns.gatekeeper.api.IGatekeeperService
    public final boolean LJII() {
        return this.LJ.isEmpty();
    }

    @Override // com.ss.android.ugc.aweme.pns.gatekeeper.api.IGatekeeperService
    public final void reset() {
        C23250099c.LIZLLL(this.LJIIIZ, null, null, new C593810NQt(this, null), 3);
        for (InterfaceC593820NQu interfaceC593820NQu : C13LP.LLIIII(this.LJIILIIL.values())) {
            try {
                interfaceC593820NQu.onReset();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                InterfaceC1519030pdF interfaceC1519030pdFLIZJ = C100C.LIZ.LIZJ();
                Pair[] pairArr = new Pair[2];
                interfaceC593820NQu.LIZIZ();
                pairArr[0] = new Pair("tool_type", "notification_tool");
                String message = th.getMessage();
                if (message == null) {
                    message = "unknown";
                }
                pairArr[1] = new Pair("error", message);
                interfaceC1519030pdFLIZJ.LIZ("tool_on_reset_fail", C2097608Jq.LJIIIIZZ(pairArr));
            }
        }
        if (C290540Ba8.LIZ()) {
            this.LJIIJJI.LIZLLL = false;
        }
        this.LJIIJJI.LIZ(true);
    }

    public GatekeeperEngine() {
        long jLJIJJ = C0C64.LJIILLIIL().LJIJJ(31744, 2, true, "decision_maker_delay_time", Mp4ScreenVideoLoadTimeout.CONTROL);
        IGatekeeperExService iGatekeeperExService = (IGatekeeperExService) PluggableExtentionKt.pluggableSpi$default(IGatekeeperExService.class, false, false, false, 14, null);
        if (iGatekeeperExService != null) {
            iGatekeeperExService.LIZ();
        }
        C0CN5.LIZIZ(Long.valueOf(jLJIJJ), new ARunnableS109S0100000_9(this, 109));
    }

    public static Map LJIILLIIL(C0NR1 c0nr1) {
        C13DA c13da = new C13DA();
        c13da.put("key", c0nr1.getTaskKey());
        Map<String, String> mapLIZLLL = c0nr1.LIZLLL();
        if (mapLIZLLL != null) {
            c13da.putAll(mapLIZLLL);
        }
        return c13da.build();
    }

    @Override // com.ss.android.ugc.aweme.pns.gatekeeper.api.IGatekeeperService
    public final DecisionMakerNetworkApi.EligibilityModel LIZ(String str) {
        return (DecisionMakerNetworkApi.EligibilityModel) ((Map) this.LJIIJJI.LIZ.getValue()).get(str);
    }

    @Override // com.ss.android.ugc.aweme.pns.gatekeeper.api.IGatekeeperService
    public final void LIZIZ(C1916630zyX c1916630zyX) {
        C23250099c.LIZLLL(this.LJIIIZ, null, null, new C593790NQr(this, c1916630zyX, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.pns.gatekeeper.api.IGatekeeperService
    public final void LIZJ(boolean z) {
        if (this.LJIIL.get()) {
            return;
        }
        C0NQY c0nqy = this.LJIIJJI;
        c0nqy.getClass();
        if (C290540Ba8.LIZ()) {
            c0nqy.LIZ(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.pns.gatekeeper.api.IGatekeeperService
    public final void LIZLLL(Object obj) {
        C1174004iY c1174004iY;
        InterfaceC593840NQw interfaceC593840NQw;
        if ((obj instanceof C1174004iY) && (c1174004iY = (C1174004iY) obj) != null && (interfaceC593840NQw = this.LJIILJJIL.get(c1174004iY.LIZ)) != null) {
            interfaceC593840NQw.LIZ(c1174004iY.LIZIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.pns.gatekeeper.api.IGatekeeperService
    public final void LJ(List<? extends C0NR2> list) {
        C23250099c.LIZLLL(this.LJIIIZ, null, null, new C593780NQq(this, list, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    @Override // com.ss.android.ugc.aweme.pns.gatekeeper.api.IGatekeeperService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(X.C0N0M r5) {
        /*
            r4 = this;
            X.0NQY r3 = r4.LJIIJJI
            java.lang.Object r2 = r3.LIZJ
            monitor-enter(r2)
            java.util.Map<java.lang.String, X.0N0M> r1 = r3.LIZIZ     // Catch: java.lang.Throwable -> L26
            java.lang.String r0 = r5.getTaskKey()     // Catch: java.lang.Throwable -> L26
            r1.put(r0, r5)     // Catch: java.lang.Throwable -> L26
            boolean r0 = X.C290540Ba8.LIZ()     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L1a
            boolean r0 = r3.LIZLLL     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L1a
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            monitor-exit(r2)
            if (r0 == 0) goto L25
            java.lang.String r0 = r5.getTaskKey()
            r3.LIZJ(r0)
        L25:
            return
        L26:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pns.gatekeeper.GatekeeperEngine.LJI(X.0N0M):void");
    }

    @Override // com.ss.android.ugc.aweme.pns.gatekeeper.api.IGatekeeperService
    public final void LJIIIZ(C100H c100h) {
        ConcurrentHashMap<String, InterfaceC593820NQu> concurrentHashMap = this.LJIILIIL;
        c100h.getClass();
        concurrentHashMap.put("notification_tool", c100h);
    }

    @Override // com.ss.android.ugc.aweme.pns.gatekeeper.api.IGatekeeperService
    public final void LJIIJJI(DecisionMakerNetworkApi.EligibilityModel eligibilityModel) {
        C0NQY c0nqy = this.LJIIJJI;
        ((Map) c0nqy.LIZ.getValue()).put(eligibilityModel.idValue, eligibilityModel);
        c0nqy.LIZJ(eligibilityModel.idValue);
    }

    @Override // com.ss.android.ugc.aweme.pns.gatekeeper.api.IGatekeeperService
    public final void LJIIL(String str) {
        boolean z;
        if (!C276250AsB.LIZ()) {
            return;
        }
        synchronized (this.LJIILL) {
            try {
                if (this.LJIILLIIL) {
                    z = true;
                } else {
                    ((ArrayList) this.LJIIZILJ).add(str);
                    z = false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (z) {
            LJIILL(str, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.pns.gatekeeper.api.IGatekeeperService
    public final void LJIILIIL(List<Pair<String, String>> list) {
        C00V0 c00v0 = this.LIZ;
        c00v0.LIZ = list;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        for (Pair pair : (ArrayList) list) {
            for (String str : C1697810uHb.LJIIJJI(pair.getFirst(), pair.getSecond())) {
                if (!linkedHashSet.contains(str)) {
                    C00V0.LIZIZ(linkedHashSet, c00v0, arrayList, str);
                }
            }
        }
        c00v0.LIZIZ = arrayList;
    }

    public final void LJIILJJIL(DecisionMakerNetworkApi.DecisionMakerResponseModel decisionMakerResponseModel) {
        List listLLIIII;
        if (!C276250AsB.LIZ()) {
            return;
        }
        List<Map<String, Object>> toolsList = decisionMakerResponseModel.getToolsList();
        if (toolsList == null) {
            toolsList = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Map<String, Object> map : toolsList) {
            PNSGKToolItem.Companion.getClass();
            PNSGKToolItem pNSGKToolItemLIZ = C593830NQv.LIZ(map);
            if (pNSGKToolItemLIZ == null) {
                i++;
            } else {
                arrayList.add(pNSGKToolItemLIZ);
            }
        }
        if (i > 0) {
            C100C.LIZ.LIZJ().LIZ("tool_drop", C2097608Jq.LJIIIIZZ(new Pair("reason", "missing_mandatory_field"), new Pair("count", String.valueOf(i))));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : arrayList) {
            String toolType = ((PNSGKToolItem) obj).getToolType();
            Object arrayList2 = linkedHashMap.get(toolType);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(toolType, arrayList2);
            }
            ((List) arrayList2).add(obj);
        }
        InterfaceC1519030pdF interfaceC1519030pdFLIZJ = C100C.LIZ.LIZJ();
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("total", String.valueOf(arrayList.size()));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), Integer.valueOf(((List) entry.getValue()).size()));
        }
        pairArr[1] = new Pair("by_type", linkedHashMap2.toString());
        interfaceC1519030pdFLIZJ.LIZ("tool_data_received", C2097608Jq.LJIIIIZZ(pairArr));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            List<PNSGKToolItem> list = (List) entry2.getValue();
            InterfaceC593820NQu interfaceC593820NQu = this.LJIILIIL.get(key);
            if (interfaceC593820NQu == null) {
                C100C.LIZ.LIZJ().LIZ("tool_drop", C2097608Jq.LJIIIIZZ(new Pair("reason", "unknown_type"), new Pair("tool_type", key), new Pair("count", String.valueOf(list.size()))));
            } else {
                try {
                    interfaceC593820NQu.LIZJ(list);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    InterfaceC1519030pdF interfaceC1519030pdFLIZJ2 = C100C.LIZ.LIZJ();
                    Pair[] pairArr2 = new Pair[2];
                    pairArr2[0] = new Pair("tool_type", key);
                    String message = th.getMessage();
                    if (message == null) {
                        message = "unknown";
                    }
                    pairArr2[1] = new Pair("error", message);
                    interfaceC1519030pdFLIZJ2.LIZ("tool_on_data_fail", C2097608Jq.LJIIIIZZ(pairArr2));
                }
            }
        }
        synchronized (this.LJIILL) {
            try {
                this.LJIILLIIL = true;
                listLLIIII = C13LP.LLIIII(this.LJIIZILJ);
                ((ArrayList) this.LJIIZILJ).clear();
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        Iterator it2 = listLLIIII.iterator();
        while (it2.hasNext()) {
            LJIILL((String) it2.next(), null);
        }
    }

    @Override // com.ss.android.ugc.aweme.pns.gatekeeper.api.IGatekeeperService
    public final C1174004iY LJIIJ(Map map, AwS112S1000000_28 awS112S1000000_28) {
        String str;
        if (!C276250AsB.LIZ()) {
            return null;
        }
        Object obj = map.get("type");
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        if (str == null) {
            C100C.LIZ.LIZJ().LIZ("tool_trigger_drop", C2097908Jt.LIZJ(new Pair("reason", "no_type")));
            return null;
        }
        InterfaceC593840NQw interfaceC593840NQw = this.LJIILJJIL.get(str);
        if (interfaceC593840NQw == null) {
            C100C.LIZ.LIZJ().LIZ("tool_trigger_drop", C2097608Jq.LJIIIIZZ(new Pair("reason", "no_resolver"), new Pair("trigger_type", str)));
            return null;
        }
        C0NR6 c0nr6LIZIZ = interfaceC593840NQw.LIZIZ(map, new AwS158S1100000_9(str, awS112S1000000_28, 6));
        C100C.LIZ.LIZJ().LIZ("tool_trigger_installed", C2097908Jt.LIZJ(new Pair("trigger_type", str)));
        return new C1174004iY(str, c0nr6LIZIZ);
    }

    public final int LJIILL(String str, Map<String, ? extends Object> map) {
        if (!C276250AsB.LIZ()) {
            return 0;
        }
        List<InterfaceC593820NQu> listLLIIII = C13LP.LLIIII(this.LJIILIIL.values());
        C100C.LIZ.LIZJ().LIZ("tool_signal_fired", C2097608Jq.LJIIIIZZ(new Pair("signal", str), new Pair("tool_count", String.valueOf(listLLIIII.size()))));
        for (InterfaceC593820NQu interfaceC593820NQu : listLLIIII) {
            try {
                interfaceC593820NQu.LIZ(str, map);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                InterfaceC1519030pdF interfaceC1519030pdFLIZJ = C100C.LIZ.LIZJ();
                Pair[] pairArr = new Pair[3];
                pairArr[0] = new Pair("signal", str);
                interfaceC593820NQu.LIZIZ();
                pairArr[1] = new Pair("tool_type", "notification_tool");
                String message = th.getMessage();
                if (message == null) {
                    message = "unknown";
                }
                pairArr[2] = new Pair("error", message);
                interfaceC1519030pdFLIZJ.LIZ("tool_signal_dispatch_fail", C2097608Jq.LJIIIIZZ(pairArr));
            }
        }
        return listLLIIII.size();
    }

    public final void LJIIZILJ(C0NR1 c0nr1, boolean z) {
        String str;
        if (u.LJJIIJZLJL(c0nr1.getTaskKey(), "GatekeeperFeatureTask", true)) {
            Map<String, String> mapLIZLLL = c0nr1.LIZLLL();
            if (mapLIZLLL != null && (str = mapLIZLLL.get("fid")) != null) {
                if (z) {
                    this.LJFF.remove(str);
                } else {
                    this.LJFF.add(str);
                }
                Set set = (Set) ((LinkedHashMap) this.LJIIIIZZ).get(str);
                if (set != null) {
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        InterfaceC593850NQx interfaceC593850NQx = (InterfaceC593850NQx) ((Reference) it2.next()).get();
                        if (interfaceC593850NQx != null) {
                            interfaceC593850NQx.LIZ();
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        Set set2 = (Set) ((LinkedHashMap) this.LJIIIIZZ).get("GatekeeperAppTask");
        if (set2 != null) {
            Iterator it3 = set2.iterator();
            while (it3.hasNext()) {
                InterfaceC593850NQx interfaceC593850NQx2 = (InterfaceC593850NQx) ((Reference) it3.next()).get();
                if (interfaceC593850NQx2 != null) {
                    this.LJ.toArray(new String[0]);
                    interfaceC593850NQx2.LIZIZ();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.pns.gatekeeper.api.IGatekeeperService
    public final void LJIIIIZZ(String str, Bundle bundle, Long l) {
        C100C.LIZ.LIZJ().LIZ("gate_keeper_signal_triggered", C2097908Jt.LIZJ(new Pair("signal", str)));
        C23250099c.LIZLLL(this.LJIIIZ, null, null, new C593870NQz(l, this, bundle, str, null), 3);
    }
}
