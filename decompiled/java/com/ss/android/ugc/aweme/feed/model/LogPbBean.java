package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C786410Ut5;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class LogPbBean implements Serializable {

    @C09CT("impr_id")
    public String imprId;

    public String toJsonString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("impr_id", TextUtils.isEmpty(this.imprId) ? "" : this.imprId);
            return C786410Ut5.J3(jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public LogPbBean() {
    }

    public String getImprId() {
        return this.imprId;
    }

    public LogPbBean(String str) {
        this.imprId = str;
    }

    public String getImprIdFromJson(String str) {
        try {
            return new JSONObject(str).optString("impr_id");
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public void setImprId(String str) {
        this.imprId = str;
    }
}
