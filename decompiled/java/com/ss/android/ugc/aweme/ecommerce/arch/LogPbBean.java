package com.ss.android.ugc.aweme.ecommerce.arch;

import X.C09CT;
import X.C786410Ut5;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class LogPbBean implements Serializable {

    @C09CT("impr_id")
    public String imprId;

    public final n toJsonObject() {
        n nVar = new n();
        nVar.LJJIIJ("impr_id", TextUtils.isEmpty(this.imprId) ? "" : this.imprId);
        return nVar;
    }

    public final String toJsonString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("impr_id", TextUtils.isEmpty(this.imprId) ? "" : this.imprId);
            return C786410Ut5.J3(jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public final String getImprId() {
        return this.imprId;
    }

    public final String getImprIdFromJson(String str) {
        try {
            return new JSONObject(str).optString("impr_id");
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public final void setImprId(String str) {
        this.imprId = str;
    }
}
