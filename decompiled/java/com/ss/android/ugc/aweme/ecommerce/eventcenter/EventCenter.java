package com.ss.android.ugc.aweme.ecommerce.eventcenter;

import X.C1061730djf;
import X.C13LP;
import X.C1486350omX;
import X.C1548820qPI;
import X.C19719512Dh;
import X.C1AF0;
import X.C2097608Jq;
import X.C397901gf;
import X.InterfaceC1141530foN;
import X.InterfaceC1164530gPT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class EventCenter implements IEventCenter {
    public static final /* synthetic */ int LIZLLL = 0;
    public final C1061730djf LIZ = new C1061730djf();
    public final ConcurrentHashMap<String, ConcurrentHashMap<C1486350omX<InterfaceC1164530gPT>, InterfaceC1141530foN>> LIZIZ = new ConcurrentHashMap<>();
    public final ReferenceQueue<InterfaceC1164530gPT> LIZJ = new ReferenceQueue<>();

    public final void LJ() {
        Reference<? extends InterfaceC1164530gPT> referencePoll = this.LIZJ.poll();
        while (referencePoll instanceof C1486350omX) {
            String str = ((C1486350omX) referencePoll).LIZ;
            InterfaceC1141530foN interfaceC1141530foN = (InterfaceC1141530foN) C19719512Dh.LIZJ(LJFF(str)).remove(referencePoll);
            if (interfaceC1141530foN != null) {
                C1548820qPI.LJIIIIZZ(str, interfaceC1141530foN);
            }
            referencePoll = this.LIZJ.poll();
        }
    }

    public final ConcurrentHashMap<C1486350omX<InterfaceC1164530gPT>, InterfaceC1141530foN> LJFF(String str) {
        ConcurrentHashMap<C1486350omX<InterfaceC1164530gPT>, InterfaceC1141530foN> concurrentHashMap = this.LIZIZ.get(str);
        if (concurrentHashMap == null) {
            synchronized (this) {
                try {
                    concurrentHashMap = this.LIZIZ.get(str);
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap<>();
                        this.LIZIZ.put(str, concurrentHashMap);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return concurrentHashMap;
    }

    public static void LJI(List list, JSONArray jSONArray) throws JSONException {
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONObject) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                list.add(linkedHashMap);
                LJII((JSONObject) obj, linkedHashMap);
            } else if (obj instanceof JSONArray) {
                ArrayList arrayList = new ArrayList();
                list.add(arrayList);
                LJI(arrayList, (JSONArray) obj);
            } else {
                list.add(jSONArray.get(i));
            }
        }
        C13LP.LLIIII(list);
    }

    public static Map LJII(JSONObject jSONObject, Map map) throws JSONException {
        if (map == null) {
            map = new LinkedHashMap();
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                map.put(next, linkedHashMap);
                LJII((JSONObject) obj, linkedHashMap);
            } else if (obj instanceof JSONArray) {
                ArrayList arrayList = new ArrayList();
                map.put(next, arrayList);
                LJI(arrayList, (JSONArray) obj);
            } else {
                map.put(next, obj);
            }
        }
        return C2097608Jq.LJIIZILJ(map);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEventCenter
    public final void LIZ(String str, String str2) throws JSONException {
        LJIIIIZZ(null, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEventCenter
    public final void LIZJ(String str, InterfaceC1164530gPT interfaceC1164530gPT) {
        ConcurrentHashMap<C1486350omX<InterfaceC1164530gPT>, InterfaceC1141530foN> concurrentHashMapLJFF = LJFF(str);
        for (Reference reference : Collections.list(concurrentHashMapLJFF.keys())) {
            if (Intrinsics.LJFF(reference.get(), interfaceC1164530gPT)) {
                InterfaceC1141530foN interfaceC1141530foN = concurrentHashMapLJFF.get(reference);
                if (interfaceC1141530foN != null) {
                    C1548820qPI.LJIIIIZZ(str, interfaceC1141530foN);
                }
                concurrentHashMapLJFF.remove(reference);
            }
        }
        LJ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEventCenter
    public final void LIZLLL(final String str, InterfaceC1164530gPT interfaceC1164530gPT) {
        final C1486350omX<InterfaceC1164530gPT> c1486350omX = new C1486350omX<>(str, interfaceC1164530gPT, this.LIZJ);
        InterfaceC1141530foN interfaceC1141530foN = new InterfaceC1141530foN() { // from class: X.0qPM
            @Override // X.InterfaceC1141530foN
            public final void mh2(C262100zr c262100zr) {
                JSONObject jSONObject;
                InterfaceC1164530gPT interfaceC1164530gPT2 = c1486350omX.get();
                if (interfaceC1164530gPT2 != null) {
                    InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
                    if (interfaceC1107590evd != null) {
                        C1872780ypo.LIZ.getClass();
                        jSONObject = C1872780ypo.LIZIZ(interfaceC1107590evd);
                    } else {
                        jSONObject = new JSONObject();
                    }
                    interfaceC1164530gPT2.onEvent(c262100zr.LIZ, C786410Ut5.J3(jSONObject));
                    return;
                }
                C1548820qPI.LJIIIIZZ(str, this);
            }
        };
        LJFF(str).put(c1486350omX, interfaceC1141530foN);
        C1548820qPI.LIZLLL(str, interfaceC1141530foN);
        LJ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEventCenter
    public final void LIZIZ(String str, String str2, boolean z) throws JSONException {
        LJIIIIZZ(Boolean.valueOf(z), str, str2);
    }

    public final void LJIIIIZZ(Boolean bool, String str, String str2) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject(str2);
            long jCurrentTimeMillis = System.currentTimeMillis();
            C1061730djf c1061730djf = this.LIZ;
            Map mapLJII = LJII(jSONObject, null);
            c1061730djf.getClass();
            C397901gf c397901gf = new C397901gf(jCurrentTimeMillis, C1061730djf.LIZLLL(mapLJII), str);
            if (bool != null) {
                bool.booleanValue();
                c397901gf.LLILZ = bool.booleanValue();
            }
            C1548820qPI.LIZIZ(c397901gf);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
    }
}
