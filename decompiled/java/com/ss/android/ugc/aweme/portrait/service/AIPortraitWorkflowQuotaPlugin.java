package com.ss.android.ugc.aweme.portrait.service;

import X.AbstractC2252651DEx;
import X.C0PEM;
import X.C2217908mX;
import X.C553220Lmq;
import X.C556090LrT;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.aigc.graph.plugin.IAIGCWorkflowPlugin;
import com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.global.AIGCWorkflowArchConfig;
import com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.global.AIGCWorkflowConfig;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIPortraitWorkflowQuotaPlugin implements IAIGCWorkflowPlugin {
    @Override // com.ss.android.ugc.aweme.aigc.graph.plugin.IAIGCWorkflowPlugin
    public final void LIZIZ(String str) {
    }

    @Override // com.ss.android.ugc.aweme.aigc.graph.plugin.IAIGCWorkflowPlugin
    public final AbstractC2252651DEx LJJJLL() {
        return C0PEM.LIZ;
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
        return Intrinsics.LJFF(str, Source.AI_PORTRAIT.getSource());
    }

    @Override // com.ss.android.ugc.aweme.aigc.graph.plugin.IAIGCWorkflowPlugin
    public final Object LIZ(C2217908mX c2217908mX, C556090LrT c556090LrT) {
        IAIPortraitQuotaService iAIPortraitQuotaService = (IAIPortraitQuotaService) PluggableExtentionKt.pluggableSpi$default(IAIPortraitQuotaService.class, false, false, false, 14, null);
        if (iAIPortraitQuotaService != null) {
            iAIPortraitQuotaService.LIZ(c2217908mX);
        }
        return Unit.LIZ;
    }
}
