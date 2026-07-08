package com.ss.lyrax.augur.command;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class AugurShowToastCommand extends AbsAugurCommand implements Serializable {

    @C09CT("reason")
    public String reason;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTLHShowToastCommand{reason='");
        sbLIZ.append(this.reason);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.lyrax.augur.command.AbsAugurCommand
    public CommandType getCommandType() {
        return CommandType.SHOW_TOAST;
    }

    public static AugurShowToastCommand fromJSON(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            AugurShowToastCommand augurShowToastCommand = new AugurShowToastCommand();
            augurShowToastCommand.parseReportMap(jSONObject, jSONObject2);
            augurShowToastCommand.reason = jSONObject.get("reason").toString();
            return augurShowToastCommand;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
