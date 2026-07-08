package com.ss.lyrax.augur.command;

import X.C09CT;
import X.C2188811AlT;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class AugurEffectModelCommand extends AbsAugurCommand implements Serializable {
    public JSONObject commandJsonObject = new JSONObject();
    public JSONObject dataMap;

    @C09CT("face_extra_model_name")
    public String faceModelName;

    @C09CT("matting_model_name")
    public String mattingModelName;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTLHEffectModelCommand{faceModelName='");
        sbLIZ.append(this.faceModelName);
        sbLIZ.append('\'');
        sbLIZ.append(", mattingModelName='");
        sbLIZ.append(this.mattingModelName);
        sbLIZ.append('\'');
        sbLIZ.append(", commandJsonObject=");
        sbLIZ.append(this.commandJsonObject);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.lyrax.augur.command.AbsAugurCommand
    public CommandType getCommandType() {
        return CommandType.EFFECT_MODEL;
    }

    public static AugurEffectModelCommand fromJSON(JSONObject jSONObject, JSONObject jSONObject2) {
        AugurEffectModelCommand augurEffectModelCommand = new AugurEffectModelCommand();
        augurEffectModelCommand.parseReportMap(jSONObject, jSONObject2);
        try {
            if (jSONObject.has("face_extra_model_name")) {
                String strOptString = jSONObject.optString("face_extra_model_name");
                augurEffectModelCommand.faceModelName = strOptString;
                if (TextUtils.equals(strOptString, "null") || TextUtils.isEmpty(augurEffectModelCommand.faceModelName)) {
                    augurEffectModelCommand.faceModelName = "";
                    jSONObject.put("face_extra_model_name", "");
                }
                augurEffectModelCommand.commandJsonObject.put("face_extra_model_name", augurEffectModelCommand.faceModelName);
            }
            if (jSONObject.has("matting_model_name")) {
                String strOptString2 = jSONObject.optString("matting_model_name");
                augurEffectModelCommand.mattingModelName = strOptString2;
                if (TextUtils.equals(strOptString2, "null") || TextUtils.isEmpty(augurEffectModelCommand.mattingModelName)) {
                    augurEffectModelCommand.mattingModelName = "";
                    jSONObject.put("matting_model_name", "");
                }
                augurEffectModelCommand.commandJsonObject.put("matting_model_name", augurEffectModelCommand.mattingModelName);
            }
            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("from_params");
            if (jSONObjectOptJSONObject != null) {
                if (jSONObjectOptJSONObject.has("face_extra_model_name")) {
                    String strOptString3 = jSONObjectOptJSONObject.optString("face_extra_model_name");
                    if (TextUtils.equals(strOptString3, "null") || TextUtils.isEmpty(strOptString3)) {
                        jSONObjectOptJSONObject.put("face_extra_model_name", "");
                    }
                }
                if (jSONObjectOptJSONObject.has("matting_model_name")) {
                    String strOptString4 = jSONObjectOptJSONObject.optString("matting_model_name");
                    if (TextUtils.equals(strOptString4, "null") || TextUtils.isEmpty(strOptString4)) {
                        jSONObjectOptJSONObject.put("matting_model_name", "");
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        augurEffectModelCommand.dataMap = jSONObject;
        return augurEffectModelCommand;
    }
}
