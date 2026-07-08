package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AggregationSdk implements Serializable {

    @C09CT("common_data")
    public Object commonData;

    public JSONObject getCommonData() {
        try {
            return new JSONObject(GsonProtectorUtils.toJson(new Gson(), this.commonData));
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
