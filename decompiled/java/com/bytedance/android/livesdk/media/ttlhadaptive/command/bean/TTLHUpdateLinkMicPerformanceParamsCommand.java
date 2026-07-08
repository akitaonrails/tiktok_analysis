package com.bytedance.android.livesdk.media.ttlhadaptive.command.bean;

import X.AbstractC1268060j6S;
import X.C09CT;
import X.C2188811AlT;
import X.EnumC1268100j6W;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes21.dex */
public class TTLHUpdateLinkMicPerformanceParamsCommand extends AbstractC1268060j6S implements Serializable {

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
        sbLIZ.append("TTLHUpdateLinkMicPerformanceParamsCommand{captureWidth=");
        sbLIZ.append(this.captureWidth);
        sbLIZ.append(", captureHeight=");
        sbLIZ.append(this.captureHeight);
        sbLIZ.append(", effectWidth=");
        sbLIZ.append(this.effectWidth);
        sbLIZ.append(", effectHeight=");
        sbLIZ.append(this.effectHeight);
        sbLIZ.append(", encodeWidth=");
        sbLIZ.append(this.encodeWidth);
        sbLIZ.append(", encodeHeight=");
        sbLIZ.append(this.encodeHeight);
        sbLIZ.append(", performanceLevel=");
        sbLIZ.append(this.performanceLevel);
        sbLIZ.append(", fps=");
        sbLIZ.append(this.fps);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1268060j6S
    public EnumC1268100j6W getCommandType() {
        return EnumC1268100j6W.UPDATE_LINKMIC_VIDEO_PARAMS;
    }

    public static TTLHUpdateLinkMicPerformanceParamsCommand fromHashMap(HashMap<String, Object> map, HashMap<String, Object> map2) {
        TTLHUpdateLinkMicPerformanceParamsCommand tTLHUpdateLinkMicPerformanceParamsCommand = new TTLHUpdateLinkMicPerformanceParamsCommand();
        try {
            tTLHUpdateLinkMicPerformanceParamsCommand.parseReportMap(map, map2);
            if (map != null) {
                if (map.containsKey("capture_width")) {
                    Object obj = map.get("capture_width");
                    Objects.requireNonNull(obj);
                    tTLHUpdateLinkMicPerformanceParamsCommand.captureWidth = CastIntegerProtector.parseInt(obj.toString());
                }
                if (map.containsKey("capture_height")) {
                    Object obj2 = map.get("capture_height");
                    Objects.requireNonNull(obj2);
                    tTLHUpdateLinkMicPerformanceParamsCommand.captureHeight = CastIntegerProtector.parseInt(obj2.toString());
                }
                if (map.containsKey("effect_width")) {
                    Object obj3 = map.get("effect_width");
                    Objects.requireNonNull(obj3);
                    tTLHUpdateLinkMicPerformanceParamsCommand.effectWidth = CastIntegerProtector.parseInt(obj3.toString());
                }
                if (map.containsKey("effect_height")) {
                    Object obj4 = map.get("effect_height");
                    Objects.requireNonNull(obj4);
                    tTLHUpdateLinkMicPerformanceParamsCommand.effectHeight = CastIntegerProtector.parseInt(obj4.toString());
                }
                if (map.containsKey("encode_width")) {
                    Object obj5 = map.get("encode_width");
                    Objects.requireNonNull(obj5);
                    tTLHUpdateLinkMicPerformanceParamsCommand.encodeWidth = CastIntegerProtector.parseInt(obj5.toString());
                }
                if (map.containsKey("encode_height")) {
                    Object obj6 = map.get("encode_height");
                    Objects.requireNonNull(obj6);
                    tTLHUpdateLinkMicPerformanceParamsCommand.encodeHeight = CastIntegerProtector.parseInt(obj6.toString());
                }
                if (map.containsKey("fps")) {
                    Object obj7 = map.get("fps");
                    Objects.requireNonNull(obj7);
                    tTLHUpdateLinkMicPerformanceParamsCommand.fps = CastIntegerProtector.parseInt(obj7.toString());
                }
                if (map.containsKey("performance_level")) {
                    Object obj8 = map.get("performance_level");
                    Objects.requireNonNull(obj8);
                    tTLHUpdateLinkMicPerformanceParamsCommand.performanceLevel = CastIntegerProtector.parseInt(obj8.toString());
                }
                if (map.containsKey("multi_stream_reason_perf")) {
                    Object obj9 = map.get("multi_stream_reason_perf");
                    Objects.requireNonNull(obj9);
                    tTLHUpdateLinkMicPerformanceParamsCommand.multiStreamReasonPerf = obj9.toString();
                    return tTLHUpdateLinkMicPerformanceParamsCommand;
                }
            }
            return tTLHUpdateLinkMicPerformanceParamsCommand;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
