package com.bytedance.android.livesdk.media.ttlhadaptive.command.bean;

import X.AbstractC1268060j6S;
import X.C09CT;
import X.C2188811AlT;
import X.EnumC1268100j6W;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class TTLHEffectModelCommand extends AbstractC1268060j6S implements Serializable {
    public JSONObject commandJsonObject = new JSONObject();
    public HashMap<String, Object> dataMap;

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

    @Override // X.AbstractC1268060j6S
    public EnumC1268100j6W getCommandType() {
        return EnumC1268100j6W.EFFECT_MODEL;
    }

    public static TTLHEffectModelCommand fromHashMap(HashMap<String, Object> map, HashMap<String, Object> map2) {
        TTLHEffectModelCommand tTLHEffectModelCommand = new TTLHEffectModelCommand();
        tTLHEffectModelCommand.parseReportMap(map, map2);
        try {
            if (map.containsKey("face_extra_model_name")) {
                String string = map.get("face_extra_model_name").toString();
                tTLHEffectModelCommand.faceModelName = string;
                tTLHEffectModelCommand.commandJsonObject.put("face_extra_model_name", string);
            }
            if (map.containsKey("matting_model_name")) {
                String string2 = map.get("matting_model_name").toString();
                tTLHEffectModelCommand.mattingModelName = string2;
                tTLHEffectModelCommand.commandJsonObject.put("matting_model_name", string2);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        tTLHEffectModelCommand.dataMap = map;
        return tTLHEffectModelCommand;
    }
}
