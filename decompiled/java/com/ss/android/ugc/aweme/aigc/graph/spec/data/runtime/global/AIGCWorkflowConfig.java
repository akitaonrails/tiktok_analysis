package com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.global;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIGCWorkflowConfig {

    @C09CT("arch")
    public final AIGCWorkflowArchConfig archConfig;

    @C09CT("business")
    public final AIGCWorkflowBusinessConfig businessConfig;

    public AIGCWorkflowConfig() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIGCWorkflowConfig)) {
            return false;
        }
        AIGCWorkflowConfig aIGCWorkflowConfig = (AIGCWorkflowConfig) obj;
        return Intrinsics.LJFF(this.archConfig, aIGCWorkflowConfig.archConfig) && Intrinsics.LJFF(this.businessConfig, aIGCWorkflowConfig.businessConfig);
    }

    public final int hashCode() {
        AIGCWorkflowArchConfig aIGCWorkflowArchConfig = this.archConfig;
        int iHashCode = (aIGCWorkflowArchConfig == null ? 0 : aIGCWorkflowArchConfig.hashCode()) * 31;
        AIGCWorkflowBusinessConfig aIGCWorkflowBusinessConfig = this.businessConfig;
        return iHashCode + (aIGCWorkflowBusinessConfig != null ? aIGCWorkflowBusinessConfig.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCWorkflowConfig(archConfig=");
        sbLIZ.append(this.archConfig);
        sbLIZ.append(", businessConfig=");
        sbLIZ.append(this.businessConfig);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AIGCWorkflowConfig(AIGCWorkflowArchConfig aIGCWorkflowArchConfig, AIGCWorkflowBusinessConfig aIGCWorkflowBusinessConfig) {
        this.archConfig = aIGCWorkflowArchConfig;
        this.businessConfig = aIGCWorkflowBusinessConfig;
    }
}
