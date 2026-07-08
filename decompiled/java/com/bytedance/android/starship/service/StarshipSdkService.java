package com.bytedance.android.starship.service;

import X.C01XU;
import X.C01XV;
import X.C054G;
import X.C05GO;
import X.C0C59;
import X.C0PEM;
import X.C1128204bA;
import X.C1128804bG;
import X.C1129004bI;
import X.C1306320k6A;
import X.C1306430k6L;
import X.C1306580k6a;
import X.C1306600k6c;
import X.C1306970k7D;
import X.C1307940k8m;
import X.C1308130k95;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C786410Ut5;
import X.EnumC1306750k6r;
import X.EnumC1306820k6y;
import com.bytedance.android.starship.IStarshipBridgeService;
import com.bytedance.android.starship.strategy.CppAllowMapConfig;
import com.bytedance.android.starship.strategy.repository.RequestData;
import com.bytedance.android.starship.strategy.repository.StrategiesData;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public final class StarshipSdkService implements IStarshipBridgeService {
    public final C054G LIZ = C2296808zG.LIZ(C0PEM.LIZJ);
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);

    @Override // com.bytedance.android.starship.IStarshipBridgeService
    public final String LJIIIIZZ() {
        Set setKeySet;
        Set setKeySet2;
        Map<String, Object> map;
        Map<String, Object> map2;
        try {
            CppAllowMapConfig cppAllowMapConfig = (CppAllowMapConfig) C1128804bG.LIZIZ.getValue();
            C1306430k6L.LIZ(new C1128204bA(cppAllowMapConfig, (Map) C1129004bI.LIZIZ.getValue()));
            if (cppAllowMapConfig == null || (map2 = cppAllowMapConfig.strategyMap) == null) {
                setKeySet = null;
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, Object> entry : map2.entrySet()) {
                    if (Intrinsics.LJFF(entry.getValue(), Boolean.TRUE)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                setKeySet = linkedHashMap.keySet();
            }
            if (cppAllowMapConfig == null || (map = cppAllowMapConfig.eventMap) == null) {
                setKeySet2 = null;
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry<String, Object> entry2 : map.entrySet()) {
                    if (Intrinsics.LJFF(entry2.getValue(), Boolean.TRUE)) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                }
                setKeySet2 = linkedHashMap2.keySet();
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("strategy_allow_list", new JSONArray((Collection) setKeySet));
            jSONObject.put("event_allow_list", new JSONArray((Collection) setKeySet2));
            Map map3 = (Map) C1129004bI.LIZIZ.getValue();
            if (map3 != null) {
                for (Map.Entry entry3 : map3.entrySet()) {
                    jSONObject.put((String) entry3.getKey(), entry3.getValue());
                }
            }
            Integer numLIZLLL = C1307940k8m.LIZ().LIZLLL();
            jSONObject.put("enable_fast_engine_lazy_init", (numLIZLLL != null ? numLIZLLL.intValue() : 0) == 1);
            String strLJFF = C1307940k8m.LIZ().LJFF();
            if (strLJFF != null) {
                jSONObject.put("fast_engine_init_config", strLJFF);
            }
            return C786410Ut5.J3(jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // com.bytedance.android.starship.IStarshipBridgeService
    public final String LJIIJ() {
        String string = null;
        try {
            EnumC1306820k6y enumC1306820k6y = EnumC1306820k6y.COLD_START;
            try {
                Keva kevaLIZJ = C1306580k6a.LIZJ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("strategy_entry");
                sbLIZ.append(C1306580k6a.LIZLLL(enumC1306820k6y));
                string = kevaLIZJ.getString(C2188811AlT.LIZIZ(sbLIZ), null);
                return string;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return string;
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            return string;
        }
    }

    @Override // com.bytedance.android.starship.IStarshipBridgeService
    public final void LJ() {
        C23250099c.LIZLLL(this.LIZ, null, null, new C1306970k7D(this, null), 3);
    }

    @Override // com.bytedance.android.starship.IStarshipBridgeService
    public final void LJI() {
        C23250099c.LIZLLL(this.LIZ, null, null, new C01XU(null), 3);
    }

    @Override // com.bytedance.android.starship.IStarshipBridgeService
    public final String LIZLLL(int i) {
        try {
            return C1306600k6c.LIZ().getString(C1306600k6c.LIZIZ("decision_config_entry", EnumC1306750k6r.values()[i].getValue()), null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // com.bytedance.android.starship.IStarshipBridgeService
    public final void LJFF(final C1308130k95 c1308130k95) {
        C1306580k6a.LJ = new Function2<RequestData, StrategiesData, Unit>() { // from class: X.0k7E
            @Override // kotlin.jvm.functions.Function2
            public final Unit invoke(RequestData requestData, StrategiesData strategiesData) {
                Gson gson = C1306320k6A.LIZ;
                String json = GsonProtectorUtils.toJson(gson, requestData, new TypeToken<RequestData>() { // from class: X.0k7H
                }.getType());
                String str = null;
                if (json == null) {
                    json = null;
                }
                String json2 = GsonProtectorUtils.toJson(gson, strategiesData, new TypeToken<StrategiesData>() { // from class: X.0k7I
                }.getType());
                if (json2 != null) {
                    str = json2;
                }
                Function2<String, String, Unit> function2 = c1308130k95;
                if (json == null) {
                    json = "";
                }
                if (str == null) {
                    str = "";
                }
                function2.invoke(json, str);
                return Unit.LIZ;
            }
        };
    }

    @Override // com.bytedance.android.starship.IStarshipBridgeService
    public final String LJII(String str) {
        String strLJIILL = null;
        try {
            Object objLJIIJJI = C0C59.LJ().LJIIJJI(str, false);
            if (objLJIIJJI == null) {
                return null;
            }
            strLJIILL = C1306320k6A.LIZ.LJIILL(objLJIIJJI);
            return strLJIILL;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return strLJIILL;
        }
    }

    @Override // com.bytedance.android.starship.IStarshipBridgeService
    public final void LJIIIZ(String str) {
        C05GO.LIZ.add(str);
    }

    @Override // com.bytedance.android.starship.IStarshipBridgeService
    public final void LIZ(String str, Map<String, ? extends Object> map) {
        C23250099c.LIZLLL(this.LIZ, null, null, new C01XV(str, map, null), 3);
    }

    @Override // com.bytedance.android.starship.IStarshipBridgeService
    public final void LIZIZ(String str, long j) {
        C1307940k8m.LIZ().LIZIZ(str, j);
    }

    @Override // com.bytedance.android.starship.IStarshipBridgeService
    public final String LIZJ(String str, String str2, String str3, String str4) {
        Object objLIZJ = C1307940k8m.LIZ().LIZJ(str, str2, str3, str4);
        if (objLIZJ == null) {
            return null;
        }
        try {
            return C1306320k6A.LIZ.LJIILL(objLIZJ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
