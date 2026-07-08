package com.ss.lyrax.augur.command;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class AugurUpdateLinkMicVideoParamsCommand extends AbsAugurCommand implements Serializable {

    @C09CT("default_level_video_param")
    public JSONObject defaultLevelVideoParam;

    @C09CT("default_performance_level")
    public int defaultPerformanceLevel;

    @C09CT("encode_configs")
    public JSONObject encodeConfigs;

    @C09CT("performance_levels")
    public JSONObject performanceLevels;

    @C09CT("performance_mode")
    public int performanceMode;

    @C09CT("simulcast_mode")
    public String simulcastMode;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AugurUpdateLinkMicVideoParamsCommand{performanceLevels=");
        sbLIZ.append(this.performanceLevels);
        sbLIZ.append(", defaultPerformanceLevel=");
        sbLIZ.append(this.defaultPerformanceLevel);
        sbLIZ.append(", defaultLevelVideoParam=");
        sbLIZ.append(this.defaultLevelVideoParam);
        sbLIZ.append(", encodeConfigs=");
        sbLIZ.append(this.encodeConfigs);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.lyrax.augur.command.AbsAugurCommand
    public CommandType getCommandType() {
        return CommandType.UPDATE_LINKMIC_VIDEO_PARAMS;
    }

    public static AugurUpdateLinkMicVideoParamsCommand fromJSON(JSONObject jSONObject, JSONObject jSONObject2) {
        AugurUpdateLinkMicVideoParamsCommand augurUpdateLinkMicVideoParamsCommand = new AugurUpdateLinkMicVideoParamsCommand();
        try {
            augurUpdateLinkMicVideoParamsCommand.parseReportMap(jSONObject, jSONObject2);
            if (jSONObject != null) {
                if (jSONObject.has("performance_levels")) {
                    augurUpdateLinkMicVideoParamsCommand.performanceLevels = (JSONObject) jSONObject.get("performance_levels");
                }
                if (jSONObject.has("encode_configs")) {
                    augurUpdateLinkMicVideoParamsCommand.encodeConfigs = (JSONObject) jSONObject.get("encode_configs");
                }
                if (jSONObject.has("default_performance_level")) {
                    augurUpdateLinkMicVideoParamsCommand.defaultPerformanceLevel = JSONObjectProtectorUtils.getInt(jSONObject, "default_performance_level");
                }
                if (jSONObject.has("default_level_video_param")) {
                    augurUpdateLinkMicVideoParamsCommand.defaultLevelVideoParam = (JSONObject) jSONObject.get("default_level_video_param");
                }
                if (jSONObject.has("simulcast_mode")) {
                    augurUpdateLinkMicVideoParamsCommand.simulcastMode = JSONObjectProtectorUtils.getString(jSONObject, "simulcast_mode");
                }
                if (jSONObject.has("performance_mode")) {
                    augurUpdateLinkMicVideoParamsCommand.performanceMode = JSONObjectProtectorUtils.getInt(jSONObject, "performance_mode");
                    return augurUpdateLinkMicVideoParamsCommand;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return augurUpdateLinkMicVideoParamsCommand;
    }
}
