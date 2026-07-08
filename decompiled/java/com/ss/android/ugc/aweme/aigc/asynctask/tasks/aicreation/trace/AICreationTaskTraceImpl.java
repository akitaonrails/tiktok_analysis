package com.ss.android.ugc.aweme.aigc.asynctask.tasks.aicreation.trace;

import X.C01GW;
import X.C0LMH;
import X.C0LMI;
import X.C0LSZ;
import X.C0LUR;
import X.C0LUS;
import X.C123100dR;
import X.C201955140j;
import X.C2188811AlT;
import X.C542840LQs;
import X.C547160Ld4;
import X.C548010LeR;
import com.bytedance.aigc.proto.Level;
import com.ss.android.ugc.aweme.aigc.aicreation.trace.IAICreationTrace;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class AICreationTaskTraceImpl implements IAICreationTrace {
    @Override // com.ss.android.ugc.aweme.aigc.aicreation.trace.IAICreationTrace
    public final void LIZ(String str, Map<String, String> map, C0LUR c0lur, Level level) {
        C01GW c01gw = C547160Ld4.LIZ;
        String str2 = c0lur.LIZ;
        String str3 = c0lur.LIZIZ;
        String str4 = c0lur.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c0lur.LJ);
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C547160Ld4.LIZJ(level.toString(), str2, str3, str4, c0lur.LIZLLL, System.currentTimeMillis(), strLIZIZ, map);
        if (C0LUS.LIZ[level.ordinal()] == 1) {
            C542840LQs c542840LQs = C542840LQs.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append(", ");
            sbLIZ2.append(map);
            C201955140j.LJIIIIZZ(c542840LQs, "AICreationTraceImpl", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        C542840LQs c542840LQs2 = C542840LQs.LIZIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(str);
        sbLIZ3.append(", ");
        sbLIZ3.append(map);
        C201955140j.LJIILL(c542840LQs2, "AICreationTraceImpl", C2188811AlT.LIZIZ(sbLIZ3));
    }

    @Override // com.ss.android.ugc.aweme.aigc.aicreation.trace.IAICreationTrace
    public final void LIZIZ(String str, Map<String, String> map, C0LSZ c0lsz, Level level) {
        String type;
        String source;
        if (C123100dR.LIZ(c0lsz.LJIIIZ)) {
            String str2 = C0LMH.LIZ;
            type = C0LMH.LIZ(c0lsz.LJI);
        } else {
            type = C0LMI.FLOW.getType();
        }
        String str3 = c0lsz.LJIIIZ;
        if (!C123100dR.LIZ(str3) || str3 == null) {
            str3 = c0lsz.LIZ;
        }
        Source source2 = c0lsz.LJIIL;
        if (source2 == null || (source = source2.getSource()) == null) {
            source = "";
        }
        String str4 = C0LMH.LIZ;
        String strLIZ = C0LMH.LIZ(c0lsz.LJI);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(String.valueOf(C548010LeR.LJ.LIZ).toLowerCase(Locale.ROOT));
        sbLIZ.append('.');
        sbLIZ.append(type);
        sbLIZ.append('.');
        LIZ(str, map, new C0LUR(str3, source, strLIZ, C2188811AlT.LIZIZ(sbLIZ)), level);
    }
}
