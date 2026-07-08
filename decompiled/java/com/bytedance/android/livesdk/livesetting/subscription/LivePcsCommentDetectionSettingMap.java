package com.bytedance.android.livesdk.livesetting.subscription;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class LivePcsCommentDetectionSettingMap {
    public final String androidScene;
    public final boolean enable;
    public final String inputSeparator;
    public final JSONObject jsonObject;

    public final String getAndroidScene() {
        return this.androidScene;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final String getInputSeparator() {
        return this.inputSeparator;
    }

    public LivePcsCommentDetectionSettingMap(String str) {
        JSONObject jSONObject;
        String strOptString;
        if (TextUtils.isEmpty(str)) {
            jSONObject = new JSONObject();
        } else {
            jSONObject = new JSONObject(str);
        }
        this.jsonObject = jSONObject;
        this.enable = jSONObject.optBoolean("enabled", false);
        this.inputSeparator = jSONObject.optString("input_separator", ",");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("android");
        String str2 = "";
        if (jSONObjectOptJSONObject != null && (strOptString = jSONObjectOptJSONObject.optString("scene_bytenn", "")) != null) {
            str2 = strOptString;
        }
        this.androidScene = str2;
    }
}
