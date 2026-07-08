package com.bytedance.android.livesdk.livesetting.pcs;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class PcsCourseFaqSchemaMap {
    public final String courseDetailFaq;
    public final String courseDetailFullScreenFaq;
    public final JSONObject jsonObject;
    public final String serviceBioFaq;

    public final String getCourseDetailFaq() {
        return this.courseDetailFaq;
    }

    public final String getCourseDetailFullScreenFaq() {
        return this.courseDetailFullScreenFaq;
    }

    public final String getServiceBioFaq() {
        return this.serviceBioFaq;
    }

    public PcsCourseFaqSchemaMap(String str) {
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
        this.serviceBioFaq = jSONObject.optString("service_preview_faq", "");
        this.courseDetailFaq = jSONObject.optString("course_detail_panel_faq", "");
        this.courseDetailFullScreenFaq = jSONObject.optString("course_detail_fullpage_faq", "");
    }
}
