package com.ss.lyrax.augur.command;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class AugurUpdateFpsResolutionCommand extends AbsAugurCommand implements Serializable {

    @C09CT("cap_height")
    public int capHeight;

    @C09CT("cap_width")
    public int capWidth;

    @C09CT("fps")
    public int fps;

    @C09CT("height")
    public int height;

    @C09CT("reason")
    public String reason;

    @C09CT("width")
    public int width;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTLHUpdateFpsResolutionCommand{width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", fps=");
        sbLIZ.append(this.fps);
        sbLIZ.append(", capWidth=");
        sbLIZ.append(this.capWidth);
        sbLIZ.append(", capHeight=");
        sbLIZ.append(this.capHeight);
        sbLIZ.append(", reason='");
        sbLIZ.append(this.reason);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.lyrax.augur.command.AbsAugurCommand
    public CommandType getCommandType() {
        return CommandType.UPDATE_FPS_RESOLUTION;
    }

    public static AugurUpdateFpsResolutionCommand fromJSON(JSONObject jSONObject, JSONObject jSONObject2) {
        AugurUpdateFpsResolutionCommand augurUpdateFpsResolutionCommand = new AugurUpdateFpsResolutionCommand();
        try {
            augurUpdateFpsResolutionCommand.parseReportMap(jSONObject, jSONObject2);
            if (jSONObject != null) {
                augurUpdateFpsResolutionCommand.width = jSONObject.optInt("width");
                augurUpdateFpsResolutionCommand.height = jSONObject.optInt("height");
                augurUpdateFpsResolutionCommand.fps = jSONObject.optInt("fps");
                if (jSONObject.has("reason")) {
                    augurUpdateFpsResolutionCommand.reason = jSONObject.get("reason").toString();
                }
                if (jSONObject.has("cap_width")) {
                    augurUpdateFpsResolutionCommand.capWidth = jSONObject.optInt("cap_width");
                }
                if (jSONObject.has("cap_height")) {
                    augurUpdateFpsResolutionCommand.capHeight = jSONObject.optInt("cap_height");
                    return augurUpdateFpsResolutionCommand;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return augurUpdateFpsResolutionCommand;
    }
}
