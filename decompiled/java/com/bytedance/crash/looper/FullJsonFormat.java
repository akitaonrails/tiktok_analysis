package com.bytedance.crash.looper;

import X.C0VJO;
import X.C0VSJ;
import X.C2112008Pe;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class FullJsonFormat {
    public static JSONObject LIZIZ(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("history_details");
        if (jSONObjectOptJSONObject == null) {
            JSONObject jSONObject2 = new JSONObject();
            C0VJO.LJIIIIZZ(jSONObject2, "longestMsgType", "no_details");
            C0VJO.LJIIIIZZ(jSONObject2, "longestMsg", "no_details");
            C0VJO.LJIIIIZZ(jSONObject, "history_details", jSONObject2);
            return jSONObject2;
        }
        return jSONObjectOptJSONObject;
    }

    public static JSONObject LIZJ(File file, String str) {
        try {
            String strLJFF = C2112008Pe.LJFF(new C0VSJ(file, str));
            if (strLJFF != null) {
                return new JSONObject(strLJFF);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return new JSONObject();
    }

    public static void LIZ(JSONArray jSONArray, JSONObject jSONObject, long j, boolean z) {
        long jOptLong;
        String strOptString;
        if (z) {
            jOptLong = jSONObject.optLong("currentMessageCost");
        } else {
            jOptLong = jSONObject.optLong("duration");
        }
        if (jSONArray != null) {
            long j2 = jOptLong + j;
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                long jOptLong2 = jSONObjectOptJSONObject.optLong("time");
                if (jOptLong2 >= j && jOptLong2 <= j2) {
                    strOptString = jSONObjectOptJSONObject.optString("trace");
                    break;
                }
            }
            strOptString = null;
        } else {
            strOptString = null;
        }
        C0VJO.LJIIIIZZ(jSONObject, "block_stack", strOptString);
    }
}
