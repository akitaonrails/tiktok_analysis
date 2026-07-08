package com.ss.lyrax.augur.command;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class AugurUpdateStreamHDParamsCommand extends AbsAugurCommand implements Serializable {

    @C09CT("enable")
    public boolean enable;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTLHUpdateStreamHDParamsCommand{enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.lyrax.augur.command.AbsAugurCommand
    public CommandType getCommandType() {
        return CommandType.UPDATE_DENOISE_PARAMS;
    }

    public static AugurUpdateStreamHDParamsCommand fromJSON(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            AugurUpdateStreamHDParamsCommand augurUpdateStreamHDParamsCommand = new AugurUpdateStreamHDParamsCommand();
            augurUpdateStreamHDParamsCommand.parseReportMap(jSONObject, jSONObject2);
            boolean z = false;
            if (jSONObject.optInt("enable", 0) == 1) {
                z = true;
            }
            augurUpdateStreamHDParamsCommand.enable = z;
            return augurUpdateStreamHDParamsCommand;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
