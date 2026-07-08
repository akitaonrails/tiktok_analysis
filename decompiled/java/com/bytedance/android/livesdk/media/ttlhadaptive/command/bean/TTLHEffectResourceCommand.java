package com.bytedance.android.livesdk.media.ttlhadaptive.command.bean;

import X.AbstractC1268060j6S;
import X.C09CT;
import X.C2188811AlT;
import X.EnumC1268100j6W;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class TTLHEffectResourceCommand extends AbstractC1268060j6S implements Serializable {
    public HashMap<String, Object> dataMap;

    @C09CT("level")
    public int level = -1;
    public JSONObject commandJsonObject = new JSONObject();

    public int getEffectResourceLevel() {
        int i = this.level;
        if (i == 0 || i == 1) {
            return i;
        }
        return -1;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTLHEffectResourceCommand{level='");
        sbLIZ.append(this.level);
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
        return EnumC1268100j6W.EFFECT_MODEL;
    }

    public static TTLHEffectResourceCommand fromHashMap(HashMap<String, Object> map, HashMap<String, Object> map2) {
        TTLHEffectResourceCommand tTLHEffectResourceCommand = new TTLHEffectResourceCommand();
        tTLHEffectResourceCommand.parseReportMap(map, map2);
        try {
            if (map.containsKey("level")) {
                int i = CastIntegerProtector.parseInt(map.get("level").toString());
                tTLHEffectResourceCommand.level = i;
                tTLHEffectResourceCommand.commandJsonObject.put("level", i);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        tTLHEffectResourceCommand.dataMap = map;
        return tTLHEffectResourceCommand;
    }
}
