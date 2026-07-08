package ttp.orbu.sdk.network.request;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class APIPutLogsDetailsBodyKt {
    public static final JSONObject toJSONObject(APIPutLogsDetailsBody aPIPutLogsDetailsBody) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("specversion", aPIPutLogsDetailsBody.specversion);
        jSONObject.put("logEntryBatches", aPIPutLogsDetailsBody.logEntryBatches);
        return jSONObject;
    }
}
