package com.ss.android.ugc.aweme.commerce.tools.common;

import X.C1061730djf;
import X.C1381370m3D;
import X.C13LP;
import X.C1548820qPI;
import X.C1553870qXR;
import X.C19719512Dh;
import X.C1AF0;
import X.C2097608Jq;
import X.C397901gf;
import X.InterfaceC1141530foN;
import X.InterfaceC1381380m3E;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.promote.replace.IEventCenter;
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
    public final C1061730djf LIZ = new C1061730djf();
    public final ConcurrentHashMap<String, ConcurrentHashMap<C1553870qXR<InterfaceC1381380m3E>, InterfaceC1141530foN>> LIZIZ = new ConcurrentHashMap<>();
    public final ReferenceQueue<InterfaceC1381380m3E> LIZJ = new ReferenceQueue<>();

    public final void LIZLLL() {
        Reference<? extends InterfaceC1381380m3E> referencePoll = this.LIZJ.poll();
        while (referencePoll instanceof C1553870qXR) {
            String str = ((C1553870qXR) referencePoll).LIZ;
            InterfaceC1141530foN interfaceC1141530foN = (InterfaceC1141530foN) C19719512Dh.LIZJ(LJ(str)).remove(referencePoll);
            if (interfaceC1141530foN != null) {
                C1548820qPI.LJIIIIZZ(str, interfaceC1141530foN);
            }
            referencePoll = this.LIZJ.poll();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.promote.replace.IEventCenter
    public final void LIZIZ(C1381370m3D c1381370m3D) {
        ConcurrentHashMap<C1553870qXR<InterfaceC1381380m3E>, InterfaceC1141530foN> concurrentHashMapLJ = LJ("ec_close_sheet");
        for (Reference reference : Collections.list(concurrentHashMapLJ.keys())) {
            if (Intrinsics.LJFF(reference.get(), c1381370m3D)) {
                InterfaceC1141530foN interfaceC1141530foN = concurrentHashMapLJ.get(reference);
                if (interfaceC1141530foN != null) {
                    C1548820qPI.LJIIIIZZ("ec_close_sheet", interfaceC1141530foN);
                }
                concurrentHashMapLJ.remove(reference);
            }
        }
        LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.promote.replace.IEventCenter
    public final void LIZJ(C1381370m3D c1381370m3D) {
        final C1553870qXR<InterfaceC1381380m3E> c1553870qXR = new C1553870qXR<>(c1381370m3D, this.LIZJ);
        InterfaceC1141530foN interfaceC1141530foN = new InterfaceC1141530foN() { // from class: X.0qXQ
            public final /* synthetic */ String LLILLJJLI = "ec_close_sheet";

            @Override // X.InterfaceC1141530foN
            public final void mh2(C262100zr c262100zr) {
                JSONObject jSONObject;
                InterfaceC1381380m3E interfaceC1381380m3E = c1553870qXR.get();
                if (interfaceC1381380m3E != null) {
                    InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
                    if (interfaceC1107590evd != null) {
                        C1872780ypo.LIZ.getClass();
                        jSONObject = C1872780ypo.LIZIZ(interfaceC1107590evd);
                    } else {
                        jSONObject = new JSONObject();
                    }
                    C786410Ut5.J3(jSONObject);
                    interfaceC1381380m3E.onEvent();
                    return;
                }
                C1548820qPI.LJIIIIZZ(this.LLILLJJLI, this);
            }
        };
        LJ("ec_close_sheet").put(c1553870qXR, interfaceC1141530foN);
        C1548820qPI.LIZLLL("ec_close_sheet", interfaceC1141530foN);
        LIZLLL();
    }

    public final ConcurrentHashMap<C1553870qXR<InterfaceC1381380m3E>, InterfaceC1141530foN> LJ(String str) {
        ConcurrentHashMap<C1553870qXR<InterfaceC1381380m3E>, InterfaceC1141530foN> concurrentHashMap = this.LIZIZ.get(str);
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

    public static void LJFF(List list, JSONArray jSONArray) throws JSONException {
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONObject) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                list.add(linkedHashMap);
                LJI((JSONObject) obj, linkedHashMap);
            } else if (obj instanceof JSONArray) {
                ArrayList arrayList = new ArrayList();
                list.add(arrayList);
                LJFF(arrayList, (JSONArray) obj);
            } else {
                list.add(jSONArray.get(i));
            }
        }
        C13LP.LLIIII(list);
    }

    public static Map LJI(JSONObject jSONObject, Map map) throws JSONException {
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
                LJI((JSONObject) obj, linkedHashMap);
            } else if (obj instanceof JSONArray) {
                ArrayList arrayList = new ArrayList();
                map.put(next, arrayList);
                LJFF(arrayList, (JSONArray) obj);
            } else {
                map.put(next, obj);
            }
        }
        return C2097608Jq.LJIIZILJ(map);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.promote.replace.IEventCenter
    public final void LIZ(String str, String str2) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject(str2);
            long jCurrentTimeMillis = System.currentTimeMillis();
            C1061730djf c1061730djf = this.LIZ;
            Map mapLJI = LJI(jSONObject, null);
            c1061730djf.getClass();
            C1548820qPI.LIZIZ(new C397901gf(jCurrentTimeMillis, C1061730djf.LIZLLL(mapLJI), str));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
    }
}
