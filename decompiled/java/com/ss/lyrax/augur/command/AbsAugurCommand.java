package com.ss.lyrax.augur.command;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public abstract class AbsAugurCommand {
    public String adaptiveStrategyName;
    public String direction;
    public String ruleName;
    public String scene;
    public int success = -1;
    public String adaptiveStrategyStatus = "default";
    public JSONObject resultToParamsJSONObject = new JSONObject();
    public JSONObject adaptiveResultJSONObject = new JSONObject();
    public JSONObject adaptiveStrategyLevelJSON = new JSONObject();
    public String resolutionStrategyExtraStatus = "default";
    public String adaptiveStrategyStatusListItem = "";

    public abstract CommandType getCommandType();

    public void parseReportMap(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            this.adaptiveResultJSONObject = jSONObject2;
            if (jSONObject2.has("rule_name")) {
                this.ruleName = jSONObject2.get("rule_name").toString();
            }
            if (jSONObject2.has("direction")) {
                this.direction = jSONObject2.get("direction").toString();
            }
            this.resultToParamsJSONObject = JSONObjectProtectorUtils.getJSONObject(jSONObject2, "to_params");
            this.scene = JSONObjectProtectorUtils.getString(JSONObjectProtectorUtils.getJSONObject(jSONObject2, "feature"), Scene.SCENE_SERVICE);
            if (jSONObject != null) {
                JSONObject jSONObject3 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "report");
                String strOptString = jSONObject3.optString("adaptive_strategy_name");
                this.adaptiveStrategyName = strOptString;
                if (TextUtils.equals(strOptString, "null")) {
                    this.adaptiveStrategyName = "";
                }
                this.adaptiveStrategyStatus = jSONObject3.optString("adaptive_strategy_status");
                this.adaptiveStrategyLevelJSON = jSONObject3.optJSONObject("adaptive_strategy_level_list");
                if (jSONObject3.has("resolution_strategy_extra_status")) {
                    this.resolutionStrategyExtraStatus = jSONObject3.optString("resolution_strategy_extra_status");
                }
                if (jSONObject3.has("adaptive_strategy_status_list")) {
                    this.adaptiveStrategyStatusListItem = jSONObject3.optString("adaptive_strategy_status_list");
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
