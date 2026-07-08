package com.bytedance.frameworks.baselib.netx.partner.monitor;

import X.C0X52;
import X.C1499350p7V;
import X.C2188811AlT;
import X.C793770VBv;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.bytedance.retrofit2.client.Request;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class PartnerMonitor implements NetworkPartner.Bystander {
    public static final PartnerMonitor LIZ = new PartnerMonitor();

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LIZLLL(C0X52<?> c0x52) {
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LJI(Request request) {
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LJIIJ(Request request) {
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LJIIJJI(Request request, C0X52<?> c0x52, Throwable th) {
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final boolean enable() {
        return true;
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void onException(Throwable th) {
    }

    public static void LIZIZ(C1499350p7V c1499350p7V, String str, String str2) throws JSONException {
        c1499350p7V.LJI.clear();
        HashMap<String, Long> map = c1499350p7V.LJI;
        C1499350p7V.LIZIZ(map, c1499350p7V.LIZJ);
        C1499350p7V.LIZIZ(map, c1499350p7V.LIZLLL);
        C1499350p7V.LIZIZ(map, c1499350p7V.LJ);
        C1499350p7V.LIZIZ(map, c1499350p7V.LJFF);
        Iterator<Map.Entry<String, Long>> it2 = map.entrySet().iterator();
        long jLongValue = 0;
        while (it2.hasNext()) {
            jLongValue += it2.next().getValue().longValue();
        }
        JSONObject jSONObjectPut = new JSONObject().put("all_handler_duration", jLongValue).put("chain_proceed_duration", c1499350p7V.LIZ).put("partner_interceptor_duration", c1499350p7V.LIZIZ).put("partner_interceptor_self_duration", c1499350p7V.LIZIZ - c1499350p7V.LIZ).put("partner_process_duration", (c1499350p7V.LIZIZ - jLongValue) - c1499350p7V.LIZ);
        for (Map.Entry<String, Long> entry : c1499350p7V.LIZJ.entrySet()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(entry.getKey());
            sbLIZ.append('_');
            sbLIZ.append("request");
            sbLIZ.append("_duration");
            jSONObjectPut.put(C2188811AlT.LIZIZ(sbLIZ), entry.getValue().longValue());
        }
        for (Map.Entry<String, Long> entry2 : c1499350p7V.LIZLLL.entrySet()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(entry2.getKey());
            sbLIZ2.append('_');
            sbLIZ2.append("response");
            sbLIZ2.append("_duration");
            jSONObjectPut.put(C2188811AlT.LIZIZ(sbLIZ2), entry2.getValue().longValue());
        }
        for (Map.Entry<String, Long> entry3 : c1499350p7V.LJ.entrySet()) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(entry3.getKey());
            sbLIZ3.append('_');
            sbLIZ3.append("exception");
            sbLIZ3.append("_duration");
            jSONObjectPut.put(C2188811AlT.LIZIZ(sbLIZ3), entry3.getValue().longValue());
        }
        for (Map.Entry<String, Long> entry4 : c1499350p7V.LJFF.entrySet()) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(entry4.getKey());
            sbLIZ4.append('_');
            sbLIZ4.append("block");
            sbLIZ4.append("_duration");
            jSONObjectPut.put(C2188811AlT.LIZIZ(sbLIZ4), entry4.getValue().longValue());
        }
        C793770VBv.LJII("network_partner_log", new JSONObject().put("path", str), jSONObjectPut, new JSONObject().put("x-tt-logid", str2));
    }
}
