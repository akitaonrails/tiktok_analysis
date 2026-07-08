package com.bytedance.ies.ugc.aweme.ttsetting.model;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class TTSettingDataResponse {
    public TTSettingData ttSettingData;
    public JSONObject ttSettingDataJSONObject;

    public final TTSettingData getTtSettingData() {
        return this.ttSettingData;
    }

    public final JSONObject getTtSettingDataJSONObject() {
        return this.ttSettingDataJSONObject;
    }

    public final void setTtSettingData(TTSettingData tTSettingData) {
        this.ttSettingData = tTSettingData;
    }

    public final void setTtSettingDataJSONObject(JSONObject jSONObject) {
        this.ttSettingDataJSONObject = jSONObject;
    }

    public TTSettingDataResponse(TTSettingData tTSettingData, JSONObject jSONObject) {
        this.ttSettingData = tTSettingData;
        this.ttSettingDataJSONObject = jSONObject;
    }
}
