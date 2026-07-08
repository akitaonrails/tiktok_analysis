package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.aicontent.aiofflineeffect.workflow;

import X.AbstractC2252651DEx;
import X.C07Y9;
import X.C099R;
import X.C0PEM;
import X.C1DFB;
import X.C2217908mX;
import X.C553220Lmq;
import X.C556090LrT;
import com.ss.android.ugc.aweme.aigc.graph.plugin.IAIGCWorkflowPlugin;
import com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.global.AIGCWorkflowArchConfig;
import com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.global.AIGCWorkflowConfig;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AiI2VWorkflowPlugin implements IAIGCWorkflowPlugin {
    public final C1DFB LIZ = C0PEM.LIZJ;

    @Override // com.ss.android.ugc.aweme.aigc.graph.plugin.IAIGCWorkflowPlugin
    public final void LIZIZ(String str) {
    }

    @Override // com.ss.android.ugc.aweme.aigc.graph.plugin.IAIGCWorkflowPlugin
    public final AbstractC2252651DEx LJJJLL() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.aigc.graph.plugin.IAIGCWorkflowPlugin
    public final boolean LIZJ(C553220Lmq c553220Lmq) {
        String str;
        AIGCWorkflowArchConfig aIGCWorkflowArchConfig;
        AIGCWorkflowConfig aIGCWorkflowConfig = c553220Lmq.LIZIZ;
        if (aIGCWorkflowConfig != null && (aIGCWorkflowArchConfig = aIGCWorkflowConfig.archConfig) != null) {
            str = aIGCWorkflowArchConfig.source;
        } else {
            str = null;
        }
        return Intrinsics.LJFF(str, "effect_aigc");
    }

    @Override // com.ss.android.ugc.aweme.aigc.graph.plugin.IAIGCWorkflowPlugin
    public final Object LIZ(C2217908mX c2217908mX, C556090LrT c556090LrT) {
        if (c2217908mX.LIZIZ instanceof C07Y9) {
            Object objLIZLLL = LIZLLL(c2217908mX, c556090LrT);
            if (objLIZLLL == C099R.LJFF()) {
                return objLIZLLL;
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        if (r0 != null) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.C2217908mX r26, X.InterfaceC1364105Vn<? super kotlin.Unit> r27) {
        /*
            Method dump skipped, instruction units count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.aicontent.aiofflineeffect.workflow.AiI2VWorkflowPlugin.LIZLLL(X.08mX, X.05Vn):java.lang.Object");
    }
}
