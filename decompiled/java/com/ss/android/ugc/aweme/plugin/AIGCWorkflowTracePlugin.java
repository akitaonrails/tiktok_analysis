package com.ss.android.ugc.aweme.plugin;

import X.AbstractC2252651DEx;
import X.AbstractC556310Lrp;
import X.C01GW;
import X.C099R;
import X.C0C64;
import X.C0PEM;
import X.C19719612Di;
import X.C1DFB;
import X.C2217908mX;
import X.C452501pT;
import X.C5180020c;
import X.C553220Lmq;
import X.C556090LrT;
import X.C556420Ls0;
import X.C556430Ls1;
import X.C844470XAv;
import com.ss.android.ugc.aweme.aigc.graph.plugin.IAIGCWorkflowPlugin;
import com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.global.AIGCWorkflowArchConfig;
import com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.global.AIGCWorkflowConfig;
import com.ss.android.ugc.aweme.trace.api.TraceLogApi;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIGCWorkflowTracePlugin implements IAIGCWorkflowPlugin {
    public final C1DFB LIZ = C0PEM.LIZJ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(102));
    public final C556420Ls0 LIZJ = new AbstractC556310Lrp() { // from class: X.0Ls0
        @Override // X.AbstractC556310Lrp
        public final void LJI(String str, String str2, Map<String, String> map) {
            String str3 = map.get("business");
            if (str3 == null || str3.length() <= 0) {
                str3 = "tofix";
            }
            String str4 = map.get("task_type");
            if (str4 == null || str4.length() <= 0) {
                str4 = "tofix";
            }
            TraceLogApi traceLogApi = (TraceLogApi) this.LIZIZ.LIZIZ.getValue();
            if (traceLogApi != null) {
                traceLogApi.LIZIZ(str, str3, str4, "aigc", str2, System.currentTimeMillis(), "debug", map);
            }
        }
    };

    @Override // com.ss.android.ugc.aweme.aigc.graph.plugin.IAIGCWorkflowPlugin
    public final AbstractC2252651DEx LJJJLL() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.aigc.graph.plugin.IAIGCWorkflowPlugin
    public final void LIZIZ(String str) {
        C556430Ls1 c556430Ls1 = this.LIZJ.LIZ;
        ((ConcurrentHashMap) c556430Ls1.LIZ).remove(str);
        C19719612Di.LJJIII(((ConcurrentHashMap) c556430Ls1.LIZ).keySet(), new C5180020c(str, 13), true);
    }

    @Override // com.ss.android.ugc.aweme.aigc.graph.plugin.IAIGCWorkflowPlugin
    public final boolean LIZJ(C553220Lmq c553220Lmq) {
        String str;
        AIGCWorkflowArchConfig aIGCWorkflowArchConfig;
        C844470XAv.LIZ.getClass();
        if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
            return true;
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_enable_effect_log_collection", true, false)) {
            AIGCWorkflowConfig aIGCWorkflowConfig = c553220Lmq.LIZIZ;
            if (aIGCWorkflowConfig != null && (aIGCWorkflowArchConfig = aIGCWorkflowConfig.archConfig) != null) {
                str = aIGCWorkflowArchConfig.source;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str, "effect_aigc")) {
                return true;
            }
            return false;
        }
        return false;
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
