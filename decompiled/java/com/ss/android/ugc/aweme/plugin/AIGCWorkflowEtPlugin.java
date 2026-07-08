package com.ss.android.ugc.aweme.plugin;

import X.AbstractC2252651DEx;
import X.AbstractC556310Lrp;
import X.AnonymousClass0585;
import X.C099R;
import X.C0PEM;
import X.C19719612Di;
import X.C2217908mX;
import X.C5180020c;
import X.C553220Lmq;
import X.C556090LrT;
import X.C556430Ls1;
import com.ss.android.ugc.aweme.aigc.graph.plugin.IAIGCWorkflowPlugin;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final class AIGCWorkflowEtPlugin implements IAIGCWorkflowPlugin {
    public final AnonymousClass0585 LIZ = new AbstractC556310Lrp() { // from class: X.0585
        @Override // X.AbstractC556310Lrp
        public final void LJI(String str, String str2, Map<String, String> map) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                c2344009Gk.LJFF(entry.getKey(), entry.getValue());
            }
            C20684815ws.LJIILLIIL(str2, c2344009Gk.LIZ);
        }
    };

    @Override // com.ss.android.ugc.aweme.aigc.graph.plugin.IAIGCWorkflowPlugin
    public final boolean LIZJ(C553220Lmq c553220Lmq) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.aigc.graph.plugin.IAIGCWorkflowPlugin
    public final AbstractC2252651DEx LJJJLL() {
        return C0PEM.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.aigc.graph.plugin.IAIGCWorkflowPlugin
    public final void LIZIZ(String str) {
        C556430Ls1 c556430Ls1 = this.LIZ.LIZ;
        ((ConcurrentHashMap) c556430Ls1.LIZ).remove(str);
        C19719612Di.LJJIII(((ConcurrentHashMap) c556430Ls1.LIZ).keySet(), new C5180020c(str, 13), true);
    }

    @Override // com.ss.android.ugc.aweme.aigc.graph.plugin.IAIGCWorkflowPlugin
    public final Object LIZ(C2217908mX c2217908mX, C556090LrT c556090LrT) {
        Object objLIZLLL = LIZLLL(c2217908mX, c556090LrT);
        if (objLIZLLL == C099R.LJFF()) {
            return objLIZLLL;
        }
        return Unit.LIZ;
    }
}
