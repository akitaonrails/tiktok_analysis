package com.ss.android.ugc.aweme.services.interceptor;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class ForcePhoneVerificationManager {
    public static ConditionalBindLoginParam conditionalBindLoginParam;
    public static final ForcePhoneVerificationManager INSTANCE = new ForcePhoneVerificationManager();
    public static final int $stable = 8;

    public final void conditionalBindLoginSuccessOrCancel() {
        conditionalBindLoginParam = null;
    }

    public final ConditionalBindLoginParam getConditionalBindLoginParam() {
        return conditionalBindLoginParam;
    }

    public final void setConditionalBindLoginParam(ConditionalBindLoginParam conditionalBindLoginParam2) {
        conditionalBindLoginParam = conditionalBindLoginParam2;
    }

    public final ConditionalBindLoginParam getParam(String str, String str2) {
        ConditionalBindLoginParam conditionalBindLoginParam2 = conditionalBindLoginParam;
        if (conditionalBindLoginParam2 != null) {
            conditionalBindLoginParam2.setMobile(str);
        }
        ConditionalBindLoginParam conditionalBindLoginParam3 = conditionalBindLoginParam;
        if (conditionalBindLoginParam3 != null) {
            conditionalBindLoginParam3.setCode(str2);
        }
        return conditionalBindLoginParam;
    }

    public final void interceptParam(String str, Map<String, String> map) {
        JSONObject jSONObject;
        if (str != null && str.length() != 0 && map != null && !map.isEmpty()) {
            ConditionalBindLoginParam conditionalBindLoginParam2 = new ConditionalBindLoginParam();
            conditionalBindLoginParam = conditionalBindLoginParam2;
            conditionalBindLoginParam2.setOriginParam(map);
            try {
                jSONObject = new JSONObject(str).optJSONObject("data");
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                jSONObject = new JSONObject();
            }
            String strOptString = jSONObject.optString("profile_key");
            String strOptString2 = jSONObject.optString("email_code_key");
            boolean zOptBoolean = jSONObject.optBoolean("is_register_for_verify");
            ConditionalBindLoginParam conditionalBindLoginParam3 = conditionalBindLoginParam;
            if (conditionalBindLoginParam3 != null) {
                conditionalBindLoginParam3.setProfileKey(strOptString);
            }
            ConditionalBindLoginParam conditionalBindLoginParam4 = conditionalBindLoginParam;
            if (conditionalBindLoginParam4 != null) {
                conditionalBindLoginParam4.setEmailCodeKey(strOptString2);
            }
            ConditionalBindLoginParam conditionalBindLoginParam5 = conditionalBindLoginParam;
            if (conditionalBindLoginParam5 != null) {
                conditionalBindLoginParam5.setRegister(zOptBoolean);
            }
        }
    }
}
