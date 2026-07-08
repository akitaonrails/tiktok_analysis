package com.ss.android.ugc.aweme.settingsrequest;

import X.C0C7O;
import X.C786410Ut5;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.settingsrequest.api.IConfigCenterBridgeApi;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ConfigCenterCenterBridgeImpl implements IConfigCenterBridgeApi {
    @Override // com.ss.android.ugc.aweme.settingsrequest.api.IConfigCenterBridgeApi
    public final Map<String, Object> getSettings(List<String> list) {
        try {
            if (list.isEmpty()) {
                return C0C7O.LIZJ();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : list) {
                linkedHashMap.put(str, C0C7O.LIZ(str));
            }
            return linkedHashMap;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new LinkedHashMap();
        }
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.IConfigCenterBridgeApi
    public final void LIZ(JSONObject jSONObject, Function1<? super String, Unit> function1, Function1<? super Exception, Unit> function12) {
        if (jSONObject != null) {
            try {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("ab_test_names");
                if (jSONArrayOptJSONArray != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    int length = jSONArrayOptJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        String strOptString = jSONArrayOptJSONArray.optString(i);
                        jSONObject2.put(strOptString, C0C7O.LIZ(strOptString));
                    }
                    function1.invoke(C786410Ut5.J3(jSONObject2));
                    return;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                function12.invoke(e);
                return;
            }
        }
        function1.invoke(C0C7O.LIZIZ());
    }
}
