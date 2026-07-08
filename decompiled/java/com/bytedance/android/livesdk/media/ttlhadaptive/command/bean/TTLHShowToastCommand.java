package com.bytedance.android.livesdk.media.ttlhadaptive.command.bean;

import X.AbstractC1268060j6S;
import X.C09CT;
import X.C2188811AlT;
import X.EnumC1268100j6W;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes21.dex */
public class TTLHShowToastCommand extends AbstractC1268060j6S implements Serializable {

    @C09CT("reason")
    public String reason;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTLHShowToastCommand{reason='");
        sbLIZ.append(this.reason);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1268060j6S
    public EnumC1268100j6W getCommandType() {
        return EnumC1268100j6W.SHOW_TOAST;
    }

    public static TTLHShowToastCommand fromHashMap(HashMap<String, Object> map, HashMap<String, Object> map2) {
        try {
            TTLHShowToastCommand tTLHShowToastCommand = new TTLHShowToastCommand();
            tTLHShowToastCommand.parseReportMap(map, map2);
            tTLHShowToastCommand.reason = map.get("reason").toString();
            return tTLHShowToastCommand;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
