package com.ss.lyrax.augur.command;

import X.C09CT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class AugurEffectSuperResolutionCommand extends AbsAugurCommand implements Serializable {

    @C09CT("enable")
    public boolean enable;

    @C09CT("scale")
    public float scale;

    @C09CT("strategies")
    public String strategies;

    @Override // com.ss.lyrax.augur.command.AbsAugurCommand
    public CommandType getCommandType() {
        return CommandType.GPU_TURBO;
    }

    public static AugurEffectSuperResolutionCommand fromJSON(JSONObject jSONObject, JSONObject jSONObject2) {
        AugurEffectSuperResolutionCommand augurEffectSuperResolutionCommand = new AugurEffectSuperResolutionCommand();
        augurEffectSuperResolutionCommand.parseReportMap(jSONObject, jSONObject2);
        try {
            if (jSONObject.has("enable")) {
                boolean z = true;
                if (jSONObject.optInt("enable") != 1) {
                    z = false;
                }
                augurEffectSuperResolutionCommand.enable = z;
            }
            if (jSONObject.has("scale")) {
                augurEffectSuperResolutionCommand.scale = (float) jSONObject.optDouble("scale");
            }
            if (jSONObject.has("strategies")) {
                augurEffectSuperResolutionCommand.strategies = jSONObject.optString("strategies");
                return augurEffectSuperResolutionCommand;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return augurEffectSuperResolutionCommand;
    }
}
