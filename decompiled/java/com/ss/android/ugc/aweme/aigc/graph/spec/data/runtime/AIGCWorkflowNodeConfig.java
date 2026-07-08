package com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes9.dex */
public final class AIGCWorkflowNodeConfig {

    @C09CT("is_failable")
    public final boolean isFailable;

    public AIGCWorkflowNodeConfig() {
        this(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AIGCWorkflowNodeConfig) && this.isFailable == ((AIGCWorkflowNodeConfig) obj).isFailable;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.isFailable);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCWorkflowNodeConfig(isFailable=");
        sbLIZ.append(this.isFailable);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AIGCWorkflowNodeConfig(boolean z) {
        this.isFailable = z;
    }
}
