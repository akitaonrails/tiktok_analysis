package com.bytedance.android.starship.service;

import X.C05GO;
import X.C05YC;
import X.C0CRK;
import X.C1306120k5q;
import X.C1308050k8x;
import X.C1308060k8y;
import X.C1D1Q;
import X.C23250099c;
import X.C362801b0;
import X.InterfaceC497601wk;
import com.bytedance.android.starship.StarshipBridge;
import com.bytedance.android.starship.engine.event.Event;
import com.bytedance.android.starship.engine.service.StarshipEngineService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public final class StarshipEngineServiceImpl implements StarshipEngineService {
    @Override // com.bytedance.android.starship.engine.service.StarshipEngineService
    public final void LIZ(String str) {
        if (Intrinsics.LJFF(str, "event_on_play_time")) {
            C1308060k8y c1308060k8y = C1308060k8y.LIZ;
            if (!C1308060k8y.LIZLLL) {
                c1308060k8y.getClass();
                C23250099c.LIZLLL((InterfaceC497601wk) C1308060k8y.LJ.getValue(), null, null, new C0CRK(null), 3);
            } else {
                c1308060k8y.getClass();
            }
            if (((Boolean) C1D1Q.LIZLLL.getValue()).booleanValue()) {
                C1308060k8y.LIZIZ++;
                if (C1308060k8y.LIZJ.compareAndSet(false, true)) {
                    c1308060k8y.getClass();
                    C23250099c.LIZLLL((InterfaceC497601wk) C1308060k8y.LJ.getValue(), null, null, new C1308050k8x(null), 3);
                }
            }
        }
    }

    @Override // com.bytedance.android.starship.engine.service.StarshipEngineService
    public final void onAppLogEvent(String str, JSONObject jSONObject) {
        HashMap map;
        Map linkedHashMap;
        C1306120k5q c1306120k5q = C1306120k5q.LIZ;
        CopyOnWriteArraySet<String> copyOnWriteArraySet = C05GO.LIZ;
        if (!copyOnWriteArraySet.isEmpty() && copyOnWriteArraySet.contains(str)) {
            if (jSONObject != null) {
                linkedHashMap = C05GO.LIZ(jSONObject);
            } else {
                linkedHashMap = new LinkedHashMap();
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("name", str);
            linkedHashMap2.put("params", linkedHashMap);
            StarshipBridge.Companion.onAppLogEvent(linkedHashMap2);
        }
        C05YC<Event> c05yc = C1306120k5q.LIZJ.get(str);
        if (c05yc != null) {
            if (jSONObject != null) {
                map = new HashMap();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, jSONObject.opt(next));
                }
            } else {
                map = null;
            }
            C23250099c.LIZLLL(C1306120k5q.LIZIZ, null, null, new C362801b0(c05yc, new Event(str, map), null), 3);
        }
    }
}
