package com.ss.android.ugc.aweme.aigc.graph.nodes.node;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class AIGCWorkflowQuotaConfig implements Serializable {

    @C09CT("enable_preload_output")
    public final boolean enablePreloadOutput;

    @C09CT("quota_remain_threshold")
    public final int quotaRemainThreshold;

    public AIGCWorkflowQuotaConfig() {
        this(false, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIGCWorkflowQuotaConfig)) {
            return false;
        }
        AIGCWorkflowQuotaConfig aIGCWorkflowQuotaConfig = (AIGCWorkflowQuotaConfig) obj;
        return this.enablePreloadOutput == aIGCWorkflowQuotaConfig.enablePreloadOutput && this.quotaRemainThreshold == aIGCWorkflowQuotaConfig.quotaRemainThreshold;
    }

    public int hashCode() {
        return (C786410Ut5.Z2(this.enablePreloadOutput) * 31) + this.quotaRemainThreshold;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCWorkflowQuotaConfig(enablePreloadOutput=");
        sbLIZ.append(this.enablePreloadOutput);
        sbLIZ.append(", quotaRemainThreshold=");
        sbLIZ.append(this.quotaRemainThreshold);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AIGCWorkflowQuotaConfig(boolean z, int i) {
        this.enablePreloadOutput = z;
        this.quotaRemainThreshold = i;
    }
}
