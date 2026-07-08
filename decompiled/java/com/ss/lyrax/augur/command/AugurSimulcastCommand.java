package com.ss.lyrax.augur.command;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class AugurSimulcastCommand extends AbsAugurCommand implements Serializable {

    @C09CT("res_cap_height")
    public int cameraHeight;

    @C09CT("res_cap_width")
    public int cameraWidth;
    public JSONObject commandJsonObject = new JSONObject();

    @C09CT("effect_fps")
    public int effectFps;

    @C09CT("res_effect_height")
    public int effectHeight;

    @C09CT("res_effect_width")
    public int effectWidth;

    @C09CT("linkmic_layout_config_id")
    public String linkmicLayoutConfigId;

    @C09CT("simulcast_stream_name")
    public String name;

    @C09CT("fps")
    public int perfFps;

    @C09CT("height")
    public int perfHeight;

    @C09CT("width")
    public int perfWidth;

    @C09CT("to_params_map")
    public JSONObject toParamsMap;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTLHSimulcastCommand{cameraWidth=");
        sbLIZ.append(this.cameraWidth);
        sbLIZ.append(", cameraHeight='");
        sbLIZ.append(this.cameraHeight);
        sbLIZ.append('\'');
        sbLIZ.append(", effectWidth='");
        sbLIZ.append(this.effectWidth);
        sbLIZ.append('\'');
        sbLIZ.append(", effectHeight='");
        sbLIZ.append(this.effectHeight);
        sbLIZ.append('\'');
        sbLIZ.append(", effectFps='");
        sbLIZ.append(this.effectFps);
        sbLIZ.append('\'');
        sbLIZ.append(", perfWidth='");
        sbLIZ.append(this.perfWidth);
        sbLIZ.append('\'');
        sbLIZ.append(", perfHeight='");
        sbLIZ.append(this.perfHeight);
        sbLIZ.append('\'');
        sbLIZ.append(", commandJsonObject=");
        sbLIZ.append(this.commandJsonObject);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.lyrax.augur.command.AbsAugurCommand
    public CommandType getCommandType() {
        return CommandType.SIMULCAST;
    }

    public static AugurSimulcastCommand fromJSON(JSONObject jSONObject, JSONObject jSONObject2) {
        AugurSimulcastCommand augurSimulcastCommand = new AugurSimulcastCommand();
        augurSimulcastCommand.parseReportMap(jSONObject, jSONObject2);
        try {
            augurSimulcastCommand.effectWidth = jSONObject.optInt("res_effect_width", 0);
            augurSimulcastCommand.effectHeight = jSONObject.optInt("res_effect_height", 0);
            augurSimulcastCommand.effectFps = jSONObject.optInt("effect_fps", 0);
            augurSimulcastCommand.perfWidth = jSONObject.optInt("width", 0);
            augurSimulcastCommand.perfHeight = jSONObject.optInt("height", 0);
            augurSimulcastCommand.perfFps = jSONObject.optInt("fps", 0);
            augurSimulcastCommand.name = jSONObject.optString("simulcast_stream_name", "");
            augurSimulcastCommand.linkmicLayoutConfigId = jSONObject.optString("linkmic_layout_config_id", "");
            augurSimulcastCommand.toParamsMap = jSONObject;
            new Gson().LJIILL(jSONObject);
            return augurSimulcastCommand;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return augurSimulcastCommand;
        }
    }
}
