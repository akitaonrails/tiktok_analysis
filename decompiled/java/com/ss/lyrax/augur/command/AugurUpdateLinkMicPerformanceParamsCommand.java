package com.ss.lyrax.augur.command;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class AugurUpdateLinkMicPerformanceParamsCommand extends AbsAugurCommand implements Serializable {

    @C09CT("capture_height")
    public int captureHeight;

    @C09CT("capture_width")
    public int captureWidth;

    @C09CT("effect_height")
    public int effectHeight;

    @C09CT("effect_width")
    public int effectWidth;

    @C09CT("encode_height")
    public int encodeHeight;

    @C09CT("encode_width")
    public int encodeWidth;

    @C09CT("fps")
    public int fps;

    @C09CT("multi_stream_reason_perf")
    public String multiStreamReasonPerf;

    @C09CT("performance_level")
    public int performanceLevel;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AugurUpdateLinkMicPerformanceParamsCommand{captureWidth=");
        sbLIZ.append(this.captureWidth);
        sbLIZ.append(", captureHeight=");
        sbLIZ.append(this.captureHeight);
        sbLIZ.append(", effectWidth=");
        sbLIZ.append(this.effectWidth);
        sbLIZ.append(", effectHeight=");
        sbLIZ.append(this.effectHeight);
        sbLIZ.append(", fps=");
        sbLIZ.append(this.fps);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.lyrax.augur.command.AbsAugurCommand
    public CommandType getCommandType() {
        return CommandType.UPDATE_LINKMIC_PERFORMANCE_PARAMS;
    }

    public static AugurUpdateLinkMicPerformanceParamsCommand fromJSON(JSONObject jSONObject, JSONObject jSONObject2) {
        AugurUpdateLinkMicPerformanceParamsCommand augurUpdateLinkMicPerformanceParamsCommand = new AugurUpdateLinkMicPerformanceParamsCommand();
        try {
            augurUpdateLinkMicPerformanceParamsCommand.parseReportMap(jSONObject, jSONObject2);
            if (jSONObject != null) {
                if (jSONObject.has("capture_width")) {
                    augurUpdateLinkMicPerformanceParamsCommand.captureWidth = ((Integer) jSONObject.get("capture_width")).intValue();
                }
                if (jSONObject.has("capture_height")) {
                    augurUpdateLinkMicPerformanceParamsCommand.captureHeight = ((Integer) jSONObject.get("capture_height")).intValue();
                }
                if (jSONObject.has("effect_width")) {
                    augurUpdateLinkMicPerformanceParamsCommand.effectWidth = ((Integer) jSONObject.get("effect_width")).intValue();
                }
                if (jSONObject.has("effect_height")) {
                    augurUpdateLinkMicPerformanceParamsCommand.effectHeight = ((Integer) jSONObject.get("effect_height")).intValue();
                }
                if (jSONObject.has("encode_width")) {
                    augurUpdateLinkMicPerformanceParamsCommand.encodeWidth = ((Integer) jSONObject.get("encode_width")).intValue();
                }
                if (jSONObject.has("encode_height")) {
                    augurUpdateLinkMicPerformanceParamsCommand.encodeHeight = ((Integer) jSONObject.get("encode_height")).intValue();
                }
                if (jSONObject.has("fps")) {
                    augurUpdateLinkMicPerformanceParamsCommand.fps = ((Integer) jSONObject.get("fps")).intValue();
                }
                if (jSONObject.has("performance_level")) {
                    augurUpdateLinkMicPerformanceParamsCommand.performanceLevel = ((Integer) jSONObject.get("performance_level")).intValue();
                }
                if (jSONObject.has("multi_stream_reason_perf")) {
                    augurUpdateLinkMicPerformanceParamsCommand.multiStreamReasonPerf = (String) jSONObject.get("multi_stream_reason_perf");
                    return augurUpdateLinkMicPerformanceParamsCommand;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return augurUpdateLinkMicPerformanceParamsCommand;
    }
}
