package com.ss.android.ugc.aweme.internalshare.impl.feedquickshare;

import X.AnonymousClass0950;
import X.C09IC;
import X.C09IR;
import X.C13LP;
import X.C2252331DDr;
import X.C998410c5X;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.pitaya.api.PTYCepCallback;
import com.bytedance.pitaya.api.PTYCepResult;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class QuickShareCepRuleManager {
    public static boolean LIZ;
    public static final List<String> LIZIZ = new ArrayList();
    public static final C2252331DDr LIZJ;
    public static final AnonymousClass0950 LIZLLL;

    static {
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 1, null, 5);
        LIZJ = c2252331DDrLIZIZ;
        LIZLLL = C09IC.LIZ(c2252331DDrLIZIZ);
    }

    public static String LIZ(PTYCepResult pTYCepResult) {
        Object obj;
        JSONObject jSONObject;
        Object obj2;
        JSONArray jSONArray;
        try {
            List<JSONArray> matchedEventsSequences = pTYCepResult.getMatchedEventsSequences();
            JSONObject jSONObject2 = null;
            if (matchedEventsSequences != null && (jSONArray = (JSONArray) C13LP.LJJJLL(matchedEventsSequences)) != null) {
                obj = jSONArray.get(0);
            } else {
                obj = null;
            }
            if (obj instanceof JSONObject) {
                jSONObject = (JSONObject) obj;
            } else {
                jSONObject = null;
            }
            if (jSONObject == null) {
                obj2 = null;
            } else {
                obj2 = jSONObject.get("params");
            }
            if (obj2 instanceof JSONObject) {
                jSONObject2 = (JSONObject) obj2;
            }
            if (jSONObject2 != null) {
                String string = JSONObjectProtectorUtils.getString(jSONObject2, "group_id");
                if (string != null) {
                    return string;
                }
            }
            return "";
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public static final class ManagerCepCallback implements PTYCepCallback {
        public final String ruleName;
        public final String trigger;

        public ManagerCepCallback(String str, String str2) {
            this.trigger = str;
            this.ruleName = str2;
        }

        @Override // com.bytedance.pitaya.api.PTYCepCallback
        public void onFinish(boolean z, PTYError pTYError, PTYCepResult pTYCepResult) {
            if (z) {
                try {
                    QuickShareCepRuleManager.LIZJ.LIZJ(new C998410c5X(QuickShareCepRuleManager.LIZ(pTYCepResult), this.trigger));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }
}
