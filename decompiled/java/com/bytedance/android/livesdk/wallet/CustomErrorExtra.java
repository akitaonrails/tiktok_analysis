package com.bytedance.android.livesdk.wallet;

import X.C08HV;
import X.C09CT;
import X.C19748512Ol;
import X.C501470JlZ;
import X.C786410Ut5;
import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.k;
import com.google.gson.s;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
public class CustomErrorExtra extends Extra {
    public static int DISMISS_ACTION_OPEN_RECHARGE = 3;
    public static int PROMPT_TYPE_DIALOG = 1;
    public static int PROMPT_TYPE_FE = 3;
    public static int PROMPT_TYPE_TOAST = 2;

    @C09CT("content_replace")
    public Map<String, PopContentReplace> contentReplace;

    @C09CT("extra")
    public String extra;
    public C08HV extraMap;

    @C09CT("penalty_warning_skip")
    public String penaltyWarningSkip;

    @C09CT("pop_up_content")
    public String popUpContent;

    @C09CT("pop_up_dismiss")
    public String popUpDismiss;

    @C09CT("pop_up_dismiss_action")
    public Integer popUpDismissAction;

    @C09CT("pop_up_primary_action")
    public Integer popUpPrimaryAction;

    @C09CT("pop_up_primary_CTA")
    public String popUpPrimaryCTA;

    @C09CT("pop_up_primary_CTA_schema")
    public String popUpPrimaryCTASchema;

    @C09CT("pop_up_style")
    public int popUpStyle;

    @C09CT("pop_up_title")
    public String popUpTitle;

    @C09CT("prompt_type")
    public int promptType;
    public String rowJson;

    @C09CT("toast_content")
    public String toastContent;

    public ExtraEntity getExtraEntity() {
        try {
            return (ExtraEntity) C19748512Ol.LIZIZ.LJII(this.extra, ExtraEntity.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public String getPenaltyWarningSkip() {
        String str = this.penaltyWarningSkip;
        return str == null ? "" : str;
    }

    public Integer getPopUpDismissAction() {
        Integer num = this.popUpDismissAction;
        return Integer.valueOf(num != null ? num.intValue() : 1);
    }

    public Integer getPopUpPrimaryAction() {
        Integer num = this.popUpPrimaryAction;
        return Integer.valueOf(num != null ? num.intValue() : 0);
    }

    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        toJSONObject(jSONObject);
        return jSONObject;
    }

    public boolean isContinuable() {
        return getPopUpPrimaryAction().intValue() == 2 || getPopUpDismissAction().intValue() == 2;
    }

    public Map<String, PopContentReplace> getContentReplace() {
        return this.contentReplace;
    }

    public String getPopUpContent() {
        return this.popUpContent;
    }

    public String getPopUpDismiss() {
        return this.popUpDismiss;
    }

    public String getPopUpPrimaryCTA() {
        return this.popUpPrimaryCTA;
    }

    public String getPopUpPrimaryCTASchema() {
        return this.popUpPrimaryCTASchema;
    }

    public int getPopUpStyle() {
        return this.popUpStyle;
    }

    public String getPopUpTitle() {
        return this.popUpTitle;
    }

    public int getPromptType() {
        return this.promptType;
    }

    public String getRawJson() {
        return this.rowJson;
    }

    public String getToastContent() {
        return this.toastContent;
    }

    public class ExtraEntity {

        @C09CT("error_code")
        public String error_code;

        @C09CT("link_to_jump")
        public String linkToJump;

        public ExtraEntity(CustomErrorExtra customErrorExtra) {
        }
    }

    public class PopContentReplace {

        @C09CT("replace_value")
        public String replaceValue;

        @C09CT("value_schema")
        public String valueSchema;

        public PopContentReplace(CustomErrorExtra customErrorExtra) {
        }
    }

    public static CustomErrorExtra getCustomErrorExtra(Exception exc) {
        CustomErrorExtra customErrorExtra;
        if (!(exc instanceof C501470JlZ)) {
            return null;
        }
        String extra = ((C501470JlZ) exc).getExtra();
        try {
            JSONObject jSONObject = new JSONObject(extra);
            if (jSONObject.has("custom_error")) {
                extra = C786410Ut5.J3(JSONObjectProtectorUtils.getJSONObject(jSONObject, "custom_error"));
            }
            customErrorExtra = (CustomErrorExtra) GsonProtectorUtils.fromJson(C19748512Ol.LIZIZ, extra, CustomErrorExtra.class);
            if (customErrorExtra != null) {
                try {
                    String str = customErrorExtra.extra;
                    if (str != null) {
                        customErrorExtra.extraMap = new C08HV(str);
                    }
                } catch (s e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                    if (customErrorExtra != null) {
                    }
                    return customErrorExtra;
                } catch (JSONException e2) {
                    e = e2;
                    TryCatchGuardChecker.doCheck(e);
                    if (customErrorExtra != null) {
                    }
                    return customErrorExtra;
                }
            }
            customErrorExtra.rowJson = extra;
        } catch (s | JSONException e3) {
            e = e3;
            customErrorExtra = null;
        }
        if (customErrorExtra.promptType == 0) {
            return null;
        }
        return customErrorExtra;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public JSONObject toJSONObject(JSONObject jSONObject) throws JSONException {
        jSONObject.put("prompt_type", this.promptType);
        jSONObject.put("toast_content", this.toastContent);
        jSONObject.put("pop_up_title", this.popUpTitle);
        jSONObject.put("pop_up_content", this.popUpContent);
        jSONObject.put("content_replace", (Object) null);
        if (this.contentReplace != null) {
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry<String, PopContentReplace> entry : this.contentReplace.entrySet()) {
                String key = entry.getKey();
                PopContentReplace value = entry.getValue();
                value.getClass();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("replace_value", value.replaceValue);
                jSONObject3.put("value_schema", value.valueSchema);
                jSONObject2.put(key, jSONObject3);
            }
            jSONObject.put("content_replace", jSONObject2);
        }
        jSONObject.put("pop_up_dismiss", this.popUpDismiss);
        jSONObject.put("pop_up_dismiss_action", this.popUpDismissAction);
        jSONObject.put("pop_up_primary_action", this.popUpPrimaryAction);
        jSONObject.put("penalty_warning_skip", this.penaltyWarningSkip);
        jSONObject.put("pop_up_primary_CTA", this.popUpPrimaryCTA);
        jSONObject.put("pop_up_primary_CTA_schema", this.popUpPrimaryCTASchema);
        jSONObject.put("pop_up_style", this.popUpStyle);
        Object obj = this.extra;
        if (obj != null) {
            jSONObject.put("extra", obj);
        }
        return jSONObject;
    }

    public static CustomErrorExtra getCustomErrorExtra(Map map) {
        CustomErrorExtra customErrorExtra;
        k jsonTree;
        try {
            Gson gson = new Gson();
            if (map.containsKey("custom_error")) {
                jsonTree = GsonProtectorUtils.toJsonTree(gson, map.get("custom_error"));
            } else {
                jsonTree = GsonProtectorUtils.toJsonTree(gson, map);
            }
            customErrorExtra = (CustomErrorExtra) GsonProtectorUtils.fromJson(gson, jsonTree, CustomErrorExtra.class);
        } catch (s e) {
            e = e;
            customErrorExtra = null;
        }
        if (customErrorExtra != null) {
            if (jsonTree != null) {
                try {
                    customErrorExtra.rowJson = jsonTree.toString();
                } catch (s e2) {
                    e = e2;
                    TryCatchGuardChecker.doCheck(e);
                    if (customErrorExtra != null) {
                    }
                    return customErrorExtra;
                }
            }
            if (customErrorExtra.promptType == 0) {
                return null;
            }
        }
        return customErrorExtra;
    }
}
