package com.ss.lyrax.augur.command;

import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class AugurEffectStrategyCommand extends AbsAugurCommand implements Serializable {
    public HashMap<String, Object> resultToParams = new HashMap<>();

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AugurEffectStrategyCommand{, resultToParams=");
        sbLIZ.append(this.resultToParams);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.lyrax.augur.command.AbsAugurCommand
    public CommandType getCommandType() {
        return CommandType.EFFECT_MODEL;
    }

    public static AugurEffectStrategyCommand fromJSON(JSONObject jSONObject, JSONObject jSONObject2) {
        AugurEffectStrategyCommand augurEffectStrategyCommand = new AugurEffectStrategyCommand();
        try {
            augurEffectStrategyCommand.parseReportMap(jSONObject, jSONObject2);
            if (jSONObject != null) {
                int iOptInt = jSONObject.optInt("level");
                int iOptInt2 = jSONObject.optInt("force_downgrade_to_bottom");
                augurEffectStrategyCommand.resultToParams.put("level", Integer.valueOf(iOptInt));
                augurEffectStrategyCommand.resultToParams.put("force_downgrade_to_bottom", Integer.valueOf(iOptInt2));
                return augurEffectStrategyCommand;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return augurEffectStrategyCommand;
    }
}
