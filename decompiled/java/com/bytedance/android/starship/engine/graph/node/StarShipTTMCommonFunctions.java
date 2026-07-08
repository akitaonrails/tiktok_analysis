package com.bytedance.android.starship.engine.graph.node;

import X.C1306430k6L;
import X.C1309240kAs;
import X.C23250099c;
import X.C23271099x;
import X.C259800zU;
import X.C348001Ws;
import X.C348101Wt;
import X.C5182020e;
import X.InterfaceC348201Wu;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class StarShipTTMCommonFunctions implements InterfaceC348201Wu {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC348201Wu
    public Map<String, Object> runPitayaTask(String str, Map<String, ? extends Object> map, long j) throws Throwable {
        Map<String, ? extends Object> linkedHashMap = map;
        if (str != null) {
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap<>();
            }
            if (!C1309240kAs.LIZJ(str)) {
                C1306430k6L.LIZ(new C348101Wt(str));
            }
            C259800zU c259800zU = new C259800zU();
            C23250099c.LJ(C23271099x.INSTANCE, new C348001Ws(c259800zU, str, linkedHashMap, j, null));
            C1306430k6L.LIZ(new C5182020e(c259800zU, (C259800zU<JSONObject>) 103));
            JSONObject jSONObject = (JSONObject) c259800zU.element;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                linkedHashMap2.put(next, jSONObject.get(next));
            }
            return linkedHashMap2;
        }
        "business==null".toString();
        throw new IllegalStateException("business==null");
    }
}
