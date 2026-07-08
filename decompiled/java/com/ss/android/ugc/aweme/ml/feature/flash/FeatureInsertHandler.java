package com.ss.android.ugc.aweme.ml.feature.flash;

import X.C0A0T;
import X.C0XM9;
import X.C1499330p7T;
import X.C1508770pMh;
import X.C1508800pMk;
import X.C1508860pMq;
import X.C1508900pMu;
import X.C1508920pMw;
import X.C1510170pOx;
import X.C1510720pPq;
import X.C2188811AlT;
import X.C718040SEo;
import X.InterfaceC1508830pMn;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.ss.android.ugc.aweme.ml.feature.flash.FeatureInsertHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.text.u;

/* JADX INFO: loaded from: classes24.dex */
public final class FeatureInsertHandler implements NetworkPartner.RequestHandler {
    public static final FeatureInsertHandler LIZ = new FeatureInsertHandler();
    public static final ConcurrentHashMap<String, Integer> LIZIZ = new ConcurrentHashMap<>();
    public static final HashMap<String, InterfaceC1508830pMn> LIZJ = new HashMap<>();
    public static final Map<String, List<FlashFreeRideConfig>> LIZLLL = new LinkedHashMap();
    public static final Map<String, FlashCommonFreeRideApiConfig> LJ = new LinkedHashMap();
    public static final Map<FlashFreeRideConfig, String> LJFF = new LinkedHashMap();
    public static final AtomicBoolean LJI = new AtomicBoolean(false);
    public static boolean LJII;

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final boolean enable() {
        return true;
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final String LJII() {
        return C718040SEo.LIZ(this);
    }

    public final synchronized void LIZIZ(boolean z) {
        ScheduledExecutorService scheduledExecutorServiceLIZIZ;
        if (LJII && !z) {
            return;
        }
        LJII = true;
        List<FlashCommonFreeRideApiConfig> list = (List) C1508920pMw.LIZIZ.getValue();
        if (list != null) {
            for (FlashCommonFreeRideApiConfig flashCommonFreeRideApiConfig : list) {
                LJ.put(flashCommonFreeRideApiConfig.url, flashCommonFreeRideApiConfig);
            }
        }
        for (Map.Entry entry : ((HashMap) C1508860pMq.LIZLLL()).entrySet()) {
            LJ.put((String) entry.getKey(), (FlashCommonFreeRideApiConfig) entry.getValue());
        }
        ArrayList<FlashFreeRideConfig> arrayList = new ArrayList();
        arrayList.addAll(((HashMap) C1508860pMq.LIZJ()).values());
        Map map = (Map) C1508900pMu.LIZIZ.getValue();
        if (map != null) {
            arrayList.addAll(map.values());
        }
        for (FlashFreeRideConfig flashFreeRideConfig : arrayList) {
            if (LJ.containsKey(flashFreeRideConfig.url)) {
                Map<String, List<FlashFreeRideConfig>> map2 = LIZLLL;
                List list2 = (List) ((LinkedHashMap) map2).get(flashFreeRideConfig.url);
                if (list2 != null) {
                    if (!list2.contains(flashFreeRideConfig)) {
                        list2.add(flashFreeRideConfig);
                    }
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(flashFreeRideConfig);
                    map2.put(flashFreeRideConfig.url, arrayList2);
                }
            }
        }
        for (Map.Entry entry2 : ((LinkedHashMap) LJ).entrySet()) {
            List list3 = (List) ((LinkedHashMap) LIZLLL).get(entry2.getKey());
            if (list3 != null) {
                HashMap<String, InterfaceC1508830pMn> map3 = LIZJ;
                if (!map3.containsKey(entry2.getKey())) {
                    map3.put((String) entry2.getKey(), new C1508770pMh(list3, entry2));
                }
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("commonFreeRideApiMap: ");
        sbLIZ.append(LJ);
        C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("freeRideConfigMap: ");
        sbLIZ2.append(LIZLLL);
        C2188811AlT.LIZIZ(sbLIZ2);
        C1510170pOx c1510170pOx = C1510170pOx.LIZ;
        float fFloatValue = ((Number) C0A0T.LIZ.getValue()).floatValue();
        c1510170pOx.getClass();
        if (C1510170pOx.LIZJ(fFloatValue) && (scheduledExecutorServiceLIZIZ = C1510720pPq.LIZIZ()) != null) {
            scheduledExecutorServiceLIZIZ.execute(new Runnable() { // from class: X.08Du
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("FeatureInsertHandler@5242.postFlashConfig$1");
                    try {
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJ(((LinkedHashMap) FeatureInsertHandler.LJ).keySet(), "any_link_url_list");
                        c2344009Gk.LJ(FeatureInsertHandler.LIZLLL, "any_link_config_value");
                        C20684815ws.LJIILLIIL("flash_config", c2344009Gk.LIZ);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("FeatureInsertHandler@5242.postFlashConfig$1");
                }
            });
        }
    }

    public final synchronized void LJ(boolean z) {
        if (!z) {
            if (LJI.compareAndSet(false, true)) {
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map map = (Map) C1508900pMu.LIZIZ.getValue();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getValue(), entry.getKey());
            }
        }
        for (Map.Entry entry2 : ((HashMap) C1508860pMq.LIZJ()).entrySet()) {
            linkedHashMap.put(entry2.getValue(), entry2.getKey());
        }
        LJFF.putAll(linkedHashMap);
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.RequestHandler
    public final void LJIIIIZZ(C0XM9 c0xm9, C1499330p7T c1499330p7T) {
        String strLIZ = c0xm9.LIZJ.LJFF.LIZ();
        int iIntValue = 0;
        if (u.LJIIZILJ(strLIZ, "/", false)) {
            strLIZ = strLIZ.substring(0, strLIZ.length() - 1);
        }
        HashMap<String, InterfaceC1508830pMn> map = LIZJ;
        if (!map.containsKey(strLIZ)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleRequest: ");
        sbLIZ.append(strLIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        ConcurrentHashMap<String, Integer> concurrentHashMap = LIZIZ;
        Integer num = concurrentHashMap.get(strLIZ);
        if (num != null) {
            iIntValue = num.intValue();
        }
        int i = iIntValue + 1;
        concurrentHashMap.put(strLIZ, Integer.valueOf(i));
        InterfaceC1508830pMn interfaceC1508830pMn = map.get(strLIZ);
        if (interfaceC1508830pMn != null) {
            interfaceC1508830pMn.LIZ(new C1508800pMk(i, strLIZ, c0xm9));
        }
    }
}
