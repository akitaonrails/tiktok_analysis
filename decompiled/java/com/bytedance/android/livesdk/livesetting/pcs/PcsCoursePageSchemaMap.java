package com.bytedance.android.livesdk.livesetting.pcs;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class PcsCoursePageSchemaMap {
    public final String courseFeedbackChatBotSchema;
    public final JSONObject jsonObject;

    public final String getCourseFeedbackChatBotSchema() {
        return this.courseFeedbackChatBotSchema;
    }

    public PcsCoursePageSchemaMap(String str) {
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
        this.courseFeedbackChatBotSchema = jSONObject.optString("course_feedback_chatbot", "");
    }
}
