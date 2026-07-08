package com.bytedance.android.livesdk.media.ttlhadaptive.command.bean;

import X.AbstractC1268060j6S;
import X.C09CT;
import X.C2188811AlT;
import X.EnumC1268100j6W;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.io.Serializable;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class TTLHSimulcastCommand extends AbstractC1268060j6S implements Serializable {

    @C09CT("res_cap_height")
    public int cameraHeight;

    @C09CT("res_cap_width")
    public int cameraWidth;
    public JSONObject commandJsonObject = new JSONObject();
    public HashMap<String, Object> dataMap;

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
    public HashMap<String, Object> toParamsMap;

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
        sbLIZ.append(", dataMap=");
        sbLIZ.append(this.dataMap);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1268060j6S
    public EnumC1268100j6W getCommandType() {
        return EnumC1268100j6W.SIMULCAST;
    }

    public static TTLHSimulcastCommand fromHashMap(HashMap<String, Object> map, HashMap<String, Object> map2) {
        TTLHSimulcastCommand tTLHSimulcastCommand = new TTLHSimulcastCommand();
        tTLHSimulcastCommand.parseReportMap(map, map2);
        try {
            tTLHSimulcastCommand.effectWidth = CastIntegerProtector.parseInt(map.get("res_effect_width").toString());
            tTLHSimulcastCommand.effectHeight = CastIntegerProtector.parseInt(map.get("res_effect_height").toString());
            tTLHSimulcastCommand.effectFps = CastIntegerProtector.parseInt(map.get("effect_fps").toString());
            tTLHSimulcastCommand.perfWidth = CastIntegerProtector.parseInt(map.get("width").toString());
            tTLHSimulcastCommand.perfHeight = CastIntegerProtector.parseInt(map.get("height").toString());
            tTLHSimulcastCommand.perfFps = CastIntegerProtector.parseInt(map.get("fps").toString());
            tTLHSimulcastCommand.name = map.get("simulcast_stream_name").toString();
            tTLHSimulcastCommand.linkmicLayoutConfigId = map.get("linkmic_layout_config_id").toString();
            tTLHSimulcastCommand.toParamsMap = map;
            new Gson().LJIILL(map);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        tTLHSimulcastCommand.dataMap = map;
        return tTLHSimulcastCommand;
    }
}
