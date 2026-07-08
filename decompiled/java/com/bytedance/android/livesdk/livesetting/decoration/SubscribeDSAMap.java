package com.bytedance.android.livesdk.livesetting.decoration;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class SubscribeDSAMap {
    public final String appealUrl;
    public final JSONObject jsonObject;

    public final String getAppealUrl() {
        return this.appealUrl;
    }

    public SubscribeDSAMap(String str) {
        JSONObject jSONObject;
        if (TextUtils.isEmpty(str)) {
            jSONObject = new JSONObject();
        } else {
            jSONObject = new JSONObject(str);
        }
        this.jsonObject = jSONObject;
        this.appealUrl = jSONObject.optString("appeal", "");
    }
}
