package com.ss.lyrax.ttlh_adapter.utils;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class ParamConverter {
    public static JSONArray convertIntListToJsonArray(Integer[] numArr, JSONArray jSONArray) {
        if (numArr.length == 0) {
            return jSONArray;
        }
        JSONArray jSONArray2 = new JSONArray();
        for (Integer num : numArr) {
            jSONArray2.put(num.intValue());
        }
        return jSONArray2;
    }

    public static JSONArray convertStringListToJsonArray(String[] strArr, JSONArray jSONArray) {
        if (strArr.length == 0) {
            return jSONArray;
        }
        JSONArray jSONArray2 = new JSONArray();
        for (String str : strArr) {
            jSONArray2.put(str);
        }
        return jSONArray2;
    }

    public static JSONObject convertStringToJson(String str, JSONObject jSONObject) {
        try {
            if (str.isEmpty()) {
                return jSONObject;
            }
            return new JSONObject(str);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObject;
        }
    }
}
