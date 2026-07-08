package com.ss.lyrax.augur.command;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class AugurUpdateDenoiseParamsCommand extends AbsAugurCommand implements Serializable {

    @C09CT("enable")
    public boolean enable;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTLHUpdateDenoiseParamsCommand{enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.lyrax.augur.command.AbsAugurCommand
    public CommandType getCommandType() {
        return CommandType.UPDATE_DENOISE_PARAMS;
    }

    public static AugurUpdateDenoiseParamsCommand fromJSON(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            AugurUpdateDenoiseParamsCommand augurUpdateDenoiseParamsCommand = new AugurUpdateDenoiseParamsCommand();
            augurUpdateDenoiseParamsCommand.parseReportMap(jSONObject2, jSONObject);
            boolean z = false;
            if (jSONObject.optInt("enable", 0) == 1) {
                z = true;
            }
            augurUpdateDenoiseParamsCommand.enable = z;
            return augurUpdateDenoiseParamsCommand;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
