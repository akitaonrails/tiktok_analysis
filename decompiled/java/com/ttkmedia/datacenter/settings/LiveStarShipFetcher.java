package com.ttkmedia.datacenter.settings;

import X.C1306900k76;
import X.C1307030k7J;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1308150k97;
import X.InterfaceC1307040k7K;
import com.bytedance.android.starship.strategy.DecisionConfig;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ttkmedia.datacenter.settings.LiveStarShipFetcher;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public final class LiveStarShipFetcher {
    public static native void _handleUpdateResult(long j, boolean z);

    public static String getLiveConfig(String str) {
        JSONObject jSONObject;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Starship] LiveStarShipFetcher getLiveConfig tag:");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        try {
            Map<String, DecisionConfig> mapLIZ = C1306900k76.LIZIZ.LIZ(str);
            if (mapLIZ == null || mapLIZ.isEmpty()) {
                return null;
            }
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry<String, DecisionConfig> entry : mapLIZ.entrySet()) {
                String key = entry.getKey();
                DecisionConfig value = entry.getValue();
                EnumC1308150k97 enumC1308150k97 = value.type;
                Object obj = value.data;
                if (obj != null) {
                    if (enumC1308150k97 != EnumC1308150k97.LEGACY_JSON_OBJECT && enumC1308150k97 != EnumC1308150k97.JSON_OBJECT) {
                        if (!(obj instanceof JSONObject) && !(obj instanceof JSONArray) && !(obj instanceof Boolean) && !(obj instanceof Number) && !(obj instanceof String)) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("[Starship] LiveStarShipFetcher Unsupported types key:");
                            sbLIZ2.append(key);
                            C2188811AlT.LIZIZ(sbLIZ2);
                        } else {
                            jSONObject2.put(key, obj);
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("[Starship] LiveStarShipFetcher result put key:");
                            sbLIZ3.append(key);
                            C2188811AlT.LIZIZ(sbLIZ3);
                        }
                    } else {
                        if (obj instanceof JSONObject) {
                            jSONObject = (JSONObject) obj;
                        } else {
                            jSONObject = new JSONObject(String.valueOf(obj));
                        }
                        jSONObject2.put(key, jSONObject);
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("[Starship] LiveStarShipFetcher result put JSON_OBJECT key:");
                        sbLIZ4.append(key);
                        C2188811AlT.LIZIZ(sbLIZ4);
                    }
                }
            }
            return C786410Ut5.J3(jSONObject2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("[Starship] LiveStarShipFetcher getLiveConfig Exception:");
            sbLIZ5.append(e);
            C2188811AlT.LIZIZ(sbLIZ5);
            return null;
        }
    }

    public static /* synthetic */ void lambda$updateLiveConfig$0(long j, C1307030k7J c1307030k7J) {
        _handleUpdateResult(j, c1307030k7J.LIZ);
    }

    public static void updateLiveConfig(String str, final long j) {
        JSONObject jSONObject = new JSONObject(str);
        if (!jSONObject.has("tags")) {
            _handleUpdateResult(j, false);
            return;
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject, "tags");
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(JSONArrayProtectorUtils.getString(jSONArray, i));
        }
        C1306900k76.LIZIZ.LIZIZ(jSONObject, arrayList, new InterfaceC1307040k7K() { // from class: X.0k7M
            @Override // X.InterfaceC1307040k7K
            public final void LIZ(C1307030k7J c1307030k7J) {
                LiveStarShipFetcher.lambda$updateLiveConfig$0(j, c1307030k7J);
            }
        });
    }
}
