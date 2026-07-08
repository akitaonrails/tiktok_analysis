package com.bytedance.android.livesdk.media.ttlhadaptive.command.bean;

import X.AbstractC1268060j6S;
import X.C09CT;
import X.C2188811AlT;
import X.EnumC1268100j6W;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes21.dex */
public class TTLHUpdateStreamHDParamsCommand extends AbstractC1268060j6S implements Serializable {

    @C09CT("enable")
    public boolean enable;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTLHUpdateStreamHDParamsCommand{enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1268060j6S
    public EnumC1268100j6W getCommandType() {
        return EnumC1268100j6W.UPDATE_DENOISE_PARAMS;
    }

    public static TTLHUpdateStreamHDParamsCommand fromHaspMap(HashMap<String, Object> map, HashMap<String, Object> map2) {
        try {
            TTLHUpdateStreamHDParamsCommand tTLHUpdateStreamHDParamsCommand = new TTLHUpdateStreamHDParamsCommand();
            tTLHUpdateStreamHDParamsCommand.parseReportMap(map, map2);
            boolean z = true;
            if (CastIntegerProtector.parseInt(map.get("enable").toString()) != 1) {
                z = false;
            }
            tTLHUpdateStreamHDParamsCommand.enable = z;
            return tTLHUpdateStreamHDParamsCommand;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
