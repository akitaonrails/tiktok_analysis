package com.bytedance.ies.ugc.aweme.rich.model.feed.model;

import X.C09CT;
import X.C1216604pQ;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class AggregationSdk implements Serializable {

    @C09CT("common_data")
    public Object commonData;

    public JSONObject getCommonData() {
        try {
            return new JSONObject(GsonProtectorUtils.toJson(C1216604pQ.LIZ(), this.commonData));
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
