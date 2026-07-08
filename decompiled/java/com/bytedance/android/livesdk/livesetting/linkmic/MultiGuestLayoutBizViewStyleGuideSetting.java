package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C786410Ut5;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("multi_guest_layout_biz_view_style_guide")
public final class MultiGuestLayoutBizViewStyleGuideSetting {
    public static final String DEFAULT;
    public static final MultiGuestLayoutBizViewStyleGuideSetting INSTANCE = new MultiGuestLayoutBizViewStyleGuideSetting();
    public static final JSONObject defaultConfigJson;
    public static final String defaultConfigJsonString;
    public static final String settingValue;

    static {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("topStart", new JSONArray().put("guideHostExpand"));
        jSONObject3.put("fullContainer", new JSONArray().put("guideHostMask"));
        jSONObject2.put("anchor", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("fullContainer", new JSONArray().put("noGuestMask"));
        jSONObject2.put("noGuest", jSONObject4);
        jSONObject.put("grid_normal", jSONObject2);
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        jSONObject6.put("topStart", new JSONArray().put("guideHostExpand"));
        jSONObject6.put("fullContainer", new JSONArray().put("guideHostMask"));
        jSONObject5.put("anchor", jSONObject6);
        JSONObject jSONObject7 = new JSONObject();
        jSONObject7.put("fullContainer", new JSONArray().put("noGuestMask"));
        jSONObject5.put("noGuest", jSONObject7);
        jSONObject.put("grid_small", jSONObject5);
        JSONObject jSONObject8 = new JSONObject();
        JSONObject jSONObject9 = new JSONObject();
        jSONObject9.put("fullContainer", new JSONArray().put("noGuestMask"));
        jSONObject8.put("anchor", jSONObject9);
        JSONObject jSONObject10 = new JSONObject();
        jSONObject10.put("fullContainer", new JSONArray().put("noGuestMask"));
        jSONObject8.put("noGuest", jSONObject10);
        jSONObject.put("panel_large", jSONObject8);
        defaultConfigJson = jSONObject;
        String strJ3 = C786410Ut5.J3(jSONObject);
        defaultConfigJsonString = strJ3;
        DEFAULT = strJ3;
        settingValue = SettingsManager.INSTANCE.getStringValue("multi_guest_layout_biz_view_style_guide", strJ3);
    }

    public final JSONObject getDefaultConfigJson() {
        return defaultConfigJson;
    }

    public final String getDefaultConfigJsonString() {
        return defaultConfigJsonString;
    }

    public final String getSettingValue() {
        return settingValue;
    }
}
