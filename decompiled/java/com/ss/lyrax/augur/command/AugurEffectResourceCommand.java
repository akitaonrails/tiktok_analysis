package com.ss.lyrax.augur.command;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class AugurEffectResourceCommand extends AbsAugurCommand implements Serializable {
    public JSONObject dataMap;

    @C09CT("level")
    public int level = -1;
    public JSONObject commandJsonObject = new JSONObject();

    public int getEffectResourceLevel() {
        int i = this.level;
        if (i == 0 || i == 1) {
            return i;
        }
        return -1;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTLHEffectResourceCommand{level='");
        sbLIZ.append(this.level);
        sbLIZ.append('\'');
        sbLIZ.append(", commandJsonObject=");
        sbLIZ.append(this.commandJsonObject);
        sbLIZ.append(", dataMap=");
        sbLIZ.append(this.dataMap);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.lyrax.augur.command.AbsAugurCommand
    public CommandType getCommandType() {
        return CommandType.EFFECT_MODEL;
    }

    public static AugurEffectResourceCommand fromJSON(JSONObject jSONObject, JSONObject jSONObject2) {
        AugurEffectResourceCommand augurEffectResourceCommand = new AugurEffectResourceCommand();
        augurEffectResourceCommand.parseReportMap(jSONObject, jSONObject2);
        try {
            if (jSONObject.has("level")) {
                int iOptInt = jSONObject.optInt("level");
                augurEffectResourceCommand.level = iOptInt;
                augurEffectResourceCommand.commandJsonObject.put("level", iOptInt);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        augurEffectResourceCommand.dataMap = jSONObject;
        return augurEffectResourceCommand;
    }
}
