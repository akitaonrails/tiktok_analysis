package com.ss.android.ugc.aweme.service;

import X.C01GW;
import X.C08KS;
import X.C08KT;
import X.C08KU;
import X.C1697810uHb;
import X.C1741890vQh;
import X.C20684815ws;
import X.C20715089p;
import X.C2188811AlT;
import X.C2214011Bl1;
import X.C2344009Gk;
import X.RunnableC514801zW;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS152S1100000_3;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class PhotoModeExtraImpl implements IPhotoModeExtraService {
    @Override // com.ss.android.ugc.aweme.service.IPhotoModeExtraService
    public final String LIZJ() {
        return ((Keva) C20715089p.LIZ.getValue()).getString("key_photo_load_fail_event", "Unknown");
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoModeExtraService
    public final Map<String, List<Object>> LIZLLL(String str) {
        if (C08KU.LIZ()) {
            C2214011Bl1.LIZ.getClass();
            HashMap map = new HashMap();
            try {
                for (C08KT c08kt : C2214011Bl1.LIZ().LIZIZ()) {
                    for (String str2 : ((LinkedHashMap) C2214011Bl1.LJFF).keySet()) {
                        Object obj = c08kt.LIZ.get(str2);
                        if (obj == null) {
                            obj = ((LinkedHashMap) C2214011Bl1.LJFF).get(str2);
                        }
                        if (map.containsKey(str2)) {
                            List list = (List) map.get(str2);
                            if (list != null) {
                                list.add(obj);
                            }
                        } else {
                            map.put(str2, C1697810uHb.LJIILJJIL(obj));
                        }
                    }
                }
                Iterator it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    Collections.reverse((List) ((Map.Entry) it2.next()).getValue());
                }
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJFF("feature", C1741890vQh.LJIIIIZZ(map));
                c2344009Gk.LJFF("request_id", str);
                C20684815ws.LJIILLIIL("photomode_realtime_feature", c2344009Gk.LIZ);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getRealTimeData realTimeMap: ");
                sbLIZ.append(map);
                C2188811AlT.LIZIZ(sbLIZ);
                return map;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return map;
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoModeExtraService
    public final void LIZ(String str, JSONObject jSONObject) {
        if (str != null && C08KU.LIZ()) {
            C2214011Bl1.LIZ.getClass();
            C01GW c01gw = C08KS.LIZ;
            c01gw.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onLogEvent:");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            try {
                ((ExecutorService) c01gw.getValue()).execute(new RunnableC514801zW(new AwS152S1100000_3(str, jSONObject, 3), (Function0<Unit>) 109));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoModeExtraService
    public final void LIZIZ(String str, JSONObject jSONObject) {
        if (C08KU.LIZ()) {
            C2214011Bl1.LIZ.getClass();
            C01GW c01gw = C08KS.LIZ;
            c01gw.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onLogEvent:");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            try {
                ((ExecutorService) c01gw.getValue()).execute(new RunnableC514801zW(new AwS152S1100000_3(str, jSONObject, 4), (Function0<Unit>) 109));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
