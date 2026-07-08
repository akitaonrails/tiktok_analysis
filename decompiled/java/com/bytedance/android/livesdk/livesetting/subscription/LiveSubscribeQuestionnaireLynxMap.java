package com.bytedance.android.livesdk.livesetting.subscription;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveSubscribeQuestionnaireLynxMap {
    public final JSONObject jsonObject;
    public final String questionHalfScreen;

    public final String getQuestionHalfScreen() {
        return this.questionHalfScreen;
    }

    public LiveSubscribeQuestionnaireLynxMap(String str) {
        JSONObject jSONObject;
        if (TextUtils.isEmpty(str)) {
            jSONObject = new JSONObject();
        } else {
            jSONObject = new JSONObject(str);
        }
        this.jsonObject = jSONObject;
        this.questionHalfScreen = jSONObject.optString("question_half_screen", "");
    }
}
