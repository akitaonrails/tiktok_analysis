package com.bytedance.android.livesdk.livesetting.pcs;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class PcsThirdPartyReportSchemaMap {
    public final String biolinkReportSchema;
    public final JSONObject jsonObject;

    public final String getBiolinkReportSchema() {
        return this.biolinkReportSchema;
    }

    public PcsThirdPartyReportSchemaMap(String str) {
        JSONObject jSONObject;
        try {
            if (TextUtils.isEmpty(str)) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(str);
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            jSONObject = new JSONObject();
        }
        this.jsonObject = jSONObject;
        this.biolinkReportSchema = jSONObject.optString("biolink_report", "aweme://roma_redirect/?spark_page=TT_CSP_Common_Chatbot_Popup&entrance=service_link_bot&enter_from=service_link_bot");
    }
}
