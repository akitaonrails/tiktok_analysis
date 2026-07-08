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
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class TTLHUpdateLinkMicVideoParamsCommand extends AbstractC1268060j6S implements Serializable {

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
        sbLIZ.append("TTLHUpdateLinkMicVideoParamsCommand{performanceLevels=");
        sbLIZ.append(this.performanceLevels);
        sbLIZ.append(", encodeConfigs=");
        sbLIZ.append(this.encodeConfigs);
        sbLIZ.append(", defaultPerformanceLevel=");
        sbLIZ.append(this.defaultPerformanceLevel);
        sbLIZ.append(", defaultLevelVideoParam=");
        sbLIZ.append(this.defaultLevelVideoParam);
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1268060j6S
    public EnumC1268100j6W getCommandType() {
        return EnumC1268100j6W.UPDATE_LINKMIC_VIDEO_PARAMS;
    }

    public static TTLHUpdateLinkMicVideoParamsCommand fromHashMap(HashMap<String, Object> map, HashMap<String, Object> map2) {
        TTLHUpdateLinkMicVideoParamsCommand tTLHUpdateLinkMicVideoParamsCommand = new TTLHUpdateLinkMicVideoParamsCommand();
        try {
            tTLHUpdateLinkMicVideoParamsCommand.parseReportMap(map, map2);
            if (map != null) {
                if (map.containsKey("performance_levels")) {
                    Object obj = map.get("performance_levels");
                    Objects.requireNonNull(obj);
                    tTLHUpdateLinkMicVideoParamsCommand.performanceLevels = new JSONObject(obj.toString());
                }
                if (map.containsKey("encode_configs")) {
                    Object obj2 = map.get("encode_configs");
                    Objects.requireNonNull(obj2);
                    tTLHUpdateLinkMicVideoParamsCommand.encodeConfigs = new JSONObject(obj2.toString());
                }
                if (map.containsKey("default_performance_level")) {
                    Object obj3 = map.get("default_performance_level");
                    Objects.requireNonNull(obj3);
                    tTLHUpdateLinkMicVideoParamsCommand.defaultPerformanceLevel = CastIntegerProtector.parseInt(obj3.toString());
                }
                if (map.containsKey("default_level_video_param")) {
                    Object obj4 = map.get("default_level_video_param");
                    Objects.requireNonNull(obj4);
                    tTLHUpdateLinkMicVideoParamsCommand.defaultLevelVideoParam = new JSONObject(obj4.toString());
                }
                if (map.containsKey("simulcast_mode")) {
                    Object obj5 = map.get("simulcast_mode");
                    Objects.requireNonNull(obj5);
                    tTLHUpdateLinkMicVideoParamsCommand.simulcastMode = obj5.toString();
                }
                if (map.containsKey("performance_mode")) {
                    Object obj6 = map.get("performance_mode");
                    Objects.requireNonNull(obj6);
                    tTLHUpdateLinkMicVideoParamsCommand.performanceMode = CastIntegerProtector.parseInt(obj6.toString());
                    return tTLHUpdateLinkMicVideoParamsCommand;
                }
            }
            return tTLHUpdateLinkMicVideoParamsCommand;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
